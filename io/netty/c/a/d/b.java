/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.s;
import io.netty.c.a.h;
import io.netty.util.z;

final class b
implements bs {
    private final ar a;
    private h c;

    b(ar ar2) {
        this.a = ar2;
    }

    @Override
    public ar e() {
        return this.a;
    }

    @Override
    public bs f() {
        s s2 = new s(bi.c);
        s2.e().b(this.e());
        return s2;
    }

    @Override
    public bs b(int n2) {
        return this;
    }

    @Override
    public bs g() {
        return this;
    }

    @Override
    public ad h() {
        return this.f();
    }

    @Override
    public g a() {
        return bi.c;
    }

    @Override
    public h i() {
        return this.c;
    }

    @Override
    public void a(h h2) {
        this.c = h2;
    }

    @Override
    public int ac() {
        return 1;
    }

    @Override
    public boolean ad() {
        return false;
    }

    @Override
    public boolean I(int n2) {
        return false;
    }

    @Override
    public /* synthetic */ ad c(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ ad j() {
        return this.g();
    }

    @Override
    public /* synthetic */ ad k() {
        return this.f();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.g();
    }

    @Override
    public /* synthetic */ i c() {
        return this.h();
    }

    @Override
    public /* synthetic */ i b() {
        return this.f();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.g();
    }
}

