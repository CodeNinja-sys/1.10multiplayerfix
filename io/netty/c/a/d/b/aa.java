/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.b.ab;
import io.netty.c.a.d.b.x;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.br;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.h;
import io.netty.c.a.d.u;
import io.netty.c.a.d.v;
import io.netty.util.z;

final class aa
extends ab
implements v {
    private final ad a;

    private aa(bj bj2, ad ad2) {
        super(bj2);
        this.a = ad2;
    }

    @Override
    public v a(br br2) {
        super.b(br2);
        return this;
    }

    @Override
    public v a(aw aw2) {
        super.b(aw2);
        return this;
    }

    @Override
    public v a(String string) {
        super.b(string);
        return this;
    }

    @Override
    public v m() {
        h h2 = new h(this.r(), this.s(), this.t(), this.a().Q());
        h2.q().b(this.q());
        h2.e().b(this.e());
        return h2;
    }

    public v n() {
        h h2 = new h(this.r(), this.s(), this.t(), this.a().S());
        h2.q().b(this.q());
        h2.e().b(this.e());
        return h2;
    }

    @Override
    public v d(int n2) {
        this.a.c(n2);
        return this;
    }

    @Override
    public v l() {
        this.a.j();
        return this;
    }

    @Override
    public g a() {
        return this.a.a();
    }

    @Override
    public ar e() {
        if (this.a instanceof bs) {
            return ((bs)this.a).e();
        }
        return ar.b;
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public boolean ad() {
        return this.a.ad();
    }

    @Override
    public boolean I(int n2) {
        return this.a.I(n2);
    }

    @Override
    public /* synthetic */ bj b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ bj b(aw aw2) {
        return this.a(aw2);
    }

    @Override
    public /* synthetic */ bj b(br br2) {
        return this.a(br2);
    }

    @Override
    public /* synthetic */ av c(br br2) {
        return this.a(br2);
    }

    @Override
    public /* synthetic */ u o() {
        return this.l();
    }

    @Override
    public /* synthetic */ u e(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ u p() {
        return this.m();
    }

    @Override
    public /* synthetic */ bs g() {
        return this.l();
    }

    @Override
    public /* synthetic */ bs b(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ bs f() {
        return this.m();
    }

    @Override
    public /* synthetic */ ad c(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ ad j() {
        return this.l();
    }

    @Override
    public /* synthetic */ ad h() {
        return this.n();
    }

    @Override
    public /* synthetic */ ad k() {
        return this.m();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.l();
    }

    @Override
    public /* synthetic */ i c() {
        return this.n();
    }

    @Override
    public /* synthetic */ i b() {
        return this.m();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.l();
    }

    /* synthetic */ aa(bj bj2, ad ad2, x x2) {
        this(bj2, ad2);
    }
}

