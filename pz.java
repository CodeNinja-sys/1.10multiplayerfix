/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;

public class pz {
    private final bxy a;
    private final ut b;
    private cmz c = new cmz(-1, -1, -1);
    private bhl d;
    private float e;
    private float f;
    private int g;
    private boolean h;
    private bvh i = bvh.b;
    private int j;

    public pz(bxy bxy2, ut ut2) {
        this.a = bxy2;
        this.b = ut2;
    }

    public static void a(bxy bxy2, pz pz2, cmz cmz2, bqk bqk2) {
        if (!bxy2.f.a(bxy2.h, cmz2, bqk2)) {
            pz2.a(cmz2);
        }
    }

    public void a(bdl bdl2) {
        this.i.a(bdl2.G);
    }

    public boolean a() {
        return this.i == bvh.e;
    }

    public void a(bvh bvh2) {
        this.i = bvh2;
        this.i.a(this.a.h.G);
    }

    public void b(bdl bdl2) {
        bdl2.ba = -180.0f;
    }

    public boolean b() {
        return this.i.e();
    }

    public boolean a(cmz cmz2) {
        bhl bhl2;
        Object object;
        if (this.i.c()) {
            if (this.i == bvh.e) {
                return false;
            }
            if (!this.a.h.aG()) {
                object = this.a.h.bt();
                if (object == null) {
                    return false;
                }
                if (!((bhl)object).a(this.a.f.n(cmz2).t())) {
                    return false;
                }
            }
        }
        if (this.i.d() && this.a.h.bt() != null && this.a.h.bt().a() instanceof bof) {
            return false;
        }
        object = this.a.f;
        dbk dbk2 = ((iu)object).n(cmz2);
        bfa bfa2 = dbk2.t();
        if ((bfa2 instanceof btt || bfa2 instanceof cip) && !this.a.h.aU()) {
            return false;
        }
        if (dbk2.a() == ahk.a) {
            return false;
        }
        ((iu)object).b(2001, cmz2, bfa.u(dbk2));
        bfa2.a((iu)object, cmz2, dbk2, this.a.h);
        boolean bl2 = ((iu)object).a(cmz2, blg.a.s(), 11);
        if (bl2) {
            bfa2.a_((iu)object, cmz2, dbk2);
        }
        this.c = new cmz(this.c.a(), -1, this.c.c());
        if (!this.i.d() && (bhl2 = this.a.h.bt()) != null) {
            bhl2.a((iu)object, dbk2, cmz2, this.a.h);
            if (bhl2.b == 0) {
                this.a.h.a(bqp.a, null);
            }
        }
        return bl2;
    }

    public boolean a(cmz cmz2, bqk bqk2) {
        Object object;
        if (this.i.c()) {
            if (this.i == bvh.e) {
                return false;
            }
            if (!this.a.h.aG()) {
                object = this.a.h.bt();
                if (object == null) {
                    return false;
                }
                if (!((bhl)object).a(this.a.f.n(cmz2).t())) {
                    return false;
                }
            }
        }
        if (!this.a.f.U().a(cmz2)) {
            return false;
        }
        if (this.i.d()) {
            this.b.a(new cco(bpk.a, cmz2, bqk2));
            pz.a(this.a, this, cmz2, bqk2);
            this.g = 5;
        } else if (!this.h || !this.b(cmz2)) {
            boolean bl2;
            if (this.h) {
                this.b.a(new cco(bpk.b, this.c, bqk2));
            }
            this.b.a(new cco(bpk.a, cmz2, bqk2));
            object = this.a.f.n(cmz2);
            boolean bl3 = bl2 = object.a() != ahk.a;
            if (bl2 && this.e == 0.0f) {
                object.t().a((iu)this.a.f, cmz2, this.a.h);
            }
            if (bl2 && object.a(this.a.h, this.a.h.aQ, cmz2) >= 1.0f) {
                this.a(cmz2);
            } else {
                this.h = true;
                this.c = cmz2;
                this.d = this.a.h.bt();
                this.e = 0.0f;
                this.f = 0.0f;
                this.a.f.c(this.a.h.bW(), this.c, (int)(this.e * 10.0f) - 1);
            }
        }
        return true;
    }

    public void c() {
        if (this.h) {
            this.b.a(new cco(bpk.b, this.c, bqk.a));
            this.h = false;
            this.e = 0.0f;
            this.a.f.c(this.a.h.bW(), this.c, -1);
            this.a.h.aR();
        }
    }

    public boolean b(cmz cmz2, bqk bqk2) {
        this.n();
        if (this.g > 0) {
            --this.g;
            return true;
        }
        if (this.i.d() && this.a.f.U().a(cmz2)) {
            this.g = 5;
            this.b.a(new cco(bpk.a, cmz2, bqk2));
            pz.a(this.a, this, cmz2, bqk2);
            return true;
        }
        if (this.b(cmz2)) {
            dbk dbk2 = this.a.f.n(cmz2);
            bfa bfa2 = dbk2.t();
            if (dbk2.a() == ahk.a) {
                this.h = false;
                return false;
            }
            this.e += dbk2.a(this.a.h, this.a.h.aQ, cmz2);
            if (this.f % 4.0f == 0.0f) {
                acv acv2 = bfa2.t();
                this.a.W().a(new ol(acv2.f(), csg.g, (acv2.a() + 1.0f) / 8.0f, acv2.b() * 0.5f, cmz2));
            }
            this.f += 1.0f;
            if (this.e >= 1.0f) {
                this.h = false;
                this.b.a(new cco(bpk.c, cmz2, bqk2));
                this.a(cmz2);
                this.e = 0.0f;
                this.f = 0.0f;
                this.g = 5;
            }
        } else {
            return this.a(cmz2, bqk2);
        }
        this.a.f.c(this.a.h.bW(), this.c, (int)(this.e * 10.0f) - 1);
        return true;
    }

    public float d() {
        if (this.i.d()) {
            return 5.0f;
        }
        return 4.5f;
    }

    public void e() {
        this.n();
        if (this.b.b().e()) {
            this.b.b().a();
        } else {
            this.b.b().j();
        }
    }

    private boolean b(cmz cmz2) {
        boolean bl2;
        bhl bhl2 = this.a.h.bt();
        boolean bl3 = bl2 = this.d == null && bhl2 == null;
        if (this.d != null && bhl2 != null) {
            bl2 = bhl2.a() == this.d.a() && bhl.a(bhl2, this.d) && (bhl2.d() || bhl2.h() == this.d.h());
        }
        return cmz2.equals(this.c) && bl2;
    }

    private void n() {
        int n2 = this.a.h.n.d;
        if (n2 != this.j) {
            this.j = n2;
            this.b.a(new ayo(this.j));
        }
    }

    public cey a(ob ob2, ym ym2, bhl bhl2, cmz cmz2, bqk bqk2, amj amj2, bqp bqp2) {
        Object object;
        this.n();
        float f2 = (float)(amj2.b - (double)cmz2.a());
        float f3 = (float)(amj2.c - (double)cmz2.b());
        float f4 = (float)(amj2.d - (double)cmz2.c());
        boolean bl2 = false;
        if (!this.a.f.U().a(cmz2)) {
            return cey.c;
        }
        if (this.i != bvh.e) {
            ge ge2;
            object = ym2.n(cmz2);
            if ((!ob2.ar_() || ob2.bt() == null && ob2.bu() == null) && object.t().a(ym2, cmz2, (dbk)object, ob2, bqp2, bhl2, bqk2, f2, f3, f4)) {
                bl2 = true;
            }
            if (!bl2 && bhl2 != null && bhl2.a() instanceof ge && !(ge2 = (ge)bhl2.a()).a(ym2, cmz2, bqk2, ob2, bhl2)) {
                return cey.c;
            }
        }
        this.b.a(new apf(cmz2, bqk2, bqp2, f2, f3, f4));
        if (bl2 || this.i == bvh.e) {
            return cey.a;
        }
        if (bhl2 == null) {
            return cey.b;
        }
        if (ob2.aS().a(bhl2.a())) {
            return cey.b;
        }
        if (bhl2.a() instanceof ge && !ob2.aU() && ((object = ((ge)bhl2.a()).c()) instanceof btt || object instanceof cip)) {
            return cey.c;
        }
        if (this.i.d()) {
            int n2 = bhl2.h();
            int n3 = bhl2.b;
            cey cey2 = bhl2.a(ob2, ym2, cmz2, bqp2, bqk2, f2, f3, f4);
            bhl2.b(n2);
            bhl2.b = n3;
            return cey2;
        }
        return bhl2.a(ob2, ym2, cmz2, bqp2, bqk2, f2, f3, f4);
    }

    public cey a(bdl bdl2, iu iu2, bhl bhl2, bqp bqp2) {
        if (this.i == bvh.e) {
            return cey.b;
        }
        this.n();
        this.b.a(new ciz(bqp2));
        if (bdl2.aS().a(bhl2.a())) {
            return cey.b;
        }
        int n2 = bhl2.b;
        wx wx2 = bhl2.a(iu2, bdl2, bqp2);
        bhl bhl3 = (bhl)wx2.b();
        if (bhl3 != bhl2 || bhl3.b != n2) {
            bdl2.a(bqp2, bhl3);
            if (bhl3.b == 0) {
                bdl2.a(bqp2, null);
            }
        }
        return wx2.a();
    }

    public ob a(iu iu2, cwj cwj2) {
        return new ob(this.a, iu2, this.b, cwj2);
    }

    public void a(bdl bdl2, cpk cpk2) {
        this.n();
        this.b.a(new cnj(cpk2));
        if (this.i != bvh.e) {
            bdl2.g(cpk2);
            bdl2.aR();
        }
    }

    public cey a(bdl bdl2, cpk cpk2, bhl bhl2, bqp bqp2) {
        this.n();
        this.b.a(new cnj(cpk2, bqp2));
        if (this.i == bvh.e) {
            return cey.b;
        }
        return bdl2.a(cpk2, bhl2, bqp2);
    }

    public cey a(bdl bdl2, cpk cpk2, auu auu2, bhl bhl2, bqp bqp2) {
        this.n();
        amj amj2 = new amj(auu2.c.b - cpk2.aU, auu2.c.c - cpk2.aV, auu2.c.d - cpk2.aW);
        this.b.a(new cnj(cpk2, bqp2, amj2));
        if (this.i == bvh.e) {
            return cey.b;
        }
        return cpk2.a(bdl2, amj2, bhl2, bqp2);
    }

    public bhl a(int n2, int n3, int n4, aao aao2, bdl bdl2) {
        short s2 = bdl2.p.a(bdl2.n);
        bhl bhl2 = bdl2.p.a(n3, n4, aao2, bdl2);
        this.b.a(new buu(n2, n3, n4, aao2, bhl2, s2));
        return bhl2;
    }

    public void a(int n2, int n3) {
        this.b.a(new cqn(n2, n3));
    }

    public void a(bhl bhl2, int n2) {
        if (this.i.d()) {
            this.b.a(new gn(n2, bhl2));
        }
    }

    public void a(bhl bhl2) {
        if (this.i.d() && bhl2 != null) {
            this.b.a(new gn(-1, bhl2));
        }
    }

    public void c(bdl bdl2) {
        this.n();
        this.b.a(new cco(bpk.f, cmz.e, bqk.a));
        bdl2.bJ();
    }

    public boolean f() {
        return this.i.e();
    }

    public boolean g() {
        return !this.i.d();
    }

    public boolean h() {
        return this.i.d();
    }

    public boolean i() {
        return this.i.d();
    }

    public boolean j() {
        return this.a.h.cp() && this.a.h.cL() instanceof it;
    }

    public boolean k() {
        return this.i == bvh.e;
    }

    public bvh l() {
        return this.i;
    }

    public boolean m() {
        return this.h;
    }

    public void a(int n2) {
        this.b.a(new pm("MC|PickItem", new si(bi.a()).d(n2)));
    }
}

