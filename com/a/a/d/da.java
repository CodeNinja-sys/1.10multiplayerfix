/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.dd;
import com.a.a.d.de;
import com.a.a.d.ql;
import com.a.a.d.qy;
import com.a.a.d.sa;

class da
extends qy {
    final bl a;
    private static final long B = 4L;

    da(ql ql2, bl bl2) {
        super(ql2);
        this.a = (bl)cl.a(bl2);
    }

    @Override
    sa a(int n2, int n3) {
        return new dd(this, n2, n3);
    }

    dd a(int n2) {
        return (dd)super.b(n2);
    }

    Object a(Object object) {
        int n2 = this.b(cl.a(object));
        return this.a(n2).a(object, n2, this.a);
    }

    @Override
    Object a() {
        return new de(this.n, this.o, this.l, this.m, this.r, this.q, this.p, this.k, this.t, this, this.a);
    }

    @Override
    /* synthetic */ sa b(int n2) {
        return this.a(n2);
    }
}

