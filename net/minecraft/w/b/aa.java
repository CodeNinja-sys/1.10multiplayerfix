/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.i.i;
import net.minecraft.q.k;
import net.minecraft.u.ah;
import net.minecraft.w.a.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.l;
import net.minecraft.w.t;

public class aa
extends bm {
    k a;
    protected t b;
    protected int c;
    double d;
    boolean e;
    i f;
    private int h;
    private double i;
    private double j;
    private double k;
    protected final int g = 20;

    public aa(t t2, double d2, boolean bl2) {
        this.b = t2;
        this.a = t2.aQ;
        this.d = d2;
        this.e = bl2;
        this.b(3);
    }

    @Override
    public boolean e() {
        l l2 = this.b.W();
        if (l2 == null) {
            return false;
        }
        if (!l2.br()) {
            return false;
        }
        this.f = this.b.N().a(l2);
        return this.f != null;
    }

    @Override
    public boolean a() {
        l l2 = this.b.W();
        return l2 == null ? false : (!l2.br() ? false : (!this.e ? !this.b.N().l() : (!this.b.f(new net.minecraft.u.b.b(l2)) ? false : !(l2 instanceof b) || !((b)l2).a() && !((b)l2).c())));
    }

    @Override
    public void b() {
        this.b.N().a(this.f, this.d);
        this.h = 0;
    }

    @Override
    public void c() {
        l l2 = this.b.W();
        if (l2 instanceof b && (((b)l2).a() || ((b)l2).c())) {
            this.b.c((l)null);
        }
        this.b.N().m();
    }

    @Override
    public void d() {
        l l2 = this.b.W();
        this.b.I().a(l2, 30.0f, 30.0f);
        double d2 = this.b.h(l2.aU, l2.cT().b, l2.aW);
        --this.h;
        if ((this.e || this.b.V().a(l2)) && this.h <= 0 && (this.i == 0.0 && this.j == 0.0 && this.k == 0.0 || l2.h(this.i, this.j, this.k) >= 1.0 || this.b.bd().nextFloat() < 0.05f)) {
            this.i = l2.aU;
            this.j = l2.cT().b;
            this.k = l2.aW;
            this.h = 4 + this.b.bd().nextInt(7);
            if (d2 > 1024.0) {
                this.h += 10;
            } else if (d2 > 256.0) {
                this.h += 5;
            }
            if (!this.b.N().a(l2, this.d)) {
                this.h += 15;
            }
        }
        this.c = Math.max(this.c - 1, 0);
        this.a(l2, d2);
        if (this.b.bv() instanceof net.minecraft.l.b.b) {
            this.c();
        }
    }

    protected void a(l l2, double d2) {
        double d3 = this.a(l2);
        if (d2 <= d3 && this.c <= 0) {
            this.c = 20;
            this.b.a(ah.a);
            this.b.j(l2);
        }
    }

    protected double a(l l2) {
        return this.b.bl * 2.0f * this.b.bl * 2.0f + l2.bl;
    }
}

