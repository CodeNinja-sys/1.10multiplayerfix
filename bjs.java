/*
 * Decompiled with CFR 0.150.
 */
public class bjs
extends cjn
implements acn {
    protected cjn b;
    protected String c = "Select world";
    private cge d;
    private ayz e;
    private cvp f;
    private avg g;
    private final cwj h;
    private st i;
    private boolean j = true;

    public bjs(cjn cjn2, cwj cwj2) {
        this.b = cjn2;
        this.h = cwj2;
    }

    @Override
    public void cH_() {
        this.c = bf.a("gui.stats", new Object[0]);
        this.j = true;
        this.u.x().a(new daq(cpl.b));
    }

    @Override
    public void p_() {
        super.p_();
        if (this.i != null) {
            this.i.i();
        }
    }

    public void f() {
        this.d = new cge(this, this.u);
        this.d.d(1, 1);
        this.e = new ayz(this, this.u);
        this.e.d(1, 1);
        this.f = new cvp(this, this.u);
        this.f.d(1, 1);
        this.g = new avg(this, this.u);
        this.g.d(1, 1);
    }

    public void h() {
        this.y.add(new cwv(0, this.w / 2 + 4, this.x - 28, 150, 20, bf.a("gui.done", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 - 160, this.x - 52, 80, 20, bf.a("stat.generalButton", new Object[0])));
        cwv cwv2 = this.b(new cwv(2, this.w / 2 - 80, this.x - 52, 80, 20, bf.a("stat.blocksButton", new Object[0])));
        cwv cwv3 = this.b(new cwv(3, this.w / 2, this.x - 52, 80, 20, bf.a("stat.itemsButton", new Object[0])));
        cwv cwv4 = this.b(new cwv(4, this.w / 2 + 80, this.x - 52, 80, 20, bf.a("stat.mobsButton", new Object[0])));
        if (this.f.a() == 0) {
            cwv2.k = false;
        }
        if (this.e.a() == 0) {
            cwv3.k = false;
        }
        if (this.g.a() == 0) {
            cwv4.k = false;
        }
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 0) {
            this.u.a(this.b);
        } else if (cwv2.j == 1) {
            this.i = this.d;
        } else if (cwv2.j == 3) {
            this.i = this.e;
        } else if (cwv2.j == 2) {
            this.i = this.f;
        } else if (cwv2.j == 4) {
            this.i = this.g;
        } else {
            this.i.a(cwv2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.j) {
            this.aH_();
            this.a(this.B, bf.a("multiplayer.downloadingStats", new Object[0]), this.w / 2, this.x / 2, 0xFFFFFF);
            this.a(this.B, a[(int)(bxy.K() / 150L % (long)a.length)], this.w / 2, this.x / 2 + this.B.a * 2, 0xFFFFFF);
        } else {
            this.i.a(n2, n3, f2);
            this.a(this.B, this.c, this.w / 2, 20, 0xFFFFFF);
            super.a(n2, n3, f2);
        }
    }

    @Override
    public void c() {
        if (this.j) {
            this.f();
            this.h();
            this.i = this.d;
            this.j = false;
        }
    }

    @Override
    public boolean q_() {
        return !this.j;
    }

    private void a(int n2, int n3, azg azg2) {
        this.a(n2 + 1, n3 + 1);
        cja.A();
        bjr.c();
        this.v.a(new bhl(azg2), n2 + 2, n3 + 2);
        bjr.a();
        cja.B();
    }

    private void a(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    private void c(int n2, int n3, int n4, int n5) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(o);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)(n2 + 0), (double)(n3 + 18), (double)this.q).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        bix2.b((double)(n2 + 18), (double)(n3 + 18), (double)this.q).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        bix2.b((double)(n2 + 18), (double)(n3 + 0), (double)this.q).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        bix2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.q).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        bha2.b();
    }

    static /* synthetic */ deb a(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ cwj b(bjs bjs2) {
        return bjs2.h;
    }

    static /* synthetic */ deb c(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb d(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ void a(bjs bjs2, int n2, int n3, int n4, int n5) {
        bjs2.c(n2, n3, n4, n5);
    }

    static /* synthetic */ deb e(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb f(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb g(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb h(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb i(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ void a(bjs bjs2, int n2, int n3, int n4, int n5, int n6, int n7) {
        bjs2.b(n2, n3, n4, n5, n6, n7);
    }

    static /* synthetic */ deb j(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb k(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ void b(bjs bjs2, int n2, int n3, int n4, int n5, int n6, int n7) {
        bjs2.b(n2, n3, n4, n5, n6, n7);
    }

    static /* synthetic */ deb l(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ void a(bjs bjs2, int n2, int n3, azg azg2) {
        bjs2.a(n2, n3, azg2);
    }

    static /* synthetic */ deb m(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb n(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb o(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb p(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb q(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb r(bjs bjs2) {
        return bjs2.B;
    }

    static /* synthetic */ deb s(bjs bjs2) {
        return bjs2.B;
    }
}

