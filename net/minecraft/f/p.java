/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.f.ad;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.w.n;

class p
implements az {
    final /* synthetic */ ad a;

    p(ad ad2) {
        this.a = ad2;
    }

    @Override
    public String X() {
        return "Sign";
    }

    @Override
    public a aK() {
        return new k(this.X());
    }

    @Override
    public void a(a a2) {
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public b aC() {
        return this.a.l;
    }

    @Override
    public s aD() {
        return new s((double)this.a.l.cy_() + 0.5, (double)this.a.l.k() + 0.5, (double)this.a.l.l() + 0.5);
    }

    @Override
    public net.minecraft.q.k aE() {
        return this.a.k;
    }

    @Override
    public n aF() {
        return null;
    }

    @Override
    public boolean aR() {
        return false;
    }

    @Override
    public void a(br br2, int n2) {
    }

    @Override
    public net.minecraft.c.a aS() {
        return this.a.k.l();
    }
}

