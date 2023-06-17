/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.f.ad;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.q.k;
import net.minecraft.u.b.s;
import net.minecraft.w.a.b;
import net.minecraft.w.n;

class a
implements az {
    final /* synthetic */ ad a;
    private final /* synthetic */ b b;

    a(ad ad2, b b2) {
        this.a = ad2;
        this.b = b2;
    }

    @Override
    public String X() {
        return this.b.X();
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return this.b.aK();
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= 2;
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
        return this.b.aE();
    }

    @Override
    public n aF() {
        return this.b;
    }

    @Override
    public boolean aR() {
        return false;
    }

    @Override
    public void a(br br2, int n2) {
        if (this.a.k != null && !this.a.k.C) {
            ad.a(this.a).a(this.a.k.l(), this, br2, n2);
        }
    }

    @Override
    public net.minecraft.c.a aS() {
        return this.b.aS();
    }
}

