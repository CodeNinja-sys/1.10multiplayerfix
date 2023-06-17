/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.u.b.n;
import net.minecraft.w.b.bm;
import net.minecraft.w.f;
import net.minecraft.w.l;

public class bg
extends bm {
    f a;
    l b;
    float c;

    public bg(f f2, float f3) {
        this.a = f2;
        this.c = f3;
        this.b(5);
    }

    @Override
    public boolean e() {
        this.b = this.a.W();
        if (this.b == null) {
            return false;
        }
        double d2 = this.a.n(this.b);
        return d2 >= 4.0 && d2 <= 16.0 ? (!this.a.be ? false : this.a.bd().nextInt(5) == 0) : false;
    }

    @Override
    public boolean a() {
        return !this.a.be;
    }

    @Override
    public void b() {
        double d2 = this.b.aU - this.a.aU;
        double d3 = this.b.aW - this.a.aW;
        float f2 = n.a(d2 * d2 + d3 * d3);
        this.a.aX += d2 / (double)f2 * 0.5 * (double)0.8f + this.a.aX * (double)0.2f;
        this.a.aZ += d3 / (double)f2 * 0.5 * (double)0.8f + this.a.aZ * (double)0.2f;
        this.a.aY = this.c;
    }
}

