/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import net.minecraft.c.a;
import net.minecraft.n.ah;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.n;

class l
implements az {
    final /* synthetic */ ah a;
    private final /* synthetic */ n b;
    private final /* synthetic */ az c;
    private final /* synthetic */ b d;
    private final /* synthetic */ double e;
    private final /* synthetic */ double f;
    private final /* synthetic */ double g;
    private final /* synthetic */ a h;

    l(ah ah2, n n2, az az2, b b2, double d2, double d3, double d4, a a2) {
        this.a = ah2;
        this.b = n2;
        this.c = az2;
        this.d = b2;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = a2;
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
        this.c.a(a2);
    }

    @Override
    public boolean a(int n2, String string) {
        return this.c.a(n2, string);
    }

    @Override
    public b aC() {
        return this.d;
    }

    @Override
    public s aD() {
        return new s(this.e, this.f, this.g);
    }

    @Override
    public k aE() {
        return this.b.aQ;
    }

    @Override
    public n aF() {
        return this.b;
    }

    @Override
    public boolean aR() {
        return this.h == null || this.h.d[0].G().b("commandBlockOutput");
    }

    @Override
    public void a(br br2, int n2) {
        this.b.a(br2, n2);
    }

    @Override
    public a aS() {
        return this.b.aS();
    }
}

