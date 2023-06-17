/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class az
extends cb {
    private final float a;

    protected az(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.j = this.j * (double)0.01f + d5;
        this.k = this.k * (double)0.01f + d6;
        this.l = this.l * (double)0.01f + d7;
        this.g += (double)((this.r.nextFloat() - this.r.nextFloat()) * 0.05f);
        this.h += (double)((this.r.nextFloat() - this.r.nextFloat()) * 0.05f);
        this.i += (double)((this.r.nextFloat() - this.r.nextFloat()) * 0.05f);
        this.a = this.y;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.d(48);
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.w + f2) / (float)this.x;
        this.y = this.a * (1.0f - f8 * f8 * 0.5f);
        super.a(g2, n2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public int a(float f2) {
        float f3 = ((float)this.w + f2) / (float)this.x;
        f3 = net.minecraft.u.b.n.a(f3, 0.0f, 1.0f);
        int n2 = super.a(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.w++ >= this.x) {
            this.h();
        }
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.96f;
        this.k *= (double)0.96f;
        this.l *= (double)0.96f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }
}

