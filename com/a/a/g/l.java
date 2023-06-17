/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.j;
import com.a.a.g.m;
import com.a.a.g.q;
import com.a.a.g.u;
import java.io.Serializable;

class l
implements Serializable {
    final long[] a;
    final int b;
    final u c;
    final m d;
    private static final long e = 1L;

    l(j j2) {
        this.a = j.c((j)j2).a;
        this.b = j.d(j2);
        this.c = j.e(j2);
        this.d = j.f(j2);
    }

    Object a() {
        return new j(new q(this.a), this.b, this.c, this.d, null);
    }
}

