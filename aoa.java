/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class aoa
extends crm
implements cso {
    private static final UUID d = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
    private static final cs e = new cs(d, "Covered armor bonus", 20.0, 0).a(false);
    protected static final bcz a = bwm.a(aoa.class, cbf.l);
    protected static final bcz b = bwm.a(aoa.class, cbf.k);
    protected static final bcz c = bwm.a(aoa.class, cbf.a);
    private float f;
    private float g;
    private cmz q;
    private int r;

    public aoa(iu iu2) {
        super(iu2);
        this.a_(1.0f, 1.0f);
        this.ai = 180.0f;
        this.ah = 180.0f;
        this.bD = true;
        this.q = null;
        this.i = 5;
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        this.ah = 180.0f;
        this.ai = 180.0f;
        this.ba = 180.0f;
        this.bc = 180.0f;
        this.aj = 180.0f;
        this.ak = 180.0f;
        return super.a(bgp2, aql2);
    }

    @Override
    protected void n() {
        this.m.a(1, new chx(this, bdl.class, 8.0f));
        this.m.a(4, new mj(this));
        this.m.a(7, new cyr(this, null));
        this.m.a(8, new bzv(this));
        this.n.a(1, new ahx((cfl)this, true, new Class[0]));
        this.n.a(2, new biq(this, this));
        this.n.a(3, new bbq(this));
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    public csg y() {
        return csg.f;
    }

    @Override
    protected bi q() {
        return dah.ff;
    }

    @Override
    public void as() {
        if (!this.aL()) {
            super.as();
        }
    }

    @Override
    protected bi s() {
        return dah.fj;
    }

    @Override
    protected bi r() {
        if (this.aL()) {
            return dah.fl;
        }
        return dah.fk;
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, bqk.a);
        this.bE.a(b, cg.f());
        this.bE.a(c, (byte)0);
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(30.0);
    }

    @Override
    protected cje al() {
        return new ayg(this, this);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Shulker");
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.bE.b(a, bqk.a(bvp2.f("AttachFace")));
        this.bE.b(c, bvp2.f("Peek"));
        if (bvp2.e("APX")) {
            int n2 = bvp2.h("APX");
            int n3 = bvp2.h("APY");
            int n4 = bvp2.h("APZ");
            this.bE.b(b, cg.b(new cmz(n2, n3, n4)));
        } else {
            this.bE.b(b, cg.f());
        }
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("AttachFace", (byte)((bqk)this.bE.a(a)).b());
        bvp2.a("Peek", (Byte)this.bE.a(c));
        cmz cmz2 = this.Q();
        if (cmz2 != null) {
            bvp2.a("APX", cmz2.a());
            bvp2.a("APY", cmz2.b());
            bvp2.a("APZ", cmz2.c());
        }
    }

    @Override
    public void bb_() {
        float f2;
        super.bb_();
        cmz cmz2 = (cmz)((cg)this.bE.a(b)).d();
        if (cmz2 == null && !this.aQ.C) {
            cmz2 = new cmz(this);
            this.bE.b(b, cg.b(cmz2));
        }
        if (this.cp()) {
            cmz2 = null;
            this.ba = f2 = this.cL().ba;
            this.ah = f2;
            this.ai = f2;
            this.r = 0;
        } else if (!this.aQ.C) {
            cmz cmz3;
            Object object;
            dbk dbk2 = this.aQ.n(cmz2);
            if (dbk2.a() != ahk.a) {
                if (dbk2.t() == blg.M) {
                    object = (bqk)((Object)dbk2.b(ath.o));
                    cmz2 = cmz2.c((bqk)object);
                    this.bE.b(b, cg.b(cmz2));
                } else if (dbk2.t() == blg.K) {
                    object = (bqk)((Object)dbk2.b(ln.o));
                    cmz2 = cmz2.c((bqk)object);
                    this.bE.b(b, cg.b(cmz2));
                } else {
                    this.D();
                }
            }
            if (!this.aQ.d((cmz)(object = cmz2.c(this.M())), false)) {
                boolean bl2 = false;
                for (bqk bqk2 : bqk.values()) {
                    object = cmz2.c(bqk2);
                    if (!this.aQ.d((cmz)object, false)) continue;
                    this.bE.b(a, bqk2);
                    bl2 = true;
                    break;
                }
                if (!bl2) {
                    this.D();
                }
            }
            if (this.aQ.d(cmz3 = cmz2.c(this.M().e()), false)) {
                this.D();
            }
        }
        f2 = (float)this.T() * 0.01f;
        this.f = this.g;
        if (this.g > f2) {
            this.g = cmk.a(this.g - 0.05f, f2, 1.0f);
        } else if (this.g < f2) {
            this.g = cmk.a(this.g + 0.05f, 0.0f, f2);
        }
        if (cmz2 != null) {
            List list;
            if (this.aQ.C) {
                if (this.r > 0 && this.q != null) {
                    --this.r;
                } else {
                    this.q = cmz2;
                }
            }
            this.aU = (double)cmz2.a() + 0.5;
            this.aV = cmz2.b();
            this.aW = (double)cmz2.c() + 0.5;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            this.br = this.aU;
            this.bs = this.aV;
            this.bt = this.aW;
            double d2 = 0.5 - (double)cmk.a((0.5f + this.g) * (float)Math.PI) * 0.5;
            double d3 = 0.5 - (double)cmk.a((0.5f + this.f) * (float)Math.PI) * 0.5;
            double d4 = d2 - d3;
            double d5 = 0.0;
            double d6 = 0.0;
            double d7 = 0.0;
            bqk bqk3 = this.M();
            switch (bqk3) {
                case a: {
                    this.a(new cxt(this.aU - 0.5, this.aV, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0 + d2, this.aW + 0.5));
                    d6 = d4;
                    break;
                }
                case b: {
                    this.a(new cxt(this.aU - 0.5, this.aV - d2, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5));
                    d6 = -d4;
                    break;
                }
                case c: {
                    this.a(new cxt(this.aU - 0.5, this.aV, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5 + d2));
                    d7 = d4;
                    break;
                }
                case d: {
                    this.a(new cxt(this.aU - 0.5, this.aV, this.aW - 0.5 - d2, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5));
                    d7 = -d4;
                    break;
                }
                case e: {
                    this.a(new cxt(this.aU - 0.5, this.aV, this.aW - 0.5, this.aU + 0.5 + d2, this.aV + 1.0, this.aW + 0.5));
                    d5 = d4;
                    break;
                }
                case f: {
                    this.a(new cxt(this.aU - 0.5 - d2, this.aV, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5));
                    d5 = -d4;
                }
            }
            if (d4 > 0.0 && !(list = this.aQ.b((cpk)this, this.cD())).isEmpty()) {
                for (cpk cpk2 : list) {
                    if (cpk2 instanceof aoa || cpk2.bv) continue;
                    cpk2.b(d5, d6, d7);
                }
            }
        }
    }

    @Override
    public void d(double d2, double d3, double d4) {
        super.d(d2, d3, d4);
        if (this.bE == null || this.by == 0) {
            return;
        }
        cg cg2 = (cg)this.bE.a(b);
        cg cg3 = cg.b(new cmz(d2, d3, d4));
        if (!cg3.equals(cg2)) {
            this.bE.b(b, cg3);
            this.bE.b(c, (byte)0);
            this.bO = true;
        }
    }

    protected boolean D() {
        if (this.aI() || !this.bj()) {
            return true;
        }
        cmz cmz2 = new cmz(this);
        for (int i2 = 0; i2 < 5; ++i2) {
            cmz cmz3 = cmz2.e(8 - this.bx.nextInt(17), 8 - this.bx.nextInt(17), 8 - this.bx.nextInt(17));
            if (cmz3.b() <= 0 || !this.aQ.c(cmz3) || !this.aQ.a(this.aQ.U(), (cpk)this) || !this.aQ.a((cpk)this, new cxt(cmz3)).isEmpty()) continue;
            boolean bl2 = false;
            for (bqk bqk2 : bqk.values()) {
                if (!this.aQ.d(cmz3.c(bqk2), false)) continue;
                this.bE.b(a, bqk2);
                bl2 = true;
                break;
            }
            if (!bl2) continue;
            this.a(dah.fo, 1.0f, 1.0f);
            this.bE.b(b, cg.b(cmz3));
            this.bE.b(c, (byte)0);
            this.b((bga)null);
            return true;
        }
        return false;
    }

    @Override
    public void Q_() {
        super.Q_();
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.ai = 180.0f;
        this.ah = 180.0f;
        this.ba = 180.0f;
    }

    @Override
    public void a(bcz bcz2) {
        cmz cmz2;
        if (b.equals(bcz2) && this.aQ.C && !this.cp() && (cmz2 = this.Q()) != null) {
            if (this.q == null) {
                this.q = cmz2;
            } else {
                this.r = 6;
            }
            this.aU = (double)cmz2.a() + 0.5;
            this.aV = cmz2.b();
            this.aW = (double)cmz2.c() + 0.5;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            this.br = this.aU;
            this.bs = this.aV;
            this.bt = this.aW;
        }
        super.a(bcz2);
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.aB = 0;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        cpk cpk2;
        if (this.aL() && (cpk2 = ahy2.a()) instanceof cwt) {
            return false;
        }
        if (super.a(ahy2, f2)) {
            if ((double)this.bh() < (double)this.bo() * 0.5 && this.bx.nextInt(4) == 0) {
                this.D();
            }
            return true;
        }
        return false;
    }

    private boolean aL() {
        return this.T() == 0;
    }

    @Override
    public cxt ao_() {
        return this.bj() ? this.cD() : null;
    }

    public bqk M() {
        return (bqk)this.bE.a(a);
    }

    public cmz Q() {
        return (cmz)((cg)this.bE.a(b)).d();
    }

    public void b(cmz cmz2) {
        this.bE.b(b, cg.c(cmz2));
    }

    public int T() {
        return ((Byte)this.bE.a(c)).byteValue();
    }

    public void d(int n2) {
        if (!this.aQ.C) {
            this.a(cgz.g).c(e);
            if (n2 == 0) {
                this.a(cgz.g).b(e);
                this.a(dah.fi, 1.0f, 1.0f);
            } else {
                this.a(dah.fm, 1.0f, 1.0f);
            }
        }
        this.bE.b(c, (byte)n2);
    }

    public float d(float f2) {
        return this.f + (this.g - this.f) * f2;
    }

    public int Y() {
        return this.r;
    }

    public cmz Z() {
        return this.q;
    }

    @Override
    public float A() {
        return 0.5f;
    }

    @Override
    public int aw() {
        return 180;
    }

    @Override
    public int ax() {
        return 180;
    }

    @Override
    public void e_(cpk cpk2) {
    }

    @Override
    public float ap_() {
        return 0.0f;
    }

    public boolean ae() {
        return this.q != null && this.Q() != null;
    }

    @Override
    protected bpx u() {
        return bvm.y;
    }

    static /* synthetic */ Random a(aoa aoa2) {
        return aoa2.bx;
    }

    static /* synthetic */ Random b(aoa aoa2) {
        return aoa2.bx;
    }

    static /* synthetic */ Random c(aoa aoa2) {
        return aoa2.bx;
    }

    static /* synthetic */ Random d(aoa aoa2) {
        return aoa2.bx;
    }

    static /* synthetic */ Random e(aoa aoa2) {
        return aoa2.bx;
    }
}

