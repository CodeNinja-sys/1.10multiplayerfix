/*
 * Decompiled with CFR 0.150.
 */
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
import net.minecraft.c.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class cpk
implements ala {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final cxt b = new cxt(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private static double c = 1.0;
    private static int d;
    private int e = d++;
    public boolean aN;
    private final List f = ov.a();
    protected int aO;
    private cpk g;
    public boolean aP;
    public iu aQ;
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
    private cxt j = b;
    public boolean be;
    public boolean bf;
    public boolean bg;
    public boolean bh;
    public boolean bi;
    protected boolean bj;
    private boolean k;
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
    protected bwm bE;
    protected static final bcz bF;
    private static final bcz n;
    private static final bcz o;
    private static final bcz p;
    private static final bcz q;
    private static final bcz r;
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
    protected cmz bT;
    protected amj bU;
    protected bqk bV;
    private boolean s;
    protected UUID bW = cmk.a(this.bx);
    protected String bX = this.bW.toString();
    private final bsv t = new bsv();
    private final List u = ov.a();
    protected boolean bY;
    private final Set v = aad.a();
    private boolean w;

    public cpk(iu iu2) {
        this.aQ = iu2;
        this.d(0.0, 0.0, 0.0);
        if (iu2 != null) {
            this.bS = iu2.q.a().a();
        }
        this.bE = new bwm(this);
        this.bE.a(bF, (byte)0);
        this.bE.a(n, 300);
        this.bE.a(p, false);
        this.bE.a(o, "");
        this.bE.a(q, false);
        this.bE.a(r, false);
        this.a();
    }

    public int bW() {
        return this.e;
    }

    public void l(int n2) {
        this.e = n2;
    }

    public Set bX() {
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

    public void v_() {
        this.ak_();
    }

    protected abstract void a();

    public bwm bY() {
        return this.bE;
    }

    public boolean equals(Object object) {
        if (object instanceof cpk) {
            return ((cpk)object).e == this.e;
        }
        return false;
    }

    public int hashCode() {
        return this.e;
    }

    protected void aj_() {
        if (this.aQ == null) {
            return;
        }
        while (this.aV > 0.0 && this.aV < 256.0) {
            this.d(this.aU, this.aV, this.aW);
            if (this.aQ.a(this, this.cD()).isEmpty()) break;
            this.aV += 1.0;
        }
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.bb = 0.0f;
    }

    public void ak_() {
        this.bk = true;
    }

    public void a_(boolean bl2) {
    }

    protected void a_(float f2, float f3) {
        if (f2 != this.bl || f3 != this.bm) {
            float f4 = this.bl;
            this.bl = f2;
            this.bm = f3;
            cxt cxt2 = this.cD();
            this.a(new cxt(cxt2.a, cxt2.b, cxt2.c, cxt2.a + (double)this.bl, cxt2.b + (double)this.bm, cxt2.c + (double)this.bl));
            if (this.bl > f4 && !this.bC && !this.aQ.C) {
                this.b((double)(f4 - this.bl), 0.0, (double)(f4 - this.bl));
            }
        }
    }

    protected void e(float f2, float f3) {
        this.ba = f2 % 360.0f;
        this.bb = f3 % 360.0f;
    }

    public void d(double d2, double d3, double d4) {
        this.aU = d2;
        this.aV = d3;
        this.aW = d4;
        float f2 = this.bl / 2.0f;
        float f3 = this.bm;
        this.a(new cxt(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public void f(float f2, float f3) {
        float f4 = this.bb;
        float f5 = this.ba;
        this.ba = (float)((double)this.ba + (double)f2 * 0.15);
        this.bb = (float)((double)this.bb - (double)f3 * 0.15);
        this.bb = cmk.a(this.bb, -90.0f, 90.0f);
        this.bd += this.bb - f4;
        this.bc += this.ba - f5;
        if (this.g != null) {
            this.g.b_(this);
        }
    }

    public void bb_() {
        if (!this.aQ.C) {
            this.b(6, this.cs());
        }
        this.w_();
    }

    public void w_() {
        this.aQ.A.a("entityBaseTick");
        if (this.cp() && this.cL().bk) {
            this.s_();
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
        if (!this.aQ.C && this.aQ instanceof alj) {
            this.aQ.A.a("portal");
            if (this.bQ) {
                a a2 = this.aQ.f();
                if (a2.E()) {
                    int n2;
                    if (!this.cp() && this.bR++ >= (n2 = this.al_())) {
                        this.bR = n2;
                        this.bP = this.aq_();
                        int n3 = this.aQ.q.a().a() == -1 ? 0 : -1;
                        this.e_(n3);
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
            this.bZ();
            this.aQ.A.b();
        }
        this.W_();
        this.bf_();
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
                    this.a(ahy.c, 1.0f);
                }
                --this.m;
            }
        }
        if (this.cj()) {
            this.ca();
            this.bq *= 0.5f;
        }
        if (this.aV < -64.0) {
            this.bq();
        }
        if (!this.aQ.C) {
            this.b(0, this.m > 0);
        }
        this.bC = false;
        this.aQ.A.b();
    }

    protected void bZ() {
        if (this.bP > 0) {
            --this.bP;
        }
    }

    public int al_() {
        return 1;
    }

    protected void ca() {
        if (this.bD) {
            return;
        }
        this.a(ahy.d, 4.0f);
        this.m(15);
    }

    public void m(int n2) {
        int n3 = n2 * 20;
        if (this instanceof bga) {
            n3 = cqc.a((bga)this, n3);
        }
        if (this.m < n3) {
            this.m = n3;
        }
    }

    public void cb() {
        this.m = 0;
    }

    protected void bq() {
        this.ak_();
    }

    public boolean h(double d2, double d3, double d4) {
        cxt cxt2 = this.cD().c(d2, d3, d4);
        return this.b(cxt2);
    }

    private boolean b(cxt cxt2) {
        return this.aQ.a(this, cxt2).isEmpty() && !this.aQ.e(cxt2);
    }

    public void b(double d2, double d3, double d4) {
        Object object;
        double d5;
        Object object2;
        Object object3;
        int n2;
        boolean bl2;
        if (this.bv) {
            this.a(this.cD().c(d2, d3, d4));
            this.cc();
            return;
        }
        this.aQ.A.a("move");
        double d6 = this.aU;
        double d7 = this.aV;
        double d8 = this.aW;
        if (this.bj) {
            this.bj = false;
            d2 *= 0.25;
            d3 *= (double)0.05f;
            d4 *= 0.25;
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
        }
        double d9 = d2;
        double d10 = d3;
        double d11 = d4;
        boolean bl3 = bl2 = this.be && this.ar_() && this instanceof bdl;
        if (bl2) {
            double d12 = 0.05;
            while (d2 != 0.0 && this.aQ.a(this, this.cD().c(d2, -1.0, 0.0)).isEmpty()) {
                d2 = d2 < 0.05 && d2 >= -0.05 ? 0.0 : (d2 > 0.0 ? (d2 -= 0.05) : (d2 += 0.05));
                d9 = d2;
            }
            while (d4 != 0.0 && this.aQ.a(this, this.cD().c(0.0, -1.0, d4)).isEmpty()) {
                d4 = d4 < 0.05 && d4 >= -0.05 ? 0.0 : (d4 > 0.0 ? (d4 -= 0.05) : (d4 += 0.05));
                d11 = d4;
            }
            while (d2 != 0.0 && d4 != 0.0 && this.aQ.a(this, this.cD().c(d2, -1.0, d4)).isEmpty()) {
                d2 = d2 < 0.05 && d2 >= -0.05 ? 0.0 : (d2 > 0.0 ? (d2 -= 0.05) : (d2 += 0.05));
                d9 = d2;
                d4 = d4 < 0.05 && d4 >= -0.05 ? 0.0 : (d4 > 0.0 ? (d4 -= 0.05) : (d4 += 0.05));
                d11 = d4;
            }
        }
        List list = this.aQ.a(this, this.cD().a(d2, d3, d4));
        cxt cxt2 = this.cD();
        int n3 = list.size();
        for (n2 = 0; n2 < n3; ++n2) {
            d3 = ((cxt)list.get(n2)).b(this.cD(), d3);
        }
        this.a(this.cD().c(0.0, d3, 0.0));
        n2 = this.be || d10 != d3 && d10 < 0.0 ? 1 : 0;
        int n4 = list.size();
        for (n3 = 0; n3 < n4; ++n3) {
            d2 = ((cxt)list.get(n3)).a(this.cD(), d2);
        }
        this.a(this.cD().c(d2, 0.0, 0.0));
        n4 = list.size();
        for (n3 = 0; n3 < n4; ++n3) {
            d4 = ((cxt)list.get(n3)).c(this.cD(), d4);
        }
        this.a(this.cD().c(0.0, 0.0, d4));
        if (this.bu > 0.0f && n2 != 0 && (d9 != d2 || d11 != d4)) {
            double d13 = d2;
            double d14 = d3;
            double d15 = d4;
            object3 = this.cD();
            this.a(cxt2);
            d2 = d9;
            d3 = this.bu;
            d4 = d11;
            object2 = this.aQ.a(this, this.cD().a(d2, d3, d4));
            cxt cxt3 = this.cD();
            cxt cxt4 = cxt3.a(d2, 0.0, d4);
            d5 = d3;
            int n5 = object2.size();
            for (int i2 = 0; i2 < n5; ++i2) {
                d5 = ((cxt)object2.get(i2)).b(cxt4, d5);
            }
            cxt3 = cxt3.c(0.0, d5, 0.0);
            double d16 = d2;
            int n6 = object2.size();
            for (int i3 = 0; i3 < n6; ++i3) {
                d16 = ((cxt)object2.get(i3)).a(cxt3, d16);
            }
            cxt3 = cxt3.c(d16, 0.0, 0.0);
            double d17 = d4;
            int n7 = object2.size();
            for (int i4 = 0; i4 < n7; ++i4) {
                d17 = ((cxt)object2.get(i4)).c(cxt3, d17);
            }
            cxt3 = cxt3.c(0.0, 0.0, d17);
            cxt cxt5 = this.cD();
            double d18 = d3;
            int n8 = object2.size();
            for (int i5 = 0; i5 < n8; ++i5) {
                d18 = ((cxt)object2.get(i5)).b(cxt5, d18);
            }
            cxt5 = cxt5.c(0.0, d18, 0.0);
            double d19 = d2;
            int n9 = object2.size();
            for (int i6 = 0; i6 < n9; ++i6) {
                d19 = ((cxt)object2.get(i6)).a(cxt5, d19);
            }
            cxt5 = cxt5.c(d19, 0.0, 0.0);
            double d20 = d4;
            int n10 = object2.size();
            for (int i7 = 0; i7 < n10; ++i7) {
                d20 = ((cxt)object2.get(i7)).c(cxt5, d20);
            }
            cxt5 = cxt5.c(0.0, 0.0, d20);
            double d21 = d16 * d16 + d17 * d17;
            double d22 = d19 * d19 + d20 * d20;
            if (d21 > d22) {
                d2 = d16;
                d4 = d17;
                d3 = -d5;
                this.a(cxt3);
            } else {
                d2 = d19;
                d4 = d20;
                d3 = -d18;
                this.a(cxt5);
            }
            int n11 = object2.size();
            for (int i8 = 0; i8 < n11; ++i8) {
                d3 = ((cxt)object2.get(i8)).b(this.cD(), d3);
            }
            this.a(this.cD().c(0.0, d3, 0.0));
            if (d13 * d13 + d15 * d15 >= d2 * d2 + d4 * d4) {
                d2 = d13;
                d3 = d14;
                d4 = d15;
                this.a((cxt)object3);
            }
        }
        this.aQ.A.b();
        this.aQ.A.a("rest");
        this.cc();
        this.bf = d9 != d2 || d11 != d4;
        this.bg = d10 != d3;
        this.be = this.bg && d10 < 0.0;
        this.bh = this.bf || this.bg;
        int n12 = cmk.c(this.aU);
        n4 = cmk.c(this.aV - (double)0.2f);
        int n13 = cmk.c(this.aW);
        cmz cmz2 = new cmz(n12, n4, n13);
        Object object4 = this.aQ.n(cmz2);
        if (object4.a() == ahk.a && ((object2 = (object3 = this.aQ.n((cmz)(object = cmz2.h()))).t()) instanceof gd || object2 instanceof zd || object2 instanceof bty)) {
            object4 = object3;
            cmz2 = object;
        }
        this.a(d3, this.be, (dbk)object4, cmz2);
        if (d9 != d2) {
            this.aX = 0.0;
        }
        if (d11 != d4) {
            this.aZ = 0.0;
        }
        object = object4.t();
        if (d10 != d3) {
            ((bfa)object).a(this.aQ, this);
        }
        if (this.e() && !bl2 && !this.cp()) {
            double d23 = this.aU - d6;
            double d24 = this.aV - d7;
            d5 = this.aW - d8;
            if (object != blg.au) {
                d24 = 0.0;
            }
            if (object != null && this.be) {
                ((bfa)object).a(this.aQ, cmz2, this);
            }
            this.bo = (float)((double)this.bo + (double)cmk.a(d23 * d23 + d5 * d5) * 0.6);
            this.bp = (float)((double)this.bp + (double)cmk.a(d23 * d23 + d24 * d24 + d5 * d5) * 0.6);
            if (this.bp > (float)this.l && object4.a() != ahk.a) {
                this.l = (int)this.bp + 1;
                if (this.V_()) {
                    float f2 = cmk.a(this.aX * this.aX * (double)0.2f + this.aY * this.aY + this.aZ * this.aZ * (double)0.2f) * 0.35f;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    this.a(this.am_(), f2, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
                }
                this.a(cmz2, (bfa)object);
            }
        }
        try {
            this.cd();
        }
        catch (Throwable throwable) {
            object2 = cet.a(throwable, "Checking entity block collision");
            sx sx2 = ((cet)object2).a("Entity being checked for collision");
            this.a(sx2);
            throw new oz((cet)object2);
        }
        boolean bl4 = this.ch();
        if (this.aQ.f(this.cD().c(0.001))) {
            this.f_(1);
            if (!bl4) {
                ++this.m;
                if (this.m == 0) {
                    this.m(8);
                }
            }
        } else if (this.m <= 0) {
            this.m = -this.bz;
        }
        if (bl4 && this.m > 0) {
            this.a(dah.bG, 0.7f, 1.6f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
            this.m = -this.bz;
        }
        this.aQ.A.b();
    }

    public void cc() {
        cxt cxt2 = this.cD();
        this.aU = (cxt2.a + cxt2.d) / 2.0;
        this.aV = cxt2.b;
        this.aW = (cxt2.c + cxt2.f) / 2.0;
    }

    protected bi am_() {
        return dah.bK;
    }

    protected bi an_() {
        return dah.bJ;
    }

    protected void cd() {
        cxt cxt2 = this.cD();
        bjb bjb2 = bjb.b(cxt2.a + 0.001, cxt2.b + 0.001, cxt2.c + 0.001);
        bjb bjb3 = bjb.b(cxt2.d - 0.001, cxt2.e - 0.001, cxt2.f - 0.001);
        bjb bjb4 = bjb.e();
        if (this.aQ.a((cmz)bjb2, (cmz)bjb3)) {
            for (int i2 = bjb2.a(); i2 <= bjb3.a(); ++i2) {
                for (int i3 = bjb2.b(); i3 <= bjb3.b(); ++i3) {
                    for (int i4 = bjb2.c(); i4 <= bjb3.c(); ++i4) {
                        bjb4.c(i2, i3, i4);
                        dbk dbk2 = this.aQ.n(bjb4);
                        try {
                            dbk2.t().a(this.aQ, (cmz)bjb4, dbk2, this);
                            continue;
                        }
                        catch (Throwable throwable) {
                            cet cet2 = cet.a(throwable, "Colliding entity with block");
                            sx sx2 = cet2.a("Block being collided with");
                            sx.a(sx2, bjb4, dbk2);
                            throw new oz(cet2);
                        }
                    }
                }
            }
        }
        bjb2.f();
        bjb3.f();
        bjb4.f();
    }

    protected void a(cmz cmz2, bfa bfa2) {
        acv acv2 = bfa2.t();
        if (this.aQ.n(cmz2.g()).t() == blg.aH) {
            acv2 = blg.aH.t();
            this.a(acv2.d(), acv2.a() * 0.15f, acv2.b());
        } else if (!bfa2.s().a().d()) {
            this.a(acv2.d(), acv2.a() * 0.15f, acv2.b());
        }
    }

    public void a(bi bi2, float f2, float f3) {
        if (!this.ce()) {
            this.aQ.a(null, this.aU, this.aV, this.aW, bi2, this.y(), f2, f3);
        }
    }

    public boolean ce() {
        return (Boolean)this.bE.a(q);
    }

    public void o(boolean bl2) {
        this.bE.b(q, bl2);
    }

    public boolean cf() {
        return (Boolean)this.bE.a(r);
    }

    public void p(boolean bl2) {
        this.bE.b(r, bl2);
    }

    protected boolean e() {
        return true;
    }

    protected void a(double d2, boolean bl2, dbk dbk2, cmz cmz2) {
        if (bl2) {
            if (this.bq > 0.0f) {
                dbk2.t().a(this.aQ, cmz2, this, this.bq);
            }
            this.bq = 0.0f;
        } else if (d2 < 0.0) {
            this.bq = (float)((double)this.bq - d2);
        }
    }

    public cxt ao_() {
        return null;
    }

    protected void f_(int n2) {
        if (!this.bD) {
            this.a(ahy.a, (float)n2);
        }
    }

    public final boolean cg() {
        return this.bD;
    }

    public void a(float f2, float f3) {
        if (this.cq()) {
            for (cpk cpk2 : this.cH()) {
                cpk2.a(f2, f3);
            }
        }
    }

    public boolean ch() {
        if (this.bA) {
            return true;
        }
        bjb bjb2 = bjb.b(this.aU, this.aV, this.aW);
        if (!this.aQ.A(bjb2) && !this.aQ.A(bjb2.c(this.aU, this.aV + (double)this.bm, this.aW))) {
            bjb2.f();
            return false;
        }
        bjb2.f();
        return true;
    }

    public boolean V_() {
        return this.bA;
    }

    public boolean bf_() {
        if (this.cL() instanceof cor) {
            this.bA = false;
        } else if (this.aQ.a(this.cD().b(0.0, -0.4f, 0.0).c(0.001), ahk.h, this)) {
            if (!this.bA && !this.bC) {
                this.J_();
            }
            this.bq = 0.0f;
            this.bA = true;
            this.m = 0;
        } else {
            this.bA = false;
        }
        return this.bA;
    }

    protected void J_() {
        float f2;
        float f3;
        float f4 = cmk.a(this.aX * this.aX * (double)0.2f + this.aY * this.aY + this.aZ * this.aZ * (double)0.2f) * 0.2f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        this.a(this.an_(), f4, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
        float f5 = cmk.c(this.cD().b);
        int n2 = 0;
        while ((float)n2 < 1.0f + this.bl * 20.0f) {
            f3 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            f2 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            this.aQ.a(lz.e, this.aU + (double)f3, (double)(f5 + 1.0f), this.aW + (double)f2, this.aX, this.aY - (double)(this.bx.nextFloat() * 0.2f), this.aZ, new int[0]);
            ++n2;
        }
        n2 = 0;
        while ((float)n2 < 1.0f + this.bl * 20.0f) {
            f3 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            f2 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl;
            this.aQ.a(lz.f, this.aU + (double)f3, (double)(f5 + 1.0f), this.aW + (double)f2, this.aX, this.aY, this.aZ, new int[0]);
            ++n2;
        }
    }

    public void W_() {
        if (this.cr() && !this.V_()) {
            this.ci();
        }
    }

    protected void ci() {
        int n2;
        int n3;
        int n4 = cmk.c(this.aU);
        cmz cmz2 = new cmz(n4, n3 = cmk.c(this.aV - (double)0.2f), n2 = cmk.c(this.aW));
        dbk dbk2 = this.aQ.n(cmz2);
        if (dbk2.i() != cpb.a) {
            this.aQ.a(lz.L, this.aU + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, this.cD().b + 0.1, this.aW + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, -this.aX * 4.0, 1.5, -this.aZ * 4.0, bfa.u(dbk2));
        }
    }

    public boolean a(ahk ahk2) {
        if (this.cL() instanceof cor) {
            return false;
        }
        double d2 = this.aV + (double)this.A();
        cmz cmz2 = new cmz(this.aU, d2, this.aW);
        dbk dbk2 = this.aQ.n(cmz2);
        if (dbk2.a() == ahk2) {
            boolean bl2;
            float f2 = en.b(dbk2.t().e(dbk2)) - 0.11111111f;
            float f3 = (float)(cmz2.b() + 1) - f2;
            boolean bl3 = bl2 = d2 < (double)f3;
            if (!bl2 && this instanceof bdl) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public boolean cj() {
        return this.aQ.a(this.cD().b((double)-0.1f, -0.4f, -0.1f), ahk.i);
    }

    public void b(float f2, float f3, float f4) {
        float f5 = f2 * f2 + f3 * f3;
        if (f5 < 1.0E-4f) {
            return;
        }
        if ((f5 = cmk.c(f5)) < 1.0f) {
            f5 = 1.0f;
        }
        f5 = f4 / f5;
        float f6 = cmk.a(this.ba * ((float)Math.PI / 180));
        float f7 = cmk.b(this.ba * ((float)Math.PI / 180));
        this.aX += (double)((f2 *= f5) * f7 - (f3 *= f5) * f6);
        this.aZ += (double)(f3 * f7 + f2 * f6);
    }

    public int b(float f2) {
        pj pj2 = new pj(cmk.c(this.aU), 0, cmk.c(this.aW));
        if (this.aQ.d(pj2)) {
            pj2.a(cmk.c(this.aV + (double)this.A()));
            return this.aQ.b((cmz)pj2, 0);
        }
        return 0;
    }

    public float a(float f2) {
        pj pj2 = new pj(cmk.c(this.aU), 0, cmk.c(this.aW));
        if (this.aQ.d(pj2)) {
            pj2.a(cmk.c(this.aV + (double)this.A()));
            return this.aQ.m(pj2);
        }
        return 0.0f;
    }

    public void b(iu iu2) {
        this.aQ = iu2;
    }

    public void b(double d2, double d3, double d4, float f2, float f3) {
        this.aU = cmk.a(d2, -3.0E7, 3.0E7);
        this.aV = d3;
        this.aW = cmk.a(d4, -3.0E7, 3.0E7);
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        f3 = cmk.a(f3, -90.0f, 90.0f);
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
        this.d(this.aU, this.aV, this.aW);
        this.e(f2, f3);
    }

    public void a(cmz cmz2, float f2, float f3) {
        this.a_((double)cmz2.a() + 0.5, cmz2.b(), (double)cmz2.c() + 0.5, f2, f3);
    }

    public void a_(double d2, double d3, double d4, float f2, float f3) {
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
        this.d(this.aU, this.aV, this.aW);
    }

    public float k(cpk cpk2) {
        float f2 = (float)(this.aU - cpk2.aU);
        float f3 = (float)(this.aV - cpk2.aV);
        float f4 = (float)(this.aW - cpk2.aW);
        return cmk.c(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public double i(double d2, double d3, double d4) {
        double d5 = this.aU - d2;
        double d6 = this.aV - d3;
        double d7 = this.aW - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double e(cmz cmz2) {
        return cmz2.d(this.aU, this.aV, this.aW);
    }

    public double f(cmz cmz2) {
        return cmz2.e(this.aU, this.aV, this.aW);
    }

    public double j(double d2, double d3, double d4) {
        double d5 = this.aU - d2;
        double d6 = this.aV - d3;
        double d7 = this.aW - d4;
        return cmk.a(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public double l(cpk cpk2) {
        double d2 = this.aU - cpk2.aU;
        double d3 = this.aV - cpk2.aV;
        double d4 = this.aW - cpk2.aW;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public void b_(bdl bdl2) {
    }

    public void e_(cpk cpk2) {
        if (this.s(cpk2)) {
            return;
        }
        if (cpk2.bv || this.bv) {
            return;
        }
        double d2 = cpk2.aU - this.aU;
        double d3 = cpk2.aW - this.aW;
        double d4 = cmk.a(d2, d3);
        if (d4 >= (double)0.01f) {
            d4 = cmk.a(d4);
            d2 /= d4;
            d3 /= d4;
            double d5 = 1.0 / d4;
            if (d5 > 1.0) {
                d5 = 1.0;
            }
            d2 *= d5;
            d3 *= d5;
            d2 *= (double)0.05f;
            d3 *= (double)0.05f;
            d2 *= (double)(1.0f - this.bw);
            d3 *= (double)(1.0f - this.bw);
            if (!this.cq()) {
                this.c(-d2, 0.0, -d3);
            }
            if (!cpk2.cq()) {
                cpk2.c(d2, 0.0, d3);
            }
        }
    }

    public void c(double d2, double d3, double d4) {
        this.aX += d2;
        this.aY += d3;
        this.aZ += d4;
        this.bO = true;
    }

    protected void bz() {
        this.bi = true;
    }

    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        this.bz();
        return false;
    }

    public amj l(float f2) {
        if (f2 == 1.0f) {
            return this.g(this.bb, this.ba);
        }
        float f3 = this.bd + (this.bb - this.bd) * f2;
        float f4 = this.bc + (this.ba - this.bc) * f2;
        return this.g(f3, f4);
    }

    protected final amj g(float f2, float f3) {
        float f4 = cmk.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = cmk.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -cmk.b(-f2 * ((float)Math.PI / 180));
        float f7 = cmk.a(-f2 * ((float)Math.PI / 180));
        return new amj(f5 * f6, f7, f4 * f6);
    }

    public amj q(float f2) {
        if (f2 == 1.0f) {
            return new amj(this.aU, this.aV + (double)this.A(), this.aW);
        }
        double d2 = this.aR + (this.aU - this.aR) * (double)f2;
        double d3 = this.aS + (this.aV - this.aS) * (double)f2 + (double)this.A();
        double d4 = this.aT + (this.aW - this.aT) * (double)f2;
        return new amj(d2, d3, d4);
    }

    public auu a(double d2, float f2) {
        amj amj2 = this.q(f2);
        amj amj3 = this.l(f2);
        amj amj4 = amj2.b(amj3.b * d2, amj3.c * d2, amj3.d * d2);
        return this.aQ.a(amj2, amj4, false, false, true);
    }

    public boolean bc_() {
        return false;
    }

    public boolean P() {
        return false;
    }

    public void a(cpk cpk2, int n2) {
    }

    public boolean k(double d2, double d3, double d4) {
        double d5 = this.aU - d2;
        double d6 = this.aV - d3;
        double d7 = this.aW - d4;
        double d8 = d5 * d5 + d6 * d6 + d7 * d7;
        return this.a(d8);
    }

    public boolean a(double d2) {
        double d3 = this.cD().a();
        if (Double.isNaN(d3)) {
            d3 = 1.0;
        }
        return d2 < (d3 *= 64.0 * c) * d3;
    }

    public boolean d(bvp bvp2) {
        String string = this.ck();
        if (this.bk || string == null) {
            return false;
        }
        bvp2.a("id", string);
        this.e(bvp2);
        return true;
    }

    public boolean c(bvp bvp2) {
        String string = this.ck();
        if (this.bk || string == null || this.cp()) {
            return false;
        }
        bvp2.a("id", string);
        this.e(bvp2);
        return true;
    }

    public bvp e(bvp bvp2) {
        try {
            bmh bmh2;
            bvp2.a("Pos", this.a(new double[]{this.aU, this.aV, this.aW}));
            bvp2.a("Motion", this.a(new double[]{this.aX, this.aY, this.aZ}));
            bvp2.a("Rotation", this.a(new float[]{this.ba, this.bb}));
            bvp2.a("FallDistance", this.bq);
            bvp2.a("Fire", (short)this.m);
            bvp2.a("Air", (short)this.cu());
            bvp2.a("OnGround", this.be);
            bvp2.a("Dimension", this.bS);
            bvp2.a("Invulnerable", this.s);
            bvp2.a("PortalCooldown", this.bP);
            bvp2.a("UUID", this.cx());
            if (this.cA() != null && !this.cA().isEmpty()) {
                bvp2.a("CustomName", this.cA());
            }
            if (this.cB()) {
                bvp2.a("CustomNameVisible", this.cB());
            }
            this.t.b(bvp2);
            if (this.ce()) {
                bvp2.a("Silent", this.ce());
            }
            if (this.cf()) {
                bvp2.a("NoGravity", this.cf());
            }
            if (this.bY) {
                bvp2.a("Glowing", this.bY);
            }
            if (this.v.size() > 0) {
                bmh2 = new bmh();
                for (Object object : this.v) {
                    bmh2.a(new byh((String)object));
                }
                bvp2.a("Tags", bmh2);
            }
            this.a(bvp2);
            if (this.cq()) {
                bmh2 = new bmh();
                for (Object object : this.cH()) {
                    bvp bvp3;
                    if (!((cpk)object).d(bvp3 = new bvp())) continue;
                    bmh2.a(bvp3);
                }
                if (!bmh2.j()) {
                    bvp2.a("Passengers", bmh2);
                }
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Saving entity NBT");
            sx sx2 = cet2.a("Entity being saved");
            this.a(sx2);
            throw new oz(cet2);
        }
        return bvp2;
    }

    public void f(bvp bvp2) {
        try {
            bmh bmh2 = bvp2.c("Pos", 6);
            bmh bmh3 = bvp2.c("Motion", 6);
            bmh bmh4 = bvp2.c("Rotation", 5);
            this.aX = bmh3.e(0);
            this.aY = bmh3.e(1);
            this.aZ = bmh3.e(2);
            if (Math.abs(this.aX) > 10.0) {
                this.aX = 0.0;
            }
            if (Math.abs(this.aY) > 10.0) {
                this.aY = 0.0;
            }
            if (Math.abs(this.aZ) > 10.0) {
                this.aZ = 0.0;
            }
            this.aU = bmh2.e(0);
            this.aV = bmh2.e(1);
            this.aW = bmh2.e(2);
            this.br = this.aU;
            this.bs = this.aV;
            this.bt = this.aW;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            this.ba = bmh4.f(0);
            this.bb = bmh4.f(1);
            this.bc = this.ba;
            this.bd = this.bb;
            this.n(this.ba);
            this.o(this.ba);
            this.bq = bvp2.j("FallDistance");
            this.m = bvp2.g("Fire");
            this.o(bvp2.g("Air"));
            this.be = bvp2.p("OnGround");
            if (bvp2.e("Dimension")) {
                this.bS = bvp2.h("Dimension");
            }
            this.s = bvp2.p("Invulnerable");
            this.bP = bvp2.h("PortalCooldown");
            if (bvp2.b("UUID")) {
                this.bW = bvp2.a("UUID");
                this.bX = this.bW.toString();
            }
            this.d(this.aU, this.aV, this.aW);
            this.e(this.ba, this.bb);
            if (bvp2.b("CustomName", 8)) {
                this.g(bvp2.l("CustomName"));
            }
            this.t(bvp2.p("CustomNameVisible"));
            this.t.a(bvp2);
            this.o(bvp2.p("Silent"));
            this.p(bvp2.p("NoGravity"));
            this.r(bvp2.p("Glowing"));
            if (bvp2.b("Tags", 9)) {
                this.v.clear();
                bmh bmh5 = bvp2.c("Tags", 8);
                int n2 = Math.min(bmh5.b(), 1024);
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.v.add(bmh5.g(i2));
                }
            }
            this.b(bvp2);
            if (this.x_()) {
                this.d(this.aU, this.aV, this.aW);
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Loading entity NBT");
            sx sx2 = cet2.a("Entity being loaded");
            this.a(sx2);
            throw new oz(cet2);
        }
    }

    protected boolean x_() {
        return true;
    }

    protected final String ck() {
        return vb.b(this);
    }

    protected abstract void b(bvp var1);

    protected abstract void a(bvp var1);

    protected bmh a(double ... arrd) {
        bmh bmh2 = new bmh();
        for (double d2 : arrd) {
            bmh2.a(new cab(d2));
        }
        return bmh2;
    }

    protected bmh a(float ... arrf) {
        bmh bmh2 = new bmh();
        for (float f2 : arrf) {
            bmh2.a(new po(f2));
        }
        return bmh2;
    }

    public er a(azg azg2, int n2) {
        return this.a(azg2, n2, 0.0f);
    }

    public er a(azg azg2, int n2, float f2) {
        return this.a(new bhl(azg2, n2, 0), f2);
    }

    public er a(bhl bhl2, float f2) {
        if (bhl2.b == 0 || bhl2.a() == null) {
            return null;
        }
        er er2 = new er(this.aQ, this.aU, this.aV + (double)f2, this.aW, bhl2);
        er2.l();
        this.aQ.b(er2);
        return er2;
    }

    public boolean bj() {
        return !this.bk;
    }

    public boolean K_() {
        if (this.bv) {
            return false;
        }
        bjb bjb2 = bjb.e();
        for (int i2 = 0; i2 < 8; ++i2) {
            int n2 = cmk.c(this.aV + (double)(((float)((i2 >> 0) % 2) - 0.5f) * 0.1f) + (double)this.A());
            int n3 = cmk.c(this.aU + (double)(((float)((i2 >> 1) % 2) - 0.5f) * this.bl * 0.8f));
            int n4 = cmk.c(this.aW + (double)(((float)((i2 >> 2) % 2) - 0.5f) * this.bl * 0.8f));
            if (bjb2.a() == n3 && bjb2.b() == n2 && bjb2.c() == n4) continue;
            bjb2.c(n3, n2, n4);
            if (!this.aQ.n(bjb2).t().ay_()) continue;
            bjb2.f();
            return true;
        }
        bjb2.f();
        return false;
    }

    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        return false;
    }

    public cxt a_(cpk cpk2) {
        return null;
    }

    public void af_() {
        cpk cpk2 = this.cL();
        if (this.cp() && cpk2.bk) {
            this.s_();
            return;
        }
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.bb_();
        if (!this.cp()) {
            return;
        }
        cpk2.c(this);
    }

    public void c(cpk cpk2) {
        if (!this.r(cpk2)) {
            return;
        }
        cpk2.d(this.aU, this.aV + this.ag() + cpk2.Z_(), this.aW);
    }

    public void b_(cpk cpk2) {
    }

    public double Z_() {
        return 0.0;
    }

    public double ag() {
        return (double)this.bm * 0.75;
    }

    public boolean m(cpk cpk2) {
        return this.a(cpk2, false);
    }

    public boolean a(cpk cpk2, boolean bl2) {
        if (!(bl2 || this.f_(cpk2) && cpk2.c_(this))) {
            return false;
        }
        if (this.cp()) {
            this.s_();
        }
        this.g = cpk2;
        this.g.n(this);
        return true;
    }

    protected boolean f_(cpk cpk2) {
        return this.aO <= 0;
    }

    public void cl() {
        for (int i2 = this.f.size() - 1; i2 >= 0; --i2) {
            ((cpk)this.f.get(i2)).s_();
        }
    }

    public void s_() {
        if (this.g != null) {
            cpk cpk2 = this.g;
            this.g = null;
            cpk2.o(this);
        }
    }

    protected void n(cpk cpk2) {
        if (cpk2.cL() != this) {
            throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
        }
        if (!this.aQ.C && cpk2 instanceof bdl && !(this.aj() instanceof bdl)) {
            this.f.add(0, cpk2);
        } else {
            this.f.add(cpk2);
        }
    }

    protected void o(cpk cpk2) {
        if (cpk2.cL() == this) {
            throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
        }
        this.f.remove(cpk2);
        cpk2.aO = 60;
    }

    protected boolean c_(cpk cpk2) {
        return this.cH().size() < 1;
    }

    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.d(d2, d3, d4);
        this.e(f2, f3);
    }

    public float ap_() {
        return 0.0f;
    }

    public amj by() {
        return null;
    }

    public afo cm() {
        afo afo2 = new afo(this.bb, this.ba);
        return afo2;
    }

    public amj cn() {
        return amj.a(this.cm());
    }

    public void g(cmz cmz2) {
        if (this.bP > 0) {
            this.bP = this.aq_();
            return;
        }
        if (!this.aQ.C && !cmz2.equals(this.bT)) {
            this.bT = new cmz(cmz2);
            aiz aiz2 = blg.aY.d(this.aQ, this.bT);
            double d2 = aiz2.b().l() == ctv.a ? (double)aiz2.a().c() : (double)aiz2.a().a();
            double d3 = aiz2.b().l() == ctv.a ? this.aW : this.aU;
            d3 = Math.abs(cmk.c(d3 - (double)(aiz2.b().f().d() == yy.b ? 1 : 0), d2, d2 - (double)aiz2.d()));
            double d4 = cmk.c(this.aV - 1.0, (double)aiz2.a().b(), (double)(aiz2.a().b() - aiz2.e()));
            this.bU = new amj(d3, d4, 0.0);
            this.bV = aiz2.b();
        }
        this.bQ = true;
    }

    public int aq_() {
        return 300;
    }

    public void a(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
    }

    public void a(byte by2) {
    }

    public void bk() {
    }

    public Iterable aA() {
        return this.u;
    }

    public Iterable aB() {
        return this.u;
    }

    public Iterable co() {
        return mq.b(this.aA(), this.aB());
    }

    public void a(dfm dfm2, bhl bhl2) {
    }

    public boolean y_() {
        boolean bl2 = this.aQ != null && this.aQ.C;
        return !this.bD && (this.m > 0 || bl2 && this.n(0));
    }

    public boolean cp() {
        return this.cL() != null;
    }

    public boolean cq() {
        return !this.cH().isEmpty();
    }

    public boolean ar_() {
        return this.n(1);
    }

    public void q(boolean bl2) {
        this.b(1, bl2);
    }

    public boolean cr() {
        return this.n(3);
    }

    public void c_(boolean bl2) {
        this.b(3, bl2);
    }

    public boolean cs() {
        return this.bY || this.aQ.C && this.n(6);
    }

    public void r(boolean bl2) {
        this.bY = bl2;
        if (!this.aQ.C) {
            this.b(6, this.bY);
        }
    }

    public boolean ct() {
        return this.n(5);
    }

    public boolean a_(bdl bdl2) {
        if (bdl2.aL()) {
            return false;
        }
        ccw ccw2 = this.as_();
        if (ccw2 != null && bdl2 != null && bdl2.as_() == ccw2 && ccw2.g()) {
            return false;
        }
        return this.ct();
    }

    public ccw as_() {
        return this.aQ.P().g(this.cy());
    }

    public boolean d(cpk cpk2) {
        return this.a(cpk2.as_());
    }

    public boolean a(ccw ccw2) {
        if (this.as_() != null) {
            return this.as_().a(ccw2);
        }
        return false;
    }

    public void e_(boolean bl2) {
        this.b(5, bl2);
    }

    protected boolean n(int n2) {
        return ((Byte)this.bE.a(bF) & 1 << n2) != 0;
    }

    protected void b(int n2, boolean bl2) {
        byte by2 = (Byte)this.bE.a(bF);
        if (bl2) {
            this.bE.b(bF, (byte)(by2 | 1 << n2));
        } else {
            this.bE.b(bF, (byte)(by2 & ~(1 << n2)));
        }
    }

    public int cu() {
        return (Integer)this.bE.a(n);
    }

    public void o(int n2) {
        this.bE.b(n, n2);
    }

    public void a(tz tz2) {
        this.a(ahy.b, 5.0f);
        ++this.m;
        if (this.m == 0) {
            this.m(8);
        }
    }

    public void a_(bga bga2) {
    }

    protected boolean e(double d2, double d3, double d4) {
        cmz cmz2 = new cmz(d2, d3, d4);
        double d5 = d2 - (double)cmz2.a();
        double d6 = d3 - (double)cmz2.b();
        double d7 = d4 - (double)cmz2.c();
        List list = this.aQ.a(this.cD());
        if (list.isEmpty()) {
            return false;
        }
        bqk bqk2 = bqk.b;
        double d8 = Double.MAX_VALUE;
        if (!this.aQ.s(cmz2.k()) && d5 < d8) {
            d8 = d5;
            bqk2 = bqk.e;
        }
        if (!this.aQ.s(cmz2.l()) && 1.0 - d5 < d8) {
            d8 = 1.0 - d5;
            bqk2 = bqk.f;
        }
        if (!this.aQ.s(cmz2.i()) && d7 < d8) {
            d8 = d7;
            bqk2 = bqk.c;
        }
        if (!this.aQ.s(cmz2.j()) && 1.0 - d7 < d8) {
            d8 = 1.0 - d7;
            bqk2 = bqk.d;
        }
        if (!this.aQ.s(cmz2.g()) && 1.0 - d6 < d8) {
            d8 = 1.0 - d6;
            bqk2 = bqk.b;
        }
        float f2 = this.bx.nextFloat() * 0.2f + 0.1f;
        float f3 = bqk2.d().a();
        if (bqk2.l() == ctv.a) {
            this.aX += (double)(f3 * f2);
        } else if (bqk2.l() == ctv.b) {
            this.aY += (double)(f3 * f2);
        } else if (bqk2.l() == ctv.c) {
            this.aZ += (double)(f3 * f2);
        }
        return true;
    }

    public void X_() {
        this.bj = true;
        this.bq = 0.0f;
    }

    @Override
    public String i_() {
        if (this.j_()) {
            return this.cA();
        }
        String string = vb.b(this);
        if (string == null) {
            string = "generic";
        }
        return caf.a("entity." + string + ".name");
    }

    public cpk[] at_() {
        return null;
    }

    public boolean g_(cpk cpk2) {
        return this == cpk2;
    }

    public float bA() {
        return 0.0f;
    }

    public void n(float f2) {
    }

    public void o(float f2) {
    }

    public boolean c() {
        return true;
    }

    public boolean d_(cpk cpk2) {
        return false;
    }

    public String toString() {
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.i_(), this.e, this.aQ == null ? "~NULL~" : this.aQ.E().i(), this.aU, this.aV, this.aW);
    }

    public boolean c(ahy ahy2) {
        return this.s && ahy2 != ahy.l && !ahy2.u();
    }

    public void s(boolean bl2) {
        this.s = bl2;
    }

    public void p(cpk cpk2) {
        this.a_(cpk2.aU, cpk2.aV, cpk2.aW, cpk2.ba, cpk2.bb);
    }

    private void h(cpk cpk2) {
        bvp bvp2 = cpk2.e(new bvp());
        bvp2.q("Dimension");
        this.f(bvp2);
        this.bP = cpk2.bP;
        this.bT = cpk2.bT;
        this.bU = cpk2.bU;
        this.bV = cpk2.bV;
    }

    public cpk e_(int n2) {
        cmz cmz2;
        if (this.aQ.C || this.bk) {
            return null;
        }
        this.aQ.A.a("changeDimension");
        a a2 = this.o_();
        int n3 = this.bS;
        ls ls2 = a2.a(n3);
        ls ls3 = a2.a(n2);
        this.bS = n2;
        if (n3 == 1 && n2 == 1) {
            ls3 = a2.a(0);
            this.bS = 0;
        }
        this.aQ.e(this);
        this.bk = false;
        this.aQ.A.a("reposition");
        if (n2 == 1) {
            cmz2 = ((alj)((Object)ls3)).ab();
        } else {
            double d2 = this.aU;
            double d3 = this.aW;
            double d4 = 8.0;
            if (n2 == -1) {
                d2 = cmk.a(d2 / 8.0, ((iu)((Object)ls3)).U().b() + 16.0, ((iu)((Object)ls3)).U().d() - 16.0);
                d3 = cmk.a(d3 / 8.0, ((iu)((Object)ls3)).U().c() + 16.0, ((iu)((Object)ls3)).U().e() - 16.0);
            } else if (n2 == 0) {
                d2 = cmk.a(d2 * 8.0, ((iu)((Object)ls3)).U().b() + 16.0, ((iu)((Object)ls3)).U().d() - 16.0);
                d3 = cmk.a(d3 * 8.0, ((iu)((Object)ls3)).U().c() + 16.0, ((iu)((Object)ls3)).U().e() - 16.0);
            }
            d2 = cmk.a((int)d2, -29999872, 29999872);
            d3 = cmk.a((int)d3, -29999872, 29999872);
            float f2 = this.ba;
            this.a_(d2, this.aV, d3, 90.0f, 0.0f);
            bel bel2 = ((alj)((Object)ls3)).ah();
            bel2.b(this, f2);
            cmz2 = new cmz(this);
        }
        ((alj)((Object)ls2)).a(this, false);
        this.aQ.A.c("reloading");
        cpk cpk2 = vb.a(vb.b(this), (iu)((Object)ls3));
        if (cpk2 != null) {
            cpk2.h(this);
            if (n3 == 1 && n2 == 1) {
                cmz cmz3 = ((iu)((Object)ls3)).p(((iu)((Object)ls3)).B());
                cpk2.a(cmz3, cpk2.ba, cpk2.bb);
            } else {
                cpk2.a(cmz2, cpk2.ba, cpk2.bb);
            }
            boolean bl2 = cpk2.aP;
            cpk2.aP = true;
            ((alj)((Object)ls3)).b(cpk2);
            cpk2.aP = bl2;
            ((alj)((Object)ls3)).a(cpk2, false);
        }
        this.bk = true;
        this.aQ.A.b();
        ((alj)((Object)ls2)).Z();
        ((alj)((Object)ls3)).Z();
        this.aQ.A.b();
        return cpk2;
    }

    public boolean aB_() {
        return true;
    }

    public float a(yk yk2, iu iu2, cmz cmz2, dbk dbk2) {
        return dbk2.t().a(this);
    }

    public boolean a(yk yk2, iu iu2, cmz cmz2, dbk dbk2, float f2) {
        return true;
    }

    public int az() {
        return 3;
    }

    public amj cv() {
        return this.bU;
    }

    public bqk cw() {
        return this.bV;
    }

    public boolean au_() {
        return false;
    }

    public void a(sx sx2) {
        sx2.a("Entity Type", new mq(this));
        sx2.a("Entity ID", this.e);
        sx2.a("Entity Name", new bhj(this));
        sx2.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.aU, this.aV, this.aW));
        sx2.a("Entity's Block location", sx.a(cmk.c(this.aU), cmk.c(this.aV), cmk.c(this.aW)));
        sx2.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.aX, this.aY, this.aZ));
        sx2.a("Entity's Passengers", new ckk(this));
        sx2.a("Entity's Vehicle", new btb(this));
    }

    public boolean z_() {
        return this.y_();
    }

    public void b(UUID uUID) {
        this.bW = uUID;
        this.bX = this.bW.toString();
    }

    public UUID cx() {
        return this.bW;
    }

    public String cy() {
        return this.bX;
    }

    public boolean A_() {
        return true;
    }

    public static double cz() {
        return c;
    }

    public static void c(double d2) {
        c = d2;
    }

    @Override
    public cbg v() {
        aym aym2 = new aym(ef.a(this.as_(), this.i_()));
        aym2.h().a(this.cC());
        aym2.h().a(this.cy());
        return aym2;
    }

    public void g(String string) {
        this.bE.b(o, string);
    }

    public String cA() {
        return (String)this.bE.a(o);
    }

    public boolean j_() {
        return !((String)this.bE.a(o)).isEmpty();
    }

    public void t(boolean bl2) {
        this.bE.b(p, bl2);
    }

    public boolean cB() {
        return (Boolean)this.bE.a(p);
    }

    public void l(double d2, double d3, double d4) {
        this.w = true;
        this.a_(d2, d3, d4, this.ba, this.bb);
        this.aQ.a(this, false);
    }

    public boolean F_() {
        return this.cB();
    }

    public void a(bcz bcz2) {
    }

    public bqk B_() {
        return bqk.b(cmk.c((double)(this.ba * 4.0f / 360.0f) + 0.5) & 3);
    }

    public bqk L_() {
        return this.B_();
    }

    protected dex cC() {
        bvp bvp2 = new bvp();
        String string = vb.b(this);
        bvp2.a("id", this.cy());
        if (string != null) {
            bvp2.a("type", string);
        }
        bvp2.a("name", this.i_());
        return new dex(km.d, new aym(bvp2.toString()));
    }

    public boolean a(czt czt2) {
        return true;
    }

    public cxt cD() {
        return this.j;
    }

    public cxt M_() {
        return this.cD();
    }

    public void a(cxt cxt2) {
        this.j = cxt2;
    }

    public float A() {
        return this.bm * 0.85f;
    }

    public boolean cE() {
        return this.k;
    }

    public void u(boolean bl2) {
        this.k = bl2;
    }

    public boolean a_(int n2, bhl bhl2) {
        return false;
    }

    @Override
    public void a(cbg cbg2) {
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public cmz k_() {
        return new cmz(this.aU, this.aV + 0.5, this.aW);
    }

    @Override
    public amj l_() {
        return new amj(this.aU, this.aV, this.aW);
    }

    @Override
    public iu m_() {
        return this.aQ;
    }

    @Override
    public cpk n_() {
        return this;
    }

    @Override
    public boolean C_() {
        return false;
    }

    @Override
    public void a(bnw bnw2, int n2) {
        if (this.aQ != null && !this.aQ.C) {
            this.t.a(this.aQ.f(), this, bnw2, n2);
        }
    }

    @Override
    public a o_() {
        return this.aQ.f();
    }

    public bsv cF() {
        return this.t;
    }

    public void q(cpk cpk2) {
        this.t.a(cpk2.cF());
    }

    public cey a(bdl bdl2, amj amj2, bhl bhl2, bqp bqp2) {
        return cey.b;
    }

    public boolean N_() {
        return false;
    }

    protected void a(bga bga2, cpk cpk2) {
        if (cpk2 instanceof bga) {
            acz.a((bga)cpk2, (cpk)bga2);
        }
        acz.b(bga2, cpk2);
    }

    public void b(czt czt2) {
    }

    public void c(czt czt2) {
    }

    public float a(ih ih2) {
        float f2 = cmk.g(this.ba);
        switch (ih2) {
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

    public float a(cdk cdk2) {
        float f2 = cmk.g(this.ba);
        switch (cdk2) {
            case b: {
                return -f2;
            }
            case c: {
                return 180.0f - f2;
            }
        }
        return f2;
    }

    public boolean O_() {
        return false;
    }

    public boolean cG() {
        boolean bl2 = this.w;
        this.w = false;
        return bl2;
    }

    public cpk aj() {
        return null;
    }

    public List cH() {
        if (this.f.isEmpty()) {
            return Collections.emptyList();
        }
        return ov.a((Iterable)this.f);
    }

    public boolean r(cpk cpk2) {
        for (cpk cpk3 : this.cH()) {
            if (!cpk3.equals(cpk2)) continue;
            return true;
        }
        return false;
    }

    public Collection cI() {
        HashSet hashSet = aad.a();
        this.a(cpk.class, hashSet);
        return hashSet;
    }

    public Collection b(Class class_) {
        HashSet hashSet = aad.a();
        this.a(class_, hashSet);
        return hashSet;
    }

    private void a(Class class_, Set set) {
        for (cpk cpk2 : this.cH()) {
            if (class_.isAssignableFrom(cpk2.getClass())) {
                set.add(cpk2);
            }
            cpk2.a(class_, set);
        }
    }

    public cpk cJ() {
        cpk cpk2 = this;
        while (cpk2.cp()) {
            cpk2 = cpk2.cL();
        }
        return cpk2;
    }

    public boolean s(cpk cpk2) {
        return this.cJ() == cpk2.cJ();
    }

    public boolean t(cpk cpk2) {
        for (cpk cpk3 : this.cH()) {
            if (cpk3.equals(cpk2)) {
                return true;
            }
            if (!cpk3.t(cpk2)) continue;
            return true;
        }
        return false;
    }

    public boolean cK() {
        cpk cpk2 = this.aj();
        if (cpk2 instanceof bdl) {
            return ((bdl)cpk2).z();
        }
        return !this.aQ.C;
    }

    public cpk cL() {
        return this.g;
    }

    public bez P_() {
        return bez.a;
    }

    public csg y() {
        return csg.g;
    }

    static {
        bF = bwm.a(cpk.class, cbf.a);
        n = bwm.a(cpk.class, cbf.b);
        o = bwm.a(cpk.class, cbf.d);
        p = bwm.a(cpk.class, cbf.h);
        q = bwm.a(cpk.class, cbf.h);
        r = bwm.a(cpk.class, cbf.h);
    }
}

