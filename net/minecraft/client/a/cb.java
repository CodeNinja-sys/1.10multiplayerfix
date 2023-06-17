/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import java.util.List;
import java.util.Random;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;

public class cb {
    private static final a a = new a(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    protected k c;
    protected double d;
    protected double e;
    protected double f;
    protected double g;
    protected double h;
    protected double i;
    protected double j;
    protected double k;
    protected double l;
    private a b = a;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected float p = 0.6f;
    protected float q = 1.8f;
    protected Random r = new Random();
    protected int s;
    protected int t;
    protected float u;
    protected float v;
    protected int w;
    protected int x;
    protected float y;
    protected float z;
    protected float A;
    protected float B;
    protected float C;
    protected float D = 1.0f;
    protected d E;
    protected float F;
    protected float G;
    public static double H;
    public static double I;
    public static double J;
    public static s K;

    protected cb(k k2, double d2, double d3, double d4) {
        this.c = k2;
        this.a(0.2f, 0.2f);
        this.b(d2, d3, d4);
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.u = this.r.nextFloat() * 3.0f;
        this.v = this.r.nextFloat() * 3.0f;
        this.y = (this.r.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.x = (int)(4.0f / (this.r.nextFloat() * 0.9f + 0.1f));
        this.w = 0;
        this.n = true;
    }

    public cb(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(k2, d2, d3, d4);
        this.j = d5 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.k = d6 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.l = d7 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        float f2 = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f3 = net.minecraft.u.b.n.a(this.j * this.j + this.k * this.k + this.l * this.l);
        this.j = this.j / (double)f3 * (double)f2 * (double)0.4f;
        this.k = this.k / (double)f3 * (double)f2 * (double)0.4f + (double)0.1f;
        this.l = this.l / (double)f3 * (double)f2 * (double)0.4f;
    }

    public cb b(float f2) {
        this.j *= (double)f2;
        this.k = (this.k - (double)0.1f) * (double)f2 + (double)0.1f;
        this.l *= (double)f2;
        return this;
    }

    public cb c(float f2) {
        this.a(0.2f * f2, 0.2f * f2);
        this.y *= f2;
        return this;
    }

    public void a(float f2, float f3, float f4) {
        this.A = f2;
        this.B = f3;
        this.C = f4;
    }

    public void d(float f2) {
        this.D = f2;
    }

    public boolean bX_() {
        return false;
    }

    public float d() {
        return this.A;
    }

    public float e() {
        return this.B;
    }

    public float f() {
        return this.C;
    }

    public void c(int n2) {
        this.x = n2;
    }

    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.w++ >= this.x) {
            this.h();
        }
        this.k -= 0.04 * (double)this.z;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        this.l *= (double)0.98f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }

    public void a(g g2, net.minecraft.w.n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = (float)this.s / 16.0f;
        float f9 = f8 + 0.0624375f;
        float f10 = (float)this.t / 16.0f;
        float f11 = f10 + 0.0624375f;
        float f12 = 0.1f * this.y;
        if (this.E != null) {
            f8 = this.E.e();
            f9 = this.E.f();
            f10 = this.E.g();
            f11 = this.E.h();
        }
        float f13 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f14 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        float f15 = (float)(this.f + (this.i - this.f) * (double)f2 - J);
        int n3 = this.a(f2);
        int n4 = n3 >> 16 & 0xFFFF;
        int n5 = n3 & 0xFFFF;
        s[] arrs = new s[]{new s(-f3 * f12 - f6 * f12, -f4 * f12, -f5 * f12 - f7 * f12), new s(-f3 * f12 + f6 * f12, f4 * f12, -f5 * f12 + f7 * f12), new s(f3 * f12 + f6 * f12, f4 * f12, f5 * f12 + f7 * f12), new s(f3 * f12 - f6 * f12, -f4 * f12, f5 * f12 - f7 * f12)};
        if (this.F != 0.0f) {
            float f16 = this.F + (this.F - this.G) * f2;
            float f17 = net.minecraft.u.b.n.b(f16 * 0.5f);
            float f18 = net.minecraft.u.b.n.a(f16 * 0.5f) * (float)cb.K.b;
            float f19 = net.minecraft.u.b.n.a(f16 * 0.5f) * (float)cb.K.c;
            float f20 = net.minecraft.u.b.n.a(f16 * 0.5f) * (float)cb.K.d;
            s s2 = new s(f18, f19, f20);
            for (int i2 = 0; i2 < 4; ++i2) {
                arrs[i2] = s2.a(2.0 * arrs[i2].b(s2)).e(arrs[i2].a((double)(f17 * f17) - s2.b(s2))).e(s2.c(arrs[i2]).a((double)(2.0f * f17)));
            }
        }
        g2.b((double)f13 + arrs[0].b, (double)f14 + arrs[0].c, (double)f15 + arrs[0].d).a(f9, f11).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
        g2.b((double)f13 + arrs[1].b, (double)f14 + arrs[1].c, (double)f15 + arrs[1].d).a(f9, f10).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
        g2.b((double)f13 + arrs[2].b, (double)f14 + arrs[2].c, (double)f15 + arrs[2].d).a(f8, f10).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
        g2.b((double)f13 + arrs[3].b, (double)f14 + arrs[3].c, (double)f15 + arrs[3].d).a(f8, f11).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
    }

    public int a() {
        return 0;
    }

    public void a(d d2) {
        int n2 = this.a();
        if (n2 != 1) {
            throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
        }
        this.E = d2;
    }

    public void d(int n2) {
        if (this.a() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.s = n2 % 16;
        this.t = n2 / 16;
    }

    public void g() {
        ++this.s;
    }

    public String toString() {
        return String.valueOf(this.getClass().getSimpleName()) + ", Pos (" + this.g + "," + this.h + "," + this.i + "), RGBA (" + this.A + "," + this.B + "," + this.C + "," + this.D + "), Age " + this.w;
    }

    public void h() {
        this.o = true;
    }

    protected void a(float f2, float f3) {
        if (f2 != this.p || f3 != this.q) {
            this.p = f2;
            this.q = f3;
            a a2 = this.k();
            this.a(new a(a2.a, a2.b, a2.c, a2.a + (double)this.p, a2.b + (double)this.q, a2.c + (double)this.p));
        }
    }

    public void b(double d2, double d3, double d4) {
        this.g = d2;
        this.h = d3;
        this.i = d4;
        float f2 = this.p / 2.0f;
        float f3 = this.q;
        this.a(new a(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public void a(double d2, double d3, double d4) {
        double d5 = d3;
        if (this.n) {
            List list = this.c.a((net.minecraft.w.n)null, this.k().a(d2, d3, d4));
            for (a a2 : list) {
                d3 = a2.b(this.k(), d3);
            }
            this.a(this.k().c(0.0, d3, 0.0));
            for (a a2 : list) {
                d2 = a2.a(this.k(), d2);
            }
            this.a(this.k().c(d2, 0.0, 0.0));
            for (a a2 : list) {
                d4 = a2.c(this.k(), d4);
            }
            this.a(this.k().c(0.0, 0.0, d4));
        } else {
            this.a(this.k().c(d2, d3, d4));
        }
        this.i();
        boolean bl2 = this.m = d3 != d3 && d5 < 0.0;
        if (d2 != d2) {
            this.j = 0.0;
        }
        if (d4 != d4) {
            this.l = 0.0;
        }
    }

    protected void i() {
        a a2 = this.k();
        this.g = (a2.a + a2.d) / 2.0;
        this.h = a2.b;
        this.i = (a2.c + a2.f) / 2.0;
    }

    public int a(float f2) {
        b b2 = new b(this.g, this.h, this.i);
        return this.c.d(b2) ? this.c.b(b2, 0) : 0;
    }

    public boolean j() {
        return !this.o;
    }

    public a k() {
        return this.b;
    }

    public void a(a a2) {
        this.b = a2;
    }
}

