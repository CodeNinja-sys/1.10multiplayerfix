/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class aw {
    private final f a;
    private float b;
    private float c;
    private boolean d;
    private double e;
    private double f;
    private double g;

    public aw(f f2) {
        this.a = f2;
    }

    public void a(n n2, float f2, float f3) {
        this.e = n2.aU;
        this.f = n2 instanceof l ? n2.aV + (double)n2.ce_() : (n2.cT().b + n2.cT().e) / 2.0;
        this.g = n2.aW;
        this.b = f2;
        this.c = f3;
        this.d = true;
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.b = f2;
        this.c = f3;
        this.d = true;
    }

    public void a() {
        this.a.bb = 0.0f;
        if (this.d) {
            this.d = false;
            double d2 = this.e - this.a.aU;
            double d3 = this.f - (this.a.aV + (double)this.a.ce_());
            double d4 = this.g - this.a.aW;
            double d5 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
            float f2 = (float)(net.minecraft.u.b.n.b(d4, d2) * 57.29577951308232) - 90.0f;
            float f3 = (float)(-(net.minecraft.u.b.n.b(d3, d5) * 57.29577951308232));
            this.a.bb = this.a(this.a.bb, f3, this.c);
            this.a.am = this.a(this.a.am, f2, this.b);
        } else {
            this.a.am = this.a(this.a.am, this.a.ak, 10.0f);
        }
        float f4 = net.minecraft.u.b.n.g(this.a.am - this.a.ak);
        if (!this.a.N().l()) {
            if (f4 < -75.0f) {
                this.a.am = this.a.ak - 75.0f;
            }
            if (f4 > 75.0f) {
                this.a.am = this.a.ak + 75.0f;
            }
        }
    }

    private float a(float f2, float f3, float f4) {
        float f5 = net.minecraft.u.b.n.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    public boolean b() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }

    public double e() {
        return this.g;
    }
}

