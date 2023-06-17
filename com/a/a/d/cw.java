/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cv;
import com.a.a.l.a;
import com.a.a.l.q;
import com.a.a.l.u;
import java.util.Comparator;

final class cw
extends cv {
    cw() {
        super(null);
    }

    @Override
    public cv a(Comparable comparable, Comparable comparable2) {
        return this.a(comparable.compareTo(comparable2));
    }

    @Override
    public cv a(Object object, Object object2, Comparator comparator) {
        return this.a(comparator.compare(object, object2));
    }

    @Override
    public cv a(int n2, int n3) {
        return this.a(q.a(n2, n3));
    }

    @Override
    public cv a(long l2, long l3) {
        return this.a(u.a(l2, l3));
    }

    @Override
    public cv a(float f2, float f3) {
        return this.a(Float.compare(f2, f3));
    }

    @Override
    public cv a(double d2, double d3) {
        return this.a(Double.compare(d2, d3));
    }

    @Override
    public cv a(boolean bl2, boolean bl3) {
        return this.a(a.a(bl3, bl2));
    }

    @Override
    public cv b(boolean bl2, boolean bl3) {
        return this.a(a.a(bl2, bl3));
    }

    cv a(int n2) {
        return n2 < 0 ? cv.c() : (n2 > 0 ? cv.d() : cv.e());
    }

    @Override
    public int b() {
        return 0;
    }
}

