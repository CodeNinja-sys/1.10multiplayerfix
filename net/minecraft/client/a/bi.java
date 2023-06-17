/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.q.k;

public class bi
extends cb {
    private final int a;
    private final int b;
    private final float L;
    private float M;
    private float N;
    private float O;
    private boolean P;

    public bi(k k2, double d2, double d3, double d4, int n2, int n3, float f2) {
        super(k2, d2, d3, d4);
        this.a = n2;
        this.b = n3;
        this.L = f2;
    }

    public void a(int n2) {
        float f2 = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        float f3 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        float f4 = (float)((n2 & 0xFF) >> 0) / 255.0f;
        float f5 = 1.0f;
        this.a(f2 * 1.0f, f3 * 1.0f, f4 * 1.0f);
    }

    public void b(int n2) {
        this.M = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        this.N = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        this.O = (float)((n2 & 0xFF) >> 0) / 255.0f;
        this.P = true;
    }

    @Override
    public boolean bX_() {
        return true;
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.w++ >= this.x) {
            this.h();
        }
        if (this.w > this.x / 2) {
            this.d(1.0f - ((float)this.w - (float)(this.x / 2)) / (float)this.x);
            if (this.P) {
                this.A += (this.M - this.A) * 0.2f;
                this.B += (this.N - this.B) * 0.2f;
                this.C += (this.O - this.C) * 0.2f;
            }
        }
        this.d(this.a + (this.b - 1 - this.w * this.b / this.x));
        this.k += (double)this.L;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.91f;
        this.k *= (double)0.91f;
        this.l *= (double)0.91f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }

    @Override
    public int a(float f2) {
        return 0xF000F0;
    }
}

