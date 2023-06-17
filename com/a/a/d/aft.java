/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.afu;
import com.a.a.d.afv;
import com.a.a.d.av;
import com.a.a.d.ce;
import com.a.a.d.dw;
import com.a.a.d.lw;
import com.a.a.d.nj;
import com.a.a.d.yd;
import com.a.a.d.yi;
import com.a.a.d.yl;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

final class aft
extends av {
    private final NavigableMap a;
    private final yl b;

    aft(NavigableMap navigableMap) {
        this.a = navigableMap;
        this.b = yl.c();
    }

    private aft(NavigableMap navigableMap, yl yl2) {
        this.a = navigableMap;
        this.b = yl2;
    }

    private NavigableMap a(yl yl2) {
        if (yl2.b(this.b)) {
            return new aft(this.a, yl2.c(this.b));
        }
        return lw.j();
    }

    public NavigableMap a(dw dw2, boolean bl2, dw dw3, boolean bl3) {
        return this.a(yl.a(dw2, ce.a(bl2), dw3, ce.a(bl3)));
    }

    public NavigableMap a(dw dw2, boolean bl2) {
        return this.a(yl.a((Comparable)dw2, ce.a(bl2)));
    }

    public NavigableMap b(dw dw2, boolean bl2) {
        return this.a(yl.b((Comparable)dw2, ce.a(bl2)));
    }

    @Override
    public Comparator comparator() {
        return yd.d();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    public yl a(Object object) {
        if (object instanceof dw) {
            try {
                dw dw2 = (dw)object;
                if (!this.b.f(dw2)) {
                    return null;
                }
                Map.Entry entry = this.a.lowerEntry(dw2);
                if (entry != null && ((yl)entry.getValue()).c.equals(dw2)) {
                    return (yl)entry.getValue();
                }
            }
            catch (ClassCastException classCastException) {
                return null;
            }
        }
        return null;
    }

    @Override
    Iterator a() {
        Map.Entry entry;
        Iterator iterator = !this.b.d() ? this.a.values().iterator() : ((entry = this.a.lowerEntry(this.b.e())) == null ? this.a.values().iterator() : (this.b.b.a((Comparable)((yl)entry.getValue()).c) ? this.a.tailMap(entry.getKey(), true).values().iterator() : this.a.tailMap(this.b.e(), true).values().iterator()));
        return new afu(this, iterator);
    }

    @Override
    Iterator b() {
        Collection collection = this.b.g() ? this.a.headMap(this.b.h(), false).descendingMap().values() : this.a.descendingMap().values();
        yi yi2 = nj.k(collection.iterator());
        if (yi2.hasNext() && this.b.c.a((Comparable)((yl)yi2.a()).c)) {
            yi2.next();
        }
        return new afv(this, yi2);
    }

    @Override
    public int size() {
        if (this.b.equals(yl.c())) {
            return this.a.size();
        }
        return nj.b(this.a());
    }

    @Override
    public boolean isEmpty() {
        return this.b.equals(yl.c()) ? this.a.isEmpty() : !this.a().hasNext();
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    public /* synthetic */ NavigableMap tailMap(Object object, boolean bl2) {
        return this.b((dw)object, bl2);
    }

    public /* synthetic */ NavigableMap headMap(Object object, boolean bl2) {
        return this.a((dw)object, bl2);
    }

    public /* synthetic */ NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a((dw)object, bl2, (dw)object2, bl3);
    }

    static /* synthetic */ yl a(aft aft2) {
        return aft2.b;
    }
}

