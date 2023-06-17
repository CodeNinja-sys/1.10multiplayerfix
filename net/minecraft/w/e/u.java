/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.List;
import java.util.UUID;
import net.minecraft.a.c;
import net.minecraft.a.o;
import net.minecraft.a.w;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.ar;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.m;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.q;

public class u
extends k
implements m {
    private static final UUID a = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
    private static final h b = new h(a, "Drinking speed penalty", -0.25, 0).a(false);
    private static final g c = net.minecraft.x.a.o.a(u.class, net.minecraft.x.a.q.h);
    private int d;

    public u(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.6f, 1.95f);
    }

    public static void a(a a2) {
        f.a(a2, "Witch");
    }

    @Override
    protected void cA_() {
        this.o.a(1, new av(this));
        this.o.a(2, new ar(this, 1.0, 60, 10.0f));
        this.o.a(2, new az(this, 1.0));
        this.o.a(3, new ap(this, b.class, 8.0f));
        this.o.a(3, new bh(this));
        this.p.a(1, new ba((t)this, false, new Class[0]));
        this.p.a(2, new y((t)this, b.class, true));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.cc().a(c, false);
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.gP;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.gS;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.gQ;
    }

    public void a(boolean bl2) {
        this.cc().b(c, bl2);
    }

    public boolean c() {
        return (Boolean)this.cc().a(c);
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(26.0);
        this.a(net.minecraft.w.d.d).a(0.25);
    }

    @Override
    public void n() {
        if (!this.aQ.C) {
            if (this.c()) {
                if (this.d-- <= 0) {
                    List list;
                    this.a(false);
                    cu cu2 = this.bC();
                    this.a(net.minecraft.h.k.a, null);
                    if (cu2 != null && cu2.a() == w.bG && (list = net.minecraft.d.m.a(cu2)) != null) {
                        for (net.minecraft.d.j j2 : list) {
                            this.c(new net.minecraft.d.j(j2));
                        }
                    }
                    this.a(net.minecraft.w.d.d).c(b);
                }
            } else {
                net.minecraft.d.b b2 = null;
                if (this.bx.nextFloat() < 0.15f && this.a(net.minecraft.g.a.h.h) && !this.b(net.minecraft.a.c.m)) {
                    b2 = net.minecraft.a.o.t;
                } else if (this.bx.nextFloat() < 0.15f && (this.cy() || this.bp() != null && this.bp().o()) && !this.b(net.minecraft.a.c.l)) {
                    b2 = net.minecraft.a.o.m;
                } else if (this.bx.nextFloat() < 0.05f && this.bo() < this.bw()) {
                    b2 = net.minecraft.a.o.v;
                } else if (this.bx.nextFloat() < 0.5f && this.W() != null && !this.b(net.minecraft.a.c.a) && this.W().n(this) > 121.0) {
                    b2 = net.minecraft.a.o.o;
                }
                if (b2 != null) {
                    this.a(net.minecraft.h.k.a, net.minecraft.d.m.a(new cu(w.bG), b2));
                    this.d = this.bC().l();
                    this.a(true);
                    this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.gR, this.S(), 1.0f, 0.8f + this.bx.nextFloat() * 0.4f);
                    i i2 = this.a(net.minecraft.w.d.d);
                    i2.c(b);
                    i2.b(b);
                }
            }
            if (this.bx.nextFloat() < 7.5E-4f) {
                this.aQ.a((n)this, (byte)15);
            }
        }
        super.n();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 15) {
            for (int i2 = 0; i2 < this.bx.nextInt(35) + 10; ++i2) {
                this.aQ.a(net.minecraft.u.aj.r, this.aU + this.bx.nextGaussian() * (double)0.13f, this.cT().e + 0.5 + this.bx.nextGaussian() * (double)0.13f, this.aW + this.bx.nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0, new int[0]);
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    protected float d(net.minecraft.u.n n2, float f2) {
        f2 = super.d(n2, f2);
        if (n2.j() == this) {
            f2 = 0.0f;
        }
        if (n2.s()) {
            f2 = (float)((double)f2 * 0.15);
        }
        return f2;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.o;
    }

    @Override
    public void a(l l2, float f2) {
        if (!this.c()) {
            double d2 = l2.aV + (double)l2.ce_() - (double)1.1f;
            double d3 = l2.aU + l2.aX - this.aU;
            double d4 = d2 - this.aV;
            double d5 = l2.aW + l2.aZ - this.aW;
            float f3 = net.minecraft.u.b.n.a(d3 * d3 + d5 * d5);
            net.minecraft.d.b b2 = net.minecraft.a.o.x;
            if (f3 >= 8.0f && !l2.b(net.minecraft.a.c.b)) {
                b2 = net.minecraft.a.o.r;
            } else if (l2.bo() >= 8.0f && !l2.b(net.minecraft.a.c.s)) {
                b2 = net.minecraft.a.o.z;
            } else if (f3 <= 3.0f && !l2.b(net.minecraft.a.c.r) && this.bx.nextFloat() < 0.25f) {
                b2 = net.minecraft.a.o.I;
            }
            net.minecraft.w.c.k k2 = new net.minecraft.w.c.k(this.aQ, this, net.minecraft.d.m.a(new cu(w.bH), b2));
            k2.bb -= -20.0f;
            k2.c(d3, d4 + (double)(f3 * 0.2f), d5, 0.75f, 8.0f);
            this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.gT, this.S(), 1.0f, 0.8f + this.bx.nextFloat() * 0.4f);
            this.aQ.a(k2);
        }
    }

    @Override
    public float ce_() {
        return 1.62f;
    }
}

