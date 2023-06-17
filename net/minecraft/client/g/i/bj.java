/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.g.d;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.u.b.a;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.w.l;

public class bj
extends n {
    private static final bp b = new bp("textures/entity/guardian.png");
    private static final bp k = new bp("textures/entity/guardian_elder.png");
    private static final bp l = new bp("textures/entity/guardian_beam.png");
    int a;

    public bj(f f2) {
        super(f2, new net.minecraft.client.j.bc(), 0.5f);
        this.a = ((net.minecraft.client.j.bc)this.g).a();
    }

    public boolean a(net.minecraft.w.e.g g2, d d2, double d3, double d4, double d5) {
        l l2;
        if (super.a(g2, d2, d3, d4, d5)) {
            return true;
        }
        if (g2.s() && (l2 = g2.t()) != null) {
            s s2 = this.a(l2, (double)l2.bm * 0.5, 1.0f);
            s s3 = this.a((l)g2, (double)g2.ce_(), 1.0f);
            if (d2.a(new a(s3.b, s3.c, s3.d, s2.b, s2.c, s2.d))) {
                return true;
            }
        }
        return false;
    }

    private s a(l l2, double d2, float f2) {
        double d3 = l2.br + (l2.aU - l2.br) * (double)f2;
        double d4 = d2 + l2.bs + (l2.aV - l2.bs) * (double)f2;
        double d5 = l2.bt + (l2.aW - l2.bt) * (double)f2;
        return new s(d3, d4, d5);
    }

    public void a(net.minecraft.w.e.g g2, double d2, double d3, double d4, float f2, float f3) {
        if (this.a != ((net.minecraft.client.j.bc)this.g).a()) {
            this.g = new net.minecraft.client.j.bc();
            this.a = ((net.minecraft.client.j.bc)this.g).a();
        }
        super.a(g2, d2, d3, d4, f2, f3);
        l l2 = g2.t();
        if (l2 != null) {
            float f4 = g2.s(f3);
            ci ci2 = ci.a();
            g g3 = ci2.c();
            this.a(l);
            bd.b(3553, 10242, 10497);
            bd.b(3553, 10243, 10497);
            bd.f();
            bd.q();
            bd.k();
            bd.a(true);
            float f5 = 240.0f;
            ay.a(ay.r, 240.0f, 240.0f);
            bd.a(ad.l, bc.e, ad.e, bc.n);
            float f6 = (float)g2.aQ.B() + f3;
            float f7 = f6 * 0.5f % 1.0f;
            float f8 = g2.ce_();
            bd.D();
            bd.c((float)d2, (float)d3 + f8, (float)d4);
            s s2 = this.a(l2, (double)l2.bm * 0.5, f3);
            s s3 = this.a((l)g2, (double)f8, f3);
            s s4 = s2.d(s3);
            double d5 = s4.b() + 1.0;
            s4 = s4.a();
            float f9 = (float)Math.acos(s4.c);
            float f10 = (float)Math.atan2(s4.d, s4.b);
            bd.b((1.5707964f + -f10) * 57.295776f, 0.0f, 1.0f, 0.0f);
            bd.b(f9 * 57.295776f, 1.0f, 0.0f, 0.0f);
            boolean bl2 = true;
            double d6 = (double)f6 * 0.05 * -1.5;
            g3.a(7, net.minecraft.client.g.d.b.i);
            float f11 = f4 * f4;
            int n2 = 64 + (int)(f11 * 191.0f);
            int n3 = 32 + (int)(f11 * 191.0f);
            int n4 = 128 - (int)(f11 * 64.0f);
            double d7 = 0.2;
            double d8 = 0.282;
            double d9 = 0.0 + Math.cos(d6 + 2.356194490192345) * 0.282;
            double d10 = 0.0 + Math.sin(d6 + 2.356194490192345) * 0.282;
            double d11 = 0.0 + Math.cos(d6 + 0.7853981633974483) * 0.282;
            double d12 = 0.0 + Math.sin(d6 + 0.7853981633974483) * 0.282;
            double d13 = 0.0 + Math.cos(d6 + 3.9269908169872414) * 0.282;
            double d14 = 0.0 + Math.sin(d6 + 3.9269908169872414) * 0.282;
            double d15 = 0.0 + Math.cos(d6 + 5.497787143782138) * 0.282;
            double d16 = 0.0 + Math.sin(d6 + 5.497787143782138) * 0.282;
            double d17 = 0.0 + Math.cos(d6 + Math.PI) * 0.2;
            double d18 = 0.0 + Math.sin(d6 + Math.PI) * 0.2;
            double d19 = 0.0 + Math.cos(d6 + 0.0) * 0.2;
            double d20 = 0.0 + Math.sin(d6 + 0.0) * 0.2;
            double d21 = 0.0 + Math.cos(d6 + 1.5707963267948966) * 0.2;
            double d22 = 0.0 + Math.sin(d6 + 1.5707963267948966) * 0.2;
            double d23 = 0.0 + Math.cos(d6 + 4.71238898038469) * 0.2;
            double d24 = 0.0 + Math.sin(d6 + 4.71238898038469) * 0.2;
            double d25 = 0.0;
            double d26 = 0.4999;
            double d27 = -1.0f + f7;
            double d28 = d5 * 2.5 + d27;
            g3.b(d17, d5, d18).a(0.4999, d28).b(n2, n3, n4, 255).d();
            g3.b(d17, 0.0, d18).a(0.4999, d27).b(n2, n3, n4, 255).d();
            g3.b(d19, 0.0, d20).a(0.0, d27).b(n2, n3, n4, 255).d();
            g3.b(d19, d5, d20).a(0.0, d28).b(n2, n3, n4, 255).d();
            g3.b(d21, d5, d22).a(0.4999, d28).b(n2, n3, n4, 255).d();
            g3.b(d21, 0.0, d22).a(0.4999, d27).b(n2, n3, n4, 255).d();
            g3.b(d23, 0.0, d24).a(0.0, d27).b(n2, n3, n4, 255).d();
            g3.b(d23, d5, d24).a(0.0, d28).b(n2, n3, n4, 255).d();
            double d29 = 0.0;
            if (g2.by % 2 == 0) {
                d29 = 0.5;
            }
            g3.b(d9, d5, d10).a(0.5, d29 + 0.5).b(n2, n3, n4, 255).d();
            g3.b(d11, d5, d12).a(1.0, d29 + 0.5).b(n2, n3, n4, 255).d();
            g3.b(d15, d5, d16).a(1.0, d29).b(n2, n3, n4, 255).d();
            g3.b(d13, d5, d14).a(0.5, d29).b(n2, n3, n4, 255).d();
            ci2.b();
            bd.E();
        }
    }

    protected void a(net.minecraft.w.e.g g2, float f2) {
        if (g2.q()) {
            bd.b(2.35f, 2.35f, 2.35f);
        }
    }

    protected bp a(net.minecraft.w.e.g g2) {
        return g2.q() ? k : b;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((net.minecraft.w.e.g)n2);
    }
}

