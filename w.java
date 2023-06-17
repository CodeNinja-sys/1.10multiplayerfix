/*
 * Decompiled with CFR 0.150.
 */
public class w
extends ck {
    private final cwp b;
    private cwp c;
    private final iu d;
    private int e;
    aus a;

    public w(cwp cwp2) {
        this.b = cwp2;
        this.d = cwp2.aQ;
        this.a(3);
    }

    @Override
    public boolean b() {
        if (this.b.aL() != 0) {
            return false;
        }
        if (this.b.aW().nextInt(500) != 0) {
            return false;
        }
        this.a = this.d.T().a(new cmz(this.b), 0);
        if (this.a == null) {
            return false;
        }
        if (!this.f() || !this.b.f(true)) {
            return false;
        }
        cpk cpk2 = this.d.a(cwp.class, this.b.cD().b(8.0, 3.0, 8.0), (cpk)this.b);
        if (cpk2 == null) {
            return false;
        }
        this.c = (cwp)cpk2;
        return this.c.aL() == 0 && this.c.f(true);
    }

    @Override
    public void c() {
        this.e = 300;
        this.b.d(true);
    }

    @Override
    public void d() {
        this.a = null;
        this.c = null;
        this.b.d(false);
    }

    @Override
    public boolean a() {
        return this.e >= 0 && this.f() && this.b.aL() == 0 && this.b.f(false);
    }

    @Override
    public void e() {
        --this.e;
        this.b.am().a(this.c, 10.0f, 30.0f);
        if (this.b.l(this.c) > 2.25) {
            this.b.ap().a(this.c, 0.25);
        } else if (this.e == 0 && this.c.aP()) {
            this.i();
        }
        if (this.b.aW().nextInt(35) == 0) {
            this.d.a((cpk)this.b, (byte)12);
        }
    }

    private boolean f() {
        if (!this.a.i()) {
            return false;
        }
        int n2 = (int)((double)this.a.c() * 0.35);
        return this.a.e() < n2;
    }

    private void i() {
        cwp cwp2 = this.b.a(this.c);
        this.c.j(6000);
        this.b.j(6000);
        this.c.g(false);
        this.b.g(false);
        cwp2.j(-24000);
        cwp2.a_(this.b.aU, this.b.aV, this.b.aW, 0.0f, 0.0f);
        this.d.b(cwp2);
        this.d.a((cpk)cwp2, (byte)12);
    }
}

