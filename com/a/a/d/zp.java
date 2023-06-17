/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abn;
import com.a.a.d.ce;
import com.a.a.d.ma;
import com.a.a.d.me;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.zq;
import com.a.a.l.q;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class zp
extends ma {
    private final transient zq b;
    private final transient int[] c;
    private final transient long[] d;
    private final transient int e;
    private final transient int f;

    zp(zq zq2, int[] arrn, long[] arrl, int n2, int n3) {
        this.b = zq2;
        this.c = arrn;
        this.d = arrl;
        this.e = n2;
        this.f = n3;
    }

    @Override
    xd a(int n2) {
        return xe.a(this.b.h().get(n2), this.c[this.e + n2]);
    }

    @Override
    public xd i() {
        return this.a(0);
    }

    @Override
    public xd j() {
        return this.a(this.f - 1);
    }

    @Override
    public int a(Object object) {
        int n2 = this.b.c(object);
        return n2 == -1 ? 0 : this.c[n2 + this.e];
    }

    @Override
    public int size() {
        long l2 = this.d[this.e + this.f] - this.d[this.e];
        return q.b(l2);
    }

    @Override
    public me b() {
        return this.b;
    }

    @Override
    public ma a(Object object, ce ce2) {
        return this.a(0, this.b.e(object, cl.a((Object)ce2) == ce.b));
    }

    @Override
    public ma b(Object object, ce ce2) {
        return this.a(this.b.f(object, cl.a((Object)ce2) == ce.b), this.f);
    }

    ma a(int n2, int n3) {
        cl.a(n2, n3, this.f);
        if (n2 == n3) {
            return zp.a(this.comparator());
        }
        if (n2 == 0 && n3 == this.f) {
            return this;
        }
        zq zq2 = (zq)this.b.a(n2, n3);
        return new zp(zq2, this.c, this.d, this.e + n2, n3 - n2);
    }

    @Override
    boolean a() {
        return this.e > 0 || this.f < this.c.length;
    }

    @Override
    public /* synthetic */ abn c(Object object, ce ce2) {
        return this.b(object, ce2);
    }

    @Override
    public /* synthetic */ abn d(Object object, ce ce2) {
        return this.a(object, ce2);
    }

    @Override
    public /* synthetic */ NavigableSet g() {
        return this.b();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.b();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.b();
    }
}

