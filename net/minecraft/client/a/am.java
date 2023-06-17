/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import java.util.Random;
import net.minecraft.client.a.cb;
import net.minecraft.q.k;

public class am
extends cb {
    private static final Random a = new Random();
    private int b = 128;

    protected am(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, 0.5 - a.nextDouble(), d6, 0.5 - a.nextDouble());
        this.k *= (double)0.2f;
        if (d5 == 0.0 && d7 == 0.0) {
            this.j *= (double)0.1f;
            this.l *= (double)0.1f;
        }
        this.y *= 0.75f;
        this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
        this.d(this.b + (7 - this.w * 8 / this.x));
        this.k += 0.004;
        this.a(this.j, this.k, this.l);
        if (this.h == this.e) {
            this.j *= 1.1;
            this.l *= 1.1;
        }
        this.j *= (double)0.96f;
        this.k *= (double)0.96f;
        this.l *= (double)0.96f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }

    public void a(int n2) {
        this.b = n2;
    }
}

