/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.c.a;
import net.minecraft.g.c.b;
import net.minecraft.q.ag;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.g;
import net.minecraft.w.n;
import net.minecraft.x.d.b.br;
import net.minecraft.x.d.b.ca;
import net.minecraft.x.d.b.e;

public class ao
implements ag {
    private final a a;
    private final v b;

    public ao(a a2, v v2) {
        this.a = a2;
        this.b = v2;
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
    }

    @Override
    public void a(n n2) {
        this.b.ae().a(n2);
        if (n2 instanceof g) {
            this.b.q.a((g)n2);
        }
    }

    @Override
    public void b(n n2) {
        this.b.ae().b(n2);
        this.b.Q().a(n2);
        if (n2 instanceof g) {
            this.b.q.b((g)n2);
        }
    }

    @Override
    public void a(net.minecraft.w.a.b b2, bv bv2, bu bu2, double d2, double d3, double d4, float f2, float f3) {
        this.a.av().a(b2, d2, d3, d4, f2 > 1.0f ? (double)(16.0f * f2) : 16.0, this.b.q.a().a(), new e(bv2, bu2, d2, d3, d4, f2, f3));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, b b4, int n2) {
        this.b.af().a(b2);
    }

    @Override
    public void a(net.minecraft.u.b.b b2) {
    }

    @Override
    public void a(bv bv2, net.minecraft.u.b.b b2) {
    }

    @Override
    public void a(net.minecraft.w.a.b b2, int n2, net.minecraft.u.b.b b3, int n3) {
        this.a.av().a(b2, b3.cy_(), b3.k(), b3.l(), 64.0, this.b.q.a().a(), new br(n2, b3, n3, false));
    }

    @Override
    public void a(int n2, net.minecraft.u.b.b b2, int n3) {
        this.a.av().a(new br(n2, b2, n3, true));
    }

    @Override
    public void b(int n2, net.minecraft.u.b.b b2, int n3) {
        for (g g2 : this.a.av().u()) {
            double d2;
            double d3;
            double d4;
            if (g2 == null || g2.aQ != this.b || g2.ca() == n2 || !((d4 = (double)b2.cy_() - g2.aU) * d4 + (d3 = (double)b2.k() - g2.aV) * d3 + (d2 = (double)b2.l() - g2.aW) * d2 < 1024.0)) continue;
            g2.a.a(new ca(n2, b2, n3));
        }
    }
}

