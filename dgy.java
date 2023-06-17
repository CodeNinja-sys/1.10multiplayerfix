/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class dgy
implements ds {
    private UUID a;
    private atf b;
    private cbg c;
    private float d;
    private jd e;
    private abo f;
    private boolean g;
    private boolean h;
    private boolean i;

    public dgy() {
    }

    public dgy(atf atf2, bds bds2) {
        this.b = atf2;
        this.a = bds2.a();
        this.c = bds2.b();
        this.d = bds2.c();
        this.e = bds2.d();
        this.f = bds2.e();
        this.g = bds2.f();
        this.h = bds2.g();
        this.i = bds2.h();
    }

    @Override
    public void a(si si2) {
        this.a = si2.g();
        this.b = (atf)si2.a(atf.class);
        switch (this.b) {
            case a: {
                this.c = si2.d();
                this.d = si2.O();
                this.e = (jd)si2.a(jd.class);
                this.f = (abo)si2.a(abo.class);
                this.a(si2.F());
                break;
            }
            case b: {
                break;
            }
            case c: {
                this.d = si2.O();
                break;
            }
            case d: {
                this.c = si2.d();
                break;
            }
            case e: {
                this.e = (jd)si2.a(jd.class);
                this.f = (abo)si2.a(abo.class);
                break;
            }
            case f: {
                this.a(si2.F());
            }
        }
    }

    private void a(int n2) {
        this.g = (n2 & 1) > 0;
        this.h = (n2 & 2) > 0;
        this.i = (n2 & 2) > 0;
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
        switch (this.b) {
            case a: {
                si2.a(this.c);
                si2.a(this.d);
                si2.a(this.e);
                si2.a(this.f);
                si2.B(this.j());
                break;
            }
            case b: {
                break;
            }
            case c: {
                si2.a(this.d);
                break;
            }
            case d: {
                si2.a(this.c);
                break;
            }
            case e: {
                si2.a(this.e);
                si2.a(this.f);
                break;
            }
            case f: {
                si2.B(this.j());
            }
        }
    }

    private int j() {
        int n2 = 0;
        if (this.g) {
            n2 |= 1;
        }
        if (this.h) {
            n2 |= 2;
        }
        if (this.i) {
            n2 |= 2;
        }
        return n2;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public UUID a() {
        return this.a;
    }

    public atf b() {
        return this.b;
    }

    public cbg c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public jd e() {
        return this.e;
    }

    public abo f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }
}

