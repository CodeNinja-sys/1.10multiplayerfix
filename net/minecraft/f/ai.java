/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import io.netty.b.g;
import net.minecraft.c.a;
import net.minecraft.f.h;
import net.minecraft.f.q;
import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.u.b.s;
import net.minecraft.w.n;

class ai
extends q {
    final /* synthetic */ h a;

    ai(h h2) {
        this.a = h2;
    }

    @Override
    public net.minecraft.u.b.b aC() {
        return this.a.l;
    }

    @Override
    public s aD() {
        return new s((double)this.a.l.cy_() + 0.5, (double)this.a.l.k() + 0.5, (double)this.a.l.l() + 0.5);
    }

    @Override
    public k aE() {
        return this.a.cD_();
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.a.C();
    }

    @Override
    public void d() {
        b b2 = this.a.k.n(this.a.l);
        this.a.cD_().a(this.a.l, b2, b2, 3);
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void a(g g2) {
        g2.E(this.a.l.cy_());
        g2.E(this.a.l.k());
        g2.E(this.a.l.l());
    }

    @Override
    public n aF() {
        return null;
    }

    @Override
    public a aS() {
        return this.a.k.l();
    }
}

