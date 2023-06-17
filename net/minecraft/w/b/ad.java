/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.u.b.n;
import net.minecraft.w.b.ax;
import net.minecraft.w.d;
import net.minecraft.w.f;

public class ad {
    protected final f a;
    protected double b;
    protected double c;
    protected double d;
    protected double e;
    protected float f;
    protected float g;
    protected ax h = ax.a;

    public ad(f f2) {
        this.a = f2;
    }

    public boolean a() {
        return this.h == ax.b;
    }

    public double b() {
        return this.e;
    }

    public void a(double d2, double d3, double d4, double d5) {
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.h = ax.b;
    }

    public void a(float f2, float f3) {
        this.h = ax.c;
        this.f = f2;
        this.g = f3;
        this.e = 0.25;
    }

    public void a(ad ad2) {
        this.h = ad2.h;
        this.b = ad2.b;
        this.c = ad2.c;
        this.d = ad2.d;
        this.e = Math.max(ad2.e, 1.0);
        this.f = ad2.f;
        this.g = ad2.g;
    }

    public void c() {
        if (this.h == ax.c) {
            net.minecraft.i.d d2;
            float f2 = (float)this.a.a(net.minecraft.w.d.d).f();
            float f3 = (float)this.e * f2;
            float f4 = this.f;
            float f5 = this.g;
            float f6 = n.c(f4 * f4 + f5 * f5);
            if (f6 < 1.0f) {
                f6 = 1.0f;
            }
            f6 = f3 / f6;
            float f7 = n.a(this.a.ba * ((float)Math.PI / 180));
            float f8 = n.b(this.a.ba * ((float)Math.PI / 180));
            float f9 = (f4 *= f6) * f8 - (f5 *= f6) * f7;
            float f10 = f5 * f8 + f4 * f7;
            j j2 = this.a.N();
            if (j2 != null && (d2 = j2.o()) != null && d2.a(this.a.aQ, n.c(this.a.aU + (double)f9), n.c(this.a.aV), n.c(this.a.aW + (double)f10)) != net.minecraft.i.h.c) {
                this.f = 1.0f;
                this.g = 0.0f;
                f3 = f2;
            }
            this.a.e_(f3);
            this.a.b(this.f);
            this.a.e(this.g);
            this.h = ax.a;
        } else if (this.h == ax.b) {
            this.h = ax.a;
            double d3 = this.b - this.a.aU;
            double d4 = this.c - this.a.aV;
            double d5 = this.d - this.a.aW;
            double d6 = d3 * d3 + d4 * d4 + d5 * d5;
            if (d6 < 2.500000277905201E-7) {
                this.a.b(0.0f);
                return;
            }
            float f11 = (float)(n.b(d5, d3) * 57.29577951308232) - 90.0f;
            this.a.ba = this.a(this.a.ba, f11, 90.0f);
            this.a.e_((float)(this.e * this.a.a(net.minecraft.w.d.d).f()));
            if (d4 > (double)this.a.bu && d3 * d3 + d5 * d5 < (double)Math.max(1.0f, this.a.bl)) {
                this.a.M().a();
            }
        } else {
            this.a.b(0.0f);
        }
    }

    protected float a(float f2, float f3, float f4) {
        float f5;
        float f6 = n.g(f3 - f2);
        if (f6 > f4) {
            f6 = f4;
        }
        if (f6 < -f4) {
            f6 = -f4;
        }
        if ((f5 = f2 + f6) < 0.0f) {
            f5 += 360.0f;
        } else if (f5 > 360.0f) {
            f5 -= 360.0f;
        }
        return f5;
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public double f() {
        return this.d;
    }
}

