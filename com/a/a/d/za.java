/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.kc;
import com.a.a.d.yx;
import com.a.a.d.yz;
import com.a.a.d.zb;
import java.util.Iterator;

final class za
extends kc {
    final /* synthetic */ yz a;

    za(yz yz2) {
        this.a = yz2;
    }

    @Override
    jt b() {
        return this.a;
    }

    @Override
    boolean aQ_() {
        return true;
    }

    @Override
    public int hashCode() {
        return yx.b(this.a.a);
    }

    @Override
    public agi aO_() {
        return this.h().aO_();
    }

    @Override
    jl m() {
        return new zb(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

