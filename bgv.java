/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import com.a.a.d.aad;
import java.util.Set;
import java.util.UUID;

public class bgv
extends acm {
    private static final UUID a = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final cs b = new cs(a, "Attacking speed boost", 0.15f, 0).a(false);
    private static final Set c = aad.e();
    private static final bcz d = bwm.a(bgv.class, cbf.g);
    private static final bcz e = bwm.a(bgv.class, cbf.h);
    private int f;
    private int g;

    public bgv(iu iu2) {
        super(iu2);
        this.a_(0.6f, 2.9f);
        this.bu = 1.0f;
        this.a(cfh.g, -1.0f);
    }

    @Override
    protected void n() {
        this.m.a(0, new baf(this));
        this.m.a(2, new eu(this, 1.0, false));
        this.m.a(7, new vq(this, 1.0));
        this.m.a(8, new chx(this, bdl.class, 8.0f));
        this.m.a(8, new bzv(this));
        this.m.a(10, new aif(this));
        this.m.a(11, new col(this));
        this.n.a(1, new ac(this));
        this.n.a(2, new ahx((cfl)this, false, new Class[0]));
        this.n.a(3, new cyx(this, cjo.class, 10, true, false, new cpf(this)));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(40.0);
        this.a(cgz.d).a(0.3f);
        this.a(cgz.e).a(7.0);
        this.a(cgz.b).a(64.0);
    }

    @Override
    public void b(bga bga2) {
        super.b(bga2);
        cp cp2 = this.a(cgz.d);
        if (bga2 == null) {
            this.g = 0;
            this.bE.b(e, false);
            cp2.c(b);
        } else {
            this.g = this.by;
            this.bE.b(e, true);
            if (!cp2.a(b)) {
                cp2.b(b);
            }
        }
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(d, cg.f());
        this.bE.a(e, false);
    }

    public void T() {
        if (this.by >= this.f + 400) {
            this.f = this.by;
            if (!this.ce()) {
                this.aQ.a(this.aU, this.aV + (double)this.A(), this.aW, dah.ba, this.y(), 2.5f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(bcz bcz2) {
        if (e.equals(bcz2) && this.aM() && this.aQ.C) {
            this.T();
        }
        super.a(bcz2);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Enderman");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        dbk dbk2 = this.aL();
        if (dbk2 != null) {
            bvp2.a("carried", (short)bfa.c(dbk2.t()));
            bvp2.a("carriedData", (short)dbk2.t().e(dbk2));
        }
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        dbk dbk2 = bvp2.b("carried", 8) ? bfa.a(bvp2.l("carried")).a(bvp2.g("carriedData") & 0xFFFF) : bfa.f(bvp2.g("carried")).a(bvp2.g("carriedData") & 0xFFFF);
        if (dbk2 == null || dbk2.t() == null || dbk2.a() == ahk.a) {
            dbk2 = null;
        }
        this.a(dbk2);
    }

    private boolean e(bdl bdl2) {
        bhl bhl2 = bdl2.n.b[3];
        if (bhl2 != null && bhl2.a() == azg.a(blg.aU)) {
            return false;
        }
        amj amj2 = bdl2.l(1.0f).a();
        amj amj3 = new amj(this.aU - bdl2.aU, this.cD().b + (double)this.A() - (bdl2.aV + (double)bdl2.A()), this.aW - bdl2.aW);
        double d2 = amj3.b();
        double d3 = amj2.b(amj3 = amj3.a());
        if (d3 > 1.0 - 0.025 / d2) {
            return bdl2.j(this);
        }
        return false;
    }

    @Override
    public float A() {
        return 2.55f;
    }

    @Override
    public void Q_() {
        if (this.aQ.C) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.aQ.a(lz.y, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm - 0.25, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, (this.bx.nextDouble() - 0.5) * 2.0, -this.bx.nextDouble(), (this.bx.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        }
        this.ax = false;
        super.Q_();
    }

    @Override
    protected void o() {
        float f2;
        if (this.ch()) {
            this.a(ahy.g, 1.0f);
        }
        if (this.aQ.h() && this.by >= this.g + 600 && (f2 = this.a(1.0f)) > 0.5f && this.aQ.g(new cmz(this)) && this.bx.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f) {
            this.b((bga)null);
            this.Z();
        }
        super.o();
    }

    protected boolean Z() {
        double d2 = this.aU + (this.bx.nextDouble() - 0.5) * 64.0;
        double d3 = this.aV + (double)(this.bx.nextInt(64) - 32);
        double d4 = this.aW + (this.bx.nextDouble() - 0.5) * 64.0;
        return this.f(d2, d3, d4);
    }

    protected boolean f(cpk cpk2) {
        amj amj2 = new amj(this.aU - cpk2.aU, this.cD().b + (double)(this.bm / 2.0f) - cpk2.aV + (double)cpk2.A(), this.aW - cpk2.aW);
        amj2 = amj2.a();
        double d2 = 16.0;
        double d3 = this.aU + (this.bx.nextDouble() - 0.5) * 8.0 - amj2.b * 16.0;
        double d4 = this.aV + (double)(this.bx.nextInt(16) - 8) - amj2.c * 16.0;
        double d5 = this.aW + (this.bx.nextDouble() - 0.5) * 8.0 - amj2.d * 16.0;
        return this.f(d3, d4, d5);
    }

    private boolean f(double d2, double d3, double d4) {
        boolean bl2 = this.g(d2, d3, d4);
        if (bl2) {
            this.aQ.a(null, this.aR, this.aS, this.aT, dah.bb, this.y(), 1.0f, 1.0f);
            this.a(dah.bb, 1.0f, 1.0f);
        }
        return bl2;
    }

    @Override
    protected bi q() {
        return this.aM() ? dah.aZ : dah.aW;
    }

    @Override
    protected bi r() {
        return dah.aY;
    }

    @Override
    protected bi s() {
        return dah.aX;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        azg azg2;
        super.b(bl2, n2);
        dbk dbk2 = this.aL();
        if (dbk2 != null && (azg2 = azg.a(dbk2.t())) != null) {
            int n3 = azg2.j() ? dbk2.t().e(dbk2) : 0;
            this.a(new bhl(azg2, 1, n3), 0.0f);
        }
    }

    @Override
    protected bpx u() {
        return bvm.v;
    }

    public void a(dbk dbk2) {
        this.bE.b(d, cg.c(dbk2));
    }

    public dbk aL() {
        return (dbk)((cg)this.bE.a(d)).d();
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (ahy2 instanceof ace) {
            for (int i2 = 0; i2 < 64; ++i2) {
                if (!this.Z()) continue;
                return true;
            }
            return false;
        }
        boolean bl2 = super.a(ahy2, f2);
        if (ahy2.g() && this.bx.nextInt(10) != 0) {
            this.Z();
        }
        return bl2;
    }

    public boolean aM() {
        return (Boolean)this.bE.a(e);
    }

    static /* synthetic */ boolean a(bgv bgv2, bdl bdl2) {
        return bgv2.e(bdl2);
    }

    static /* synthetic */ Set aN() {
        return c;
    }

    static {
        c.add(blg.c);
        c.add(blg.d);
        c.add(blg.m);
        c.add(blg.n);
        c.add(blg.N);
        c.add(blg.O);
        c.add(blg.P);
        c.add(blg.Q);
        c.add(blg.W);
        c.add(blg.aK);
        c.add(blg.aL);
        c.add(blg.aU);
        c.add(blg.bk);
        c.add(blg.bw);
        c.add(blg.aV);
    }
}

