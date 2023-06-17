/*
 * Decompiled with CFR 0.150.
 */
public class dec {
    public iu a;
    public czt b;
    private bvh c = bvh.a;
    private boolean d;
    private int e;
    private cmz f = cmz.e;
    private int g;
    private boolean h;
    private cmz i = cmz.e;
    private int j;
    private int k = -1;

    public dec(iu iu2) {
        this.a = iu2;
    }

    public void a(bvh bvh2) {
        this.c = bvh2;
        bvh2.a(this.b.G);
        this.b.x();
        ((cmt)((Object)this.b.b.al())).a(new cgl(bfp.b, this.b));
        this.a.G();
    }

    public bvh b() {
        return this.c;
    }

    public boolean c() {
        return this.c.e();
    }

    public boolean d() {
        return this.c.d();
    }

    public void b(bvh bvh2) {
        if (this.c == bvh.a) {
            this.c = bvh2;
        }
        this.a(this.c);
    }

    public void a() {
        ++this.g;
        if (this.h) {
            int n2 = this.g - this.j;
            dbk dbk2 = this.a.n(this.i);
            bfa bfa2 = dbk2.t();
            if (dbk2.a() == ahk.a) {
                this.h = false;
            } else {
                float f2 = dbk2.a(this.b, this.b.aQ, this.i) * (float)(n2 + 1);
                int n3 = (int)(f2 * 10.0f);
                if (n3 != this.k) {
                    this.a.c(this.b.bW(), this.i, n3);
                    this.k = n3;
                }
                if (f2 >= 1.0f) {
                    this.h = false;
                    this.b(this.i);
                }
            }
        } else if (this.d) {
            dbk dbk3 = this.a.n(this.f);
            bfa bfa3 = dbk3.t();
            if (dbk3.a() == ahk.a) {
                this.a.c(this.b.bW(), this.f, -1);
                this.k = -1;
                this.d = false;
            } else {
                int n4 = this.g - this.e;
                float f3 = dbk3.a(this.b, this.b.aQ, this.i) * (float)(n4 + 1);
                int n5 = (int)(f3 * 10.0f);
                if (n5 != this.k) {
                    this.a.c(this.b.bW(), this.f, n5);
                    this.k = n5;
                }
            }
        }
    }

    public void a(cmz cmz2, bqk bqk2) {
        if (this.d()) {
            if (!this.a.a(null, cmz2, bqk2)) {
                this.b(cmz2);
            }
            return;
        }
        dbk dbk2 = this.a.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (this.c.c()) {
            if (this.c == bvh.e) {
                return;
            }
            if (!this.b.aG()) {
                bhl bhl2 = this.b.bt();
                if (bhl2 == null) {
                    return;
                }
                if (!bhl2.a(bfa2)) {
                    return;
                }
            }
        }
        this.a.a(null, cmz2, bqk2);
        this.e = this.g;
        float f2 = 1.0f;
        if (dbk2.a() != ahk.a) {
            bfa2.a(this.a, cmz2, this.b);
            f2 = dbk2.a(this.b, this.b.aQ, cmz2);
        }
        if (dbk2.a() != ahk.a && f2 >= 1.0f) {
            this.b(cmz2);
        } else {
            this.d = true;
            this.f = cmz2;
            int n2 = (int)(f2 * 10.0f);
            this.a.c(this.b.bW(), cmz2, n2);
            this.k = n2;
        }
    }

    public void a(cmz cmz2) {
        if (cmz2.equals(this.f)) {
            int n2 = this.g - this.e;
            dbk dbk2 = this.a.n(cmz2);
            if (dbk2.a() != ahk.a) {
                float f2 = dbk2.a(this.b, this.b.aQ, cmz2) * (float)(n2 + 1);
                if (f2 >= 0.7f) {
                    this.d = false;
                    this.a.c(this.b.bW(), cmz2, -1);
                    this.b(cmz2);
                } else if (!this.h) {
                    this.d = false;
                    this.h = true;
                    this.i = cmz2;
                    this.j = this.e;
                }
            }
        }
    }

    public void e() {
        this.d = false;
        this.a.c(this.b.bW(), this.f, -1);
    }

    private boolean c(cmz cmz2) {
        dbk dbk2 = this.a.n(cmz2);
        dbk2.t().a(this.a, cmz2, dbk2, this.b);
        boolean bl2 = this.a.f(cmz2);
        if (bl2) {
            dbk2.t().a_(this.a, cmz2, dbk2);
        }
        return bl2;
    }

    public boolean b(cmz cmz2) {
        if (this.c.d() && this.b.bt() != null && this.b.bt().a() instanceof bof) {
            return false;
        }
        dbk dbk2 = this.a.n(cmz2);
        bql bql2 = this.a.q(cmz2);
        bfa bfa2 = dbk2.t();
        if ((bfa2 instanceof btt || bfa2 instanceof cip) && !this.b.aU()) {
            this.a.a(cmz2, dbk2, dbk2, 3);
            return false;
        }
        if (this.c.c()) {
            if (this.c == bvh.e) {
                return false;
            }
            if (!this.b.aG()) {
                bhl bhl2 = this.b.bt();
                if (bhl2 == null) {
                    return false;
                }
                if (!bhl2.a(bfa2)) {
                    return false;
                }
            }
        }
        this.a.a(this.b, 2001, cmz2, bfa.u(dbk2));
        boolean bl2 = this.c(cmz2);
        if (this.d()) {
            this.b.a.a(new cjj(this.a, cmz2));
        } else {
            bhl bhl3 = this.b.bt();
            bhl bhl4 = bhl3 == null ? null : bhl3.j();
            boolean bl3 = this.b.b(dbk2);
            if (bhl3 != null) {
                bhl3.a(this.a, dbk2, cmz2, this.b);
                if (bhl3.b == 0) {
                    this.b.a(bqp.a, null);
                }
            }
            if (bl2 && bl3) {
                dbk2.t().a(this.a, this.b, cmz2, dbk2, bql2, bhl4);
            }
        }
        return bl2;
    }

    public cey a(bdl bdl2, iu iu2, bhl bhl2, bqp bqp2) {
        if (this.c == bvh.e) {
            return cey.b;
        }
        if (bdl2.aS().a(bhl2.a())) {
            return cey.b;
        }
        int n2 = bhl2.b;
        int n3 = bhl2.h();
        wx wx2 = bhl2.a(iu2, bdl2, bqp2);
        bhl bhl3 = (bhl)wx2.b();
        if (bhl3 == bhl2 && bhl3.b == n2 && bhl3.l() <= 0 && bhl3.h() == n3) {
            return wx2.a();
        }
        bdl2.a(bqp2, bhl3);
        if (this.d()) {
            bhl3.b = n2;
            if (bhl3.d()) {
                bhl3.b(n3);
            }
        }
        if (bhl3.b == 0) {
            bdl2.a(bqp2, null);
        }
        if (!bdl2.ag_()) {
            ((czt)bdl2).a(bdl2.o);
        }
        return wx2.a();
    }

    public cey a(bdl bdl2, iu iu2, bhl bhl2, bqp bqp2, cmz cmz2, bqk bqk2, float f2, float f3, float f4) {
        Object object;
        if (this.c == bvh.e) {
            bql bql2 = iu2.q(cmz2);
            if (bql2 instanceof bme) {
                bfa bfa2 = iu2.n(cmz2).t();
                bme bme2 = (bme)((Object)bql2);
                if (bme2 instanceof bdm && bfa2 instanceof aqi) {
                    bme2 = ((aqi)bfa2).c(iu2, cmz2);
                }
                if (bme2 != null) {
                    bdl2.a(bme2);
                    return cey.a;
                }
            } else if (bql2 instanceof tb) {
                bdl2.a((tb)((Object)bql2));
                return cey.a;
            }
            return cey.b;
        }
        if ((!bdl2.ar_() || bdl2.bt() == null && bdl2.bu() == null) && (object = iu2.n(cmz2)).t().a(iu2, cmz2, (dbk)object, bdl2, bqp2, bhl2, bqk2, f2, f3, f4)) {
            return cey.a;
        }
        if (bhl2 == null) {
            return cey.b;
        }
        if (bdl2.aS().a(bhl2.a())) {
            return cey.b;
        }
        if (bhl2.a() instanceof ge && !bdl2.aU() && ((object = ((ge)bhl2.a()).c()) instanceof btt || object instanceof cip)) {
            return cey.c;
        }
        if (this.d()) {
            int n2 = bhl2.h();
            int n3 = bhl2.b;
            cey cey2 = bhl2.a(bdl2, iu2, cmz2, bqp2, bqk2, f2, f3, f4);
            bhl2.b(n2);
            bhl2.b = n3;
            return cey2;
        }
        return bhl2.a(bdl2, iu2, cmz2, bqp2, bqk2, f2, f3, f4);
    }

    public void a(alj alj2) {
        this.a = alj2;
    }
}

