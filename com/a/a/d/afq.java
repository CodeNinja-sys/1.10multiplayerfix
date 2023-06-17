/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.afr;
import com.a.a.d.afs;
import com.a.a.d.aft;
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

final class afq
extends av {
    private final NavigableMap a;
    private final NavigableMap b;
    private final yl c;

    afq(NavigableMap navigableMap) {
        this(navigableMap, yl.c());
    }

    private afq(NavigableMap navigableMap, yl yl2) {
        this.a = navigableMap;
        this.b = new aft(navigableMap);
        this.c = yl2;
    }

    private NavigableMap a(yl yl2) {
        if (!this.c.b(yl2)) {
            return lw.j();
        }
        yl2 = yl2.c(this.c);
        return new afq(this.a, yl2);
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
    Iterator a() {
        dw dw2;
        Collection collection = this.c.d() ? this.b.tailMap(this.c.e(), this.c.f() == ce.b).values() : this.b.values();
        yi yi2 = nj.k(collection.iterator());
        if (this.c.f(dw.d()) && (!yi2.hasNext() || ((yl)yi2.a()).b != dw.d())) {
            dw2 = dw.d();
        } else if (yi2.hasNext()) {
            dw2 = ((yl)yi2.next()).c;
        } else {
            return nj.a();
        }
        return new afr(this, dw2, yi2);
    }

    @Override
    Iterator b() {
        dw dw2;
        boolean bl2;
        dw dw3 = this.c.g() ? (dw)this.c.h() : dw.e();
        yi yi2 = nj.k(this.b.headMap(dw3, bl2 = this.c.g() && this.c.i() == ce.b).descendingMap().values().iterator());
        if (yi2.hasNext()) {
            dw2 = ((yl)yi2.a()).c == dw.e() ? ((yl)yi2.next()).b : this.a.higherKey(((yl)yi2.a()).c);
        } else {
            if (!this.c.f(dw.d()) || this.a.containsKey(dw.d())) {
                return nj.a();
            }
            dw2 = this.a.higherKey(dw.d());
        }
        dw dw4 = (dw)cc.b(dw2, dw.e());
        return new afs(this, dw4, yi2);
    }

    @Override
    public int size() {
        return nj.b(this.a());
    }

    public yl a(Object object) {
        if (object instanceof dw) {
            try {
                dw dw2 = (dw)object;
                Map.Entry entry = this.b(dw2, true).firstEntry();
                if (entry != null && ((dw)entry.getKey()).equals(dw2)) {
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
    public boolean containsKey(Object object) {
        return this.a(object) != null;
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

    static /* synthetic */ yl a(afq afq2) {
        return afq2.c;
    }
}

