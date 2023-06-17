/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.u.aw;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;

public class ak
extends ap
implements aw {
    public float a;
    public float b;
    public int c;
    private int d;

    @Override
    public void a() {
        double d2;
        if (++this.d % 20 * 4 == 0) {
            this.k.c(this.l, p.bQ, 1, this.c);
        }
        this.b = this.a;
        int n2 = this.l.cy_();
        int n3 = this.l.k();
        int n4 = this.l.l();
        float f2 = 0.1f;
        if (this.c > 0 && this.a == 0.0f) {
            double d3 = (double)n2 + 0.5;
            d2 = (double)n4 + 0.5;
            this.k.a(null, d3, (double)n3 + 0.5, d2, f.aN, bu.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
        }
        if (this.c == 0 && this.a > 0.0f || this.c > 0 && this.a < 1.0f) {
            float f3 = this.a;
            this.a = this.c > 0 ? (this.a += 0.1f) : (this.a -= 0.1f);
            if (this.a > 1.0f) {
                this.a = 1.0f;
            }
            float f4 = 0.5f;
            if (this.a < 0.5f && f3 >= 0.5f) {
                d2 = (double)n2 + 0.5;
                double d4 = (double)n4 + 0.5;
                this.k.a(null, d2, (double)n3 + 0.5, d4, f.aM, bu.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
            }
            if (this.a < 0.0f) {
                this.a = 0.0f;
            }
        }
    }

    @Override
    public boolean c(int n2, int n3) {
        if (n2 == 1) {
            this.c = n3;
            return true;
        }
        return super.c(n2, n3);
    }

    @Override
    public void bP_() {
        this.bN_();
        super.bP_();
    }

    public void b() {
        ++this.c;
        this.k.c(this.l, p.bQ, 1, this.c);
    }

    public void g() {
        --this.c;
        this.k.c(this.l, p.bQ, 1, this.c);
    }

    public boolean a(b b2) {
        return this.k.q(this.l) != this ? false : b2.h((double)this.l.cy_() + 0.5, (double)this.l.k() + 0.5, (double)this.l.l() + 0.5) <= 64.0;
    }
}

