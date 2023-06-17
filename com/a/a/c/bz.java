/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.aw;
import com.a.a.c.bs;
import com.a.a.c.bt;
import com.a.a.c.bw;
import com.a.a.c.cg;
import com.a.a.c.cl;
import com.a.a.c.cp;

final class bz
extends bw {
    @Override
    cg a(bt bt2, bs bs2, Object object, int n2) {
        return n2 == 1 ? new cl(bt2.i, object, bs2) : new cp(bt2.i, object, bs2, n2);
    }

    @Override
    aw a() {
        return aw.c();
    }
}

