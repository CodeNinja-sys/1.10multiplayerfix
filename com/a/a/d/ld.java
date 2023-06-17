/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jl;
import com.a.a.d.lb;
import com.a.a.d.yl;
import com.a.a.d.yq;
import java.util.Map;

class ld
extends lb {
    final /* synthetic */ yl a;
    final /* synthetic */ lb b;
    final /* synthetic */ lb c;

    ld(lb lb2, jl jl2, jl jl3, yl yl2, lb lb3) {
        this.c = lb2;
        this.a = yl2;
        this.b = lb3;
        super(jl2, jl3);
    }

    @Override
    public lb b(yl yl2) {
        if (this.a.b(yl2)) {
            return this.b.b(yl2.c(this.a));
        }
        return lb.a();
    }

    @Override
    public /* synthetic */ yq c(yl yl2) {
        return this.b(yl2);
    }

    @Override
    public /* synthetic */ Map f() {
        return super.e();
    }
}

