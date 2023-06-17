/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.lf;
import com.a.a.d.yl;

class lg
extends jl {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ yl c;
    final /* synthetic */ lf d;

    lg(lf lf2, int n2, int n3, yl yl2) {
        this.d = lf2;
        this.a = n2;
        this.b = n3;
        this.c = yl2;
    }

    @Override
    public int size() {
        return this.a;
    }

    public yl b(int n2) {
        cl.a(n2, this.a);
        if (n2 == 0 || n2 == this.a - 1) {
            return ((yl)lf.a(this.d).get(n2 + this.b)).c(this.c);
        }
        return (yl)lf.a(this.d).get(n2 + this.b);
    }

    @Override
    boolean a() {
        return true;
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

