/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ir;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.kh;
import java.util.Map;

class ki
extends ir {
    final /* synthetic */ jl a;
    final /* synthetic */ kh b;

    ki(kh kh2, jl jl2) {
        this.b = kh2;
        this.a = jl2;
    }

    public Object get(int n2) {
        return ((Map.Entry)this.a.get(n2)).getValue();
    }

    @Override
    iz b() {
        return this.b;
    }
}

