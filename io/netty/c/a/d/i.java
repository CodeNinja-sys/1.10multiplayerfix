/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.k;
import io.netty.c.a.d.r;
import io.netty.c.a.d.u;
import io.netty.c.a.d.w;
import io.netty.util.z;

public class i
extends r
implements w {
    private final g a;
    private final ar c;
    private final boolean d;

    public i(br br2, bp bp2) {
        this(br2, bp2, bi.a(0));
    }

    public i(br br2, bp bp2, g g2) {
        this(br2, bp2, g2, true);
    }

    public i(br br2, bp bp2, g g2, boolean bl2) {
        super(br2, bp2, bl2);
        if (g2 == null) {
            throw new NullPointerException("content");
        }
        this.a = g2;
        this.c = new k(bl2);
        this.d = bl2;
    }

    @Override
    public ar e() {
        return this.c;
    }

    @Override
    public g a() {
        return this.a;
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public w l() {
        this.a.ab();
        return this;
    }

    @Override
    public w d(int n2) {
        this.a.H(n2);
        return this;
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
    public w a(br br2) {
        super.b(br2);
        return this;
    }

    @Override
    public w a(bp bp2) {
        super.b(bp2);
        return this;
    }

    @Override
    public w m() {
        i i2 = new i(this.r(), this.s(), this.a().Q(), this.d);
        i2.q().b(this.q());
        i2.e().b(this.e());
        return i2;
    }

    public w n() {
        i i2 = new i(this.r(), this.s(), this.a().S(), this.d);
        i2.q().b(this.q());
        i2.e().b(this.e());
        return i2;
    }

    @Override
    public /* synthetic */ bm b(br br2) {
        return this.a(br2);
    }

    @Override
    public /* synthetic */ bm b(bp bp2) {
        return this.a(bp2);
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
    public /* synthetic */ io.netty.b.i a(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ io.netty.b.i bC_() {
        return this.l();
    }

    @Override
    public /* synthetic */ io.netty.b.i c() {
        return this.n();
    }

    @Override
    public /* synthetic */ io.netty.b.i b() {
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
}

