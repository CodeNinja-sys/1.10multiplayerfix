/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d;

import com.a.a.b.cm;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.q.ah;
import net.minecraft.r.j;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bv;
import net.minecraft.u.r;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.ae;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.ar;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.y;
import net.minecraft.w.d.c;
import net.minecraft.w.d.d;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.m;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class e
extends k
implements m {
    private static final net.minecraft.x.a.g a = net.minecraft.x.a.o.a(e.class, net.minecraft.x.a.q.b);
    private static final net.minecraft.x.a.g b = net.minecraft.x.a.o.a(e.class, net.minecraft.x.a.q.b);
    private static final net.minecraft.x.a.g c = net.minecraft.x.a.o.a(e.class, net.minecraft.x.a.q.b);
    private static final net.minecraft.x.a.g[] d = new net.minecraft.x.a.g[]{a, b, c};
    private static final net.minecraft.x.a.g e = net.minecraft.x.a.o.a(e.class, net.minecraft.x.a.q.b);
    private final float[] f = new float[2];
    private final float[] g = new float[2];
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final int[] u = new int[2];
    private final int[] v = new int[2];
    private int w;
    private final ah x = (ah)new ah(this.aK(), net.minecraft.q.ae.f, net.minecraft.q.ar.a).a(true);
    private static final cm y = new d();

    public e(net.minecraft.q.k k2) {
        super(k2);
        this.h(this.bw());
        this.d(0.9f, 3.5f);
        this.bD = true;
        ((net.minecraft.i.a)this.N()).c(true);
        this.k = 50;
    }

    @Override
    protected void cA_() {
        this.o.a(0, new c(this));
        this.o.a(1, new av(this));
        this.o.a(2, new ar(this, 1.0, 40, 20.0f));
        this.o.a(5, new az(this, 1.0));
        this.o.a(6, new ap(this, b.class, 8.0f));
        this.o.a(7, new bh(this));
        this.p.a(1, new ba((t)this, false, new Class[0]));
        this.p.a(2, new y(this, f.class, 0, false, false, y));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, 0);
        this.bE.a(b, 0);
        this.bE.a(c, 0);
        this.bE.a(e, 0);
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "WitherBoss");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Invul", this.p());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.e(e2.h("Invul"));
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.gU;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.gX;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.gW;
    }

    @Override
    public void n() {
        int n2;
        int n3;
        double d2;
        double d3;
        double d4;
        n n4;
        this.aY *= (double)0.6f;
        if (!this.aQ.C && this.f(0) > 0 && (n4 = this.aQ.a(this.f(0))) != null) {
            double d5;
            if (this.aV < n4.aV || !this.q() && this.aV < n4.aV + 5.0) {
                if (this.aY < 0.0) {
                    this.aY = 0.0;
                }
                this.aY += (0.5 - this.aY) * (double)0.6f;
            }
            if ((d4 = (d5 = n4.aU - this.aU) * d5 + (d3 = n4.aW - this.aW) * d3) > 9.0) {
                d2 = net.minecraft.u.b.n.a(d4);
                this.aX += (d5 / d2 * 0.5 - this.aX) * (double)0.6f;
                this.aZ += (d3 / d2 * 0.5 - this.aZ) * (double)0.6f;
            }
        }
        if (this.aX * this.aX + this.aZ * this.aZ > (double)0.05f) {
            this.ba = (float)net.minecraft.u.b.n.b(this.aZ, this.aX) * 57.295776f - 90.0f;
        }
        super.n();
        for (n3 = 0; n3 < 2; ++n3) {
            this.i[n3] = this.g[n3];
            this.h[n3] = this.f[n3];
        }
        for (n3 = 0; n3 < 2; ++n3) {
            int n5 = this.f(n3 + 1);
            n n6 = null;
            if (n5 > 0) {
                n6 = this.aQ.a(n5);
            }
            if (n6 != null) {
                d3 = this.g(n3 + 1);
                d4 = this.o(n3 + 1);
                d2 = this.p(n3 + 1);
                double d6 = n6.aU - d3;
                double d7 = n6.aV + (double)n6.ce_() - d4;
                double d8 = n6.aW - d2;
                double d9 = net.minecraft.u.b.n.a(d6 * d6 + d8 * d8);
                float f2 = (float)(net.minecraft.u.b.n.b(d8, d6) * 57.29577951308232) - 90.0f;
                float f3 = (float)(-(net.minecraft.u.b.n.b(d7, d9) * 57.29577951308232));
                this.f[n3] = this.b(this.f[n3], f3, 40.0f);
                this.g[n3] = this.b(this.g[n3], f2, 10.0f);
                continue;
            }
            this.g[n3] = this.b(this.g[n3], this.ak, 10.0f);
        }
        n3 = this.q() ? 1 : 0;
        for (n2 = 0; n2 < 3; ++n2) {
            double d10 = this.g(n2);
            double d11 = this.o(n2);
            double d12 = this.p(n2);
            this.aQ.a(net.minecraft.u.aj.l, d10 + this.bx.nextGaussian() * (double)0.3f, d11 + this.bx.nextGaussian() * (double)0.3f, d12 + this.bx.nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0, new int[0]);
            if (n3 == 0 || this.aQ.p.nextInt(4) != 0) continue;
            this.aQ.a(net.minecraft.u.aj.p, d10 + this.bx.nextGaussian() * (double)0.3f, d11 + this.bx.nextGaussian() * (double)0.3f, d12 + this.bx.nextGaussian() * (double)0.3f, (double)0.7f, (double)0.7f, 0.5, new int[0]);
        }
        if (this.p() > 0) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.aQ.a(net.minecraft.u.aj.p, this.aU + this.bx.nextGaussian(), this.aV + (double)(this.bx.nextFloat() * 3.3f), this.aW + this.bx.nextGaussian(), (double)0.7f, (double)0.7f, (double)0.9f, new int[0]);
            }
        }
    }

    @Override
    protected void e() {
        if (this.p() > 0) {
            int n2 = this.p() - 1;
            if (n2 <= 0) {
                this.aQ.a(this, this.aU, this.aV + (double)this.ce_(), this.aW, 7.0f, false, this.aQ.G().b("mobGriefing"));
                this.aQ.a(1023, new net.minecraft.u.b.b(this), 0);
            }
            this.e(n2);
            if (this.by % 10 == 0) {
                this.a(10.0f);
            }
        } else {
            int n3;
            int n4;
            super.e();
            block0: for (n4 = 1; n4 < 3; ++n4) {
                Object object;
                if (this.by < this.u[n4 - 1]) continue;
                this.u[n4 - 1] = this.by + 10 + this.bx.nextInt(10);
                if (this.aQ.R() == net.minecraft.q.l.c || this.aQ.R() == net.minecraft.q.l.d) {
                    n3 = n4 - 1;
                    int n5 = this.v[n4 - 1];
                    this.v[n3] = this.v[n4 - 1] + 1;
                    if (n5 > 15) {
                        float f2 = 10.0f;
                        float f3 = 5.0f;
                        double d2 = net.minecraft.u.b.n.a(this.bx, this.aU - 10.0, this.aU + 10.0);
                        double d3 = net.minecraft.u.b.n.a(this.bx, this.aV - 5.0, this.aV + 5.0);
                        double d4 = net.minecraft.u.b.n.a(this.bx, this.aW - 10.0, this.aW + 10.0);
                        this.a(n4 + 1, d2, d3, d4, true);
                        this.v[n4 - 1] = 0;
                    }
                }
                if ((n3 = this.f(n4)) > 0) {
                    object = this.aQ.a(n3);
                    if (object != null && ((n)object).br() && this.n((n)object) <= 900.0 && this.l((n)object)) {
                        if (object instanceof b && ((b)object).J.a) {
                            this.a(n4, 0);
                            continue;
                        }
                        this.a(n4 + 1, (l)object);
                        this.u[n4 - 1] = this.by + 40 + this.bx.nextInt(20);
                        this.v[n4 - 1] = 0;
                        continue;
                    }
                    this.a(n4, 0);
                    continue;
                }
                object = this.aQ.a(l.class, this.cT().b(20.0, 8.0, 20.0), com.a.a.b.cn.a(y, net.minecraft.u.r.e));
                for (int i2 = 0; i2 < 10 && !object.isEmpty(); ++i2) {
                    l l2 = (l)object.get(this.bx.nextInt(object.size()));
                    if (l2 != this && l2.br() && this.l(l2)) {
                        if (l2 instanceof b) {
                            if (((b)l2).J.a) continue block0;
                            this.a(n4, l2.ca());
                            continue block0;
                        }
                        this.a(n4, l2.ca());
                        continue block0;
                    }
                    object.remove(l2);
                }
            }
            if (this.W() != null) {
                this.a(0, this.W().ca());
            } else {
                this.a(0, 0);
            }
            if (this.w > 0) {
                --this.w;
                if (this.w == 0 && this.aQ.G().b("mobGriefing")) {
                    n4 = net.minecraft.u.b.n.c(this.aV);
                    n3 = net.minecraft.u.b.n.c(this.aU);
                    int n6 = net.minecraft.u.b.n.c(this.aW);
                    boolean bl2 = false;
                    for (int i3 = -1; i3 <= 1; ++i3) {
                        for (int i4 = -1; i4 <= 1; ++i4) {
                            for (int i5 = 0; i5 <= 3; ++i5) {
                                int n7 = n3 + i3;
                                int n8 = n4 + i5;
                                int n9 = n6 + i4;
                                net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n7, n8, n9);
                                net.minecraft.g.c.b b3 = this.aQ.n(b2);
                                cn cn2 = b3.c();
                                if (b3.d() == net.minecraft.g.a.h.a || !net.minecraft.w.d.e.a(cn2)) continue;
                                bl2 = this.aQ.b(b2, true) || bl2;
                            }
                        }
                    }
                    if (bl2) {
                        this.aQ.a(null, 1022, new net.minecraft.u.b.b(this), 0);
                    }
                }
            }
            if (this.by % 20 == 0) {
                this.a(1.0f);
            }
            this.x.a(this.bo() / this.bw());
        }
    }

    public static boolean a(cn cn2) {
        return cn2 != net.minecraft.a.p.h && cn2 != net.minecraft.a.p.bF && cn2 != net.minecraft.a.p.bG && cn2 != net.minecraft.a.p.bX && cn2 != net.minecraft.a.p.dc && cn2 != net.minecraft.a.p.dd && cn2 != net.minecraft.a.p.cv;
    }

    public void c() {
        this.e(220);
        this.h(this.bw() / 3.0f);
    }

    @Override
    public void am() {
    }

    @Override
    public void b(g g2) {
        super.b(g2);
        this.x.a(g2);
    }

    @Override
    public void c(g g2) {
        super.c(g2);
        this.x.b(g2);
    }

    private double g(int n2) {
        if (n2 <= 0) {
            return this.aU;
        }
        float f2 = (this.ak + (float)(180 * (n2 - 1))) * ((float)Math.PI / 180);
        float f3 = net.minecraft.u.b.n.b(f2);
        return this.aU + (double)f3 * 1.3;
    }

    private double o(int n2) {
        return n2 <= 0 ? this.aV + 3.0 : this.aV + 2.2;
    }

    private double p(int n2) {
        if (n2 <= 0) {
            return this.aW;
        }
        float f2 = (this.ak + (float)(180 * (n2 - 1))) * ((float)Math.PI / 180);
        float f3 = net.minecraft.u.b.n.a(f2);
        return this.aW + (double)f3 * 1.3;
    }

    private float b(float f2, float f3, float f4) {
        float f5 = net.minecraft.u.b.n.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    private void a(int n2, l l2) {
        this.a(n2, l2.aU, l2.aV + (double)l2.ce_() * 0.5, l2.aW, n2 == 0 && this.bx.nextFloat() < 0.001f);
    }

    private void a(int n2, double d2, double d3, double d4, boolean bl2) {
        this.aQ.a(null, 1024, new net.minecraft.u.b.b(this), 0);
        double d5 = this.g(n2);
        double d6 = this.o(n2);
        double d7 = this.p(n2);
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        net.minecraft.w.c.b b2 = new net.minecraft.w.c.b(this.aQ, this, d8, d9, d10);
        if (bl2) {
            b2.a(true);
        }
        b2.aV = d6;
        b2.aU = d5;
        b2.aW = d7;
        this.aQ.a(b2);
    }

    @Override
    public void a(l l2, float f2) {
        this.a(0, l2);
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (n2 != net.minecraft.u.n.g && !(n2.j() instanceof e)) {
            n n3;
            if (this.p() > 0 && n2 != net.minecraft.u.n.l) {
                return false;
            }
            if (this.q() && (n3 = n2.i()) instanceof net.minecraft.w.c.f) {
                return false;
            }
            n3 = n2.j();
            if (n3 != null && !(n3 instanceof b) && n3 instanceof l && ((l)n3).bB() == this.bB()) {
                return false;
            }
            if (this.w <= 0) {
                this.w = 20;
            }
            int n4 = 0;
            while (n4 < this.v.length) {
                int n5 = n4++;
                this.v[n5] = this.v[n5] + 3;
            }
            return super.a(n2, f2);
        }
        return false;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        net.minecraft.w.f.ae ae2 = this.a(net.minecraft.a.w.cj, 1);
        if (ae2 != null) {
            ae2.r();
        }
        if (!this.aQ.C) {
            for (b b2 : this.aQ.a(b.class, this.cT().b(50.0, 100.0, 50.0))) {
                b2.a((net.minecraft.r.k)net.minecraft.r.j.J);
            }
        }
    }

    @Override
    protected void an() {
        this.as = 0;
    }

    @Override
    public int m(float f2) {
        return 0xF000F0;
    }

    @Override
    public void c(float f2, float f3) {
    }

    @Override
    public void c(net.minecraft.d.j j2) {
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(300.0);
        this.a(net.minecraft.w.d.d).a(0.6f);
        this.a(net.minecraft.w.d.b).a(40.0);
        this.a(net.minecraft.w.d.g).a(4.0);
    }

    public float b(int n2) {
        return this.g[n2];
    }

    public float c(int n2) {
        return this.f[n2];
    }

    public int p() {
        return (Integer)this.bE.a(e);
    }

    public void e(int n2) {
        this.bE.b(e, n2);
    }

    public int f(int n2) {
        return (Integer)this.bE.a(d[n2]);
    }

    public void a(int n2, int n3) {
        this.bE.b(d[n2], n3);
    }

    public boolean q() {
        return this.bo() <= this.bw() / 2.0f;
    }

    @Override
    public ae bB() {
        return net.minecraft.w.ae.b;
    }

    @Override
    protected boolean s(n n2) {
        return false;
    }

    @Override
    public boolean cH() {
        return false;
    }
}

