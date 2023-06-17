/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.q.g.a.am;
import net.minecraft.u.aj;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.d.a.a.g;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;

public class a
extends k {
    private s b;

    public a(net.minecraft.w.d.a a2) {
        super(a2);
    }

    @Override
    public void a() {
        s s2 = this.a.p(1.0f).a();
        s2.b(-0.7853982f);
        double d2 = this.a.e.aU;
        double d3 = this.a.e.aV + (double)(this.a.e.bm / 2.0f);
        double d4 = this.a.e.aW;
        for (int i2 = 0; i2 < 8; ++i2) {
            double d5 = d2 + this.a.bd().nextGaussian() / 2.0;
            double d6 = d3 + this.a.bd().nextGaussian() / 2.0;
            double d7 = d4 + this.a.bd().nextGaussian() / 2.0;
            this.a.aQ.a(aj.Q, d5, d6, d7, -s2.b * (double)0.08f + this.a.aX, -s2.c * (double)0.3f + this.a.aY, -s2.d * (double)0.08f + this.a.aZ, new int[0]);
            s2.b(0.19634955f);
        }
    }

    @Override
    public void b() {
        if (this.b == null) {
            this.b = new s(this.a.aQ.p(am.a));
        }
        if (this.b.c(this.a.aU, this.a.aV, this.a.aW) < 1.0) {
            ((g)this.a.p().b(j.f)).j();
            this.a.p().a(j.g);
        }
    }

    @Override
    public float c() {
        return 1.5f;
    }

    @Override
    public float d() {
        float f2 = n.a(this.a.aX * this.a.aX + this.a.aZ * this.a.aZ) + 1.0f;
        float f3 = Math.min(f2, 40.0f);
        return f3 / f2;
    }

    @Override
    public void e() {
        this.b = null;
    }

    @Override
    public s f() {
        return this.b;
    }

    @Override
    public j g() {
        return j.d;
    }
}

