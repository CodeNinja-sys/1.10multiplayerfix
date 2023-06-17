/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.b.cc;
import net.minecraft.a.w;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.ab;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.t;
import net.minecraft.client.h.a;
import net.minecraft.client.r;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.m.av;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.a.y;
import net.minecraft.u.ac;
import net.minecraft.u.ah;
import net.minecraft.u.ai;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.c;
import net.minecraft.w.l;

public class bs {
    private static final bp a = new bp("textures/map/map_background.png");
    private static final bp b = new bp("textures/misc/underwater.png");
    private final r c;
    private cu d;
    private cu e;
    private float f;
    private float g;
    private float h;
    private float i;
    private final f j;
    private final t k;
    private static /* synthetic */ int[] l;

    public bs(r r2) {
        this.c = r2;
        this.j = r2.ab();
        this.k = r2.ac();
    }

    public void a(l l2, cu cu2, ao ao2) {
        this.a(l2, cu2, ao2, false);
    }

    public void a(l l2, cu cu2, ao ao2, boolean bl2) {
        if (cu2 != null) {
            boolean bl3;
            cg cg2 = cu2.a();
            cn cn2 = cn.a(cg2);
            bd.D();
            boolean bl4 = bl3 = this.k.a(cu2) && this.a(cn2);
            if (bl3) {
                bd.a(false);
            }
            this.k.a(cu2, l2, ao2, bl2);
            if (bl3) {
                bd.a(true);
            }
            bd.E();
        }
    }

    private boolean a(cn cn2) {
        return cn2 != null && cn2.bR_() == net.minecraft.u.c.d;
    }

    private void a(float f2, float f3) {
        bd.D();
        bd.b(f2, 1.0f, 0.0f, 0.0f);
        bd.b(f3, 0.0f, 1.0f, 0.0f);
        am.b();
        bd.E();
    }

    private void c() {
        net.minecraft.client.h.d d2 = this.c.j;
        int n2 = this.c.h.b(new net.minecraft.u.b.b(d2.aU, d2.aV + (double)d2.ce_(), d2.aW), 0);
        float f2 = n2 & 0xFFFF;
        float f3 = n2 >> 16;
        ay.a(ay.r, f2, f3);
    }

    private void c(float f2) {
        net.minecraft.client.h.d d2 = this.c.j;
        float f3 = d2.l + (d2.j - d2.l) * f2;
        float f4 = d2.k + (d2.i - d2.k) * f2;
        bd.b((d2.bb - f3) * 0.1f, 1.0f, 0.0f, 0.0f);
        bd.b((d2.ba - f4) * 0.1f, 0.0f, 1.0f, 0.0f);
    }

    private float d(float f2) {
        float f3 = 1.0f - f2 / 45.0f + 0.1f;
        f3 = n.a(f3, 0.0f, 1.0f);
        f3 = -n.b(f3 * (float)Math.PI) * 0.5f + 0.5f;
        return f3;
    }

    private void d() {
        if (!this.c.j.cD()) {
            bd.q();
            bd.D();
            bd.b(90.0f, 0.0f, 1.0f, 0.0f);
            this.a(ai.b);
            this.a(ai.a);
            bd.E();
            bd.p();
        }
    }

    private void a(ai ai2) {
        this.c.N().a(this.c.j.g());
        aa aa2 = this.j.a(this.c.j);
        ab ab2 = (ab)aa2;
        bd.D();
        float f2 = ai2 == ai.b ? 1.0f : -1.0f;
        bd.b(92.0f, 0.0f, 1.0f, 0.0f);
        bd.b(45.0f, 1.0f, 0.0f, 0.0f);
        bd.b(f2 * -41.0f, 0.0f, 0.0f, 1.0f);
        bd.c(f2 * 0.3f, -1.1f, 0.45f);
        if (ai2 == ai.b) {
            ab2.b(this.c.j);
        } else {
            ab2.c(this.c.j);
        }
        bd.E();
    }

    private void a(float f2, ai ai2, float f3, cu cu2) {
        float f4 = ai2 == ai.b ? 1.0f : -1.0f;
        bd.c(f4 * 0.125f, -0.125f, 0.0f);
        if (!this.c.j.cD()) {
            bd.D();
            bd.b(f4 * 10.0f, 0.0f, 0.0f, 1.0f);
            this.a(f2, f3, ai2);
            bd.E();
        }
        bd.D();
        bd.c(f4 * 0.51f, -0.08f + f2 * -1.2f, -0.75f);
        float f5 = n.c(f3);
        float f6 = n.a(f5 * (float)Math.PI);
        float f7 = -0.5f * f6;
        float f8 = 0.4f * n.a(f5 * ((float)Math.PI * 2));
        float f9 = -0.3f * n.a(f3 * (float)Math.PI);
        bd.c(f4 * f7, f8 - 0.3f * f6, f9);
        bd.b(f6 * -45.0f, 1.0f, 0.0f, 0.0f);
        bd.b(f4 * f6 * -30.0f, 0.0f, 1.0f, 0.0f);
        this.a(cu2);
        bd.E();
    }

    private void a(float f2, float f3, float f4) {
        float f5 = n.c(f4);
        float f6 = -0.2f * n.a(f4 * (float)Math.PI);
        float f7 = -0.4f * n.a(f5 * (float)Math.PI);
        bd.c(0.0f, -f6 / 2.0f, f7);
        float f8 = this.d(f2);
        bd.c(0.0f, 0.04f + f3 * -1.2f + f8 * -0.5f, -0.72f);
        bd.b(f8 * -85.0f, 1.0f, 0.0f, 0.0f);
        this.d();
        float f9 = n.a(f5 * (float)Math.PI);
        bd.b(f9 * 20.0f, 1.0f, 0.0f, 0.0f);
        bd.b(2.0f, 2.0f, 2.0f);
        this.a(this.d);
    }

    private void a(cu cu2) {
        bd.b(180.0f, 0.0f, 1.0f, 0.0f);
        bd.b(180.0f, 0.0f, 0.0f, 1.0f);
        bd.b(0.38f, 0.38f, 0.38f);
        bd.f();
        this.c.N().a(a);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        bd.c(-0.5f, -0.5f, 0.0f);
        bd.b(0.0078125f, 0.0078125f, 0.0078125f);
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(-7.0, 135.0, 0.0).a(0.0, 1.0).d();
        g2.b(135.0, 135.0, 0.0).a(1.0, 1.0).d();
        g2.b(135.0, -7.0, 0.0).a(1.0, 0.0).d();
        g2.b(-7.0, -7.0, 0.0).a(0.0, 0.0).d();
        ci2.b();
        y y2 = w.bk.a(cu2, this.c.h);
        if (y2 != null) {
            this.c.q.i().a(y2, false);
        }
        bd.e();
    }

    private void a(float f2, float f3, ai ai2) {
        boolean bl2 = ai2 != ai.a;
        float f4 = bl2 ? 1.0f : -1.0f;
        float f5 = n.c(f3);
        float f6 = -0.3f * n.a(f5 * (float)Math.PI);
        float f7 = 0.4f * n.a(f5 * ((float)Math.PI * 2));
        float f8 = -0.4f * n.a(f3 * (float)Math.PI);
        bd.c(f4 * (f6 + 0.64000005f), f7 + -0.6f + f2 * -0.6f, f8 + -0.71999997f);
        bd.b(f4 * 45.0f, 0.0f, 1.0f, 0.0f);
        float f9 = n.a(f3 * f3 * (float)Math.PI);
        float f10 = n.a(f5 * (float)Math.PI);
        bd.b(f4 * f10 * 70.0f, 0.0f, 1.0f, 0.0f);
        bd.b(f4 * f9 * -20.0f, 0.0f, 0.0f, 1.0f);
        net.minecraft.client.h.d d2 = this.c.j;
        this.c.N().a(d2.g());
        bd.c(f4 * -1.0f, 3.6f, 3.5f);
        bd.b(f4 * 120.0f, 0.0f, 0.0f, 1.0f);
        bd.b(200.0f, 1.0f, 0.0f, 0.0f);
        bd.b(f4 * -135.0f, 0.0f, 1.0f, 0.0f);
        bd.c(f4 * 5.6f, 0.0f, 0.0f);
        ab ab2 = (ab)this.j.a(d2);
        bd.q();
        if (bl2) {
            ab2.b(d2);
        } else {
            ab2.c(d2);
        }
        bd.p();
    }

    private void a(float f2, ai ai2, cu cu2) {
        float f3;
        float f4 = (float)this.c.j.bS() - f2 + 1.0f;
        float f5 = f4 / (float)cu2.l();
        if (f5 < 0.8f) {
            f3 = n.e(n.b(f4 / 4.0f * (float)Math.PI) * 0.1f);
            bd.c(0.0f, f3, 0.0f);
        }
        f3 = 1.0f - (float)Math.pow(f5, 27.0);
        int n2 = ai2 == ai.b ? 1 : -1;
        bd.c(f3 * 0.6f * (float)n2, f3 * -0.5f, f3 * 0.0f);
        bd.b((float)n2 * f3 * 90.0f, 0.0f, 1.0f, 0.0f);
        bd.b(f3 * 10.0f, 1.0f, 0.0f, 0.0f);
        bd.b((float)n2 * f3 * 30.0f, 0.0f, 0.0f, 1.0f);
    }

    private void a(ai ai2, float f2) {
        int n2 = ai2 == ai.b ? 1 : -1;
        float f3 = n.a(f2 * f2 * (float)Math.PI);
        bd.b((float)n2 * (45.0f + f3 * -20.0f), 0.0f, 1.0f, 0.0f);
        float f4 = n.a(n.c(f2) * (float)Math.PI);
        bd.b((float)n2 * f4 * -20.0f, 0.0f, 0.0f, 1.0f);
        bd.b(f4 * -80.0f, 1.0f, 0.0f, 0.0f);
        bd.b((float)n2 * -45.0f, 0.0f, 1.0f, 0.0f);
    }

    private void b(ai ai2, float f2) {
        int n2 = ai2 == ai.b ? 1 : -1;
        bd.c((float)n2 * 0.56f, -0.52f + f2 * -0.6f, -0.72f);
    }

    public void a(float f2) {
        cu cu2;
        net.minecraft.client.h.d d2 = this.c.j;
        float f3 = d2.j(f2);
        ah ah2 = (ah)((Object)cc.b((Object)d2.S, (Object)ah.a));
        float f4 = d2.bd + (d2.bb - d2.bd) * f2;
        float f5 = d2.bc + (d2.ba - d2.bc) * f2;
        boolean bl2 = true;
        boolean bl3 = true;
        if (((l)d2).B() && (cu2 = d2.bR()).a() == w.f) {
            ah ah3 = ((l)d2).D();
            bl2 = ah3 == ah.a;
            bl3 = !bl2;
        }
        this.a(f4, f5);
        this.c();
        this.c(f2);
        bd.A();
        if (bl2) {
            float f6 = ah2 == ah.a ? f3 : 0.0f;
            float f7 = 1.0f - (this.g + (this.f - this.g) * f2);
            this.a(d2, f2, f4, ah.a, f6, this.d, f7);
        }
        if (bl3) {
            float f8 = ah2 == ah.b ? f3 : 0.0f;
            float f9 = 1.0f - (this.i + (this.h - this.i) * f2);
            this.a(d2, f2, f4, ah.b, f8, this.e, f9);
        }
        bd.B();
        am.a();
    }

    public void a(a a2, float f2, float f3, ah ah2, float f4, cu cu2, float f5) {
        boolean bl2 = ah2 == ah.a;
        ai ai2 = bl2 ? a2.aH() : a2.aH().a();
        bd.D();
        if (cu2 == null) {
            if (bl2 && !a2.cD()) {
                this.a(f5, f4, ai2);
            }
        } else if (cu2.a() == w.bk) {
            if (bl2 && this.e == null) {
                this.a(f3, f5, f4);
            } else {
                this.a(f5, ai2, f4, cu2);
            }
        } else {
            boolean bl3;
            boolean bl4 = bl3 = ai2 == ai.b;
            if (a2.B() && a2.bS() > 0 && a2.D() == ah2) {
                int n2 = bl3 ? 1 : -1;
                switch (bs.b()[cu2.m().ordinal()]) {
                    case 1: {
                        this.b(ai2, f5);
                        break;
                    }
                    case 2: 
                    case 3: {
                        this.a(f2, ai2, cu2);
                        this.b(ai2, f5);
                        break;
                    }
                    case 4: {
                        this.b(ai2, f5);
                        break;
                    }
                    case 5: {
                        this.b(ai2, f5);
                        bd.c((float)n2 * -0.2785682f, 0.18344387f, 0.15731531f);
                        bd.b(-13.935f, 1.0f, 0.0f, 0.0f);
                        bd.b((float)n2 * 35.3f, 0.0f, 1.0f, 0.0f);
                        bd.b((float)n2 * -9.785f, 0.0f, 0.0f, 1.0f);
                        float f6 = (float)cu2.l() - ((float)this.c.j.bS() - f2 + 1.0f);
                        float f7 = f6 / 20.0f;
                        f7 = (f7 * f7 + f7 * 2.0f) / 3.0f;
                        if (f7 > 1.0f) {
                            f7 = 1.0f;
                        }
                        if (f7 > 0.1f) {
                            float f8 = n.a((f6 - 0.1f) * 1.3f);
                            float f9 = f7 - 0.1f;
                            float f10 = f8 * f9;
                            bd.c(f10 * 0.0f, f10 * 0.004f, f10 * 0.0f);
                        }
                        bd.c(f7 * 0.0f, f7 * 0.0f, f7 * 0.04f);
                        bd.b(1.0f, 1.0f, 1.0f + f7 * 0.2f);
                        bd.b((float)n2 * 45.0f, 0.0f, -1.0f, 0.0f);
                    }
                }
            } else {
                float f11 = -0.4f * n.a(n.c(f4) * (float)Math.PI);
                float f12 = 0.2f * n.a(n.c(f4) * ((float)Math.PI * 2));
                float f13 = -0.2f * n.a(f4 * (float)Math.PI);
                int n3 = bl3 ? 1 : -1;
                bd.c((float)n3 * f11, f12, f13);
                this.b(ai2, f5);
                this.a(ai2, f4);
            }
            this.a(a2, cu2, bl3 ? ao.e : ao.d, !bl3);
        }
        bd.E();
    }

    public void b(float f2) {
        bd.c();
        if (this.c.j.ab()) {
            net.minecraft.g.c.b b2 = this.c.h.n(new net.minecraft.u.b.b(this.c.j));
            net.minecraft.client.h.d d2 = this.c.j;
            for (int i2 = 0; i2 < 8; ++i2) {
                double d3 = d2.aU + (double)(((float)((i2 >> 0) % 2) - 0.5f) * d2.bl * 0.8f);
                double d4 = d2.aV + (double)(((float)((i2 >> 1) % 2) - 0.5f) * 0.1f);
                double d5 = d2.aW + (double)(((float)((i2 >> 2) % 2) - 0.5f) * d2.bl * 0.8f);
                net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(d3, d4 + (double)d2.ce_(), d5);
                net.minecraft.g.c.b b4 = this.c.h.n(b3);
                if (!b4.c().bT_()) continue;
                b2 = b4;
            }
            if (b2.l() != ac.a) {
                this.a(f2, this.c.aa().a().a(b2));
            }
        }
        if (!this.c.j.a()) {
            if (this.c.j.a(net.minecraft.g.a.h.h)) {
                this.e(f2);
            }
            if (this.c.j.cy()) {
                this.f(f2);
            }
        }
        bd.d();
    }

    private void a(float f2, d d2) {
        this.c.N().a(net.minecraft.client.g.a.f.b);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        float f3 = 0.1f;
        bd.c(0.1f, 0.1f, 0.1f, 0.5f);
        bd.D();
        float f4 = -1.0f;
        float f5 = 1.0f;
        float f6 = -1.0f;
        float f7 = 1.0f;
        float f8 = -0.5f;
        float f9 = d2.e();
        float f10 = d2.f();
        float f11 = d2.g();
        float f12 = d2.h();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(-1.0, -1.0, -0.5).a(f10, f12).d();
        g2.b(1.0, -1.0, -0.5).a(f9, f12).d();
        g2.b(1.0, 1.0, -0.5).a(f9, f11).d();
        g2.b(-1.0, 1.0, -0.5).a(f10, f11).d();
        ci2.b();
        bd.E();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void e(float f2) {
        this.c.N().a(b);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        float f3 = this.c.j.n(f2);
        bd.c(f3, f3, f3, 0.5f);
        bd.l();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.D();
        float f4 = 4.0f;
        float f5 = -1.0f;
        float f6 = 1.0f;
        float f7 = -1.0f;
        float f8 = 1.0f;
        float f9 = -0.5f;
        float f10 = -this.c.j.ba / 64.0f;
        float f11 = this.c.j.bb / 64.0f;
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(-1.0, -1.0, -0.5).a(4.0f + f10, 4.0f + f11).d();
        g2.b(1.0, -1.0, -0.5).a(0.0f + f10, 4.0f + f11).d();
        g2.b(1.0, 1.0, -0.5).a(0.0f + f10, 0.0f + f11).d();
        g2.b(-1.0, 1.0, -0.5).a(4.0f + f10, 0.0f + f11).d();
        ci2.b();
        bd.E();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.k();
    }

    private void f(float f2) {
        ci ci2 = ci.a();
        g g2 = ci2.c();
        bd.c(1.0f, 1.0f, 1.0f, 0.9f);
        bd.c(519);
        bd.a(false);
        bd.l();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        float f3 = 1.0f;
        for (int i2 = 0; i2 < 2; ++i2) {
            bd.D();
            d d2 = this.c.R().a("minecraft:blocks/fire_layer_1");
            this.c.N().a(net.minecraft.client.g.a.f.b);
            float f4 = d2.e();
            float f5 = d2.f();
            float f6 = d2.g();
            float f7 = d2.h();
            float f8 = -0.5f;
            float f9 = 0.5f;
            float f10 = -0.5f;
            float f11 = 0.5f;
            float f12 = -0.5f;
            bd.c((float)(-(i2 * 2 - 1)) * 0.24f, -0.3f, 0.0f);
            bd.b((float)(i2 * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
            g2.a(7, net.minecraft.client.g.d.b.g);
            g2.b(-0.5, -0.5, -0.5).a(f5, f7).d();
            g2.b(0.5, -0.5, -0.5).a(f4, f7).d();
            g2.b(0.5, 0.5, -0.5).a(f4, f6).d();
            g2.b(-0.5, 0.5, -0.5).a(f5, f6).d();
            ci2.b();
            bd.E();
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.k();
        bd.a(true);
        bd.c(515);
    }

    public void a() {
        this.g = this.f;
        this.i = this.h;
        net.minecraft.client.h.d d2 = this.c.j;
        cu cu2 = d2.bC();
        cu cu3 = d2.bD();
        if (d2.K()) {
            this.f = n.a(this.f - 0.4f, 0.0f, 1.0f);
            this.h = n.a(this.h - 0.4f, 0.0f, 1.0f);
        } else {
            float f2 = d2.g(1.0f);
            this.f += n.a((cc.a((Object)this.d, (Object)cu2) ? f2 * f2 * f2 : 0.0f) - this.f, -0.4f, 0.4f);
            this.h += n.a((float)(cc.a((Object)this.e, (Object)cu3) ? 1 : 0) - this.h, -0.4f, 0.4f);
        }
        if (this.f < 0.1f) {
            this.d = cu2;
        }
        if (this.h < 0.1f) {
            this.e = cu3;
        }
    }

    public void a(ah ah2) {
        if (ah2 == ah.a) {
            this.f = 0.0f;
        } else {
            this.h = 0.0f;
        }
    }

    static /* synthetic */ int[] b() {
        if (l != null) {
            return l;
        }
        int[] arrn = new int[av.values().length];
        try {
            arrn[av.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[av.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[av.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[av.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[av.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        l = arrn;
        return arrn;
    }
}

