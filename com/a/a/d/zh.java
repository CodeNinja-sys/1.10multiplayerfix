/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.kc;
import com.a.a.d.yw;
import com.a.a.d.zf;
import com.a.a.d.zg;
import java.util.Iterator;

class zh
extends kc {
    final /* synthetic */ zf a;

    private zh(zf zf2) {
        this.a = zf2;
    }

    @Override
    jt b() {
        return this.a;
    }

    @Override
    public agi aO_() {
        return this.h().aO_();
    }

    @Override
    jl m() {
        return new yw((iz)this, zf.a(this.a));
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    /* synthetic */ zh(zf zf2, zg zg2) {
        this(zf2);
    }
}

