/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.ki;
import com.a.a.d.kj;
import com.a.a.d.nj;
import com.a.a.d.sz;
import java.util.Iterator;

final class kh
extends iz {
    private final jt a;

    kh(jt jt2) {
        this.a = jt2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public agi aO_() {
        return sz.a(this.a.e().aO_());
    }

    @Override
    public boolean contains(Object object) {
        return object != null && nj.a((Iterator)this.aO_(), object);
    }

    @Override
    boolean a() {
        return true;
    }

    @Override
    jl m() {
        jl jl2 = this.a.e().h();
        return new ki(this, jl2);
    }

    @Override
    Object aR_() {
        return new kj(this.a);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

