/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.h;

import com.c.a.e;
import net.minecraft.client.h.a;
import net.minecraft.client.r;
import net.minecraft.q.k;
import net.minecraft.u.b.n;

public class b
extends a {
    private int d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;

    public b(k k2, e e2) {
        super(k2, e2);
        this.bu = 0.0f;
        this.bv = true;
        this.H = 0.25f;
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cT().a() * 10.0;
        if (Double.isNaN(d3)) {
            d3 = 1.0;
        }
        return d2 < (d3 = d3 * 64.0 * net.minecraft.client.h.b.cO()) * d3;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        return true;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = f2;
        this.i = f3;
        this.d = n2;
    }

    @Override
    public void cE_() {
        this.H = 0.0f;
        super.cE_();
        this.ac = this.ad;
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f2 = n.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.ad += (f2 - this.ad) * 0.4f;
        this.ae += this.ad;
    }

    @Override
    public void n() {
        if (this.d > 0) {
            double d2;
            double d3 = this.aU + (this.e - this.aU) / (double)this.d;
            double d4 = this.aV + (this.f - this.aV) / (double)this.d;
            double d5 = this.aW + (this.g - this.aW) / (double)this.d;
            for (d2 = this.h - (double)this.ba; d2 < -180.0; d2 += 360.0) {
            }
            while (d2 >= 180.0) {
                d2 -= 360.0;
            }
            this.ba = (float)((double)this.ba + d2 / (double)this.d);
            this.bb = (float)((double)this.bb + (this.i - (double)this.bb) / (double)this.d);
            --this.d;
            this.e(d3, d4, d5);
            this.e(this.ba, this.bb);
        }
        this.v = this.w;
        this.bz();
        float f2 = n.a(this.aX * this.aX + this.aZ * this.aZ);
        float f3 = (float)Math.atan(-this.aY * (double)0.2f) * 15.0f;
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.be || this.bo() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.be || this.bo() <= 0.0f) {
            f3 = 0.0f;
        }
        this.w += (f2 - this.w) * 0.4f;
        this.ah += (f3 - this.ah) * 0.8f;
        this.aQ.A.a("push");
        this.bK();
        this.aQ.A.b();
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        net.minecraft.client.r.z().t.c().a(a2);
    }

    @Override
    public boolean a(int n2, String string) {
        return false;
    }

    @Override
    public net.minecraft.u.b.b aC() {
        return new net.minecraft.u.b.b(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5);
    }
}

