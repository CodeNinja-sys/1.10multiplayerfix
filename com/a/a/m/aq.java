/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.d.lo;
import com.a.a.m.an;
import com.a.a.m.as;

class aq
extends as {
    final /* synthetic */ an c;

    aq(an an2, an an3) {
        this.c = an2;
        super(an3);
    }

    @Override
    Iterable c(Object object) {
        return lo.j();
    }

    @Override
    jl a(Iterable iterable) {
        jn jn2 = jl.g();
        for (Object t2 : iterable) {
            if (this.b(t2).isInterface()) continue;
            jn2.c(t2);
        }
        return super.a(jn2.b());
    }
}

