/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jl;
import com.a.a.d.zr;
import com.a.a.d.zs;

final class zv
extends jl {
    final /* synthetic */ zr a;

    private zv(zr zr2) {
        this.a = zr2;
    }

    @Override
    public int size() {
        return this.a.n();
    }

    public Object get(int n2) {
        return this.a.b(n2);
    }

    @Override
    boolean a() {
        return true;
    }

    /* synthetic */ zv(zr zr2, zs zs2) {
        this(zr2);
    }
}

