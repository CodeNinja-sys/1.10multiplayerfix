/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class bl
extends cb {
    private final float a;
    private boolean b;

    protected bl(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.j = d5;
        this.k = d6;
        this.l = d7;
        this.A = net.minecraft.u.b.n.a(this.r, 0.7176471f, 0.8745098f);
        this.B = net.minecraft.u.b.n.a(this.r, 0.0f, 0.0f);
        this.C = net.minecraft.u.b.n.a(this.r, 0.8235294f, 0.9764706f);
        this.y *= 0.75f;
        this.a = this.y;
        this.x = (int)(20.0 / ((double)this.r.nextFloat() * 0.8 + 0.2));
        this.b = false;
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.w++ >= this.x) {
            this.h();
        } else {
            this.d(3 * this.w / this.x + 5);
            if (this.m) {
                this.k = 0.0;
                this.b = true;
            }
            if (this.b) {
                this.k += 0.002;
            }
            this.a(this.j, this.k, this.l);
            if (this.h == this.e) {
                this.j *= 1.1;
                this.l *= 1.1;
            }
            this.j *= (double)0.96f;
            this.l *= (double)0.96f;
            if (this.b) {
                this.k *= (double)0.96f;
            }
        }
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.y = this.a * net.minecraft.u.b.n.a(((float)this.w + f2) / (float)this.x * 32.0f, 0.0f, 1.0f);
        super.a(g2, n2, f2, f3, f4, f5, f6, f7);
    }
}

