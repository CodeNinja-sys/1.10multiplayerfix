/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.lb;
import com.a.a.d.yl;

class lc
extends jl {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ yl c;
    final /* synthetic */ lb d;

    lc(lb lb2, int n2, int n3, yl yl2) {
        this.d = lb2;
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
            return ((yl)lb.a(this.d).get(n2 + this.b)).c(this.c);
        }
        return (yl)lb.a(this.d).get(n2 + this.b);
    }

    @Override
    boolean a() {
        return true;
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

