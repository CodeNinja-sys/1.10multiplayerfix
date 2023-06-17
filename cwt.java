/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;
import java.util.List;

public abstract class cwt
extends cpk
implements cvj {
    private static final cm f = cn.a(auxx.e, auxx.a, new jz());
    private static final bcz g = bwm.a(cwt.class, cbf.a);
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private bfa k;
    private int l;
    protected boolean a;
    protected int b;
    public cok c = cok.a;
    public int d;
    public cpk e;
    private int m;
    private int n;
    private double o = 2.0;
    private int p;

    public cwt(iu iu2) {
        super(iu2);
        this.a_(0.5f, 0.5f);
    }

    public cwt(iu iu2, double d2, double d3, double d4) {
        this(iu2);
        this.d(d2, d3, d4);
    }

    public cwt(iu iu2, bga bga2) {
        this(iu2, bga2.aU, bga2.aV + (double)bga2.A() - (double)0.1f, bga2.aW);
        this.e = bga2;
        if (bga2 instanceof bdl) {
            this.c = cok.b;
        }
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cD().a() * 10.0;
        if (Double.isNaN(d3)) {
            d3 = 1.0;
        }
        return d2 < (d3 *= 64.0 * cwt.cz()) * d3;
    }

    @Override
    protected void a() {
        this.bE.a(g, (byte)0);
    }

    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -cmk.a(f3 * ((float)Math.PI / 180)) * cmk.b(f2 * ((float)Math.PI / 180));
        float f8 = -cmk.a(f2 * ((float)Math.PI / 180));
        float f9 = cmk.b(f3 * ((float)Math.PI / 180)) * cmk.b(f2 * ((float)Math.PI / 180));
        this.a((double)f7, (double)f8, (double)f9, f5, f6);
        this.aX += cpk2.aX;
        this.aZ += cpk2.aZ;
        if (!cpk2.be) {
            this.aY += cpk2.aY;
        }
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3) {
        float f4 = cmk.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        this.aX = d2 *= (double)f2;
        this.aY = d3 *= (double)f2;
        this.aZ = d4 *= (double)f2;
        float f5 = cmk.a(d2 * d2 + d4 * d4);
        this.ba = (float)(cmk.b(d2, d4) * 57.2957763671875);
        this.bb = (float)(cmk.b(d3, (double)f5) * 57.2957763671875);
        this.bc = this.ba;
        this.bd = this.bb;
        this.m = 0;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.d(d2, d3, d4);
        this.e(f2, f3);
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = cmk.a(d2 * d2 + d4 * d4);
            this.bb = (float)(cmk.b(d3, (double)f2) * 57.2957763671875);
            this.ba = (float)(cmk.b(d2, d4) * 57.2957763671875);
            this.bd = this.bb;
            this.bc = this.ba;
            this.a_(this.aU, this.aV, this.aW, this.ba, this.bb);
            this.m = 0;
        }
    }

    @Override
    public void bb_() {
        cpk cpk2;
        Object object;
        super.bb_();
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
            this.ba = (float)(cmk.b(this.aX, this.aZ) * 57.2957763671875);
            this.bb = (float)(cmk.b(this.aY, (double)f2) * 57.2957763671875);
            this.bc = this.ba;
            this.bd = this.bb;
        }
        cmz cmz2 = new cmz(this.h, this.i, this.j);
        dbk dbk2 = this.aQ.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (dbk2.a() != ahk.a && (object = dbk2.d(this.aQ, cmz2)) != bfa.y && ((cxt)object).a(cmz2).a(new amj(this.aU, this.aV, this.aW))) {
            this.a = true;
        }
        if (this.d > 0) {
            --this.d;
        }
        if (this.a) {
            int n2 = bfa2.e(dbk2);
            if (bfa2 != this.k || n2 != this.l) {
                this.a = false;
                this.aX *= (double)(this.bx.nextFloat() * 0.2f);
                this.aY *= (double)(this.bx.nextFloat() * 0.2f);
                this.aZ *= (double)(this.bx.nextFloat() * 0.2f);
                this.m = 0;
                this.n = 0;
            } else {
                ++this.m;
                if (this.m >= 1200) {
                    this.ak_();
                }
            }
            ++this.b;
            return;
        }
        this.b = 0;
        ++this.n;
        object = new amj(this.aU, this.aV, this.aW);
        amj amj2 = new amj(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
        auu auu2 = this.aQ.a((amj)object, amj2, false, true, false);
        object = new amj(this.aU, this.aV, this.aW);
        amj2 = new amj(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
        if (auu2 != null) {
            amj2 = new amj(auu2.c.b, auu2.c.c, auu2.c.d);
        }
        if ((cpk2 = this.a((amj)object, amj2)) != null) {
            auu2 = new auu(cpk2);
        }
        if (auu2 != null && auu2.d != null && auu2.d instanceof bdl) {
            bdl bdl2 = (bdl)auu2.d;
            if (this.e instanceof bdl && !((bdl)this.e).c(bdl2)) {
                auu2 = null;
            }
        }
        if (auu2 != null) {
            this.a(auu2);
        }
        if (this.B()) {
            for (int i2 = 0; i2 < 4; ++i2) {
                this.aQ.a(lz.j, this.aU + this.aX * (double)i2 / 4.0, this.aV + this.aY * (double)i2 / 4.0, this.aW + this.aZ * (double)i2 / 4.0, -this.aX, -this.aY + 0.2, -this.aZ, new int[0]);
            }
        }
        this.aU += this.aX;
        this.aV += this.aY;
        this.aW += this.aZ;
        float f3 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
        this.ba = (float)(cmk.b(this.aX, this.aZ) * 57.2957763671875);
        this.bb = (float)(cmk.b(this.aY, (double)f3) * 57.2957763671875);
        while (this.bb - this.bd < -180.0f) {
            this.bd -= 360.0f;
        }
        while (this.bb - this.bd >= 180.0f) {
            this.bd += 360.0f;
        }
        while (this.ba - this.bc < -180.0f) {
            this.bc -= 360.0f;
        }
        while (this.ba - this.bc >= 180.0f) {
            this.bc += 360.0f;
        }
        this.bb = this.bd + (this.bb - this.bd) * 0.2f;
        this.ba = this.bc + (this.ba - this.bc) * 0.2f;
        float f4 = 0.99f;
        float f5 = 0.05f;
        if (this.V_()) {
            for (int i3 = 0; i3 < 4; ++i3) {
                float f6 = 0.25f;
                this.aQ.a(lz.e, this.aU - this.aX * 0.25, this.aV - this.aY * 0.25, this.aW - this.aZ * 0.25, this.aX, this.aY, this.aZ, new int[0]);
            }
            f4 = 0.6f;
        }
        if (this.ch()) {
            this.cb();
        }
        this.aX *= (double)f4;
        this.aY *= (double)f4;
        this.aZ *= (double)f4;
        if (!this.cf()) {
            this.aY -= (double)0.05f;
        }
        this.d(this.aU, this.aV, this.aW);
        this.cd();
    }

    protected void a(auu auu2) {
        cpk cpk2 = auu2.d;
        if (cpk2 != null) {
            float f2 = cmk.a(this.aX * this.aX + this.aY * this.aY + this.aZ * this.aZ);
            int n2 = cmk.f((double)f2 * this.o);
            if (this.B()) {
                n2 += this.bx.nextInt(n2 / 2 + 2);
            }
            ahy ahy2 = this.e == null ? ahy.a(this, (cpk)this) : ahy.a(this, this.e);
            if (this.y_() && !(cpk2 instanceof bgv)) {
                cpk2.m(5);
            }
            if (cpk2.a(ahy2, (float)n2)) {
                if (cpk2 instanceof bga) {
                    float f3;
                    bga bga2 = (bga)cpk2;
                    if (!this.aQ.C) {
                        bga2.k(bga2.bp() + 1);
                    }
                    if (this.p > 0 && (f3 = cmk.a(this.aX * this.aX + this.aZ * this.aZ)) > 0.0f) {
                        bga2.c(this.aX * (double)this.p * (double)0.6f / (double)f3, 0.1, this.aZ * (double)this.p * (double)0.6f / (double)f3);
                    }
                    if (this.e instanceof bga) {
                        acz.a(bga2, this.e);
                        acz.b((bga)this.e, (cpk)bga2);
                    }
                    this.b(bga2);
                    if (this.e != null && bga2 != this.e && bga2 instanceof bdl && this.e instanceof czt) {
                        ((czt)this.e).a.a(new avk(6, 0.0f));
                    }
                }
                this.a(dah.t, 1.0f, 1.2f / (this.bx.nextFloat() * 0.2f + 0.9f));
                if (!(cpk2 instanceof bgv)) {
                    this.ak_();
                }
            } else {
                this.aX *= (double)-0.1f;
                this.aY *= (double)-0.1f;
                this.aZ *= (double)-0.1f;
                this.ba += 180.0f;
                this.bc += 180.0f;
                this.n = 0;
                if (!this.aQ.C && this.aX * this.aX + this.aY * this.aY + this.aZ * this.aZ < (double)0.001f) {
                    if (this.c == cok.b) {
                        this.a(this.p(), 0.1f);
                    }
                    this.ak_();
                }
            }
        } else {
            cmz cmz2 = auu2.a();
            this.h = cmz2.a();
            this.i = cmz2.b();
            this.j = cmz2.c();
            dbk dbk2 = this.aQ.n(cmz2);
            this.k = dbk2.t();
            this.l = this.k.e(dbk2);
            this.aX = (float)(auu2.c.b - this.aU);
            this.aY = (float)(auu2.c.c - this.aV);
            this.aZ = (float)(auu2.c.d - this.aW);
            float f4 = cmk.a(this.aX * this.aX + this.aY * this.aY + this.aZ * this.aZ);
            this.aU -= this.aX / (double)f4 * (double)0.05f;
            this.aV -= this.aY / (double)f4 * (double)0.05f;
            this.aW -= this.aZ / (double)f4 * (double)0.05f;
            this.a(dah.t, 1.0f, 1.2f / (this.bx.nextFloat() * 0.2f + 0.9f));
            this.a = true;
            this.d = 7;
            this.d(false);
            if (dbk2.a() != ahk.a) {
                this.k.a(this.aQ, cmz2, dbk2, this);
            }
        }
    }

    protected void b(bga bga2) {
    }

    protected cpk a(amj amj2, amj amj3) {
        cpk cpk2 = null;
        List list = this.aQ.a((cpk)this, this.cD().a(this.aX, this.aY, this.aZ).b(1.0), f);
        double d2 = 0.0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            cxt cxt2;
            auu auu2;
            cpk cpk3 = (cpk)list.get(i2);
            if (cpk3 == this.e && this.n < 5 || (auu2 = (cxt2 = cpk3.cD().b(0.3f)).b(amj2, amj3)) == null || !((d3 = amj2.g(auu2.c)) < d2) && d2 != 0.0) continue;
            cpk2 = cpk3;
            d2 = d3;
        }
        return cpk2;
    }

    public static void a(cgy cgy2, String string) {
    }

    public static void b(cgy cgy2) {
        cwt.a(cgy2, "Arrow");
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("xTile", this.h);
        bvp2.a("yTile", this.i);
        bvp2.a("zTile", this.j);
        bvp2.a("life", (short)this.m);
        bpx bpx2 = (bpx)bfa.v.b(this.k);
        bvp2.a("inTile", bpx2 == null ? "" : bpx2.toString());
        bvp2.a("inData", (byte)this.l);
        bvp2.a("shake", (byte)this.d);
        bvp2.a("inGround", (byte)(this.a ? 1 : 0));
        bvp2.a("pickup", (byte)this.c.ordinal());
        bvp2.a("damage", this.o);
    }

    @Override
    public void b(bvp bvp2) {
        this.h = bvp2.h("xTile");
        this.i = bvp2.h("yTile");
        this.j = bvp2.h("zTile");
        this.m = bvp2.g("life");
        this.k = bvp2.b("inTile", 8) ? bfa.a(bvp2.l("inTile")) : bfa.f(bvp2.f("inTile") & 0xFF);
        this.l = bvp2.f("inData") & 0xFF;
        this.d = bvp2.f("shake") & 0xFF;
        boolean bl2 = this.a = bvp2.f("inGround") == 1;
        if (bvp2.b("damage", 99)) {
            this.o = bvp2.k("damage");
        }
        if (bvp2.b("pickup", 99)) {
            this.c = cok.a(bvp2.f("pickup"));
        } else if (bvp2.b("player", 99)) {
            this.c = bvp2.p("player") ? cok.b : cok.a;
        }
    }

    @Override
    public void b_(bdl bdl2) {
        boolean bl2;
        if (this.aQ.C || !this.a || this.d > 0) {
            return;
        }
        boolean bl3 = bl2 = this.c == cok.b || this.c == cok.c && bdl2.G.d;
        if (this.c == cok.b && !bdl2.n.c(this.p())) {
            bl2 = false;
        }
        if (bl2) {
            this.a(dah.da, 0.2f, ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            bdl2.b(this, 1);
            this.ak_();
        }
    }

    protected abstract bhl p();

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    public int b(float f2) {
        return 0xF000F0;
    }

    public void b(double d2) {
        this.o = d2;
    }

    public double w() {
        return this.o;
    }

    public void c(int n2) {
        this.p = n2;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public float A() {
        return 0.0f;
    }

    public void d(boolean bl2) {
        byte by2 = (Byte)this.bE.a(g);
        if (bl2) {
            this.bE.b(g, (byte)(by2 | 1));
        } else {
            this.bE.b(g, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    public boolean B() {
        byte by2 = (Byte)this.bE.a(g);
        return (by2 & 1) != 0;
    }
}

