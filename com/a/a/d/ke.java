/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.kf;
import com.a.a.d.kg;
import com.a.a.d.lo;
import java.util.Iterator;

final class ke
extends lo {
    private final jt a;

    ke(jt jt2) {
        this.a = jt2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public agi aO_() {
        return this.h().aO_();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    jl m() {
        jl jl2 = this.a.e().h();
        return new kf(this, jl2);
    }

    @Override
    boolean a() {
        return true;
    }

    @Override
    Object aR_() {
        return new kg(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

