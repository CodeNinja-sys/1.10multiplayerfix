/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agj;
import com.a.a.d.ir;
import com.a.a.d.iz;
import com.a.a.d.jl;
import java.util.ListIterator;

class yw
extends ir {
    private final iz a;
    private final jl b;

    yw(iz iz2, jl jl2) {
        this.a = iz2;
        this.b = jl2;
    }

    yw(iz iz2, Object[] arrobject) {
        this(iz2, jl.b(arrobject));
    }

    @Override
    iz b() {
        return this.a;
    }

    jl k() {
        return this.b;
    }

    @Override
    public agj a(int n2) {
        return this.b.a(n2);
    }

    @Override
    int a(Object[] arrobject, int n2) {
        return this.b.a(arrobject, n2);
    }

    public Object get(int n2) {
        return this.b.get(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.a(n2);
    }
}

