/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class l
implements p {
    protected double a;
    protected double b;
    protected double c;
    protected float d;
    protected float e;
    protected boolean f;
    protected boolean g;
    protected boolean h;

    public l() {
    }

    public l(boolean bl2) {
        this.f = bl2;
    }

    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(a a2) {
        this.f = a2.F() != 0;
    }

    @Override
    public void b(a a2) {
        a2.B(this.f ? 1 : 0);
    }

    public double a(double d2) {
        return this.g ? this.a : d2;
    }

    public double b(double d2) {
        return this.g ? this.b : d2;
    }

    public double c(double d2) {
        return this.g ? this.c : d2;
    }

    public float a(float f2) {
        return this.h ? this.d : f2;
    }

    public float b(float f2) {
        return this.h ? this.e : f2;
    }

    public boolean a() {
        return this.f;
    }
}

