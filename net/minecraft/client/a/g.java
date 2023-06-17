/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.q.k;

public class g
extends cb {
    protected g(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.j *= (double)0.3f;
        this.k = Math.random() * (double)0.2f + (double)0.1f;
        this.l *= (double)0.3f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.d(19);
        this.a(0.01f, 0.01f);
        this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.z = 0.0f;
        this.j = d5;
        this.k = d6;
        this.l = d7;
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        this.k -= (double)this.z;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        this.l *= (double)0.98f;
        int n2 = 60 - this.x;
        float f2 = (float)n2 * 0.001f;
        this.a(f2, f2);
        this.d(19 + n2 % 4);
        if (this.x-- <= 0) {
            this.h();
        }
    }
}

