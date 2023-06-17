/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.c;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.q.c.a;
import net.minecraft.q.c.b;
import net.minecraft.u.b.m;
import net.minecraft.w.n;

public class d {
    private final List a = ov.a();
    private double b;
    private double c;
    private double d;
    private double e = this.d = 6.0E7;
    private long f;
    private long g;
    private int h = 29999984;
    private double i = 0.2;
    private double j = 5.0;
    private int k = 15;
    private int l = 5;

    public boolean a(net.minecraft.u.b.b b2) {
        return (double)(b2.cy_() + 1) > this.d() && (double)b2.cy_() < this.f() && (double)(b2.l() + 1) > this.e() && (double)b2.l() < this.g();
    }

    public boolean a(m m2) {
        return (double)m2.e() > this.d() && (double)m2.c() < this.f() && (double)m2.f() > this.e() && (double)m2.d() < this.g();
    }

    public boolean a(net.minecraft.u.b.a a2) {
        return a2.d > this.d() && a2.a < this.f() && a2.f > this.e() && a2.c < this.g();
    }

    public double a(n n2) {
        return this.a(n2.aU, n2.aW);
    }

    public double a(double d2, double d3) {
        double d4 = d3 - this.e();
        double d5 = this.g() - d3;
        double d6 = d2 - this.d();
        double d7 = this.f() - d2;
        double d8 = Math.min(d6, d7);
        d8 = Math.min(d8, d4);
        return Math.min(d8, d5);
    }

    public a c() {
        return this.e < this.d ? net.minecraft.q.c.a.b : (this.e > this.d ? net.minecraft.q.c.a.a : net.minecraft.q.c.a.c);
    }

    public double d() {
        double d2 = this.a() - this.h() / 2.0;
        if (d2 < (double)(-this.h)) {
            d2 = -this.h;
        }
        return d2;
    }

    public double e() {
        double d2 = this.b() - this.h() / 2.0;
        if (d2 < (double)(-this.h)) {
            d2 = -this.h;
        }
        return d2;
    }

    public double f() {
        double d2 = this.a() + this.h() / 2.0;
        if (d2 > (double)this.h) {
            d2 = this.h;
        }
        return d2;
    }

    public double g() {
        double d2 = this.b() + this.h() / 2.0;
        if (d2 > (double)this.h) {
            d2 = this.h;
        }
        return d2;
    }

    public double a() {
        return this.b;
    }

    public double b() {
        return this.c;
    }

    public void b(double d2, double d3) {
        this.b = d2;
        this.c = d3;
        for (b b2 : this.k()) {
            b2.a(this, d2, d3);
        }
    }

    public double h() {
        if (this.c() != net.minecraft.q.c.a.c) {
            double d2 = (float)(System.currentTimeMillis() - this.g) / (float)(this.f - this.g);
            if (d2 < 1.0) {
                return this.d + (this.e - this.d) * d2;
            }
            this.a(this.e);
        }
        return this.d;
    }

    public long i() {
        return this.c() == net.minecraft.q.c.a.c ? 0L : this.f - System.currentTimeMillis();
    }

    public double j() {
        return this.e;
    }

    public void a(double d2) {
        this.d = d2;
        this.e = d2;
        this.g = this.f = System.currentTimeMillis();
        for (b b2 : this.k()) {
            b2.a(this, d2);
        }
    }

    public void a(double d2, double d3, long l2) {
        this.d = d2;
        this.e = d3;
        this.g = System.currentTimeMillis();
        this.f = this.g + l2;
        for (b b2 : this.k()) {
            b2.a(this, d2, d3, l2);
        }
    }

    protected List k() {
        return ov.a((Iterable)this.a);
    }

    public void a(b b2) {
        this.a.add(b2);
    }

    public void a(int n2) {
        this.h = n2;
    }

    public int l() {
        return this.h;
    }

    public double m() {
        return this.j;
    }

    public void b(double d2) {
        this.j = d2;
        for (b b2 : this.k()) {
            b2.c(this, d2);
        }
    }

    public double n() {
        return this.i;
    }

    public void c(double d2) {
        this.i = d2;
        for (b b2 : this.k()) {
            b2.b(this, d2);
        }
    }

    public double o() {
        return this.f == this.g ? 0.0 : Math.abs(this.d - this.e) / (double)(this.f - this.g);
    }

    public int p() {
        return this.k;
    }

    public void b(int n2) {
        this.k = n2;
        for (b b2 : this.k()) {
            b2.a(this, n2);
        }
    }

    public int q() {
        return this.l;
    }

    public void c(int n2) {
        this.l = n2;
        for (b b2 : this.k()) {
            b2.b(this, n2);
        }
    }
}

