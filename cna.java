/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class cna
extends cxn {
    private static final bcz a = bwm.a(cna.class, cbf.h);
    private static final Set b = aad.a(hp.cb, hp.cc, hp.cV);
    private boolean c;
    private int d;
    private int e;

    public cna(iu iu2) {
        super(iu2);
        this.a_(0.9f, 0.9f);
    }

    @Override
    protected void n() {
        this.m.a(0, new baf(this));
        this.m.a(1, new aro(this, 1.25));
        this.m.a(3, new ky(this, 1.0));
        this.m.a(4, new af((cfl)this, 1.2, hp.ci, false));
        this.m.a(4, new af((cfl)this, 1.2, false, b));
        this.m.a(5, new adk(this, 1.1));
        this.m.a(6, new vq(this, 1.0));
        this.m.a(7, new chx(this, bdl.class, 6.0f));
        this.m.a(8, new bzv(this));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(10.0);
        this.a(cgz.d).a(0.25);
    }

    @Override
    public cpk aj() {
        if (this.cH().isEmpty()) {
            return null;
        }
        return (cpk)this.cH().get(0);
    }

    @Override
    public boolean ad() {
        cpk cpk2 = this.aj();
        if (!(cpk2 instanceof bdl)) {
            return false;
        }
        bdl bdl2 = (bdl)cpk2;
        bhl bhl2 = bdl2.bt();
        if (bhl2 != null && bhl2.a() == hp.ci) {
            return true;
        }
        bhl2 = bdl2.bu();
        return bhl2 != null && bhl2.a() == hp.ci;
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, false);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Pig");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Saddle", this.T());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.d(bvp2.p("Saddle"));
    }

    @Override
    protected bi q() {
        return dah.dV;
    }

    @Override
    protected bi r() {
        return dah.dX;
    }

    @Override
    protected bi s() {
        return dah.dW;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.dZ, 0.15f, 1.0f);
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (!super.a(bdl2, bqp2, bhl2)) {
            if (this.T() && !this.aQ.C && !this.cq()) {
                bdl2.m(this);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        super.b(bl2, n2);
        if (this.T()) {
            this.a(hp.aC, 1);
        }
    }

    @Override
    protected bpx u() {
        return bvm.D;
    }

    public boolean T() {
        return (Boolean)this.bE.a(a);
    }

    public void d(boolean bl2) {
        if (bl2) {
            this.bE.b(a, true);
        } else {
            this.bE.b(a, false);
        }
    }

    @Override
    public void a(tz tz2) {
        if (this.aQ.C || this.bk) {
            return;
        }
        csq csq2 = new csq(this.aQ);
        csq2.a(dfm.a, new bhl(hp.D));
        csq2.a_(this.aU, this.aV, this.aW, this.ba, this.bb);
        csq2.m(this.aI());
        if (this.j_()) {
            csq2.g(this.cA());
            csq2.t(this.cB());
        }
        this.aQ.b(csq2);
        this.ak_();
    }

    @Override
    public void a(float f2, float f3) {
        super.a(f2, f3);
        if (f2 > 5.0f) {
            for (bdl bdl2 : this.b(bdl.class)) {
                bdl2.a((cyd)bpa.u);
            }
        }
    }

    @Override
    public void b(float f2, float f3) {
        cpk cpk2;
        cpk cpk3 = cpk2 = this.cH().isEmpty() ? null : (cpk)this.cH().get(0);
        if (!this.cq() || !this.ad()) {
            this.bu = 0.5f;
            this.al = 0.02f;
            super.b(f2, f3);
            return;
        }
        this.bc = this.ba = cpk2.ba;
        this.bb = cpk2.bb * 0.5f;
        this.e(this.ba, this.bb);
        this.ah = this.ba;
        this.aj = this.ba;
        this.bu = 1.0f;
        this.al = this.G_() * 0.1f;
        if (this.cK()) {
            float f4 = (float)this.a(cgz.d).e() * 0.225f;
            if (this.c) {
                if (this.d++ > this.e) {
                    this.c = false;
                }
                f4 += f4 * 1.15f * cmk.a((float)this.d / (float)this.e * (float)Math.PI);
            }
            this.i(f4);
            super.b(0.0f, 1.0f);
        } else {
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
        }
        this.Z = this.aa;
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f5 = cmk.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        this.aa += (f5 - this.aa) * 0.4f;
        this.ab += this.aa;
    }

    public boolean aP() {
        if (this.c) {
            return false;
        }
        this.c = true;
        this.d = 0;
        this.e = this.aW().nextInt(841) + 140;
        return true;
    }

    public cna a(alf alf2) {
        return new cna(this.aQ);
    }

    @Override
    public boolean a(bhl bhl2) {
        return bhl2 != null && b.contains(bhl2.a());
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }
}

