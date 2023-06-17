/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.bm;
import net.minecraft.w.f;

public class bh
extends bm {
    private final f a;
    private double b;
    private double c;
    private int d;

    public bh(f f2) {
        this.a = f2;
        this.b(3);
    }

    @Override
    public boolean e() {
        return this.a.bd().nextFloat() < 0.02f;
    }

    @Override
    public boolean a() {
        return this.d >= 0;
    }

    @Override
    public void b() {
        double d2 = Math.PI * 2 * this.a.bd().nextDouble();
        this.b = Math.cos(d2);
        this.c = Math.sin(d2);
        this.d = 20 + this.a.bd().nextInt(20);
    }

    @Override
    public void d() {
        --this.d;
        this.a.I().a(this.a.aU + this.b, this.a.aV + (double)this.a.ce_(), this.a.aW + this.c, this.a.ap(), this.a.ao());
    }
}

