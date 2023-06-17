/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.d.ov;
import java.util.ArrayList;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.dq;
import net.minecraft.g.gy;
import net.minecraft.g.p;
import net.minecraft.k.i;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.bp;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class n
extends net.minecraft.w.n {
    private b e;
    public int a;
    public boolean b = true;
    private boolean f;
    private boolean g;
    private int h = 40;
    private float i = 2.0f;
    public e c;
    protected static final g d = o.a(n.class, q.j);

    public n(k k2) {
        super(k2);
    }

    public n(k k2, double d2, double d3, double d4, b b2) {
        super(k2);
        this.e = b2;
        this.aN = true;
        this.d(0.98f, 0.98f);
        this.e(d2, d3 + (double)((1.0f - this.bm) / 2.0f), d4);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
        this.a(new net.minecraft.u.b.b(this));
    }

    public void a(net.minecraft.u.b.b b2) {
        this.bE.b(d, b2);
    }

    public net.minecraft.u.b.b a() {
        return (net.minecraft.u.b.b)this.bE.a(d);
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    protected void cb_() {
        this.bE.a(d, net.minecraft.u.b.b.c);
    }

    @Override
    public boolean cg_() {
        return !this.bk;
    }

    @Override
    public void cE_() {
        cn cn2 = this.e.c();
        if (this.e.d() == net.minecraft.g.a.h.a) {
            this.aa();
        } else {
            net.minecraft.u.b.b b2;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            if (this.a++ == 0) {
                b2 = new net.minecraft.u.b.b(this);
                if (this.aQ.n(b2).c() == cn2) {
                    this.aQ.f(b2);
                } else if (!this.aQ.C) {
                    this.aa();
                    return;
                }
            }
            if (!this.ci()) {
                this.aY -= (double)0.04f;
            }
            this.b(this.aX, this.aY, this.aZ);
            this.aX *= (double)0.98f;
            this.aY *= (double)0.98f;
            this.aZ *= (double)0.98f;
            if (!this.aQ.C) {
                b2 = new net.minecraft.u.b.b(this);
                if (this.be) {
                    b b3 = this.aQ.n(b2);
                    if (dq.m(this.aQ.n(new net.minecraft.u.b.b(this.aU, this.aV - (double)0.01f, this.aW)))) {
                        this.be = false;
                        return;
                    }
                    this.aX *= (double)0.7f;
                    this.aZ *= (double)0.7f;
                    this.aY *= -0.5;
                    if (b3.c() != net.minecraft.a.p.M) {
                        this.aa();
                        if (!this.f) {
                            if (this.aQ.a(cn2, b2, true, ad.b, null, null) && !dq.m(this.aQ.n(b2.c())) && this.aQ.a(b2, this.e, 3)) {
                                ap ap2;
                                if (cn2 instanceof dq) {
                                    ((dq)cn2).c(this.aQ, b2);
                                }
                                if (this.c != null && cn2 instanceof p && (ap2 = this.aQ.q(b2)) != null) {
                                    e e2 = ap2.a(new e());
                                    for (String string : this.c.e()) {
                                        a a2 = this.c.c(string);
                                        if ("x".equals(string) || "y".equals(string) || "z".equals(string)) continue;
                                        e2.a(string, a2.b());
                                    }
                                    ap2.b(e2);
                                    ap2.C();
                                }
                            } else if (this.b && this.aQ.G().b("doEntityDrops")) {
                                this.a(new cu(cn2, 1, cn2.k(this.e)), 0.0f);
                            }
                        }
                    }
                } else if (this.a > 100 && !this.aQ.C && (b2.k() < 1 || b2.k() > 256) || this.a > 600) {
                    if (this.b && this.aQ.G().b("doEntityDrops")) {
                        this.a(new cu(cn2, 1, cn2.k(this.e)), 0.0f);
                    }
                    this.aa();
                }
            }
        }
    }

    @Override
    public void c(float f2, float f3) {
        int n2;
        cn cn2 = this.e.c();
        if (this.g && (n2 = net.minecraft.u.b.n.f(f2 - 1.0f)) > 0) {
            ArrayList arrayList = ov.a((Iterable)this.aQ.b((net.minecraft.w.n)this, this.cT()));
            boolean bl2 = cn2 == net.minecraft.a.p.cf;
            net.minecraft.u.n n3 = bl2 ? net.minecraft.u.n.p : net.minecraft.u.n.q;
            for (net.minecraft.w.n n4 : arrayList) {
                n4.a(n3, (float)Math.min(net.minecraft.u.b.n.d((float)n2 * this.i), this.h));
            }
            if (bl2 && (double)this.bx.nextFloat() < (double)0.05f + (double)n2 * 0.05) {
                int n5 = (Integer)this.e.a(gy.c);
                if (++n5 > 2) {
                    this.f = true;
                } else {
                    this.e = this.e.a(gy.c, Integer.valueOf(n5));
                }
            }
        }
    }

    public static void a(net.minecraft.u.a.a a2) {
    }

    @Override
    protected void a(e e2) {
        cn cn2 = this.e != null ? this.e.c() : net.minecraft.a.p.a;
        bp bp2 = (bp)cn.v.b(cn2);
        e2.a("Block", bp2 == null ? "" : bp2.toString());
        e2.a("Data", (byte)cn2.b(this.e));
        e2.a("Time", this.a);
        e2.a("DropItem", this.b);
        e2.a("HurtEntities", this.g);
        e2.a("FallHurtAmount", this.i);
        e2.a("FallHurtMax", this.h);
        if (this.c != null) {
            e2.a("TileEntityData", this.c);
        }
    }

    @Override
    protected void b(e e2) {
        int n2 = e2.f("Data") & 0xFF;
        this.e = e2.b("Block", 8) ? cn.a(e2.l("Block")).a(n2) : (e2.b("TileID", 99) ? cn.d(e2.h("TileID")).a(n2) : cn.d(e2.f("Tile") & 0xFF).a(n2));
        this.a = e2.h("Time");
        cn cn2 = this.e.c();
        if (e2.b("HurtEntities", 99)) {
            this.g = e2.p("HurtEntities");
            this.i = e2.j("FallHurtAmount");
            this.h = e2.h("FallHurtMax");
        } else if (cn2 == net.minecraft.a.p.cf) {
            this.g = true;
        }
        if (e2.b("DropItem", 99)) {
            this.b = e2.p("DropItem");
        }
        if (e2.b("TileEntityData", 10)) {
            this.c = e2.o("TileEntityData");
        }
        if (cn2 == null || cn2.v().d() == net.minecraft.g.a.h.a) {
            this.e = net.minecraft.a.p.m.v();
        }
    }

    public k c() {
        return this.aQ;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    @Override
    public boolean cL() {
        return false;
    }

    @Override
    public void a(i i2) {
        super.a(i2);
        if (this.e != null) {
            cn cn2 = this.e.c();
            i2.a("Immitating block ID", cn.c(cn2));
            i2.a("Immitating block data", cn2.b(this.e));
        }
    }

    public b f() {
        return this.e;
    }

    @Override
    public boolean cY() {
        return true;
    }
}

