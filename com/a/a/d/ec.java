/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.adw;
import com.a.a.d.ef;
import com.a.a.d.ek;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.lo;
import com.a.a.d.zr;
import java.util.Map;

final class ec
extends zr {
    private final jt a;
    private final jt b;
    private final jt c;
    private final jt d;
    private final int[] e;
    private final int[] f;
    private final Object[][] g;
    private final int[] h;
    private final int[] i;

    private static jt a(lo lo2) {
        ju ju2 = jt.n();
        int n2 = 0;
        for (Object e2 : lo2) {
            ju2.b(e2, n2);
            ++n2;
        }
        return ju2.b();
    }

    ec(jl jl2, lo lo2, lo lo3) {
        Object[][] arrobject = new Object[lo2.size()][lo3.size()];
        this.g = arrobject;
        this.a = ec.a(lo2);
        this.b = ec.a(lo3);
        this.e = new int[this.a.size()];
        this.f = new int[this.b.size()];
        int[] arrn = new int[jl2.size()];
        int[] arrn2 = new int[jl2.size()];
        for (int i2 = 0; i2 < jl2.size(); ++i2) {
            int n2;
            adw adw2 = (adw)jl2.get(i2);
            Object object = adw2.a();
            Object object2 = adw2.b();
            int n3 = (Integer)this.a.get(object);
            Object object3 = this.g[n3][n2 = ((Integer)this.b.get(object2)).intValue()];
            cl.a(object3 == null, "duplicate key: (%s, %s)", object, object2);
            this.g[n3][n2] = adw2.c();
            int n4 = n3;
            this.e[n4] = this.e[n4] + 1;
            int n5 = n2;
            this.f[n5] = this.f[n5] + 1;
            arrn[i2] = n3;
            arrn2[i2] = n2;
        }
        this.h = arrn;
        this.i = arrn2;
        this.c = new ek(this, null);
        this.d = new ef(this, null);
    }

    @Override
    public jt k() {
        return this.d;
    }

    @Override
    public jt l() {
        return this.c;
    }

    @Override
    public Object b(Object object, Object object2) {
        Integer n2 = (Integer)this.a.get(object);
        Integer n3 = (Integer)this.b.get(object2);
        return n2 == null || n3 == null ? null : this.g[n2][n3];
    }

    @Override
    public int n() {
        return this.h.length;
    }

    @Override
    adw a(int n2) {
        int n3 = this.h[n2];
        int n4 = this.i[n2];
        Object e2 = this.x().h().get(n3);
        Object e3 = this.w().h().get(n4);
        Object object = this.g[n3][n4];
        return ec.c(e2, e3, object);
    }

    @Override
    Object b(int n2) {
        return this.g[this.h[n2]][this.i[n2]];
    }

    @Override
    public /* synthetic */ Map p() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.l();
    }

    static /* synthetic */ int[] a(ec ec2) {
        return ec2.e;
    }

    static /* synthetic */ jt b(ec ec2) {
        return ec2.b;
    }

    static /* synthetic */ Object[][] c(ec ec2) {
        return ec2.g;
    }

    static /* synthetic */ int[] d(ec ec2) {
        return ec2.f;
    }

    static /* synthetic */ jt e(ec ec2) {
        return ec2.a;
    }
}

