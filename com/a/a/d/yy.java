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
import com.a.a.d.yx;
import java.util.Iterator;

class yy
extends kc {
    final /* synthetic */ yx a;

    yy(yx yx2) {
        this.a = yx2;
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
        return new yw((iz)this, yx.a(this.a));
    }

    @Override
    boolean aQ_() {
        return true;
    }

    @Override
    public int hashCode() {
        return yx.b(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

