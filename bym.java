/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bym
extends acm {
    private static final bcz a = bwm.a(bym.class, cbf.a);
    private static final bcz b = bwm.a(bym.class, cbf.b);
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private bga q;
    private int r;
    private boolean s;
    private vq v;

    public bym(iu iu2) {
        super(iu2);
        this.i = 10;
        this.a_(0.85f, 0.85f);
        this.j = new awy(this);
        this.d = this.c = this.bx.nextFloat();
    }

    @Override
    protected void n() {
        byi byi2 = new byi(this, 1.0);
        this.v = new vq(this, 1.0, 80);
        this.m.a(4, new bwx(this));
        this.m.a(5, byi2);
        this.m.a(7, this.v);
        this.m.a(8, new chx(this, bdl.class, 8.0f));
        this.m.a(8, new chx(this, bym.class, 12.0f, 0.01f));
        this.m.a(9, new bzv(this));
        this.v.a(3);
        byi2.a(3);
        this.n.a(1, new cyx(this, bga.class, 10, true, false, new fa(this)));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.e).a(6.0);
        this.a(cgz.d).a(0.5);
        this.a(cgz.b).a(16.0);
        this.a(cgz.a).a(30.0);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Guardian");
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.d(bvp2.p("Elder"));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Elder", this.aM());
    }

    @Override
    protected dct a(iu iu2) {
        return new qz(this, iu2);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
        this.bE.a(b, 0);
    }

    private boolean d(int n2) {
        return ((Byte)this.bE.a(a) & n2) != 0;
    }

    private void a(int n2, boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | n2));
        } else {
            this.bE.b(a, (byte)(by2 & ~n2));
        }
    }

    public boolean T() {
        return this.d(2);
    }

    private void e(boolean bl2) {
        this.a(2, bl2);
    }

    public int aL() {
        if (this.aM()) {
            return 60;
        }
        return 80;
    }

    public boolean aM() {
        return this.d(4);
    }

    public void d(boolean bl2) {
        this.a(4, bl2);
        if (bl2) {
            this.a_(1.9975f, 1.9975f);
            this.a(cgz.d).a(0.3f);
            this.a(cgz.e).a(8.0);
            this.a(cgz.a).a(80.0);
            this.aC();
            if (this.v != null) {
                this.v.b(400);
            }
        }
    }

    public void aP() {
        this.d(true);
        this.g = this.f = 1.0f;
    }

    private void f(int n2) {
        this.bE.b(b, n2);
    }

    public boolean aQ() {
        return (Integer)this.bE.a(b) != 0;
    }

    public bga aR() {
        if (!this.aQ()) {
            return null;
        }
        if (this.aQ.C) {
            if (this.q != null) {
                return this.q;
            }
            cpk cpk2 = this.aQ.a((Integer)this.bE.a(b));
            if (cpk2 instanceof bga) {
                this.q = (bga)cpk2;
                return this.q;
            }
            return null;
        }
        return this.ar();
    }

    @Override
    public void a(bcz bcz2) {
        super.a(bcz2);
        if (a.equals(bcz2)) {
            if (this.aM() && this.bl < 1.0f) {
                this.a_(1.9975f, 1.9975f);
            }
        } else if (b.equals(bcz2)) {
            this.r = 0;
            this.q = null;
        }
    }

    @Override
    public int j() {
        return 160;
    }

    @Override
    protected bi q() {
        if (this.aM()) {
            return this.V_() ? dah.aD : dah.aE;
        }
        return this.V_() ? dah.cg : dah.ch;
    }

    @Override
    protected bi r() {
        if (this.aM()) {
            return this.V_() ? dah.aI : dah.aJ;
        }
        return this.V_() ? dah.cm : dah.cn;
    }

    @Override
    protected bi s() {
        if (this.aM()) {
            return this.V_() ? dah.aG : dah.aH;
        }
        return this.V_() ? dah.cj : dah.ck;
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    public float A() {
        return this.bm * 0.5f;
    }

    @Override
    public float a(cmz cmz2) {
        if (this.aQ.n(cmz2).a() == ahk.h) {
            return 10.0f + this.aQ.m(cmz2) - 0.5f;
        }
        return super.a(cmz2);
    }

    @Override
    public void Q_() {
        if (this.aQ.C) {
            Object object;
            this.d = this.c;
            if (!this.V_()) {
                this.e = 2.0f;
                if (this.aY > 0.0 && this.s && !this.ce()) {
                    this.aQ.a(this.aU, this.aV, this.aW, dah.cl, this.y(), 1.0f, 1.0f, false);
                }
                this.s = this.aY < 0.0 && this.aQ.d(new cmz(this).h(), false);
            } else {
                this.e = this.T() ? (this.e < 0.5f ? 4.0f : (this.e += (0.5f - this.e) * 0.1f)) : (this.e += (0.125f - this.e) * 0.2f);
            }
            this.c += this.e;
            this.g = this.f;
            this.f = !this.V_() ? this.bx.nextFloat() : (this.T() ? (this.f += (0.0f - this.f) * 0.25f) : (this.f += (1.0f - this.f) * 0.06f));
            if (this.T() && this.V_()) {
                object = this.l(0.0f);
                for (int i2 = 0; i2 < 2; ++i2) {
                    this.aQ.a(lz.e, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl - ((amj)object).b * 1.5, this.aV + this.bx.nextDouble() * (double)this.bm - ((amj)object).c * 1.5, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl - ((amj)object).d * 1.5, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (this.aQ()) {
                if (this.r < this.aL()) {
                    ++this.r;
                }
                if ((object = this.aR()) != null) {
                    this.am().a((cpk)object, 90.0f, 90.0f);
                    this.am().a();
                    double d2 = this.p(0.0f);
                    double d3 = ((bga)object).aU - this.aU;
                    double d4 = ((bga)object).aV + (double)(((bga)object).bm * 0.5f) - (this.aV + (double)this.A());
                    double d5 = ((bga)object).aW - this.aW;
                    double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                    d3 /= d6;
                    d4 /= d6;
                    d5 /= d6;
                    double d7 = this.bx.nextDouble();
                    while (d7 < d6) {
                        this.aQ.a(lz.e, this.aU + d3 * (d7 += 1.8 - d2 + this.bx.nextDouble() * (1.7 - d2)), this.aV + d4 * d7 + (double)this.A(), this.aW + d5 * d7, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
            }
        }
        if (this.bA) {
            this.o(300);
        } else if (this.be) {
            this.aY += 0.5;
            this.aX += (double)((this.bx.nextFloat() * 2.0f - 1.0f) * 0.4f);
            this.aZ += (double)((this.bx.nextFloat() * 2.0f - 1.0f) * 0.4f);
            this.ba = this.bx.nextFloat() * 360.0f;
            this.be = false;
            this.bO = true;
        }
        if (this.aQ()) {
            this.ba = this.aj;
        }
        super.Q_();
    }

    public float d(float f2) {
        return this.d + (this.c - this.d) * f2;
    }

    public float j(float f2) {
        return this.g + (this.f - this.g) * f2;
    }

    public float p(float f2) {
        return ((float)this.r + f2) / (float)this.aL();
    }

    @Override
    protected void o() {
        super.o();
        if (this.aM()) {
            int n2 = 1200;
            int n3 = 1200;
            int n4 = 6000;
            int n5 = 2;
            if ((this.by + this.bW()) % 1200 == 0) {
                bfv bfv2 = ake.d;
                List list = this.aQ.b(czt.class, new byw(this));
                for (czt czt2 : list) {
                    if (czt2.b(bfv2) && czt2.c(bfv2).c() >= 2 && czt2.c(bfv2).b() >= 1200) continue;
                    czt2.a.a(new avk(10, 0.0f));
                    czt2.b(new cko(bfv2, 6000, 2));
                }
            }
            if (!this.bP()) {
                this.a(new cmz(this), 16);
            }
        }
    }

    @Override
    protected bpx u() {
        return this.aM() ? bvm.x : bvm.w;
    }

    @Override
    protected boolean aC_() {
        return true;
    }

    @Override
    public boolean i() {
        return this.aQ.a(this.cD(), (cpk)this) && this.aQ.a((cpk)this, this.cD()).isEmpty();
    }

    @Override
    public boolean h() {
        return (this.bx.nextInt(20) == 0 || !this.aQ.h(new cmz(this))) && super.h();
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (!this.T() && !ahy2.s() && ahy2.a() instanceof bga) {
            bga bga2 = (bga)ahy2.a();
            if (!ahy2.e()) {
                bga2.a(ahy.a(this), 2.0f);
            }
        }
        if (this.v != null) {
            this.v.f();
        }
        return super.a(ahy2, f2);
    }

    @Override
    public int aw() {
        return 180;
    }

    @Override
    public void b(float f2, float f3) {
        if (this.T_()) {
            if (this.V_()) {
                this.b(f2, f3, 0.1f);
                this.b(this.aX, this.aY, this.aZ);
                this.aX *= (double)0.9f;
                this.aY *= (double)0.9f;
                this.aZ *= (double)0.9f;
                if (!this.T() && this.ar() == null) {
                    this.aY -= 0.005;
                }
            } else {
                super.b(f2, f3);
            }
        } else {
            super.b(f2, f3);
        }
    }

    static /* synthetic */ void a(bym bym2, int n2) {
        bym2.f(n2);
    }

    static /* synthetic */ vq a(bym bym2) {
        return bym2.v;
    }

    static /* synthetic */ void a(bym bym2, boolean bl2) {
        bym2.e(bl2);
    }
}

