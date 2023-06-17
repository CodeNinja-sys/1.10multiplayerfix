/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.kc;
import com.a.a.d.zl;
import com.a.a.d.zm;
import com.a.a.d.zo;
import java.util.Iterator;

class zn
extends kc {
    final /* synthetic */ zl a;

    private zn(zl zl2) {
        this.a = zl2;
    }

    @Override
    public agi aO_() {
        return this.h().aO_();
    }

    @Override
    jl m() {
        return new zo(this);
    }

    @Override
    jt b() {
        return this.a;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    /* synthetic */ zn(zl zl2, zm zm2) {
        this(zl2);
    }
}

