/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.c.ac;
import io.netty.util.e;
import io.netty.util.z;

public class c
extends ac {
    public c() {
        this(bi.a(0));
    }

    public c(g g2) {
        super(g2);
    }

    public c(boolean bl2, int n2, g g2) {
        super(bl2, n2, g2);
    }

    public c(boolean bl2, int n2, String string) {
        this(bl2, n2, c.a(string));
    }

    public String e() {
        return this.a().a(e.d);
    }

    private static g a(String string) {
        if (string == null || string.isEmpty()) {
            return bi.c;
        }
        return bi.a(string, e.d);
    }

    public c f() {
        return new c(this.m(), this.n(), this.a().Q());
    }

    public c g() {
        return new c(this.m(), this.n(), this.a().S());
    }

    public c k() {
        super.h();
        return this;
    }

    public c b(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public /* synthetic */ ac c(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ ac h() {
        return this.k();
    }

    @Override
    public /* synthetic */ ac i() {
        return this.g();
    }

    @Override
    public /* synthetic */ ac j() {
        return this.f();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.k();
    }

    @Override
    public /* synthetic */ i c() {
        return this.g();
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
        return this.k();
    }
}

