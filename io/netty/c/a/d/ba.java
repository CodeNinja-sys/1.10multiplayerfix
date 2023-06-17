/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.ae;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.az;
import io.netty.c.a.d.br;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.u;
import io.netty.c.a.h;
import io.netty.util.z;

abstract class ba
extends ae
implements u {
    protected final av a;
    private ar c;

    private ba(av av2, g g2, ar ar2) {
        super(g2);
        this.a = av2;
        this.c = ar2;
    }

    @Override
    public ar e() {
        return this.c;
    }

    public void a(ar ar2) {
        this.c = ar2;
    }

    @Override
    public br r() {
        return this.a.r();
    }

    public u d(br br2) {
        this.a.c(br2);
        return this;
    }

    @Override
    public ar q() {
        return this.a.q();
    }

    @Override
    public h i() {
        return this.a.i();
    }

    @Override
    public void a(h h2) {
        this.a.a(h2);
    }

    @Override
    public u e(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public u o() {
        super.bC_();
        return this;
    }

    @Override
    public abstract u p();

    public abstract u n();

    @Override
    public /* synthetic */ i a(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.o();
    }

    @Override
    public /* synthetic */ i c() {
        return this.n();
    }

    @Override
    public /* synthetic */ i b() {
        return this.p();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.o();
    }

    @Override
    public /* synthetic */ av c(br br2) {
        return this.d(br2);
    }

    @Override
    public /* synthetic */ bs g() {
        return this.o();
    }

    @Override
    public /* synthetic */ bs b(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ bs f() {
        return this.p();
    }

    @Override
    public /* synthetic */ ad c(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ ad j() {
        return this.o();
    }

    @Override
    public /* synthetic */ ad h() {
        return this.n();
    }

    @Override
    public /* synthetic */ ad k() {
        return this.p();
    }

    /* synthetic */ ba(av av2, g g2, ar ar2, az az2) {
        this(av2, g2, ar2);
    }
}

