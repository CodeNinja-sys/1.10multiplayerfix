/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.d.aad;
import com.a.a.d.mq;
import com.a.a.d.ov;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.e.s;
import net.minecraft.e.y;
import net.minecraft.g.cn;
import net.minecraft.g.ct;
import net.minecraft.g.ee;
import net.minecraft.g.ey;
import net.minecraft.g.fk;
import net.minecraft.g.fm;
import net.minecraft.h.k;
import net.minecraft.k.i;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.n.ap;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.o.f;
import net.minecraft.o.z;
import net.minecraft.q.t;
import net.minecraft.u.ac;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.u.b.r;
import net.minecraft.u.bi;
import net.minecraft.u.bo;
import net.minecraft.u.bq;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.ad;
import net.minecraft.w.af;
import net.minecraft.w.f.ab;
import net.minecraft.w.f.ae;
import net.minecraft.w.g.a;
import net.minecraft.w.h;
import net.minecraft.w.l;
import net.minecraft.w.v;
import net.minecraft.w.x;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class n
implements az {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final net.minecraft.u.b.a b = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private static double c = 1.0;
    private static int d;
    private int e = d++;
    public boolean aN;
    private final List f = ov.a();
    protected int aO;
    private n g;
    public boolean aP;
    public net.minecraft.q.k aQ;
    public double aR;
    public double aS;
    public double aT;
    public double aU;
    public double aV;
    public double aW;
    public double aX;
    public double aY;
    public double aZ;
    public float ba;
    public float bb;
    public float bc;
    public float bd;
    private net.minecraft.u.b.a h = b;
    public boolean be;
    public boolean bf;
    public boolean bg;
    public boolean bh;
    public boolean bi;
    protected boolean bj;
    private boolean i;
    public boolean bk;
    public float bl = 0.6f;
    public float bm = 1.8f;
    public float bn;
    public float bo;
    public float bp;
    public float bq;
    private int l = 1;
    public double br;
    public double bs;
    public double bt;
    public float bu;
    public boolean bv;
    public float bw;
    protected Random bx = new Random();
    public int by;
    public int bz = 1;
    private int m;
    protected boolean bA;
    public int bB;
    protected boolean bC = true;
    protected boolean bD;
    protected net.minecraft.x.a.o bE;
    protected static final net.minecraft.x.a.g bF;
    private static final net.minecraft.x.a.g n;
    private static final net.minecraft.x.a.g o;
    private static final net.minecraft.x.a.g p;
    private static final net.minecraft.x.a.g q;
    private static final net.minecraft.x.a.g r;
    public boolean bG;
    public int bH;
    public int bI;
    public int bJ;
    public long bK;
    public long bL;
    public long bM;
    public boolean bN;
    public boolean bO;
    public int bP;
    protected boolean bQ;
    protected int bR;
    public int bS;
    protected net.minecraft.u.b.b bT;
    protected net.minecraft.u.b.s bU;
    protected net.minecraft.u.ad bV;
    private boolean s;
    protected UUID bW = net.minecraft.u.b.n.a(this.bx);
    protected String bX = this.bW.toString();
    private final ap t = new ap();
    private final List u = ov.a();
    protected boolean bY;
    private final Set v = aad.a();
    private boolean w;

    static {
        bF = net.minecraft.x.a.o.a(n.class, net.minecraft.x.a.q.a);
        n = net.minecraft.x.a.o.a(n.class, net.minecraft.x.a.q.b);
        o = net.minecraft.x.a.o.a(n.class, net.minecraft.x.a.q.d);
        p = net.minecraft.x.a.o.a(n.class, net.minecraft.x.a.q.h);
        q = net.minecraft.x.a.o.a(n.class, net.minecraft.x.a.q.h);
        r = net.minecraft.x.a.o.a(n.class, net.minecraft.x.a.q.h);
    }

    public n(net.minecraft.q.k k2) {
        this.aQ = k2;
        this.e(0.0, 0.0, 0.0);
        if (k2 != null) {
            this.bS = k2.q.a().a();
        }
        this.bE = new net.minecraft.x.a.o(this);
        this.bE.a(bF, (byte)0);
        this.bE.a(n, 300);
        this.bE.a(p, false);
        this.bE.a(o, "");
        this.bE.a(q, false);
        this.bE.a(r, false);
        this.cb_();
    }

    public int ca() {
        return this.e;
    }

    public void j(int n2) {
        this.e = n2;
    }

    public Set cb() {
        return this.v;
    }

    public boolean e(String string) {
        if (this.v.size() >= 1024) {
            return false;
        }
        this.v.add(string);
        return true;
    }

    public boolean f(String string) {
        return this.v.remove(string);
    }

    public void aY() {
        this.aa();
    }

    protected abstract void cb_();

    public net.minecraft.x.a.o cc() {
        return this.bE;
    }

    public boolean equals(Object object) {
        return object instanceof n ? ((n)object).e == this.e : false;
    }

    public int hashCode() {
        return this.e;
    }

    protected void U() {
        if (this.aQ != null) {
            while (this.aV > 0.0 && this.aV < 256.0) {
                this.e(this.aU, this.aV, this.aW);
                if (this.aQ.a(this, this.cT()).isEmpty()) break;
                this.aV += 1.0;
            }
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
            this.bb = 0.0f;
        }
    }

    public void aa() {
        this.bk = true;
    }

    public void j(boolean bl2) {
    }

    protected void d(float f2, float f3) {
        if (f2 != this.bl || f3 != this.bm) {
            float f4 = this.bl;
            this.bl = f2;
            this.bm = f3;
            net.minecraft.u.b.a a2 = this.cT();
            this.a(new net.minecraft.u.b.a(a2.a, a2.b, a2.c, a2.a + (double)this.bl, a2.b + (double)this.bm, a2.c + (double)this.bl));
            if (this.bl > f4 && !this.bC && !this.aQ.C) {
                this.b(f4 - this.bl, 0.0, f4 - this.bl);
            }
        }
    }

    protected void e(float f2, float f3) {
        this.ba = f2 % 360.0f;
        this.bb = f3 % 360.0f;
    }

    public void e(double d2, double d3, double d4) {
        this.aU = d2;
        this.aV = d3;
        this.aW = d4;
        float f2 = this.bl / 2.0f;
        float f3 = this.bm;
        this.a(new net.minecraft.u.b.a(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public void f(float f2, float f3) {
        float f4 = this.bb;
        float f5 = this.ba;
        this.ba = (float)((double)this.ba + (double)f2 * 0.15);
        this.bb = (float)((double)this.bb - (double)f3 * 0.15);
        this.bb = net.minecraft.u.b.n.a(this.bb, -90.0f, 90.0f);
        this.bd += this.bb - f4;
        this.bc += this.ba - f5;
        if (this.g != null) {
            this.g.q(this);
        }
    }

    public void cE_() {
        if (!this.aQ.C) {
            this.a(6, this.cC());
        }
        this.cf_();
    }

    public void cf_() {
        this.aQ.A.a("entityBaseTick");
        if (this.cz() && this.df().bk) {
            this.o();
        }
        if (this.aO > 0) {
            --this.aO;
        }
        this.bn = this.bo;
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        this.bd = this.bb;
        this.bc = this.ba;
        if (!this.aQ.C && this.aQ instanceof net.minecraft.q.v) {
            this.aQ.A.a("portal");
            if (this.bQ) {
                net.minecraft.c.a a2 = this.aQ.l();
                if (a2.O()) {
                    int n2;
                    if (!this.cz() && this.bR++ >= (n2 = this.O())) {
                        this.bR = n2;
                        this.bP = this.R();
                        int n3 = this.aQ.q.a().a() == -1 ? 0 : -1;
                        this.h_(n3);
                    }
                    this.bQ = false;
                }
            } else {
                if (this.bR > 0) {
                    this.bR -= 4;
                }
                if (this.bR < 0) {
                    this.bR = 0;
                }
            }
            this.aP();
            this.aQ.A.b();
        }
        this.co();
        this.cn();
        if (this.aQ.C) {
            this.m = 0;
        } else if (this.m > 0) {
            if (this.bD) {
                this.m -= 4;
                if (this.m < 0) {
                    this.m = 0;
                }
            } else {
                if (this.m % 20 == 0) {
                    this.a(net.minecraft.u.n.c, 1.0f);
                }
                --this.m;
            }
        }
        if (this.cq()) {
            this.cd();
            this.bq *= 0.5f;
        }
        if (this.aV < -64.0) {
            this.by();
        }
        if (!this.aQ.C) {
            this.a(0, this.m > 0);
        }
        this.bC = false;
        this.aQ.A.b();
    }

    protected void aP() {
        if (this.bP > 0) {
            --this.bP;
        }
    }

    public int O() {
        return 1;
    }

    protected void cd() {
        if (!this.bD) {
            this.a(net.minecraft.u.n.d, 4.0f);
            this.k(15);
        }
    }

    public void k(int n2) {
        int n3 = n2 * 20;
        if (this instanceof l) {
            n3 = z.a((l)this, n3);
        }
        if (this.m < n3) {
            this.m = n3;
        }
    }

    public void ce() {
        this.m = 0;
    }

    protected void by() {
        this.aa();
    }

    public boolean g(double d2, double d3, double d4) {
        net.minecraft.u.b.a a2 = this.cT().c(d2, d3, d4);
        return this.b(a2);
    }

    private boolean b(net.minecraft.u.b.a a2) {
        return this.aQ.a(this, a2).isEmpty() && !this.aQ.e(a2);
    }

    public void b(double d2, double d3, double d4) {
        if (this.bv) {
            this.a(this.cT().c(d2, d3, d4));
            this.cf();
        } else {
            net.minecraft.u.b.b b2;
            net.minecraft.g.c.b b3;
            Object object;
            Object object2;
            int n2;
            boolean bl2;
            this.aQ.A.a("move");
            double d5 = this.aU;
            double d6 = this.aV;
            double d7 = this.aW;
            if (this.bj) {
                this.bj = false;
                d2 *= 0.25;
                d3 *= (double)0.05f;
                d4 *= 0.25;
                this.aX = 0.0;
                this.aY = 0.0;
                this.aZ = 0.0;
            }
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            boolean bl3 = bl2 = this.be && this.G() && this instanceof b;
            if (bl2) {
                double d11 = 0.05;
                while (d2 != 0.0 && this.aQ.a(this, this.cT().c(d2, -1.0, 0.0)).isEmpty()) {
                    d2 = d2 < 0.05 && d2 >= -0.05 ? 0.0 : (d2 > 0.0 ? (d2 -= 0.05) : (d2 += 0.05));
                    d8 = d2;
                }
                while (d4 != 0.0 && this.aQ.a(this, this.cT().c(0.0, -1.0, d4)).isEmpty()) {
                    d4 = d4 < 0.05 && d4 >= -0.05 ? 0.0 : (d4 > 0.0 ? (d4 -= 0.05) : (d4 += 0.05));
                    d10 = d4;
                }
                while (d2 != 0.0 && d4 != 0.0 && this.aQ.a(this, this.cT().c(d2, -1.0, d4)).isEmpty()) {
                    d2 = d2 < 0.05 && d2 >= -0.05 ? 0.0 : (d2 > 0.0 ? (d2 -= 0.05) : (d2 += 0.05));
                    d8 = d2;
                    d4 = d4 < 0.05 && d4 >= -0.05 ? 0.0 : (d4 > 0.0 ? (d4 -= 0.05) : (d4 += 0.05));
                    d10 = d4;
                }
            }
            List list = this.aQ.a(this, this.cT().a(d2, d3, d4));
            net.minecraft.u.b.a a2 = this.cT();
            int n3 = list.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                d3 = ((net.minecraft.u.b.a)list.get(i2)).b(this.cT(), d3);
            }
            this.a(this.cT().c(0.0, d3, 0.0));
            n3 = !(this.be || d9 != d3 && d9 < 0.0) ? 0 : 1;
            int n4 = list.size();
            for (n2 = 0; n2 < n4; ++n2) {
                d2 = ((net.minecraft.u.b.a)list.get(n2)).a(this.cT(), d2);
            }
            this.a(this.cT().c(d2, 0.0, 0.0));
            n4 = list.size();
            for (n2 = 0; n2 < n4; ++n2) {
                d4 = ((net.minecraft.u.b.a)list.get(n2)).c(this.cT(), d4);
            }
            this.a(this.cT().c(0.0, 0.0, d4));
            if (this.bu > 0.0f && n3 != 0 && (d8 != d2 || d10 != d4)) {
                double d12 = d2;
                double d13 = d3;
                double d14 = d4;
                object2 = this.cT();
                this.a(a2);
                d3 = this.bu;
                object = this.aQ.a(this, this.cT().a(d8, d3, d10));
                net.minecraft.u.b.a a3 = this.cT();
                net.minecraft.u.b.a a4 = a3.a(d8, 0.0, d10);
                double d15 = d3;
                int n5 = object.size();
                for (int i3 = 0; i3 < n5; ++i3) {
                    d15 = ((net.minecraft.u.b.a)object.get(i3)).b(a4, d15);
                }
                a3 = a3.c(0.0, d15, 0.0);
                double d16 = d8;
                int n6 = object.size();
                for (int i4 = 0; i4 < n6; ++i4) {
                    d16 = ((net.minecraft.u.b.a)object.get(i4)).a(a3, d16);
                }
                a3 = a3.c(d16, 0.0, 0.0);
                double d17 = d10;
                int n7 = object.size();
                for (int i5 = 0; i5 < n7; ++i5) {
                    d17 = ((net.minecraft.u.b.a)object.get(i5)).c(a3, d17);
                }
                a3 = a3.c(0.0, 0.0, d17);
                net.minecraft.u.b.a a5 = this.cT();
                double d18 = d3;
                int n8 = object.size();
                for (int i6 = 0; i6 < n8; ++i6) {
                    d18 = ((net.minecraft.u.b.a)object.get(i6)).b(a5, d18);
                }
                a5 = a5.c(0.0, d18, 0.0);
                double d19 = d8;
                int n9 = object.size();
                for (int i7 = 0; i7 < n9; ++i7) {
                    d19 = ((net.minecraft.u.b.a)object.get(i7)).a(a5, d19);
                }
                a5 = a5.c(d19, 0.0, 0.0);
                double d20 = d10;
                int n10 = object.size();
                for (int i8 = 0; i8 < n10; ++i8) {
                    d20 = ((net.minecraft.u.b.a)object.get(i8)).c(a5, d20);
                }
                a5 = a5.c(0.0, 0.0, d20);
                double d21 = d16 * d16 + d17 * d17;
                double d22 = d19 * d19 + d20 * d20;
                if (d21 > d22) {
                    d2 = d16;
                    d4 = d17;
                    d3 = -d15;
                    this.a(a3);
                } else {
                    d2 = d19;
                    d4 = d20;
                    d3 = -d18;
                    this.a(a5);
                }
                int n11 = object.size();
                for (int i9 = 0; i9 < n11; ++i9) {
                    d3 = ((net.minecraft.u.b.a)object.get(i9)).b(this.cT(), d3);
                }
                this.a(this.cT().c(0.0, d3, 0.0));
                if (d12 * d12 + d14 * d14 >= d2 * d2 + d4 * d4) {
                    d2 = d12;
                    d3 = d13;
                    d4 = d14;
                    this.a((net.minecraft.u.b.a)object2);
                }
            }
            this.aQ.A.b();
            this.aQ.A.a("rest");
            this.cf();
            this.bf = d8 != d2 || d10 != d4;
            this.bg = d9 != d3;
            this.be = this.bg && d9 < 0.0;
            this.bh = this.bf || this.bg;
            n2 = net.minecraft.u.b.n.c(this.aU);
            int n12 = net.minecraft.u.b.n.c(this.aV - (double)0.2f);
            int n13 = net.minecraft.u.b.n.c(this.aW);
            net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(n2, n12, n13);
            net.minecraft.g.c.b b5 = this.aQ.n(b4);
            if (b5.d() == net.minecraft.g.a.h.a && ((object2 = (b3 = this.aQ.n(b2 = b4.c())).c()) instanceof fm || object2 instanceof ey || object2 instanceof ct)) {
                b5 = b3;
                b4 = b2;
            }
            this.a(d3, this.be, b5, b4);
            if (d8 != d2) {
                this.aX = 0.0;
            }
            if (d10 != d4) {
                this.aZ = 0.0;
            }
            cn cn2 = b5.c();
            if (d9 != d3) {
                cn2.a(this.aQ, this);
            }
            if (this.au() && !bl2 && !this.cz()) {
                double d23 = this.aU - d5;
                double d24 = this.aV - d6;
                double d25 = this.aW - d7;
                if (cn2 != net.minecraft.a.p.au) {
                    d24 = 0.0;
                }
                if (cn2 != null && this.be) {
                    cn2.a(this.aQ, b4, this);
                }
                this.bo = (float)((double)this.bo + (double)net.minecraft.u.b.n.a(d23 * d23 + d25 * d25) * 0.6);
                this.bp = (float)((double)this.bp + (double)net.minecraft.u.b.n.a(d23 * d23 + d24 * d24 + d25 * d25) * 0.6);
                if (this.bp > (float)this.l && b5.d() != net.minecraft.g.a.h.a) {
                    this.l = (int)this.bp + 1;
                    if (this.cm()) {
                        float f2 = net.minecraft.u.b.n.a(this.aX * this.aX * (double)0.2f + this.aY * this.aY + this.aZ * this.aZ * (double)0.2f) * 0.35f;
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                        this.a(this.P(), f2, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
                    }
                    this.a(b4, cn2);
                }
            }
            try {
                this.cg();
            }
            catch (Throwable throwable) {
                object2 = net.minecraft.k.a.a(throwable, "Checking entity block collision");
                object = ((net.minecraft.k.a)object2).a("Entity being checked for collision");
                this.a((i)object);
                throw new bo((net.minecraft.k.a)object2);
            }
            boolean bl4 = this.cl();
            if (this.aQ.f(this.cT().c(0.001))) {
                this.l(1);
                if (!bl4) {
                    ++this.m;
                    if (this.m == 0) {
                        this.k(8);
                    }
                }
            } else if (this.m <= 0) {
                this.m = -this.bz;
            }
            if (bl4 && this.m > 0) {
                this.a(net.minecraft.a.f.bG, 0.7f, 1.6f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
                this.m = -this.bz;
            }
            this.aQ.A.b();
        }
    }

    public void cf() {
        net.minecraft.u.b.a a2 = this.cT();
        this.aU = (a2.a + a2.d) / 2.0;
        this.aV = a2.b;
        this.aW = (a2.c + a2.f) / 2.0;
    }

    protected bv P() {
        return net.minecraft.a.f.bK;
    }

    protected bv Q() {
        return net.minecraft.a.f.bJ;
    }

    protected void cg() {
        net.minecraft.u.b.a a2 = this.cT();
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.c(a2.a + 0.001, a2.b + 0.001, a2.c + 0.001);
        net.minecraft.u.b.h h3 = net.minecraft.u.b.h.c(a2.d - 0.001, a2.e - 0.001, a2.f - 0.001);
        net.minecraft.u.b.h h4 = net.minecraft.u.b.h.m();
        if (this.aQ.a((net.minecraft.u.b.b)h2, (net.minecraft.u.b.b)h3)) {
            for (int i2 = h2.cy_(); i2 <= h3.cy_(); ++i2) {
                for (int i3 = h2.k(); i3 <= h3.k(); ++i3) {
                    for (int i4 = h2.l(); i4 <= h3.l(); ++i4) {
                        h4.d(i2, i3, i4);
                        net.minecraft.g.c.b b2 = this.aQ.n(h4);
                        try {
                            b2.c().a(this.aQ, (net.minecraft.u.b.b)h4, b2, this);
                            continue;
                        }
                        catch (Throwable throwable) {
                            net.minecraft.k.a a3 = net.minecraft.k.a.a(throwable, "Colliding entity with block");
                            i i5 = a3.a("Block being collided with");
                            net.minecraft.k.i.a(i5, h4, b2);
                            throw new bo(a3);
                        }
                    }
                }
            }
        }
        h2.n();
        h3.n();
        h4.n();
    }

    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        fk fk2 = cn2.w();
        if (this.aQ.n(b2.b()).c() == net.minecraft.a.p.aH) {
            fk2 = net.minecraft.a.p.aH.w();
            this.a(fk2.d(), fk2.a() * 0.15f, fk2.b());
        } else if (!cn2.v().d().d()) {
            this.a(fk2.d(), fk2.a() * 0.15f, fk2.b());
        }
    }

    public void a(bv bv2, float f2, float f3) {
        if (!this.ch()) {
            this.aQ.a(null, this.aU, this.aV, this.aW, bv2, this.S(), f2, f3);
        }
    }

    public boolean ch() {
        return (Boolean)this.bE.a(q);
    }

    public void k(boolean bl2) {
        this.bE.b(q, bl2);
    }

    public boolean ci() {
        return (Boolean)this.bE.a(r);
    }

    public void l(boolean bl2) {
        this.bE.b(r, bl2);
    }

    protected boolean au() {
        return true;
    }

    protected void a(double d2, boolean bl2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3) {
        if (bl2) {
            if (this.bq > 0.0f) {
                b2.c().a(this.aQ, b3, this, this.bq);
            }
            this.bq = 0.0f;
        } else if (d2 < 0.0) {
            this.bq = (float)((double)this.bq - d2);
        }
    }

    public net.minecraft.u.b.a cj() {
        return null;
    }

    protected void l(int n2) {
        if (!this.bD) {
            this.a(net.minecraft.u.n.a, (float)n2);
        }
    }

    public final boolean ck() {
        return this.bD;
    }

    public void c(float f2, float f3) {
        if (this.cA()) {
            for (n n2 : this.db()) {
                n2.c(f2, f3);
            }
        }
    }

    public boolean cl() {
        if (this.bA) {
            return true;
        }
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.c(this.aU, this.aV, this.aW);
        if (!this.aQ.A(h2) && !this.aQ.A(h2.d(this.aU, this.aV + (double)this.bm, this.aW))) {
            h2.n();
            return false;
        }
        h2.n();
        return true;
    }

    public boolean cm() {
        return this.bA;
    }

    public boolean cn() {
        if (this.df() instanceof ab) {
            this.bA = false;
        } else if (this.aQ.a(this.cT().b(0.0, -0.4f, 0.0).c(0.001), net.minecraft.g.a.h.h, this)) {
            if (!this.bA && !this.bC) {
                this.al();
            }
            this.bq = 0.0f;
            this.bA = true;
            this.m = 0;
        } else {
            this.bA = false;
        }
        return this.bA;
    }

    protected void al() {
        float f2;
        float f3;
        float f4 = net.minecraft.u.b.n.a(this.aX * this.aX * (double)0.2f + this.aY * this.aY + this.aZ * this.aZ * (double)0.2f) * 0.2f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        this.a(this.Q(), f4, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
        float f5 = net.minecraft.u.b.n.c(this.cT().b);
        int n2 = 0;
        while ((float)n2 < 1.0f + this.bl * 20.0f) {
            f3 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            f2 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            this.aQ.a(aj.e, this.aU + (double)f3, (double)(f5 + 1.0f), this.aW + (double)f2, this.aX, this.aY - (double)(this.bx.nextFloat() * 0.2f), this.aZ, new int[0]);
            ++n2;
        }
        n2 = 0;
        while ((float)n2 < 1.0f + this.bl * 20.0f) {
            f3 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            f2 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            this.aQ.a(aj.f, this.aU + (double)f3, (double)(f5 + 1.0f), this.aW + (double)f2, this.aX, this.aY, this.aZ, new int[0]);
            ++n2;
        }
    }

    public void co() {
        if (this.cB() && !this.cm()) {
            this.cp();
        }
    }

    protected void cp() {
        int n2;
        int n3;
        int n4 = net.minecraft.u.b.n.c(this.aU);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n4, n3 = net.minecraft.u.b.n.c(this.aV - (double)0.2f), n2 = net.minecraft.u.b.n.c(this.aW));
        net.minecraft.g.c.b b3 = this.aQ.n(b2);
        if (b3.l() != ac.a) {
            this.aQ.a(aj.L, this.aU + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, this.cT().b + 0.1, this.aW + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, -this.aX * 4.0, 1.5, -this.aZ * 4.0, cn.p(b3));
        }
    }

    public boolean a(net.minecraft.g.a.h h2) {
        if (this.df() instanceof ab) {
            return false;
        }
        double d2 = this.aV + (double)this.ce_();
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.aU, d2, this.aW);
        net.minecraft.g.c.b b3 = this.aQ.n(b2);
        if (b3.d() == h2) {
            float f2 = ee.b(b3.c().b(b3)) - 0.11111111f;
            float f3 = (float)(b2.k() + 1) - f2;
            boolean bl2 = d2 < (double)f3;
            return !bl2 && this instanceof b ? false : bl2;
        }
        return false;
    }

    public boolean cq() {
        return this.aQ.a(this.cT().b((double)-0.1f, -0.4f, -0.1f), net.minecraft.g.a.h.i);
    }

    public void a(float f2, float f3, float f4, boolean bl2) {
        float f5 = f2 * f2 + f3 * f3;
        if (f5 >= 1.0E-4f) {
            if ((f5 = net.minecraft.u.b.n.c(f5)) < 1.0f) {
                f5 = 1.0f;
            }
            if (this instanceof net.minecraft.l.b.b) {
                if (!bl2) {
                    f5 = f4 / f5;
                }
            } else {
                f5 = f4 / f5;
            }
            float f6 = net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180));
            float f7 = net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180));
            this.aX += (double)((f2 *= f5) * f7 - (f3 *= f5) * f6);
            this.aZ += (double)(f3 * f7 + f2 * f6);
        }
    }

    public int m(float f2) {
        net.minecraft.u.b.g g2 = new net.minecraft.u.b.g(net.minecraft.u.b.n.c(this.aU), 0, net.minecraft.u.b.n.c(this.aW));
        if (this.aQ.d(g2)) {
            g2.g(net.minecraft.u.b.n.c(this.aV + (double)this.ce_()));
            return this.aQ.b((net.minecraft.u.b.b)g2, 0);
        }
        return 0;
    }

    public float n(float f2) {
        net.minecraft.u.b.g g2 = new net.minecraft.u.b.g(net.minecraft.u.b.n.c(this.aU), 0, net.minecraft.u.b.n.c(this.aW));
        if (this.aQ.d(g2)) {
            g2.g(net.minecraft.u.b.n.c(this.aV + (double)this.ce_()));
            return this.aQ.m(g2);
        }
        return 0.0f;
    }

    public void b(net.minecraft.q.k k2) {
        this.aQ = k2;
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.aU = net.minecraft.u.b.n.a(d2, -3.0E7, 3.0E7);
        this.aV = d3;
        this.aW = net.minecraft.u.b.n.a(d4, -3.0E7, 3.0E7);
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        f3 = net.minecraft.u.b.n.a(f3, -90.0f, 90.0f);
        this.ba = f2;
        this.bb = f3;
        this.bc = this.ba;
        this.bd = this.bb;
        double d5 = this.bc - f2;
        if (d5 < -180.0) {
            this.bc += 360.0f;
        }
        if (d5 >= 180.0) {
            this.bc -= 360.0f;
        }
        this.e(this.aU, this.aV, this.aW);
        this.e(f2, f3);
    }

    public void a(net.minecraft.u.b.b b2, float f2, float f3) {
        this.b((double)b2.cy_() + 0.5, b2.k(), (double)b2.l() + 0.5, f2, f3);
    }

    public void b(double d2, double d3, double d4, float f2, float f3) {
        this.aU = d2;
        this.aV = d3;
        this.aW = d4;
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        this.br = this.aU;
        this.bs = this.aV;
        this.bt = this.aW;
        this.ba = f2;
        this.bb = f3;
        this.e(this.aU, this.aV, this.aW);
    }

    public float m(n n2) {
        float f2 = (float)(this.aU - n2.aU);
        float f3 = (float)(this.aV - n2.aV);
        float f4 = (float)(this.aW - n2.aW);
        return net.minecraft.u.b.n.c(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public double h(double d2, double d3, double d4) {
        double d5 = this.aU - d2;
        double d6 = this.aV - d3;
        double d7 = this.aW - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double c(net.minecraft.u.b.b b2) {
        return b2.e(this.aU, this.aV, this.aW);
    }

    public double d(net.minecraft.u.b.b b2) {
        return b2.f(this.aU, this.aV, this.aW);
    }

    public double i(double d2, double d3, double d4) {
        double d5 = this.aU - d2;
        double d6 = this.aV - d3;
        double d7 = this.aW - d4;
        return net.minecraft.u.b.n.a(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public double n(n n2) {
        double d2 = this.aU - n2.aU;
        double d3 = this.aV - n2.aV;
        double d4 = this.aW - n2.aW;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public void d(b b2) {
    }

    public void d(n n2) {
        double d2;
        double d3;
        double d4;
        if (!this.B(n2) && !n2.bv && !this.bv && (d4 = net.minecraft.u.b.n.a(d3 = n2.aU - this.aU, d2 = n2.aW - this.aW)) >= (double)0.01f) {
            d4 = net.minecraft.u.b.n.a(d4);
            d3 /= d4;
            d2 /= d4;
            double d5 = 1.0 / d4;
            if (d5 > 1.0) {
                d5 = 1.0;
            }
            d3 *= d5;
            d2 *= d5;
            d3 *= (double)0.05f;
            d2 *= (double)0.05f;
            d3 *= (double)(1.0f - this.bw);
            d2 *= (double)(1.0f - this.bw);
            if (!this.cA()) {
                this.a_(-d3, 0.0, -d2);
            }
            if (!n2.cA()) {
                n2.a_(d3, 0.0, d2);
            }
        }
    }

    public void a_(double d2, double d3, double d4) {
        this.aX += d2;
        this.aY += d3;
        this.aZ += d4;
        this.bO = true;
    }

    protected void bN() {
        this.bi = true;
    }

    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        this.bN();
        return false;
    }

    public net.minecraft.u.b.s i(float f2) {
        if (f2 == 1.0f) {
            return this.g(this.bb, this.ba);
        }
        float f3 = this.bd + (this.bb - this.bd) * f2;
        float f4 = this.bc + (this.ba - this.bc) * f2;
        return this.g(f3, f4);
    }

    protected final net.minecraft.u.b.s g(float f2, float f3) {
        float f4 = net.minecraft.u.b.n.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = net.minecraft.u.b.n.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -net.minecraft.u.b.n.b(-f2 * ((float)Math.PI / 180));
        float f7 = net.minecraft.u.b.n.a(-f2 * ((float)Math.PI / 180));
        return new net.minecraft.u.b.s(f5 * f6, f7, f4 * f6);
    }

    public net.minecraft.u.b.s o(float f2) {
        if (f2 == 1.0f) {
            return new net.minecraft.u.b.s(this.aU, this.aV + (double)this.ce_(), this.aW);
        }
        double d2 = this.aR + (this.aU - this.aR) * (double)f2;
        double d3 = this.aS + (this.aV - this.aS) * (double)f2 + (double)this.ce_();
        double d4 = this.aT + (this.aW - this.aT) * (double)f2;
        return new net.minecraft.u.b.s(d2, d3, d4);
    }

    public o a(double d2, float f2) {
        net.minecraft.u.b.s s2 = this.o(f2);
        net.minecraft.u.b.s s3 = this.i(f2);
        net.minecraft.u.b.s s4 = s2.b(s3.b * d2, s3.c * d2, s3.d * d2);
        return this.aQ.a(s2, s4, false, false, true);
    }

    public boolean cg_() {
        return false;
    }

    public boolean bM() {
        return false;
    }

    public void a(n n2, int n3) {
    }

    public boolean j(double d2, double d3, double d4) {
        double d5 = this.aU - d2;
        double d6 = this.aV - d3;
        double d7 = this.aW - d4;
        double d8 = d5 * d5 + d6 * d6 + d7 * d7;
        return this.a(d8);
    }

    public boolean a(double d2) {
        double d3 = this.cT().a();
        if (Double.isNaN(d3)) {
            d3 = 1.0;
        }
        return d2 < (d3 = d3 * 64.0 * c) * d3;
    }

    public boolean c(e e2) {
        String string = this.cr();
        if (!this.bk && string != null) {
            e2.a("id", string);
            this.e(e2);
            return true;
        }
        return false;
    }

    public boolean d(e e2) {
        String string = this.cr();
        if (!this.bk && string != null && !this.cz()) {
            e2.a("id", string);
            this.e(e2);
            return true;
        }
        return false;
    }

    public e e(e e2) {
        try {
            q q2;
            e2.a("Pos", this.a(new double[]{this.aU, this.aV, this.aW}));
            e2.a("Motion", this.a(new double[]{this.aX, this.aY, this.aZ}));
            e2.a("Rotation", this.a(this.ba, this.bb));
            e2.a("FallDistance", this.bq);
            e2.a("Fire", (short)this.m);
            e2.a("Air", (short)this.cE());
            e2.a("OnGround", this.be);
            e2.a("Dimension", this.bS);
            e2.a("Invulnerable", this.s);
            e2.a("PortalCooldown", this.bP);
            e2.a("UUID", this.cM());
            if (this.cP() != null && !this.cP().isEmpty()) {
                e2.a("CustomName", this.cP());
            }
            if (this.cQ()) {
                e2.a("CustomNameVisible", this.cQ());
            }
            this.t.b(e2);
            if (this.ch()) {
                e2.a("Silent", this.ch());
            }
            if (this.ci()) {
                e2.a("NoGravity", this.ci());
            }
            if (this.bY) {
                e2.a("Glowing", this.bY);
            }
            if (this.v.size() > 0) {
                q2 = new q();
                for (Object object : this.v) {
                    q2.a(new y((String)object));
                }
                e2.a("Tags", q2);
            }
            this.a(e2);
            if (this.cA()) {
                q2 = new q();
                for (Object object : this.db()) {
                    e e3;
                    if (!((n)object).c(e3 = new e())) continue;
                    q2.a(e3);
                }
                if (!q2.c()) {
                    e2.a("Passengers", q2);
                }
            }
            return e2;
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Saving entity NBT");
            i i2 = a2.a("Entity being saved");
            this.a(i2);
            throw new bo(a2);
        }
    }

    public void f(e e2) {
        try {
            q q2 = e2.c("Pos", 6);
            q q3 = e2.c("Motion", 6);
            q q4 = e2.c("Rotation", 5);
            this.aX = q3.e(0);
            this.aY = q3.e(1);
            this.aZ = q3.e(2);
            if (Math.abs(this.aX) > 10.0) {
                this.aX = 0.0;
            }
            if (Math.abs(this.aY) > 10.0) {
                this.aY = 0.0;
            }
            if (Math.abs(this.aZ) > 10.0) {
                this.aZ = 0.0;
            }
            this.aU = q2.e(0);
            this.aV = q2.e(1);
            this.aW = q2.e(2);
            this.br = this.aU;
            this.bs = this.aV;
            this.bt = this.aW;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            this.ba = q4.f(0);
            this.bb = q4.f(1);
            this.bc = this.ba;
            this.bd = this.bb;
            this.k(this.ba);
            this.l(this.ba);
            this.bq = e2.j("FallDistance");
            this.m = e2.g("Fire");
            this.n(e2.g("Air"));
            this.be = e2.p("OnGround");
            if (e2.e("Dimension")) {
                this.bS = e2.h("Dimension");
            }
            this.s = e2.p("Invulnerable");
            this.bP = e2.h("PortalCooldown");
            if (e2.b("UUID")) {
                this.bW = e2.a("UUID");
                this.bX = this.bW.toString();
            }
            this.e(this.aU, this.aV, this.aW);
            this.e(this.ba, this.bb);
            if (e2.b("CustomName", 8)) {
                this.g(e2.l("CustomName"));
            }
            this.q(e2.p("CustomNameVisible"));
            this.t.a(e2);
            this.k(e2.p("Silent"));
            this.l(e2.p("NoGravity"));
            this.n(e2.p("Glowing"));
            if (e2.b("Tags", 9)) {
                this.v.clear();
                q q5 = e2.c("Tags", 8);
                int n2 = Math.min(q5.e(), 1024);
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.v.add(q5.g(i2));
                }
            }
            this.b(e2);
            if (this.cj_()) {
                this.e(this.aU, this.aV, this.aW);
            }
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Loading entity NBT");
            i i3 = a2.a("Entity being loaded");
            this.a(i3);
            throw new bo(a2);
        }
    }

    protected boolean cj_() {
        return true;
    }

    protected final String cr() {
        return net.minecraft.w.h.b(this);
    }

    protected abstract void b(e var1);

    protected abstract void a(e var1);

    protected q a(double ... arrd) {
        q q2 = new q();
        double[] arrd2 = arrd;
        int n2 = arrd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            double d2 = arrd2[i2];
            q2.a(new s(d2));
        }
        return q2;
    }

    protected q a(float ... arrf) {
        q q2 = new q();
        float[] arrf2 = arrf;
        int n2 = arrf.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            float f2 = arrf2[i2];
            q2.a(new net.minecraft.e.b(f2));
        }
        return q2;
    }

    public ae a(cg cg2, int n2) {
        return this.a(cg2, n2, 0.0f);
    }

    public ae a(cg cg2, int n2, float f2) {
        return this.a(new cu(cg2, n2, 0), f2);
    }

    public ae a(cu cu2, float f2) {
        if (cu2.b != 0 && cu2.a() != null) {
            ae ae2 = new ae(this.aQ, this.aU, this.aV + (double)f2, this.aW, cu2);
            ae2.l();
            this.aQ.a(ae2);
            return ae2;
        }
        return null;
    }

    public boolean br() {
        return !this.bk;
    }

    public boolean ab() {
        if (this.bv) {
            return false;
        }
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        for (int i2 = 0; i2 < 8; ++i2) {
            int n2 = net.minecraft.u.b.n.c(this.aV + (double)(((float)((i2 >> 0) % 2) - 0.5f) * 0.1f) + (double)this.ce_());
            int n3 = net.minecraft.u.b.n.c(this.aU + (double)(((float)((i2 >> 1) % 2) - 0.5f) * this.bl * 0.8f));
            int n4 = net.minecraft.u.b.n.c(this.aW + (double)(((float)((i2 >> 2) % 2) - 0.5f) * this.bl * 0.8f));
            if (h2.cy_() == n3 && h2.k() == n2 && h2.l() == n4) continue;
            h2.d(n3, n2, n4);
            if (!this.aQ.n(h2).c().bT_()) continue;
            h2.n();
            return true;
        }
        h2.n();
        return false;
    }

    public boolean a(b b2, cu cu2, ah ah2) {
        return false;
    }

    public net.minecraft.u.b.a o(n n2) {
        return null;
    }

    public void J() {
        n n2 = this.df();
        if (this.cz() && n2.bk) {
            this.o();
        } else {
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
            this.cE_();
            if (this.cz()) {
                n2.p(this);
            }
        }
    }

    public void p(n n2) {
        if (this.A(n2)) {
            n2.e(this.aU, this.aV + this.cs() + n2.Y(), this.aW);
        }
    }

    public void q(n n2) {
    }

    public double Y() {
        return 0.0;
    }

    public double cs() {
        return (double)this.bm * 0.75;
    }

    public boolean r(n n2) {
        return this.a(n2, false);
    }

    public boolean a(n n2, boolean bl2) {
        if (bl2 || this.s(n2) && n2.v(this)) {
            if (this.cz()) {
                this.o();
            }
            this.g = n2;
            this.g.t(this);
            return true;
        }
        return false;
    }

    protected boolean s(n n2) {
        return this.aO <= 0;
    }

    public void ct() {
        for (int i2 = this.f.size() - 1; i2 >= 0; --i2) {
            ((n)this.f.get(i2)).o();
        }
    }

    public void o() {
        if (this.g != null) {
            n n2 = this.g;
            this.g = null;
            n2.u(this);
        }
    }

    protected void t(n n2) {
        if (n2.df() != this) {
            throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
        }
        if (!this.aQ.C && n2 instanceof b && !(this.da() instanceof b)) {
            this.f.add(0, n2);
        } else {
            this.f.add(n2);
        }
    }

    protected void u(n n2) {
        if (n2.df() == this) {
            throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
        }
        this.f.remove(n2);
        n2.aO = 60;
    }

    protected boolean v(n n2) {
        return this.db().size() < 1;
    }

    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.e(d2, d3, d4);
        this.e(f2, f3);
    }

    public float cu() {
        return 0.0f;
    }

    public net.minecraft.u.b.s bL() {
        return null;
    }

    public r cv() {
        r r2 = new r(this.bb, this.ba);
        return r2;
    }

    public net.minecraft.u.b.s cw() {
        return net.minecraft.u.b.s.a(this.cv());
    }

    public void e(net.minecraft.u.b.b b2) {
        if (this.bP > 0) {
            this.bP = this.R();
        } else {
            if (!this.aQ.C && !b2.equals(this.bT)) {
                this.bT = new net.minecraft.u.b.b(b2);
                net.minecraft.g.c.a.f f2 = net.minecraft.a.p.aY.d(this.aQ, this.bT);
                double d2 = f2.b().l() == net.minecraft.u.ae.a ? (double)f2.a().l() : (double)f2.a().cy_();
                double d3 = f2.b().l() == net.minecraft.u.ae.a ? this.aW : this.aU;
                d3 = Math.abs(net.minecraft.u.b.n.c(d3 - (double)(f2.b().f().d() == net.minecraft.u.af.b ? 1 : 0), d2, d2 - (double)f2.d()));
                double d4 = net.minecraft.u.b.n.c(this.aV - 1.0, (double)f2.a().k(), (double)(f2.a().k() - f2.e()));
                this.bU = new net.minecraft.u.b.s(d3, d4, 0.0);
                this.bV = f2.b();
            }
            this.bQ = true;
        }
    }

    public int R() {
        return 300;
    }

    public void k(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
    }

    public void a(byte by2) {
    }

    public void bs() {
    }

    public Iterable aw() {
        return this.u;
    }

    public Iterable ax() {
        return this.u;
    }

    public Iterable cx() {
        return mq.b(this.aw(), this.ax());
    }

    public void a(k k2, cu cu2) {
    }

    public boolean cy() {
        boolean bl2;
        boolean bl3 = bl2 = this.aQ != null && this.aQ.C;
        return !this.bD && (this.m > 0 || bl2 && this.m(0));
    }

    public boolean cz() {
        return this.df() != null;
    }

    public boolean cA() {
        return !this.db().isEmpty();
    }

    public boolean G() {
        return this.m(1);
    }

    public void m(boolean bl2) {
        this.a(1, bl2);
    }

    public boolean cB() {
        return this.m(3);
    }

    public void b(boolean bl2) {
        this.a(3, bl2);
    }

    public boolean cC() {
        return this.bY || this.aQ.C && this.m(6);
    }

    public void n(boolean bl2) {
        this.bY = bl2;
        if (!this.aQ.C) {
            this.a(6, this.bY);
        }
    }

    public boolean cD() {
        return this.m(5);
    }

    public boolean c_(b b2) {
        if (b2.a()) {
            return false;
        }
        net.minecraft.j.i i2 = this.aA();
        return i2 != null && b2 != null && b2.aA() == i2 && i2.g() ? false : this.cD();
    }

    public net.minecraft.j.i aA() {
        return this.aQ.Q().g(this.cN());
    }

    public boolean w(n n2) {
        return this.a(n2.aA());
    }

    public boolean a(net.minecraft.j.i i2) {
        return this.aA() != null ? this.aA().a(i2) : false;
    }

    public void o(boolean bl2) {
        this.a(5, bl2);
    }

    protected boolean m(int n2) {
        return ((Byte)this.bE.a(bF) & 1 << n2) != 0;
    }

    protected void a(int n2, boolean bl2) {
        byte by2 = (Byte)this.bE.a(bF);
        if (bl2) {
            this.bE.b(bF, (byte)(by2 | 1 << n2));
        } else {
            this.bE.b(bF, (byte)(by2 & ~(1 << n2)));
        }
    }

    public int cE() {
        return (Integer)this.bE.a(n);
    }

    public void n(int n2) {
        this.bE.b(n, n2);
    }

    public void a(a a2) {
        this.a(net.minecraft.u.n.b, 5.0f);
        ++this.m;
        if (this.m == 0) {
            this.k(8);
        }
    }

    public void b(l l2) {
    }

    protected boolean a(double d2, double d3, double d4) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(d2, d3, d4);
        double d5 = d2 - (double)b2.cy_();
        double d6 = d3 - (double)b2.k();
        double d7 = d4 - (double)b2.l();
        List list = this.aQ.a(this.cT());
        if (list.isEmpty()) {
            return false;
        }
        net.minecraft.u.ad ad2 = net.minecraft.u.ad.b;
        double d8 = Double.MAX_VALUE;
        if (!this.aQ.s(b2.f()) && d5 < d8) {
            d8 = d5;
            ad2 = net.minecraft.u.ad.e;
        }
        if (!this.aQ.s(b2.g()) && 1.0 - d5 < d8) {
            d8 = 1.0 - d5;
            ad2 = net.minecraft.u.ad.f;
        }
        if (!this.aQ.s(b2.d()) && d7 < d8) {
            d8 = d7;
            ad2 = net.minecraft.u.ad.c;
        }
        if (!this.aQ.s(b2.e()) && 1.0 - d7 < d8) {
            d8 = 1.0 - d7;
            ad2 = net.minecraft.u.ad.d;
        }
        if (!this.aQ.s(b2.b()) && 1.0 - d6 < d8) {
            d8 = 1.0 - d6;
            ad2 = net.minecraft.u.ad.b;
        }
        float f2 = this.bx.nextFloat() * 0.2f + 0.1f;
        float f3 = ad2.d().a();
        if (ad2.l() == net.minecraft.u.ae.a) {
            this.aX += (double)(f3 * f2);
        } else if (ad2.l() == net.minecraft.u.ae.b) {
            this.aY += (double)(f3 * f2);
        } else if (ad2.l() == net.minecraft.u.ae.c) {
            this.aZ += (double)(f3 * f2);
        }
        return true;
    }

    public void am() {
        this.bj = true;
        this.bq = 0.0f;
    }

    @Override
    public String X() {
        if (this.bO_()) {
            return this.cP();
        }
        String string = net.minecraft.w.h.b(this);
        if (string == null) {
            string = "generic";
        }
        return net.minecraft.u.d.b.a.a("entity." + string + ".name");
    }

    public n[] cF() {
        return null;
    }

    public boolean x(n n2) {
        return this == n2;
    }

    public float bO() {
        return 0.0f;
    }

    public void k(float f2) {
    }

    public void l(float f2) {
    }

    public boolean cG() {
        return true;
    }

    public boolean a_(n n2) {
        return false;
    }

    public String toString() {
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.X(), this.e, this.aQ == null ? "~NULL~" : this.aQ.F().i(), this.aU, this.aV, this.aW);
    }

    public boolean b(net.minecraft.u.n n2) {
        return this.s && n2 != net.minecraft.u.n.l && !n2.u();
    }

    public void p(boolean bl2) {
        this.s = bl2;
    }

    public void y(n n2) {
        this.b(n2.aU, n2.aV, n2.aW, n2.ba, n2.bb);
    }

    private void b(n n2) {
        e e2 = n2.e(new e());
        e2.q("Dimension");
        this.f(e2);
        this.bP = n2.bP;
        this.bT = n2.bT;
        this.bU = n2.bU;
        this.bV = n2.bV;
    }

    public n h_(int n2) {
        if (!this.aQ.C && !this.bk) {
            net.minecraft.u.b.b b2;
            this.aQ.A.a("changeDimension");
            net.minecraft.c.a a2 = this.aS();
            int n3 = this.bS;
            net.minecraft.q.v v2 = a2.a(n3);
            net.minecraft.q.v v3 = a2.a(n2);
            this.bS = n2;
            if (n3 == 1 && n2 == 1) {
                v3 = a2.a(0);
                this.bS = 0;
            }
            this.aQ.b(this);
            this.bk = false;
            this.aQ.A.a("reposition");
            if (n2 == 1) {
                b2 = v3.Z();
            } else {
                double d2 = this.aU;
                double d3 = this.aW;
                double d4 = 8.0;
                if (n2 == -1) {
                    d2 = net.minecraft.u.b.n.a(d2 / 8.0, v3.V().d() + 16.0, v3.V().f() - 16.0);
                    d3 = net.minecraft.u.b.n.a(d3 / 8.0, v3.V().e() + 16.0, v3.V().g() - 16.0);
                } else if (n2 == 0) {
                    d2 = net.minecraft.u.b.n.a(d2 * 8.0, v3.V().d() + 16.0, v3.V().f() - 16.0);
                    d3 = net.minecraft.u.b.n.a(d3 * 8.0, v3.V().e() + 16.0, v3.V().g() - 16.0);
                }
                d2 = net.minecraft.u.b.n.a((int)d2, -29999872, 29999872);
                d3 = net.minecraft.u.b.n.a((int)d3, -29999872, 29999872);
                float f2 = this.ba;
                this.b(d2, this.aV, d3, 90.0f, 0.0f);
                net.minecraft.q.g g2 = v3.ag();
                g2.b(this, f2);
                b2 = new net.minecraft.u.b.b(this);
            }
            v2.a(this, false);
            this.aQ.A.c("reloading");
            n n4 = net.minecraft.w.h.a(net.minecraft.w.h.b(this), (net.minecraft.q.k)v3);
            if (n4 != null) {
                n4.b(this);
                if (n3 == 1 && n2 == 1) {
                    net.minecraft.u.b.b b3 = v3.p(v3.D());
                    n4.a(b3, n4.ba, n4.bb);
                } else {
                    n4.a(b2, n4.ba, n4.bb);
                }
                boolean bl2 = n4.aP;
                n4.aP = true;
                v3.a(n4);
                n4.aP = bl2;
                v3.a(n4, false);
            }
            this.bk = true;
            this.aQ.A.b();
            v2.X();
            v3.X();
            this.aQ.A.b();
            return n4;
        }
        return null;
    }

    public boolean cH() {
        return true;
    }

    public float a(t t2, net.minecraft.q.k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        return b3.c().a(this);
    }

    public boolean a(t t2, net.minecraft.q.k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, float f2) {
        return true;
    }

    public int ck_() {
        return 3;
    }

    public net.minecraft.u.b.s cI() {
        return this.bU;
    }

    public net.minecraft.u.ad cJ() {
        return this.bV;
    }

    public boolean cK() {
        return false;
    }

    public void a(i i2) {
        i2.a("Entity Type", new v(this));
        i2.a("Entity ID", this.e);
        i2.a("Entity Name", new af(this));
        i2.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.aU, this.aV, this.aW));
        i2.a("Entity's Block location", net.minecraft.k.i.a(net.minecraft.u.b.n.c(this.aU), net.minecraft.u.b.n.c(this.aV), net.minecraft.u.b.n.c(this.aW)));
        i2.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.aX, this.aY, this.aZ));
        i2.a("Entity's Passengers", new ad(this));
        i2.a("Entity's Vehicle", new x(this));
    }

    public boolean cL() {
        return this.cy();
    }

    public void a(UUID uUID) {
        this.bW = uUID;
        this.bX = this.bW.toString();
    }

    public UUID cM() {
        return this.bW;
    }

    public String cN() {
        return this.bX;
    }

    public boolean ay() {
        return true;
    }

    public static double cO() {
        return c;
    }

    public static void b(double d2) {
        c = d2;
    }

    @Override
    public net.minecraft.u.d.a aK() {
        net.minecraft.u.d.k k2 = new net.minecraft.u.d.k(net.minecraft.j.d.a(this.aA(), this.X()));
        k2.a().a(this.cS());
        k2.a().a(this.cN());
        return k2;
    }

    public void g(String string) {
        this.bE.b(o, string);
    }

    public String cP() {
        return (String)this.bE.a(o);
    }

    public boolean bO_() {
        return !((String)this.bE.a(o)).isEmpty();
    }

    public void q(boolean bl2) {
        this.bE.b(p, bl2);
    }

    public boolean cQ() {
        return (Boolean)this.bE.a(p);
    }

    public void d(double d2, double d3, double d4) {
        this.w = true;
        this.b(d2, d3, d4, this.ba, this.bb);
        this.aQ.a(this, false);
    }

    public boolean at() {
        return this.cQ();
    }

    public void a(net.minecraft.x.a.g g2) {
    }

    public net.minecraft.u.ad cl_() {
        return net.minecraft.u.ad.b(net.minecraft.u.b.n.c((double)(this.ba * 4.0f / 360.0f) + 0.5) & 3);
    }

    public net.minecraft.u.ad cR() {
        return this.cl_();
    }

    protected net.minecraft.u.d.a.c cS() {
        e e2 = new e();
        String string = net.minecraft.w.h.b(this);
        e2.a("id", this.cN());
        if (string != null) {
            e2.a("type", string);
        }
        e2.a("name", this.X());
        return new net.minecraft.u.d.a.c(net.minecraft.u.d.a.d.d, new net.minecraft.u.d.k(e2.toString()));
    }

    public boolean a(g g2) {
        return true;
    }

    public net.minecraft.u.b.a cT() {
        return this.h;
    }

    public net.minecraft.u.b.a cU() {
        return this.cT();
    }

    public void a(net.minecraft.u.b.a a2) {
        this.h = a2;
    }

    public float ce_() {
        return this.bm * 0.85f;
    }

    public boolean cV() {
        return this.i;
    }

    public void r(boolean bl2) {
        this.i = bl2;
    }

    public boolean a_(int n2, cu cu2) {
        return false;
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public net.minecraft.u.b.b aC() {
        return new net.minecraft.u.b.b(this.aU, this.aV + 0.5, this.aW);
    }

    @Override
    public net.minecraft.u.b.s aD() {
        return new net.minecraft.u.b.s(this.aU, this.aV, this.aW);
    }

    @Override
    public net.minecraft.q.k aE() {
        return this.aQ;
    }

    @Override
    public n aF() {
        return this;
    }

    @Override
    public boolean aR() {
        return false;
    }

    @Override
    public void a(br br2, int n2) {
        if (this.aQ != null && !this.aQ.C) {
            this.t.a(this.aQ.l(), this, br2, n2);
        }
    }

    @Override
    public net.minecraft.c.a aS() {
        return this.aQ.l();
    }

    public ap cW() {
        return this.t;
    }

    public void z(n n2) {
        this.t.a(n2.cW());
    }

    public net.minecraft.u.ab a(b b2, net.minecraft.u.b.s s2, cu cu2, ah ah2) {
        return net.minecraft.u.ab.b;
    }

    public boolean cX() {
        return false;
    }

    protected void a(l l2, n n2) {
        if (n2 instanceof l) {
            net.minecraft.o.f.a((l)n2, (n)l2);
        }
        net.minecraft.o.f.b(l2, n2);
    }

    public void b(g g2) {
    }

    public void c(g g2) {
    }

    public float a(bq bq2) {
        float f2 = net.minecraft.u.b.n.g(this.ba);
        switch (bq2) {
            case c: {
                return f2 + 180.0f;
            }
            case d: {
                return f2 + 270.0f;
            }
            case b: {
                return f2 + 90.0f;
            }
        }
        return f2;
    }

    public float a(bi bi2) {
        float f2 = net.minecraft.u.b.n.g(this.ba);
        switch (bi2) {
            case b: {
                return -f2;
            }
            case c: {
                return 180.0f - f2;
            }
        }
        return f2;
    }

    public boolean cY() {
        return false;
    }

    public boolean cZ() {
        boolean bl2 = this.w;
        this.w = false;
        return bl2;
    }

    public n da() {
        return null;
    }

    public List db() {
        return this.f.isEmpty() ? Collections.emptyList() : ov.a((Iterable)this.f);
    }

    public boolean A(n n2) {
        for (n n3 : this.db()) {
            if (!n3.equals(n2)) continue;
            return true;
        }
        return false;
    }

    public Collection dc() {
        HashSet hashSet = aad.a();
        this.a(n.class, hashSet);
        return hashSet;
    }

    public Collection b(Class class_) {
        HashSet hashSet = aad.a();
        this.a(class_, hashSet);
        return hashSet;
    }

    private void a(Class class_, Set set) {
        for (n n2 : this.db()) {
            if (class_.isAssignableFrom(n2.getClass())) {
                set.add(n2);
            }
            n2.a(class_, set);
        }
    }

    public n dd() {
        n n2 = this;
        while (n2.cz()) {
            n2 = n2.df();
        }
        return n2;
    }

    public boolean B(n n2) {
        return this.dd() == n2.dd();
    }

    public boolean C(n n2) {
        for (n n3 : this.db()) {
            if (n3.equals(n2)) {
                return true;
            }
            if (!n3.C(n2)) continue;
            return true;
        }
        return false;
    }

    public boolean de() {
        n n2 = this.da();
        return n2 instanceof b ? ((b)n2).u() : !this.aQ.C;
    }

    public n df() {
        return this.g;
    }

    public net.minecraft.g.a.b cm_() {
        return net.minecraft.g.a.b.a;
    }

    public bu S() {
        return net.minecraft.u.bu.g;
    }
}

