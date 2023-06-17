/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jl;
import com.a.a.d.lo;
import java.util.List;

final class aai
extends jl {
    final /* synthetic */ jl a;

    aai(jl jl2) {
        this.a = jl2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    public List b(int n2) {
        return ((lo)this.a.get(n2)).h();
    }

    @Override
    boolean a() {
        return true;
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

