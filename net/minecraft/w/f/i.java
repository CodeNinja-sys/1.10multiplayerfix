/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import io.netty.b.g;
import net.minecraft.c.a;
import net.minecraft.f.q;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.f.w;
import net.minecraft.w.n;

class i
extends q {
    final /* synthetic */ w a;

    i(w w2) {
        this.a = w2;
    }

    @Override
    public void d() {
        this.a.cc().b(w.i(), this.c());
        this.a.cc().b(w.n(), this.b());
    }

    @Override
    public int e() {
        return 1;
    }

    @Override
    public void a(g g2) {
        g2.E(this.a.ca());
    }

    @Override
    public b aC() {
        return new b(this.a.aU, this.a.aV + 0.5, this.a.aW);
    }

    @Override
    public s aD() {
        return new s(this.a.aU, this.a.aV, this.a.aW);
    }

    @Override
    public k aE() {
        return this.a.aQ;
    }

    @Override
    public n aF() {
        return this.a;
    }

    @Override
    public a aS() {
        return this.a.aQ.l();
    }
}

