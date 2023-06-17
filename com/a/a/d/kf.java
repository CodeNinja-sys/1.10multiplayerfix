/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ir;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.ke;
import java.util.Map;

class kf
extends ir {
    final /* synthetic */ jl a;
    final /* synthetic */ ke b;

    kf(ke ke2, jl jl2) {
        this.b = ke2;
        this.a = jl2;
    }

    public Object get(int n2) {
        return ((Map.Entry)this.a.get(n2)).getKey();
    }

    @Override
    iz b() {
        return this.b;
    }
}

