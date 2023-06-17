/*
 * Decompiled with CFR 0.150.
 */
public class cbe
extends bfh {
    private final cwp c;
    private boolean d;
    private boolean e;
    private int f;

    public cbe(cwp cwp2, double d2) {
        super(cwp2, d2, 16);
        this.c = cwp2;
    }

    @Override
    public boolean b() {
        if (this.a <= 0) {
            if (!this.c.aQ.F().b("mobGriefing")) {
                return false;
            }
            this.f = -1;
            this.d = this.c.bV();
            this.e = this.c.bU();
        }
        return super.b();
    }

    @Override
    public boolean a() {
        return this.f >= 0 && super.a();
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public void d() {
        super.d();
    }

    @Override
    public void e() {
        super.e();
        this.c.am().a((double)this.b.a() + 0.5, this.b.b() + 1, (double)this.b.c() + 0.5, 10.0f, this.c.aw());
        if (this.f()) {
            iu iu2 = this.c.aQ;
            cmz cmz2 = this.b.g();
            dbk dbk2 = iu2.n(cmz2);
            bfa bfa2 = dbk2.t();
            if (this.f == 0 && bfa2 instanceof kd && ((kd)bfa2).o(dbk2)) {
                iu2.b(cmz2, true);
            } else if (this.f == 1 && dbk2.a() == ahk.a) {
                al al2 = this.c.bR();
                for (int i2 = 0; i2 < al2.aI_(); ++i2) {
                    bhl bhl2 = al2.a(i2);
                    boolean bl2 = false;
                    if (bhl2 != null) {
                        if (bhl2.a() == hp.P) {
                            iu2.a(cmz2, blg.aj.s(), 3);
                            bl2 = true;
                        } else if (bhl2.a() == hp.cc) {
                            iu2.a(cmz2, blg.cc.s(), 3);
                            bl2 = true;
                        } else if (bhl2.a() == hp.cb) {
                            iu2.a(cmz2, blg.cb.s(), 3);
                            bl2 = true;
                        } else if (bhl2.a() == hp.cU) {
                            iu2.a(cmz2, blg.cZ.s(), 3);
                            bl2 = true;
                        }
                    }
                    if (!bl2) continue;
                    --bhl2.b;
                    if (bhl2.b > 0) break;
                    al2.a(i2, null);
                    break;
                }
            }
            this.f = -1;
            this.a = 10;
        }
    }

    @Override
    protected boolean a(iu iu2, cmz cmz2) {
        bfa bfa2 = iu2.n(cmz2).t();
        if (bfa2 == blg.ak) {
            dbk dbk2 = iu2.n(cmz2 = cmz2.g());
            bfa2 = dbk2.t();
            if (bfa2 instanceof kd && ((kd)bfa2).o(dbk2) && this.e && (this.f == 0 || this.f < 0)) {
                this.f = 0;
                return true;
            }
            if (dbk2.a() == ahk.a && this.d && (this.f == 1 || this.f < 0)) {
                this.f = 1;
                return true;
            }
        }
        return false;
    }
}

