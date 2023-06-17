/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;

public class dga
extends acm
implements cyt {
    private static final bcz a = bwm.a(dga.class, cbf.b);
    private static final bcz b = bwm.a(dga.class, cbf.b);
    private static final bcz c = bwm.a(dga.class, cbf.b);
    private static final bcz[] d = new bcz[]{a, b, c};
    private static final bcz e = bwm.a(dga.class, cbf.b);
    private final float[] f = new float[2];
    private final float[] g = new float[2];
    private final float[] q = new float[2];
    private final float[] r = new float[2];
    private final int[] s = new int[2];
    private final int[] v = new int[2];
    private int w;
    private final bjy x = (bjy)new bjy(this.v(), jd.f, abo.a).a(true);
    private static final cm y = new cq();

    public dga(iu iu2) {
        super(iu2);
        this.k(this.bo());
        this.a_(0.9f, 3.5f);
        this.bD = true;
        ((vp)this.ap()).c(true);
        this.i = 50;
    }

    @Override
    protected void n() {
        this.m.a(0, new cwi(this));
        this.m.a(1, new baf(this));
        this.m.a(2, new amv(this, 1.0, 40, 20.0f));
        this.m.a(5, new vq(this, 1.0));
        this.m.a(6, new chx(this, bdl.class, 8.0f));
        this.m.a(7, new bzv(this));
        this.n.a(1, new ahx((cfl)this, false, new Class[0]));
        this.n.a(2, new cyx(this, xy.class, 0, false, false, y));
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, 0);
        this.bE.a(b, 0);
        this.bE.a(c, 0);
        this.bE.a(e, 0);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "WitherBoss");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Invul", this.aL());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.g(bvp2.h("Invul"));
    }

    @Override
    protected bi q() {
        return dah.gU;
    }

    @Override
    protected bi r() {
        return dah.gX;
    }

    @Override
    protected bi s() {
        return dah.gW;
    }

    @Override
    public void Q_() {
        int n2;
        int n3;
        double d2;
        double d3;
        double d4;
        cpk cpk2;
        this.aY *= (double)0.6f;
        if (!this.aQ.C && this.h(0) > 0 && (cpk2 = this.aQ.a(this.h(0))) != null) {
            double d5;
            if (this.aV < cpk2.aV || !this.aM() && this.aV < cpk2.aV + 5.0) {
                if (this.aY < 0.0) {
                    this.aY = 0.0;
                }
                this.aY += (0.5 - this.aY) * (double)0.6f;
            }
            if ((d4 = (d5 = cpk2.aU - this.aU) * d5 + (d3 = cpk2.aW - this.aW) * d3) > 9.0) {
                d2 = cmk.a(d4);
                this.aX += (d5 / d2 * 0.5 - this.aX) * (double)0.6f;
                this.aZ += (d3 / d2 * 0.5 - this.aZ) * (double)0.6f;
            }
        }
        if (this.aX * this.aX + this.aZ * this.aZ > (double)0.05f) {
            this.ba = (float)cmk.b(this.aZ, this.aX) * 57.295776f - 90.0f;
        }
        super.Q_();
        for (n3 = 0; n3 < 2; ++n3) {
            this.r[n3] = this.g[n3];
            this.q[n3] = this.f[n3];
        }
        for (n3 = 0; n3 < 2; ++n3) {
            int n4 = this.h(n3 + 1);
            cpk cpk3 = null;
            if (n4 > 0) {
                cpk3 = this.aQ.a(n4);
            }
            if (cpk3 != null) {
                d3 = this.i(n3 + 1);
                d4 = this.j(n3 + 1);
                d2 = this.p(n3 + 1);
                double d6 = cpk3.aU - d3;
                double d7 = cpk3.aV + (double)cpk3.A() - d4;
                double d8 = cpk3.aW - d2;
                double d9 = cmk.a(d6 * d6 + d8 * d8);
                float f2 = (float)(cmk.b(d8, d6) * 57.2957763671875) - 90.0f;
                float f3 = (float)(-(cmk.b(d7, d9) * 57.2957763671875));
                this.f[n3] = this.a(this.f[n3], f3, 40.0f);
                this.g[n3] = this.a(this.g[n3], f2, 10.0f);
                continue;
            }
            this.g[n3] = this.a(this.g[n3], this.ah, 10.0f);
        }
        n3 = this.aM() ? 1 : 0;
        for (n2 = 0; n2 < 3; ++n2) {
            double d10 = this.i(n2);
            double d11 = this.j(n2);
            double d12 = this.p(n2);
            this.aQ.a(lz.l, d10 + this.bx.nextGaussian() * (double)0.3f, d11 + this.bx.nextGaussian() * (double)0.3f, d12 + this.bx.nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0, new int[0]);
            if (n3 == 0 || this.aQ.p.nextInt(4) != 0) continue;
            this.aQ.a(lz.p, d10 + this.bx.nextGaussian() * (double)0.3f, d11 + this.bx.nextGaussian() * (double)0.3f, d12 + this.bx.nextGaussian() * (double)0.3f, (double)0.7f, (double)0.7f, 0.5, new int[0]);
        }
        if (this.aL() > 0) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.aQ.a(lz.p, this.aU + this.bx.nextGaussian(), this.aV + (double)(this.bx.nextFloat() * 3.3f), this.aW + this.bx.nextGaussian(), (double)0.7f, (double)0.7f, (double)0.9f, new int[0]);
            }
        }
    }

    @Override
    protected void o() {
        int n2;
        int n3;
        if (this.aL() > 0) {
            int n4 = this.aL() - 1;
            if (n4 <= 0) {
                this.aQ.a(this, this.aU, this.aV + (double)this.A(), this.aW, 7.0f, false, this.aQ.F().b("mobGriefing"));
                this.aQ.a(1023, new cmz(this), 0);
            }
            this.g(n4);
            if (this.by % 10 == 0) {
                this.b_(10.0f);
            }
            return;
        }
        super.o();
        block0: for (n3 = 1; n3 < 3; ++n3) {
            Object object;
            if (this.by < this.s[n3 - 1]) continue;
            this.s[n3 - 1] = this.by + 10 + this.bx.nextInt(10);
            if (this.aQ.Q() == ct.c || this.aQ.Q() == ct.d) {
                int n5 = n3 - 1;
                int n6 = this.v[n5];
                this.v[n5] = n6 + 1;
                if (n6 > 15) {
                    float f2 = 10.0f;
                    float f3 = 5.0f;
                    double d2 = cmk.a(this.bx, this.aU - 10.0, this.aU + 10.0);
                    double d3 = cmk.a(this.bx, this.aV - 5.0, this.aV + 5.0);
                    double d4 = cmk.a(this.bx, this.aW - 10.0, this.aW + 10.0);
                    this.a(n3 + 1, d2, d3, d4, true);
                    this.v[n3 - 1] = 0;
                }
            }
            if ((n2 = this.h(n3)) > 0) {
                object = this.aQ.a(n2);
                if (object == null || !((cpk)object).bj() || this.l((cpk)object) > 900.0 || !this.j((cpk)object)) {
                    this.a(n3, 0);
                    continue;
                }
                if (object instanceof bdl && ((bdl)object).G.a) {
                    this.a(n3, 0);
                    continue;
                }
                this.a(n3 + 1, (bga)object);
                this.s[n3 - 1] = this.by + 40 + this.bx.nextInt(20);
                this.v[n3 - 1] = 0;
                continue;
            }
            object = this.aQ.a(bga.class, this.cD().b(20.0, 8.0, 20.0), cn.a(y, auxx.e));
            for (int i2 = 0; i2 < 10 && !object.isEmpty(); ++i2) {
                bga bga2 = (bga)object.get(this.bx.nextInt(object.size()));
                if (bga2 != this && bga2.bj() && this.j(bga2)) {
                    if (bga2 instanceof bdl) {
                        if (((bdl)bga2).G.a) continue block0;
                        this.a(n3, bga2.bW());
                        continue block0;
                    }
                    this.a(n3, bga2.bW());
                    continue block0;
                }
                object.remove(bga2);
            }
        }
        if (this.ar() != null) {
            this.a(0, this.ar().bW());
        } else {
            this.a(0, 0);
        }
        if (this.w > 0) {
            --this.w;
            if (this.w == 0 && this.aQ.F().b("mobGriefing")) {
                n3 = cmk.c(this.aV);
                n2 = cmk.c(this.aU);
                int n7 = cmk.c(this.aW);
                boolean bl2 = false;
                for (int i3 = -1; i3 <= 1; ++i3) {
                    for (int i4 = -1; i4 <= 1; ++i4) {
                        for (int i5 = 0; i5 <= 3; ++i5) {
                            int n8 = n2 + i3;
                            int n9 = n3 + i5;
                            int n10 = n7 + i4;
                            cmz cmz2 = new cmz(n8, n9, n10);
                            dbk dbk2 = this.aQ.n(cmz2);
                            bfa bfa2 = dbk2.t();
                            if (dbk2.a() == ahk.a || !dga.a(bfa2)) continue;
                            bl2 = this.aQ.b(cmz2, true) || bl2;
                        }
                    }
                }
                if (bl2) {
                    this.aQ.a(null, 1022, new cmz(this), 0);
                }
            }
        }
        if (this.by % 20 == 0) {
            this.b_(1.0f);
        }
        this.x.a(this.bh() / this.bo());
    }

    public static boolean a(bfa bfa2) {
        return bfa2 != blg.h && bfa2 != blg.bF && bfa2 != blg.bG && bfa2 != blg.bX && bfa2 != blg.dc && bfa2 != blg.dd && bfa2 != blg.cv;
    }

    public void T() {
        this.g(220);
        this.k(this.bo() / 3.0f);
    }

    @Override
    public void X_() {
    }

    @Override
    public void b(czt czt2) {
        super.b(czt2);
        this.x.a(czt2);
    }

    @Override
    public void c(czt czt2) {
        super.c(czt2);
        this.x.b(czt2);
    }

    private double i(int n2) {
        if (n2 <= 0) {
            return this.aU;
        }
        float f2 = (this.ah + (float)(180 * (n2 - 1))) * ((float)Math.PI / 180);
        float f3 = cmk.b(f2);
        return this.aU + (double)f3 * 1.3;
    }

    private double j(int n2) {
        if (n2 <= 0) {
            return this.aV + 3.0;
        }
        return this.aV + 2.2;
    }

    private double p(int n2) {
        if (n2 <= 0) {
            return this.aW;
        }
        float f2 = (this.ah + (float)(180 * (n2 - 1))) * ((float)Math.PI / 180);
        float f3 = cmk.a(f2);
        return this.aW + (double)f3 * 1.3;
    }

    private float a(float f2, float f3, float f4) {
        float f5 = cmk.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    private void a(int n2, bga bga2) {
        this.a(n2, bga2.aU, bga2.aV + (double)bga2.A() * 0.5, bga2.aW, n2 == 0 && this.bx.nextFloat() < 0.001f);
    }

    private void a(int n2, double d2, double d3, double d4, boolean bl2) {
        this.aQ.a(null, 1024, new cmz(this), 0);
        double d5 = this.i(n2);
        double d6 = this.j(n2);
        double d7 = this.p(n2);
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        nm nm2 = new nm(this.aQ, this, d8, d9, d10);
        if (bl2) {
            nm2.a(true);
        }
        nm2.aV = d6;
        nm2.aU = d5;
        nm2.aW = d7;
        this.aQ.b(nm2);
    }

    @Override
    public void a(bga bga2, float f2) {
        this.a(0, bga2);
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        cpk cpk2;
        if (this.c(ahy2)) {
            return false;
        }
        if (ahy2 == ahy.g || ahy2.b() instanceof dga) {
            return false;
        }
        if (this.aL() > 0 && ahy2 != ahy.l) {
            return false;
        }
        if (this.aM() && (cpk2 = ahy2.a()) instanceof cwt) {
            return false;
        }
        cpk2 = ahy2.b();
        if (cpk2 != null && !(cpk2 instanceof bdl) && cpk2 instanceof bga && ((bga)cpk2).ak() == this.ak()) {
            return false;
        }
        if (this.w <= 0) {
            this.w = 20;
        }
        int n2 = 0;
        while (n2 < this.v.length) {
            int n3 = n2++;
            this.v[n3] = this.v[n3] + 3;
        }
        return super.a(ahy2, f2);
    }

    @Override
    protected void a(boolean bl2, int n2) {
        er er2 = this.a(hp.cj, 1);
        if (er2 != null) {
            er2.p();
        }
        if (!this.aQ.C) {
            for (bdl bdl2 : this.aQ.a(bdl.class, this.cD().b(50.0, 100.0, 50.0))) {
                bdl2.a((cyd)bpa.J);
            }
        }
    }

    @Override
    protected void av() {
        this.ap = 0;
    }

    @Override
    public int b(float f2) {
        return 0xF000F0;
    }

    @Override
    public void a(float f2, float f3) {
    }

    @Override
    public void b(cko cko2) {
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(300.0);
        this.a(cgz.d).a(0.6f);
        this.a(cgz.b).a(40.0);
        this.a(cgz.g).a(4.0);
    }

    public float d(int n2) {
        return this.g[n2];
    }

    public float f(int n2) {
        return this.f[n2];
    }

    public int aL() {
        return (Integer)this.bE.a(e);
    }

    public void g(int n2) {
        this.bE.b(e, n2);
    }

    public int h(int n2) {
        return (Integer)this.bE.a(d[n2]);
    }

    public void a(int n2, int n3) {
        this.bE.b(d[n2], n3);
    }

    public boolean aM() {
        return this.bh() <= this.bo() / 2.0f;
    }

    @Override
    public agh ak() {
        return agh.b;
    }

    @Override
    protected boolean f_(cpk cpk2) {
        return false;
    }

    @Override
    public boolean aB_() {
        return false;
    }
}

