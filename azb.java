/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;

public class azb
extends cpk {
    private dbk e;
    public int a;
    public boolean b = true;
    private boolean f;
    private boolean g;
    private int h = 40;
    private float i = 2.0f;
    public bvp c;
    protected static final bcz d = bwm.a(azb.class, cbf.j);

    public azb(iu iu2) {
        super(iu2);
    }

    public azb(iu iu2, double d2, double d3, double d4, dbk dbk2) {
        super(iu2);
        this.e = dbk2;
        this.aN = true;
        this.a_(0.98f, 0.98f);
        this.d(d2, d3 + (double)((1.0f - this.bm) / 2.0f), d4);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
        this.a(new cmz(this));
    }

    public void a(cmz cmz2) {
        this.bE.b(d, cmz2);
    }

    public cmz n() {
        return (cmz)this.bE.a(d);
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected void a() {
        this.bE.a(d, cmz.e);
    }

    @Override
    public boolean bc_() {
        return !this.bk;
    }

    @Override
    public void bb_() {
        cmz cmz2;
        bfa bfa2 = this.e.t();
        if (this.e.a() == ahk.a) {
            this.ak_();
            return;
        }
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (this.a++ == 0) {
            cmz2 = new cmz(this);
            if (this.aQ.n(cmz2).t() == bfa2) {
                this.aQ.f(cmz2);
            } else if (!this.aQ.C) {
                this.ak_();
                return;
            }
        }
        if (!this.cf()) {
            this.aY -= (double)0.04f;
        }
        this.b(this.aX, this.aY, this.aZ);
        this.aX *= (double)0.98f;
        this.aY *= (double)0.98f;
        this.aZ *= (double)0.98f;
        if (!this.aQ.C) {
            cmz2 = new cmz(this);
            if (this.be) {
                dbk dbk2 = this.aQ.n(cmz2);
                if (cmy.n(this.aQ.n(new cmz(this.aU, this.aV - (double)0.01f, this.aW)))) {
                    this.be = false;
                    return;
                }
                this.aX *= (double)0.7f;
                this.aZ *= (double)0.7f;
                this.aY *= -0.5;
                if (dbk2.t() != blg.M) {
                    this.ak_();
                    if (!this.f) {
                        if (this.aQ.a(bfa2, cmz2, true, bqk.b, null, null) && !cmy.n(this.aQ.n(cmz2.h())) && this.aQ.a(cmz2, this.e, 3)) {
                            bql bql2;
                            if (bfa2 instanceof cmy) {
                                ((cmy)bfa2).b(this.aQ, cmz2);
                            }
                            if (this.c != null && bfa2 instanceof gk && (bql2 = this.aQ.q(cmz2)) != null) {
                                bvp bvp2 = bql2.b(new bvp());
                                for (String string : this.c.b()) {
                                    azt azt2 = this.c.c(string);
                                    if ("x".equals(string) || "y".equals(string) || "z".equals(string)) continue;
                                    bvp2.a(string, azt2.i());
                                }
                                bql2.a(bvp2);
                                bql2.c_();
                            }
                        } else if (this.b && this.aQ.F().b("doEntityDrops")) {
                            this.a(new bhl(bfa2, 1, bfa2.d(this.e)), 0.0f);
                        }
                    }
                }
            } else if (this.a > 100 && !this.aQ.C && (cmz2.b() < 1 || cmz2.b() > 256) || this.a > 600) {
                if (this.b && this.aQ.F().b("doEntityDrops")) {
                    this.a(new bhl(bfa2, 1, bfa2.d(this.e)), 0.0f);
                }
                this.ak_();
            }
        }
    }

    @Override
    public void a(float f2, float f3) {
        int n2;
        bfa bfa2 = this.e.t();
        if (this.g && (n2 = cmk.f(f2 - 1.0f)) > 0) {
            ArrayList arrayList = ov.a((Iterable)this.aQ.b((cpk)this, this.cD()));
            boolean bl2 = bfa2 == blg.cf;
            ahy ahy2 = bl2 ? ahy.p : ahy.q;
            for (cpk cpk2 : arrayList) {
                cpk2.a(ahy2, (float)Math.min(cmk.d((float)n2 * this.i), this.h));
            }
            if (bl2 && (double)this.bx.nextFloat() < (double)0.05f + (double)n2 * 0.05) {
                int n3 = (Integer)this.e.b(ba.b);
                if (++n3 > 2) {
                    this.f = true;
                } else {
                    this.e = this.e.a(ba.b, Integer.valueOf(n3));
                }
            }
        }
    }

    public static void a(cgy cgy2) {
    }

    @Override
    protected void a(bvp bvp2) {
        bfa bfa2 = this.e != null ? this.e.t() : blg.a;
        bpx bpx2 = (bpx)bfa.v.b(bfa2);
        bvp2.a("Block", bpx2 == null ? "" : bpx2.toString());
        bvp2.a("Data", (byte)bfa2.e(this.e));
        bvp2.a("Time", this.a);
        bvp2.a("DropItem", this.b);
        bvp2.a("HurtEntities", this.g);
        bvp2.a("FallHurtAmount", this.i);
        bvp2.a("FallHurtMax", this.h);
        if (this.c != null) {
            bvp2.a("TileEntityData", this.c);
        }
    }

    @Override
    protected void b(bvp bvp2) {
        int n2 = bvp2.f("Data") & 0xFF;
        this.e = bvp2.b("Block", 8) ? bfa.a(bvp2.l("Block")).a(n2) : (bvp2.b("TileID", 99) ? bfa.f(bvp2.h("TileID")).a(n2) : bfa.f(bvp2.f("Tile") & 0xFF).a(n2));
        this.a = bvp2.h("Time");
        bfa bfa2 = this.e.t();
        if (bvp2.b("HurtEntities", 99)) {
            this.g = bvp2.p("HurtEntities");
            this.i = bvp2.j("FallHurtAmount");
            this.h = bvp2.h("FallHurtMax");
        } else if (bfa2 == blg.cf) {
            this.g = true;
        }
        if (bvp2.b("DropItem", 99)) {
            this.b = bvp2.p("DropItem");
        }
        if (bvp2.b("TileEntityData", 10)) {
            this.c = bvp2.o("TileEntityData");
        }
        if (bfa2 == null || bfa2.s().a() == ahk.a) {
            this.e = blg.m.s();
        }
    }

    public iu p() {
        return this.aQ;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    @Override
    public boolean z_() {
        return false;
    }

    @Override
    public void a(sx sx2) {
        super.a(sx2);
        if (this.e != null) {
            bfa bfa2 = this.e.t();
            sx2.a("Immitating block ID", bfa.c(bfa2));
            sx2.a("Immitating block data", bfa2.e(this.e));
        }
    }

    public dbk r() {
        return this.e;
    }

    @Override
    public boolean O_() {
        return true;
    }
}

