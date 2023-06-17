/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class bo
extends cb {
    private final float a;
    private final double b;
    private final double L;
    private final double M;

    protected bo(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.j = d5;
        this.k = d6;
        this.l = d7;
        this.g = d2;
        this.h = d3;
        this.i = d4;
        this.b = this.g;
        this.L = this.h;
        this.M = this.i;
        float f2 = this.r.nextFloat() * 0.6f + 0.4f;
        this.a = this.y = this.r.nextFloat() * 0.2f + 0.5f;
        this.A = f2 * 0.9f;
        this.B = f2 * 0.3f;
        this.C = f2;
        this.x = (int)(Math.random() * 10.0) + 40;
        this.d((int)(Math.random() * 8.0));
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.w + f2) / (float)this.x;
        f8 = 1.0f - f8;
        f8 *= f8;
        f8 = 1.0f - f8;
        this.y = this.a * f8;
        super.a(g2, n2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public int a(float f2) {
        int n2 = super.a(f2);
        float f3 = (float)this.w / (float)this.x;
        f3 *= f3;
        f3 *= f3;
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n4 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n4 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        float f2 = (float)this.w / (float)this.x;
        float f3 = -f2 + f2 * f2 * 2.0f;
        float f4 = 1.0f - f3;
        this.g = this.b + this.j * (double)f4;
        this.h = this.L + this.k * (double)f4 + (double)(1.0f - f2);
        this.i = this.M + this.l * (double)f4;
        if (this.w++ >= this.x) {
            this.h();
        }
    }
}

