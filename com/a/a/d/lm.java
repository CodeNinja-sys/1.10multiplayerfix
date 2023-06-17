/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.dw;
import com.a.a.d.jl;
import com.a.a.d.lf;
import com.a.a.d.mq;
import com.a.a.d.yl;

final class lm
extends jl {
    private final boolean b;
    private final boolean c;
    private final int d;
    final /* synthetic */ lf a;

    lm(lf lf2) {
        this.a = lf2;
        this.b = ((yl)lf.a(lf2).get(0)).d();
        this.c = ((yl)mq.h(lf.a(lf2))).g();
        int n2 = lf.a(lf2).size() - 1;
        if (this.b) {
            ++n2;
        }
        if (this.c) {
            ++n2;
        }
        this.d = n2;
    }

    @Override
    public int size() {
        return this.d;
    }

    public yl b(int n2) {
        cl.a(n2, this.d);
        dw dw2 = this.b ? (n2 == 0 ? dw.d() : ((yl)lf.a((lf)this.a).get((int)(n2 - 1))).c) : ((yl)lf.a((lf)this.a).get((int)n2)).c;
        dw dw3 = this.c && n2 == this.d - 1 ? dw.e() : ((yl)lf.a((lf)this.a).get((int)(n2 + (this.b ? 0 : 1)))).b;
        return yl.a(dw2, dw3);
    }

    @Override
    boolean a() {
        return true;
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

