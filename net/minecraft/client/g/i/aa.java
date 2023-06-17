/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.cc;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.g.g.d;
import net.minecraft.client.g.i.f;
import net.minecraft.client.k.ce;
import net.minecraft.client.r;
import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ac;
import net.minecraft.u.b.a;
import net.minecraft.u.bp;

public abstract class aa {
    private static final bp a = new bp("textures/misc/shadow.png");
    protected final f c;
    protected float d;
    protected float e = 1.0f;
    protected boolean f;

    protected aa(f f2) {
        this.c = f2;
    }

    public void a(boolean bl2) {
        this.f = bl2;
    }

    public boolean a(net.minecraft.w.n n2, d d2, double d3, double d4, double d5) {
        a a2 = n2.cU().b(0.5);
        if (a2.b() || a2.a() == 0.0) {
            a2 = new a(n2.aU - 2.0, n2.aV - 2.0, n2.aW - 2.0, n2.aU + 2.0, n2.aV + 2.0, n2.aW + 2.0);
        }
        return n2.j(d3, d4, d5) && (n2.bN || d2.a(a2));
    }

    public void a(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, float f3) {
        if (!this.f) {
            this.a(n2, d2, d3, d4);
        }
    }

    protected int c(net.minecraft.w.n n2) {
        String string;
        int n3 = 0xFFFFFF;
        net.minecraft.j.d d2 = (net.minecraft.j.d)n2.aA();
        if (d2 != null && (string = ce.b(d2.d())).length() >= 2) {
            n3 = this.b().b(string.charAt(1));
        }
        return n3;
    }

    protected void a(net.minecraft.w.n n2, double d2, double d3, double d4) {
        if (this.d(n2)) {
            this.a(n2, n2.aK().d(), d2, d3, d4, 64);
        }
    }

    protected boolean d(net.minecraft.w.n n2) {
        return n2.at() && n2.bO_();
    }

    protected void a(net.minecraft.w.n n2, double d2, double d3, double d4, String string, double d5) {
        this.a(n2, string, d2, d3, d4, 64);
    }

    protected abstract bp a(net.minecraft.w.n var1);

    protected boolean e(net.minecraft.w.n n2) {
        bp bp2 = this.a(n2);
        String string = "";
        if (n2 instanceof net.minecraft.l.b.b) {
            string = "data/1.bin";
        }
        if (bp2 == null) {
            return false;
        }
        this.a(bp2, string);
        return true;
    }

    public void a(bp bp2, String string) {
        this.c.a.a(bp2, string);
    }

    public void a(bp bp2) {
        this.c.a.a(bp2);
    }

    private void a(net.minecraft.w.n n2, double d2, double d3, double d4, float f2) {
        bd.f();
        net.minecraft.client.g.a.f f3 = r.z().R();
        net.minecraft.client.g.a.d d5 = f3.a("minecraft:blocks/fire_layer_0");
        net.minecraft.client.g.a.d d6 = f3.a("minecraft:blocks/fire_layer_1");
        bd.D();
        bd.c((float)d2, (float)d3, (float)d4);
        float f4 = n2.bl * 1.4f;
        bd.b(f4, f4, f4);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        float f5 = 0.5f;
        float f6 = 0.0f;
        float f7 = n2.bm / f4;
        float f8 = (float)(n2.aV - n2.cT().b);
        bd.b(-this.c.e, 0.0f, 1.0f, 0.0f);
        bd.c(0.0f, 0.0f, -0.3f + (float)((int)f7) * 0.02f);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f9 = 0.0f;
        int n3 = 0;
        g2.a(7, net.minecraft.client.g.d.b.g);
        while (f7 > 0.0f) {
            net.minecraft.client.g.a.d d7 = n3 % 2 == 0 ? d5 : d6;
            this.a(net.minecraft.client.g.a.f.b);
            float f10 = d7.e();
            float f11 = d7.g();
            float f12 = d7.f();
            float f13 = d7.h();
            if (n3 / 2 % 2 == 0) {
                float f14 = f12;
                f12 = f10;
                f10 = f14;
            }
            g2.b((double)(f5 - 0.0f), (double)(0.0f - f8), (double)f9).a(f12, f13).d();
            g2.b((double)(-f5 - 0.0f), (double)(0.0f - f8), (double)f9).a(f10, f13).d();
            g2.b((double)(-f5 - 0.0f), (double)(1.4f - f8), (double)f9).a(f10, f11).d();
            g2.b((double)(f5 - 0.0f), (double)(1.4f - f8), (double)f9).a(f12, f11).d();
            f7 -= 0.45f;
            f8 -= 0.45f;
            f5 *= 0.9f;
            f9 += 0.03f;
            ++n3;
        }
        ci2.b();
        bd.E();
        bd.e();
    }

    private void d(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, float f3) {
        bd.l();
        bd.a(ad.l, bc.j);
        this.c.a.a(a);
        k k2 = this.a();
        bd.a(false);
        float f4 = this.d;
        if (n2 instanceof net.minecraft.w.f) {
            net.minecraft.w.f f5 = (net.minecraft.w.f)n2;
            f4 *= f5.av();
            if (f5.ba()) {
                f4 *= 0.5f;
            }
        }
        double d5 = n2.br + (n2.aU - n2.br) * (double)f3;
        double d6 = n2.bs + (n2.aV - n2.bs) * (double)f3;
        double d7 = n2.bt + (n2.aW - n2.bt) * (double)f3;
        int n3 = net.minecraft.u.b.n.c(d5 - (double)f4);
        int n4 = net.minecraft.u.b.n.c(d5 + (double)f4);
        int n5 = net.minecraft.u.b.n.c(d6 - (double)f4);
        int n6 = net.minecraft.u.b.n.c(d6);
        int n7 = net.minecraft.u.b.n.c(d7 - (double)f4);
        int n8 = net.minecraft.u.b.n.c(d7 + (double)f4);
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.i);
        for (net.minecraft.u.b.b b2 : net.minecraft.u.b.b.b(new net.minecraft.u.b.b(n3, n5, n7), new net.minecraft.u.b.b(n4, n6, n8))) {
            b b3 = k2.n(b2.c());
            if (b3.l() == ac.a || k2.j(b2) <= 3) continue;
            this.a(b3, d2, d3, d4, b2, f2, f4, d8, d9, d10);
        }
        ci2.b();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.k();
        bd.a(true);
    }

    private k a() {
        return this.c.b;
    }

    private void a(b b2, double d2, double d3, double d4, net.minecraft.u.b.b b3, float f2, float f3, double d5, double d6, double d7) {
        if (b2.k()) {
            ci ci2 = ci.a();
            g g2 = ci2.c();
            double d8 = ((double)f2 - (d3 - ((double)b3.k() + d6)) / 2.0) * 0.5 * (double)this.a().m(b3);
            if (d8 >= 0.0) {
                if (d8 > 1.0) {
                    d8 = 1.0;
                }
                a a2 = b2.c((n)this.a(), b3);
                double d9 = (double)b3.cy_() + a2.a + d5;
                double d10 = (double)b3.cy_() + a2.d + d5;
                double d11 = (double)b3.k() + a2.b + d6 + 0.015625;
                double d12 = (double)b3.l() + a2.c + d7;
                double d13 = (double)b3.l() + a2.f + d7;
                float f4 = (float)((d2 - d9) / 2.0 / (double)f3 + 0.5);
                float f5 = (float)((d2 - d10) / 2.0 / (double)f3 + 0.5);
                float f6 = (float)((d4 - d12) / 2.0 / (double)f3 + 0.5);
                float f7 = (float)((d4 - d13) / 2.0 / (double)f3 + 0.5);
                g2.b(d9, d11, d12).a(f4, f6).a(1.0f, 1.0f, 1.0f, (float)d8).d();
                g2.b(d9, d11, d13).a(f4, f7).a(1.0f, 1.0f, 1.0f, (float)d8).d();
                g2.b(d10, d11, d13).a(f5, f7).a(1.0f, 1.0f, 1.0f, (float)d8).d();
                g2.b(d10, d11, d12).a(f5, f6).a(1.0f, 1.0f, 1.0f, (float)d8).d();
            }
        }
    }

    public static void a(a a2, double d2, double d3, double d4) {
        bd.w();
        ci ci2 = ci.a();
        g g2 = ci2.c();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        g2.c(d2, d3, d4);
        g2.a(7, net.minecraft.client.g.d.b.h);
        g2.b(a2.a, a2.e, a2.c).c(0.0f, 0.0f, -1.0f).d();
        g2.b(a2.d, a2.e, a2.c).c(0.0f, 0.0f, -1.0f).d();
        g2.b(a2.d, a2.b, a2.c).c(0.0f, 0.0f, -1.0f).d();
        g2.b(a2.a, a2.b, a2.c).c(0.0f, 0.0f, -1.0f).d();
        g2.b(a2.a, a2.b, a2.f).c(0.0f, 0.0f, 1.0f).d();
        g2.b(a2.d, a2.b, a2.f).c(0.0f, 0.0f, 1.0f).d();
        g2.b(a2.d, a2.e, a2.f).c(0.0f, 0.0f, 1.0f).d();
        g2.b(a2.a, a2.e, a2.f).c(0.0f, 0.0f, 1.0f).d();
        g2.b(a2.a, a2.b, a2.c).c(0.0f, -1.0f, 0.0f).d();
        g2.b(a2.d, a2.b, a2.c).c(0.0f, -1.0f, 0.0f).d();
        g2.b(a2.d, a2.b, a2.f).c(0.0f, -1.0f, 0.0f).d();
        g2.b(a2.a, a2.b, a2.f).c(0.0f, -1.0f, 0.0f).d();
        g2.b(a2.a, a2.e, a2.f).c(0.0f, 1.0f, 0.0f).d();
        g2.b(a2.d, a2.e, a2.f).c(0.0f, 1.0f, 0.0f).d();
        g2.b(a2.d, a2.e, a2.c).c(0.0f, 1.0f, 0.0f).d();
        g2.b(a2.a, a2.e, a2.c).c(0.0f, 1.0f, 0.0f).d();
        g2.b(a2.a, a2.b, a2.f).c(-1.0f, 0.0f, 0.0f).d();
        g2.b(a2.a, a2.e, a2.f).c(-1.0f, 0.0f, 0.0f).d();
        g2.b(a2.a, a2.e, a2.c).c(-1.0f, 0.0f, 0.0f).d();
        g2.b(a2.a, a2.b, a2.c).c(-1.0f, 0.0f, 0.0f).d();
        g2.b(a2.d, a2.b, a2.c).c(1.0f, 0.0f, 0.0f).d();
        g2.b(a2.d, a2.e, a2.c).c(1.0f, 0.0f, 0.0f).d();
        g2.b(a2.d, a2.e, a2.f).c(1.0f, 0.0f, 0.0f).d();
        g2.b(a2.d, a2.b, a2.f).c(1.0f, 0.0f, 0.0f).d();
        ci2.b();
        g2.c(0.0, 0.0, 0.0);
        bd.v();
    }

    public void b(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, float f3) {
        if (this.c.g != null) {
            double d5;
            float f4;
            if (this.c.g.M && this.d > 0.0f && !n2.cD() && this.c.a() && (f4 = (float)((1.0 - (d5 = this.c.b(n2.aU, n2.aV, n2.aW)) / 256.0) * (double)this.e)) > 0.0f) {
                this.d(n2, d2, d3, d4, f4, f3);
            }
            if (!(!n2.cL() || n2 instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)n2).a())) {
                this.a(n2, d2, d3, d4, f3);
            }
        }
    }

    public ce b() {
        return this.c.c();
    }

    protected void a(net.minecraft.w.n n2, String string, double d2, double d3, double d4, int n3) {
        double d5 = n2.n(this.c.c);
        if (d5 <= (double)(n3 * n3)) {
            boolean bl2 = n2.G();
            float f2 = this.c.e;
            float f3 = this.c.f;
            boolean bl3 = this.c.g.as == 2;
            float f4 = n2.bm + 0.5f - (bl2 ? 0.25f : 0.0f);
            int n4 = "deadmau5".equals(string) ? -10 : 0;
            cc.a(this.b(), string, (float)d2, (float)d3 + f4, (float)d4, n4, f2, f3, bl3, bl2);
        }
    }

    public f c() {
        return this.c;
    }

    public boolean d() {
        return false;
    }

    public void c(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, float f3) {
    }
}

