/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.a.w;
import net.minecraft.client.g.am;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.g;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.j;
import net.minecraft.client.g.t;
import net.minecraft.client.r;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.x;
import net.minecraft.q.a.y;
import net.minecraft.u.b.b;
import net.minecraft.u.bp;
import net.minecraft.w.f.ae;
import net.minecraft.w.f.l;
import net.minecraft.w.n;

public class m
extends aa {
    private static final bp a = new bp("textures/map/map_background.png");
    private final r b = r.z();
    private final ag g = new ag("item_frame", "normal");
    private final ag h = new ag("item_frame", "map");
    private final t i;

    public m(f f2, t t2) {
        super(f2);
        this.i = t2;
    }

    public void a(l l2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        b b2 = l2.l();
        double d5 = (double)b2.cy_() - l2.aU + d2;
        double d6 = (double)b2.k() - l2.aV + d3;
        double d7 = (double)b2.l() - l2.aW + d4;
        bd.b(d5 + 0.5, d6 + 0.5, d7 + 0.5);
        bd.b(180.0f - l2.ba, 0.0f, 1.0f, 0.0f);
        this.c.a.a(net.minecraft.client.g.a.f.b);
        j j2 = this.b.aa();
        g g2 = j2.a().b();
        aq aq2 = l2.p() != null && l2.p().a() == w.bk ? g2.a(this.h) : g2.a(this.g);
        bd.D();
        bd.c(-0.5f, -0.5f, -0.5f);
        if (this.f) {
            bd.g();
            bd.e(this.c(l2));
        }
        j2.b().a(aq2, 1.0f, 1.0f, 1.0f, 1.0f);
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.E();
        bd.c(0.0f, 0.0f, 0.4375f);
        this.b(l2);
        bd.E();
        this.a(l2, d2 + (double)((float)l2.b.h() * 0.3f), d3 - 0.25, d4 + (double)((float)l2.b.j() * 0.3f));
    }

    protected bp a(l l2) {
        return null;
    }

    private void b(l l2) {
        cu cu2 = l2.p();
        if (cu2 != null) {
            ae ae2 = new ae(l2.aQ, 0.0, 0.0, 0.0, cu2);
            cg cg2 = ae2.c().a();
            ae2.c().b = 1;
            ae2.a = 0.0f;
            bd.D();
            bd.f();
            int n2 = l2.q();
            if (cg2 == w.bk) {
                n2 = n2 % 4 * 2;
            }
            bd.b((float)n2 * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
            if (cg2 == w.bk) {
                this.c.a.a(a);
                bd.b(180.0f, 0.0f, 0.0f, 1.0f);
                float f2 = 0.0078125f;
                bd.b(0.0078125f, 0.0078125f, 0.0078125f);
                bd.c(-64.0f, -64.0f, 0.0f);
                y y2 = w.bk.a(ae2.c(), l2.aQ);
                bd.c(0.0f, 0.0f, -1.0f);
                if (y2 != null) {
                    this.b.q.i().a(y2, true);
                }
            } else {
                bd.b(0.5f, 0.5f, 0.5f);
                if (!this.i.a(ae2.c()) || cg2 instanceof x) {
                    bd.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                bd.a();
                am.b();
                this.i.a(ae2.c(), ao.i);
                am.a();
                bd.b();
            }
            bd.e();
            bd.E();
        }
    }

    protected void a(l l2, double d2, double d3, double d4) {
        if (r.w() && l2.p() != null && l2.p().s() && this.c.d == l2) {
            float f2;
            double d5 = l2.n(this.c.c);
            float f3 = f2 = l2.G() ? 32.0f : 64.0f;
            if (d5 < (double)(f2 * f2)) {
                String string = l2.p().q();
                this.a((n)l2, string, d2, d3, d4, 64);
            }
        }
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((l)n2);
    }
}

