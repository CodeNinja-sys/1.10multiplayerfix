/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.av;
import net.minecraft.client.k.cy;
import net.minecraft.client.k.de;
import net.minecraft.client.k.p;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

class by
extends av {
    public int a;
    final /* synthetic */ cy b;

    public by(cy cy2) {
        this.b = cy2;
        super(cy2.n, cy2.p, cy2.q, 80, cy2.q - 37, 24);
        this.a = -1;
    }

    private void a(int n2, int n3, cg cg2, int n4) {
        this.e(n2 + 1, n3 + 1);
        bd.A();
        am.c();
        this.b.o.a(new cu(cg2, 1, n4), n2 + 2, n3 + 2);
        am.a();
        bd.B();
    }

    private void e(int n2, int n3) {
        this.d(n2, n3, 0, 0);
    }

    private void d(int n2, int n3, int n4, int n5) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c.N().a(de.z);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b((double)(n2 + 0), (double)(n3 + 18), (double)this.b.B).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        g2.b((double)(n2 + 18), (double)(n3 + 18), (double)this.b.B).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        g2.b((double)(n2 + 18), (double)(n3 + 0), (double)this.b.B).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        g2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.b.B).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        ci2.b();
    }

    @Override
    protected int a() {
        return cy.g().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a = n2;
        this.b.f();
        cy.a(this.b).a(((p)cy.g().get((int)cy.b((cy)this.b).a)).d);
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.a;
    }

    @Override
    protected void d() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        p p2 = (p)cy.g().get(n2);
        this.a(n3, n4, p2.a, p2.b);
        this.b.u.a(p2.c, n3 + 18 + 5, n4 + 6, 0xFFFFFF);
    }
}

