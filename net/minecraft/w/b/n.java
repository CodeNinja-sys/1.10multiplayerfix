/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public class n
extends bm {
    private final t a;
    private double b;
    private double c;
    private double d;
    private final double e;

    public n(t t2, double d2) {
        this.a = t2;
        this.e = d2;
        this.b(1);
    }

    @Override
    public boolean e() {
        if (this.a.di()) {
            return false;
        }
        b b2 = this.a.dj();
        s s2 = af.a(this.a, 16, 7, new s(b2.cy_(), b2.k(), b2.l()));
        if (s2 == null) {
            return false;
        }
        this.b = s2.b;
        this.c = s2.c;
        this.d = s2.d;
        return true;
    }

    @Override
    public boolean a() {
        return !this.a.N().l();
    }

    @Override
    public void b() {
        this.a.N().a(this.b, this.c, this.d, this.e);
    }
}

