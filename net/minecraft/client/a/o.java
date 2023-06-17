/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.q.k;

public class o
extends cb {
    private final float a;
    private final double b;
    private final double L;
    private final double M;

    protected o(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.j = d5;
        this.k = d6;
        this.l = d7;
        this.b = d2;
        this.L = d3;
        this.M = d4;
        this.d = d2 + d5;
        this.e = d3 + d6;
        this.f = d4 + d7;
        this.g = this.d;
        this.h = this.e;
        this.i = this.f;
        float f2 = this.r.nextFloat() * 0.6f + 0.4f;
        this.a = this.y = this.r.nextFloat() * 0.5f + 0.2f;
        this.A = 0.9f * f2;
        this.B = 0.9f * f2;
        this.C = f2;
        this.x = (int)(Math.random() * 10.0) + 30;
        this.d((int)(Math.random() * 26.0 + 1.0 + 224.0));
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
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
        f2 = 1.0f - f2;
        float f3 = 1.0f - f2;
        f3 *= f3;
        f3 *= f3;
        this.g = this.b + this.j * (double)f2;
        this.h = this.L + this.k * (double)f2 - (double)(f3 * 1.2f);
        this.i = this.M + this.l * (double)f2;
        if (this.w++ >= this.x) {
            this.h();
        }
    }
}

