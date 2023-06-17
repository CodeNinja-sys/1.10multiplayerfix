/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.b.t;

public class g
extends b {
    protected int a;
    protected int b;
    protected int d;

    public g() {
        this(0, 0, 0);
    }

    public g(b b2) {
        this(b2.cy_(), b2.k(), b2.l());
    }

    public g(int n2, int n3, int n4) {
        super(0, 0, 0);
        this.a = n2;
        this.b = n3;
        this.d = n4;
    }

    @Override
    public int cy_() {
        return this.a;
    }

    @Override
    public int k() {
        return this.b;
    }

    @Override
    public int l() {
        return this.d;
    }

    public g b(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.d = n4;
        return this;
    }

    public g a(net.minecraft.w.n n2) {
        return this.b(n2.aU, n2.aV, n2.aW);
    }

    public g b(double d2, double d3, double d4) {
        return this.b(n.c(d2), n.c(d3), n.c(d4));
    }

    public g e(t t2) {
        return this.b(t2.cy_(), t2.k(), t2.l());
    }

    public g b(ad ad2) {
        return this.b(ad2, 1);
    }

    public g b(ad ad2, int n2) {
        return this.b(this.a + ad2.h() * n2, this.b + ad2.i() * n2, this.d + ad2.j() * n2);
    }

    public void g(int n2) {
        this.b = n2;
    }

    @Override
    public b i() {
        return new b(this);
    }
}

