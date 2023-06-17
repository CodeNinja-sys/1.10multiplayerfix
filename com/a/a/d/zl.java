/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.d.lw;
import com.a.a.d.me;
import com.a.a.d.zn;
import com.a.a.d.zq;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;

final class zl
extends lw {
    private final transient zq a;
    private final transient jl b;

    zl(zq zq2, jl jl2) {
        this.a = zq2;
        this.b = jl2;
    }

    zl(zq zq2, jl jl2, lw lw2) {
        super(lw2);
        this.a = zq2;
        this.b = jl2;
    }

    @Override
    lo d() {
        return new zn(this, null);
    }

    @Override
    public me a() {
        return this.a;
    }

    @Override
    public iz aU_() {
        return this.b;
    }

    @Override
    public Object get(Object object) {
        int n2 = this.a.c(object);
        return n2 == -1 ? null : this.b.get(n2);
    }

    private lw a(int n2, int n3) {
        if (n2 == 0 && n3 == this.size()) {
            return this;
        }
        if (n2 == n3) {
            return zl.a(this.comparator());
        }
        return zl.a(this.a.a(n2, n3), this.b.a(n2, n3));
    }

    @Override
    public lw a(Object object, boolean bl2) {
        return this.a(0, this.a.e(cl.a(object), bl2));
    }

    @Override
    public lw b(Object object, boolean bl2) {
        return this.a(this.a.f(cl.a(object), bl2), this.size());
    }

    @Override
    lw i() {
        return new zl((zq)this.a.aP_(), this.b.f(), this);
    }

    @Override
    public /* synthetic */ NavigableMap tailMap(Object object, boolean bl2) {
        return this.b(object, bl2);
    }

    @Override
    public /* synthetic */ NavigableMap headMap(Object object, boolean bl2) {
        return this.a(object, bl2);
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.aU_();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.a();
    }

    @Override
    public /* synthetic */ lo g() {
        return this.a();
    }

    static /* synthetic */ jl a(zl zl2) {
        return zl2.b;
    }
}

