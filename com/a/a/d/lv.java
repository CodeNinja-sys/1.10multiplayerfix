/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aay;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.me;
import com.a.a.d.yw;
import com.a.a.d.zq;
import java.util.Comparator;

final class lv
extends yw
implements aay {
    lv(me me2, jl jl2) {
        super((iz)me2, jl2);
    }

    me j() {
        return (me)super.b();
    }

    @Override
    public Comparator comparator() {
        return this.j().comparator();
    }

    @Override
    public int indexOf(Object object) {
        int n2 = this.j().c(object);
        return n2 >= 0 && this.get(n2).equals(object) ? n2 : -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.indexOf(object);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    jl b(int n2, int n3) {
        return new zq(super.b(n2, n3), this.comparator()).h();
    }

    @Override
    /* synthetic */ iz b() {
        return this.j();
    }
}

