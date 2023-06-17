/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.q.k;
import net.minecraft.w.b.bm;
import net.minecraft.w.f;
import net.minecraft.w.l;

public class as
extends bm {
    k a;
    f b;
    l c;
    int d;

    public as(f f2) {
        this.b = f2;
        this.a = f2.aQ;
        this.b(3);
    }

    @Override
    public boolean e() {
        l l2 = this.b.W();
        if (l2 == null) {
            return false;
        }
        this.c = l2;
        return true;
    }

    @Override
    public boolean a() {
        return !this.c.br() ? false : (this.b.n(this.c) > 225.0 ? false : !this.b.N().l() || this.e());
    }

    @Override
    public void c() {
        this.c = null;
        this.b.N().m();
    }

    @Override
    public void d() {
        this.b.I().a(this.c, 30.0f, 30.0f);
        double d2 = this.b.bl * 2.0f * this.b.bl * 2.0f;
        double d3 = this.b.h(this.c.aU, this.c.cT().b, this.c.aW);
        double d4 = 0.8;
        if (d3 > d2 && d3 < 16.0) {
            d4 = 1.33;
        } else if (d3 < 225.0) {
            d4 = 0.6;
        }
        this.b.N().a(this.c, d4);
        this.d = Math.max(this.d - 1, 0);
        if (d3 <= d2 && this.d <= 0) {
            this.d = 20;
            this.b.j(this.c);
        }
    }
}

