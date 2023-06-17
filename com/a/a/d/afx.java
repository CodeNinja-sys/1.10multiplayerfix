/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.afn;
import com.a.a.d.aft;
import com.a.a.d.afy;
import com.a.a.d.afz;
import com.a.a.d.av;
import com.a.a.d.ce;
import com.a.a.d.dw;
import com.a.a.d.lw;
import com.a.a.d.nj;
import com.a.a.d.sz;
import com.a.a.d.yd;
import com.a.a.d.yl;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;

final class afx
extends av {
    private final yl a;
    private final yl b;
    private final NavigableMap c;
    private final NavigableMap d;

    private afx(yl yl2, yl yl3, NavigableMap navigableMap) {
        this.a = (yl)cl.a(yl2);
        this.b = (yl)cl.a(yl3);
        this.c = (NavigableMap)cl.a(navigableMap);
        this.d = new aft(navigableMap);
    }

    private NavigableMap a(yl yl2) {
        if (!yl2.b(this.a)) {
            return lw.j();
        }
        return new afx(this.a.c(yl2), this.b, this.c);
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
                if (!this.a.f(dw2) || dw2.a(this.b.b) < 0 || dw2.a(this.b.c) >= 0) {
                    return null;
                }
                if (dw2.equals(this.b.b)) {
                    yl yl2 = (yl)sz.c(this.c.floorEntry(dw2));
                    if (yl2 != null && yl2.c.a(this.b.b) > 0) {
                        return yl2.c(this.b);
                    }
                } else {
                    yl yl3 = (yl)this.c.get(dw2);
                    if (yl3 != null) {
                        return yl3.c(this.b);
                    }
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
        if (this.b.j()) {
            return nj.a();
        }
        if (this.a.c.a((Comparable)this.b.b)) {
            return nj.a();
        }
        Iterator iterator = this.a.b.a((Comparable)this.b.b) ? this.d.tailMap(this.b.b, false).values().iterator() : this.c.tailMap(this.a.b.c(), this.a.f() == ce.b).values().iterator();
        dw dw2 = (dw)yd.d().a(this.a.c, (Object)dw.b(this.b.c));
        return new afy(this, iterator, dw2);
    }

    @Override
    Iterator b() {
        if (this.b.j()) {
            return nj.a();
        }
        dw dw2 = (dw)yd.d().a(this.a.c, (Object)dw.b(this.b.c));
        Iterator iterator = this.c.headMap(dw2.c(), dw2.b() == ce.b).descendingMap().values().iterator();
        return new afz(this, iterator);
    }

    @Override
    public int size() {
        return nj.b(this.a());
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

    static /* synthetic */ yl a(afx afx2) {
        return afx2.b;
    }

    static /* synthetic */ yl b(afx afx2) {
        return afx2.a;
    }

    /* synthetic */ afx(yl yl2, yl yl3, NavigableMap navigableMap, afn afn2) {
        this(yl2, yl3, navigableMap);
    }
}

