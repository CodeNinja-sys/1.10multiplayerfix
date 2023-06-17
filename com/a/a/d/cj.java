/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.ci;
import com.a.a.d.jl;
import java.util.List;

class cj
extends jl {
    final /* synthetic */ int a;
    final /* synthetic */ ci b;

    cj(ci ci2, int n2) {
        this.b = ci2;
        this.a = n2;
    }

    @Override
    public int size() {
        return ci.a(this.b).size();
    }

    public Object get(int n2) {
        cl.a(n2, this.size());
        int n3 = ci.a(this.b, this.a, n2);
        return ((List)ci.a(this.b).get(n2)).get(n3);
    }

    @Override
    boolean a() {
        return true;
    }
}

