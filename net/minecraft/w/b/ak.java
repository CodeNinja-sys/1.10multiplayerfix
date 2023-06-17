/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.u.b.s;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.l;
import net.minecraft.w.t;

public class ak
extends bm {
    private final t a;
    private l b;
    private double c;
    private double d;
    private double e;
    private final double f;
    private final float g;

    public ak(t t2, double d2, float f2) {
        this.a = t2;
        this.f = d2;
        this.g = f2;
        this.b(1);
    }

    @Override
    public boolean e() {
        this.b = this.a.W();
        if (this.b == null) {
            return false;
        }
        if (this.b.n(this.a) > (double)(this.g * this.g)) {
            return false;
        }
        s s2 = af.a(this.a, 16, 7, new s(this.b.aU, this.b.aV, this.b.aW));
        if (s2 == null) {
            return false;
        }
        this.c = s2.b;
        this.d = s2.c;
        this.e = s2.d;
        return true;
    }

    @Override
    public boolean a() {
        return !this.a.N().l() && this.b.br() && this.b.n(this.a) < (double)(this.g * this.g);
    }

    @Override
    public void c() {
        this.b = null;
    }

    @Override
    public void b() {
        this.a.N().a(this.c, this.d, this.e, this.f);
    }
}

