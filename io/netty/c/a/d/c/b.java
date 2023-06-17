/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.c.ac;
import io.netty.util.c.d;
import io.netty.util.e;
import io.netty.util.z;

public class b
extends ac {
    public b() {
        super(bi.a(0));
    }

    public b(int n2, String string) {
        this(true, 0, n2, string);
    }

    public b(boolean bl2, int n2) {
        this(bl2, n2, bi.a(0));
    }

    public b(boolean bl2, int n2, int n3, String string) {
        super(bl2, n2, b.a(n3, string));
    }

    private static g a(int n2, String string) {
        byte[] arrby = d.a;
        if (string != null) {
            arrby = string.getBytes(e.d);
        }
        g g2 = bi.a(2 + arrby.length);
        g2.C(n2);
        if (arrby.length > 0) {
            g2.c(arrby);
        }
        g2.g(0);
        return g2;
    }

    public b(boolean bl2, int n2, g g2) {
        super(bl2, n2, g2);
    }

    public int e() {
        g g2 = this.a();
        if (g2 == null || g2.j() == 0) {
            return -1;
        }
        g2.g(0);
        short s2 = g2.G();
        g2.g(0);
        return s2;
    }

    public String f() {
        g g2 = this.a();
        if (g2 == null || g2.j() <= 2) {
            return "";
        }
        g2.g(2);
        String string = g2.a(e.d);
        g2.g(0);
        return string;
    }

    public b g() {
        return new b(this.m(), this.n(), this.a().Q());
    }

    public b k() {
        return new b(this.m(), this.n(), this.a().S());
    }

    public b l() {
        super.h();
        return this;
    }

    public b b(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public /* synthetic */ ac c(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ ac h() {
        return this.l();
    }

    @Override
    public /* synthetic */ ac i() {
        return this.k();
    }

    @Override
    public /* synthetic */ ac j() {
        return this.g();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.l();
    }

    @Override
    public /* synthetic */ i c() {
        return this.k();
    }

    @Override
    public /* synthetic */ i b() {
        return this.g();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.l();
    }
}

