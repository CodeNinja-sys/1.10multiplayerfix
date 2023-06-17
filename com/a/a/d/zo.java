/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ir;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.sz;
import com.a.a.d.zl;
import com.a.a.d.zn;
import java.util.Map;

class zo
extends ir {
    private final jl b;
    final /* synthetic */ zn a;

    zo(zn zn2) {
        this.a = zn2;
        this.b = this.a.a.a().h();
    }

    public Map.Entry b(int n2) {
        return sz.a(this.b.get(n2), zl.a(this.a.a).get(n2));
    }

    @Override
    iz b() {
        return this.a;
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

