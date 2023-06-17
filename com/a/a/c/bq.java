/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.aw;
import com.a.a.b.eh;
import com.a.a.c.ab;
import com.a.a.c.aj;
import com.a.a.c.ao;
import com.a.a.c.bw;
import com.a.a.c.dg;
import com.a.a.c.dq;
import com.a.a.c.e;
import com.a.a.c.f;
import com.a.a.c.k;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class bq
extends aj
implements Serializable {
    private static final long a = 1L;
    final bw b;
    final bw c;
    final aw d;
    final aw e;
    final long f;
    final long g;
    final long h;
    final dq i;
    final int j;
    final dg k;
    final eh l;
    final ab m;
    transient e n;

    bq(ao ao2) {
        this(ao2.n, ao2.o, ao2.l, ao2.m, ao2.s, ao2.r, ao2.p, ao2.q, ao2.k, ao2.v, ao2.w, ao2.z);
    }

    private bq(bw bw2, bw bw3, aw aw2, aw aw3, long l2, long l3, long l4, dq dq2, int n2, dg dg2, eh eh2, ab ab2) {
        this.b = bw2;
        this.c = bw3;
        this.d = aw2;
        this.e = aw3;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = dq2;
        this.j = n2;
        this.k = dg2;
        this.l = eh2 == eh.b() || eh2 == com.a.a.c.f.d ? null : eh2;
        this.m = ab2;
    }

    f h() {
        f f2 = com.a.a.c.f.a().a(this.b).b(this.c).a(this.d).b(this.e).b(this.j).a(this.k);
        f2.f = false;
        if (this.f > 0L) {
            f2.a(this.f, TimeUnit.NANOSECONDS);
        }
        if (this.g > 0L) {
            f2.b(this.g, TimeUnit.NANOSECONDS);
        }
        if (this.i != com.a.a.c.k.a) {
            f2.a(this.i);
            if (this.h != -1L) {
                f2.b(this.h);
            }
        } else if (this.h != -1L) {
            f2.a(this.h);
        }
        if (this.l != null) {
            f2.a(this.l);
        }
        return f2;
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        f f2 = this.h();
        this.n = f2.u();
    }

    private Object i() {
        return this.n;
    }

    @Override
    protected e f() {
        return this.n;
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.f();
    }
}

