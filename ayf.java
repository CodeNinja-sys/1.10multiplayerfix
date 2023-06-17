/*
 * Decompiled with CFR 0.150.
 */
public class ayf
implements bme {
    private final String a;
    private final bme b;
    private final bme c;

    public ayf(String string, bme bme2, bme bme3) {
        this.a = string;
        if (bme2 == null) {
            bme2 = bme3;
        }
        if (bme3 == null) {
            bme3 = bme2;
        }
        this.b = bme2;
        this.c = bme3;
        if (bme2.aJ_()) {
            bme3.a(bme2.i());
        } else if (bme3.aJ_()) {
            bme2.a(bme3.i());
        }
    }

    @Override
    public int aI_() {
        return this.b.aI_() + this.c.aI_();
    }

    public boolean a(tb tb2) {
        return this.b == tb2 || this.c == tb2;
    }

    @Override
    public String i_() {
        if (this.b.j_()) {
            return this.b.i_();
        }
        if (this.c.j_()) {
            return this.c.i_();
        }
        return this.a;
    }

    @Override
    public boolean j_() {
        return this.b.j_() || this.c.j_();
    }

    @Override
    public cbg v() {
        if (this.j_()) {
            return new aym(this.i_());
        }
        return new du(this.i_(), new Object[0]);
    }

    @Override
    public bhl a(int n2) {
        if (n2 >= this.b.aI_()) {
            return this.c.a(n2 - this.b.aI_());
        }
        return this.b.a(n2);
    }

    @Override
    public bhl a(int n2, int n3) {
        if (n2 >= this.b.aI_()) {
            return this.c.a(n2 - this.b.aI_(), n3);
        }
        return this.b.a(n2, n3);
    }

    @Override
    public bhl b(int n2) {
        if (n2 >= this.b.aI_()) {
            return this.c.b(n2 - this.b.aI_());
        }
        return this.b.b(n2);
    }

    @Override
    public void a(int n2, bhl bhl2) {
        if (n2 >= this.b.aI_()) {
            this.c.a(n2 - this.b.aI_(), bhl2);
        } else {
            this.b.a(n2, bhl2);
        }
    }

    @Override
    public int d() {
        return this.b.d();
    }

    @Override
    public void c_() {
        this.b.c_();
        this.c.c_();
    }

    @Override
    public boolean a(bdl bdl2) {
        return this.b.a(bdl2) && this.c.a(bdl2);
    }

    @Override
    public void b(bdl bdl2) {
        this.b.b(bdl2);
        this.c.b(bdl2);
    }

    @Override
    public void c(bdl bdl2) {
        this.b.c(bdl2);
        this.c.c(bdl2);
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        return true;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public boolean aJ_() {
        return this.b.aJ_() || this.c.aJ_();
    }

    @Override
    public void a(biu biu2) {
        this.b.a(biu2);
        this.c.a(biu2);
    }

    @Override
    public biu i() {
        return this.b.i();
    }

    @Override
    public String n() {
        return this.b.n();
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new cnx(cps2, this, bdl2);
    }

    @Override
    public void g() {
        this.b.g();
        this.c.g();
    }
}

