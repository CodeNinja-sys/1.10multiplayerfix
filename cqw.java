/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class cqw
extends nb {
    private static final bcz d = bwm.a(cqw.class, cbf.c);
    private static final bcz e = bwm.a(cqw.class, cbf.h);
    private static final bcz f = bwm.a(cqw.class, cbf.b);
    private float g;
    private float w;
    private boolean x;
    private boolean y;
    private float z;
    private float A;

    public cqw(iu iu2) {
        super(iu2);
        this.a_(0.6f, 0.85f);
        this.a(false);
    }

    @Override
    protected void n() {
        this.c = new awa(this);
        this.m.a(1, new baf(this));
        this.m.a(2, this.c);
        this.m.a(3, new cye(this, 0.4f));
        this.m.a(4, new eu(this, 1.0, true));
        this.m.a(5, new bpy(this, 1.0, 10.0f, 2.0f));
        this.m.a(6, new ky(this, 1.0));
        this.m.a(7, new vq(this, 1.0));
        this.m.a(8, new cdx(this, 8.0f));
        this.m.a(9, new chx(this, bdl.class, 8.0f));
        this.m.a(9, new bzv(this));
        this.n.a(1, new dem(this));
        this.n.a(2, new btf(this));
        this.n.a(3, new ahx((cfl)this, true, new Class[0]));
        this.n.a(4, new cuu(this, cxn.class, false, new ctx(this)));
        this.n.a(5, new cyx((cfl)this, azy.class, false));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.d).a(0.3f);
        if (this.B()) {
            this.a(cgz.a).a(20.0);
        } else {
            this.a(cgz.a).a(8.0);
        }
        this.bs().b(cgz.e).a(2.0);
    }

    @Override
    public void b(bga bga2) {
        super.b(bga2);
        if (bga2 == null) {
            this.d(false);
        } else if (!this.B()) {
            this.d(true);
        }
    }

    @Override
    protected void o() {
        this.bE.b(d, Float.valueOf(this.bh()));
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(d, Float.valueOf(this.bh()));
        this.bE.a(e, false);
        this.bE.a(f, dck.o.c());
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.hl, 0.15f, 1.0f);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Wolf");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Angry", this.aQ());
        bvp2.a("CollarColor", (byte)this.aR().c());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.d(bvp2.p("Angry"));
        if (bvp2.b("CollarColor", 99)) {
            this.a(dck.a(bvp2.f("CollarColor")));
        }
    }

    @Override
    protected bi q() {
        if (this.aQ()) {
            return dah.hg;
        }
        if (this.bx.nextInt(3) == 0) {
            if (this.B() && ((Float)this.bE.a(d)).floatValue() < 10.0f) {
                return dah.hm;
            }
            return dah.hj;
        }
        return dah.he;
    }

    @Override
    protected bi r() {
        return dah.hi;
    }

    @Override
    protected bi s() {
        return dah.hf;
    }

    @Override
    protected float t() {
        return 0.4f;
    }

    @Override
    protected bpx u() {
        return bvm.K;
    }

    @Override
    public void Q_() {
        super.Q_();
        if (!this.aQ.C && this.x && !this.y && !this.aS() && this.be) {
            this.y = true;
            this.z = 0.0f;
            this.A = 0.0f;
            this.aQ.a((cpk)this, (byte)8);
        }
        if (!this.aQ.C && this.ar() == null && this.aQ()) {
            this.d(false);
        }
    }

    @Override
    public void bb_() {
        super.bb_();
        this.w = this.g;
        this.g = this.bQ() ? (this.g += (1.0f - this.g) * 0.4f) : (this.g += (0.0f - this.g) * 0.4f);
        if (this.ch()) {
            this.x = true;
            this.y = false;
            this.z = 0.0f;
            this.A = 0.0f;
        } else if ((this.x || this.y) && this.y) {
            if (this.z == 0.0f) {
                this.a(dah.hk, this.t(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
            this.A = this.z;
            this.z += 0.05f;
            if (this.A >= 2.0f) {
                this.x = false;
                this.y = false;
                this.A = 0.0f;
                this.z = 0.0f;
            }
            if (this.z > 0.4f) {
                float f2 = (float)this.cD().b;
                int n2 = (int)(cmk.a((this.z - 0.4f) * (float)Math.PI) * 7.0f);
                for (int i2 = 0; i2 < n2; ++i2) {
                    float f3 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl * 0.5f;
                    float f4 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl * 0.5f;
                    this.aQ.a(lz.f, this.aU + (double)f3, (double)(f2 + 0.8f), this.aW + (double)f4, this.aX, this.aY, this.aZ, new int[0]);
                }
            }
        }
    }

    public boolean T() {
        return this.x;
    }

    public float d(float f2) {
        return 0.75f + (this.A + (this.z - this.A) * f2) / 2.0f * 0.25f;
    }

    public float h(float f2, float f3) {
        float f4 = (this.A + (this.z - this.A) * f2 + f3) / 1.8f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        return cmk.a(f4 * (float)Math.PI) * cmk.a(f4 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    public float p(float f2) {
        return (this.w + (this.g - this.w) * f2) * 0.15f * (float)Math.PI;
    }

    @Override
    public float A() {
        return this.bm * 0.8f;
    }

    @Override
    public int aw() {
        if (this.C()) {
            return 20;
        }
        return super.aw();
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        cpk cpk2 = ahy2.b();
        if (this.c != null) {
            this.c.a(false);
        }
        if (cpk2 != null && !(cpk2 instanceof bdl) && !(cpk2 instanceof cwt)) {
            f2 = (f2 + 1.0f) / 2.0f;
        }
        return super.a(ahy2, f2);
    }

    @Override
    public boolean a(cpk cpk2) {
        boolean bl2 = cpk2.a(ahy.b(this), (float)((int)this.a(cgz.e).e()));
        if (bl2) {
            this.a((bga)this, cpk2);
        }
        return bl2;
    }

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
        if (bl2) {
            this.a(cgz.a).a(20.0);
        } else {
            this.a(cgz.a).a(8.0);
        }
        this.a(cgz.e).a(4.0);
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (this.B()) {
            if (bhl2 != null) {
                dck dck2;
                if (bhl2.a() instanceof aeu) {
                    aeu aeu2 = (aeu)bhl2.a();
                    if (aeu2.f() && ((Float)this.bE.a(d)).floatValue() < 20.0f) {
                        if (!bdl2.G.d) {
                            --bhl2.b;
                        }
                        this.b_((float)aeu2.g(bhl2));
                        return true;
                    }
                } else if (bhl2.a() == hp.bd && (dck2 = dck.a(bhl2.h())) != this.aR()) {
                    this.a(dck2);
                    if (!bdl2.G.d) {
                        --bhl2.b;
                    }
                    return true;
                }
            }
            if (this.a(bdl2) && !this.aQ.C && !this.a(bhl2)) {
                this.c.a(!this.C());
                this.ax = false;
                this.l.n();
                this.b((bga)null);
            }
        } else if (bhl2 != null && bhl2.a() == hp.be && !this.aQ()) {
            if (!bdl2.G.d) {
                --bhl2.b;
            }
            if (!this.aQ.C) {
                if (this.bx.nextInt(3) == 0) {
                    this.a(true);
                    this.l.n();
                    this.b((bga)null);
                    this.c.a(true);
                    this.k(20.0f);
                    this.a(bdl2.cx());
                    this.b(true);
                    this.aQ.a((cpk)this, (byte)7);
                } else {
                    this.b(false);
                    this.aQ.a((cpk)this, (byte)6);
                }
            }
            return true;
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 8) {
            this.y = true;
            this.z = 0.0f;
            this.A = 0.0f;
        } else {
            super.a(by2);
        }
    }

    public float aP() {
        if (this.aQ()) {
            return 1.5393804f;
        }
        if (this.B()) {
            return (0.55f - (this.bo() - ((Float)this.bE.a(d)).floatValue()) * 0.02f) * (float)Math.PI;
        }
        return 0.62831855f;
    }

    @Override
    public boolean a(bhl bhl2) {
        if (bhl2 == null) {
            return false;
        }
        if (!(bhl2.a() instanceof aeu)) {
            return false;
        }
        return ((aeu)bhl2.a()).f();
    }

    @Override
    public int z() {
        return 8;
    }

    public boolean aQ() {
        return ((Byte)this.bE.a(a) & 2) != 0;
    }

    public void d(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 2));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFFD));
        }
    }

    public dck aR() {
        return dck.a((Integer)this.bE.a(f) & 0xF);
    }

    public void a(dck dck2) {
        this.bE.b(f, dck2.c());
    }

    public cqw a(alf alf2) {
        cqw cqw2 = new cqw(this.aQ);
        UUID uUID = this.D();
        if (uUID != null) {
            cqw2.a(uUID);
            cqw2.a(true);
        }
        return cqw2;
    }

    public void e(boolean bl2) {
        this.bE.b(e, bl2);
    }

    @Override
    public boolean a(cxn cxn2) {
        if (cxn2 == this) {
            return false;
        }
        if (!this.B()) {
            return false;
        }
        if (!(cxn2 instanceof cqw)) {
            return false;
        }
        cqw cqw2 = (cqw)cxn2;
        if (!cqw2.B()) {
            return false;
        }
        if (cqw2.C()) {
            return false;
        }
        return this.bS() && cqw2.bS();
    }

    public boolean bQ() {
        return (Boolean)this.bE.a(e);
    }

    @Override
    public boolean a(bga bga2, bga bga3) {
        cqw cqw2;
        if (bga2 instanceof ddh || bga2 instanceof ha) {
            return false;
        }
        if (bga2 instanceof cqw && (cqw2 = (cqw)bga2).B() && cqw2.E() == bga3) {
            return false;
        }
        if (bga2 instanceof bdl && bga3 instanceof bdl && !((bdl)bga3).c((bdl)bga2)) {
            return false;
        }
        return !(bga2 instanceof it) || !((it)bga2).D();
    }

    @Override
    public boolean c(bdl bdl2) {
        return !this.aQ() && super.c(bdl2);
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }
}

