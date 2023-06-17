/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class axn {
    private final iu b;
    private final cmz c;
    private final bxs d;
    private dbk e;
    private final boolean f;
    private final List g = ov.a();
    final /* synthetic */ bxs a;

    public axn(bxs bxs2, iu iu2, cmz cmz2, dbk dbk2) {
        this.a = bxs2;
        this.b = iu2;
        this.c = cmz2;
        this.e = dbk2;
        this.d = (bxs)dbk2.t();
        ctp ctp2 = (ctp)((Object)dbk2.b(this.d.d()));
        this.f = this.d.d;
        this.a(ctp2);
    }

    public List a() {
        return this.g;
    }

    private void a(ctp ctp2) {
        this.g.clear();
        switch (ctp2) {
            case a: {
                this.g.add(this.c.i());
                this.g.add(this.c.j());
                break;
            }
            case b: {
                this.g.add(this.c.k());
                this.g.add(this.c.l());
                break;
            }
            case c: {
                this.g.add(this.c.k());
                this.g.add(this.c.l().g());
                break;
            }
            case d: {
                this.g.add(this.c.k().g());
                this.g.add(this.c.l());
                break;
            }
            case e: {
                this.g.add(this.c.i().g());
                this.g.add(this.c.j());
                break;
            }
            case f: {
                this.g.add(this.c.i());
                this.g.add(this.c.j().g());
                break;
            }
            case g: {
                this.g.add(this.c.l());
                this.g.add(this.c.j());
                break;
            }
            case h: {
                this.g.add(this.c.k());
                this.g.add(this.c.j());
                break;
            }
            case i: {
                this.g.add(this.c.k());
                this.g.add(this.c.i());
                break;
            }
            case j: {
                this.g.add(this.c.l());
                this.g.add(this.c.i());
            }
        }
    }

    private void d() {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            axn axn2 = this.b((cmz)this.g.get(i2));
            if (axn2 == null || !axn2.a(this)) {
                this.g.remove(i2--);
                continue;
            }
            this.g.set(i2, axn2.c);
        }
    }

    private boolean a(cmz cmz2) {
        return bxs.c(this.b, cmz2) || bxs.c(this.b, cmz2.g()) || bxs.c(this.b, cmz2.h());
    }

    private axn b(cmz cmz2) {
        cmz cmz3 = cmz2;
        dbk dbk2 = this.b.n(cmz3);
        if (bxs.m(dbk2)) {
            return new axn(this.a, this.b, cmz3, dbk2);
        }
        cmz3 = cmz2.g();
        dbk2 = this.b.n(cmz3);
        if (bxs.m(dbk2)) {
            return new axn(this.a, this.b, cmz3, dbk2);
        }
        cmz3 = cmz2.h();
        dbk2 = this.b.n(cmz3);
        if (bxs.m(dbk2)) {
            return new axn(this.a, this.b, cmz3, dbk2);
        }
        return null;
    }

    private boolean a(axn axn2) {
        return this.c(axn2.c);
    }

    private boolean c(cmz cmz2) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            cmz cmz3 = (cmz)this.g.get(i2);
            if (cmz3.a() != cmz2.a() || cmz3.c() != cmz2.c()) continue;
            return true;
        }
        return false;
    }

    protected int b() {
        int n2 = 0;
        for (bqk bqk2 : afj.a) {
            if (!this.a(this.c.c(bqk2))) continue;
            ++n2;
        }
        return n2;
    }

    private boolean b(axn axn2) {
        return this.a(axn2) || this.g.size() != 2;
    }

    private void c(axn axn2) {
        this.g.add(axn2.c);
        cmz cmz2 = this.c.i();
        cmz cmz3 = this.c.j();
        cmz cmz4 = this.c.k();
        cmz cmz5 = this.c.l();
        boolean bl2 = this.c(cmz2);
        boolean bl3 = this.c(cmz3);
        boolean bl4 = this.c(cmz4);
        boolean bl5 = this.c(cmz5);
        ctp ctp2 = null;
        if (bl2 || bl3) {
            ctp2 = ctp.a;
        }
        if (bl4 || bl5) {
            ctp2 = ctp.b;
        }
        if (!this.f) {
            if (bl3 && bl5 && !bl2 && !bl4) {
                ctp2 = ctp.g;
            }
            if (bl3 && bl4 && !bl2 && !bl5) {
                ctp2 = ctp.h;
            }
            if (bl2 && bl4 && !bl3 && !bl5) {
                ctp2 = ctp.i;
            }
            if (bl2 && bl5 && !bl3 && !bl4) {
                ctp2 = ctp.j;
            }
        }
        if (ctp2 == ctp.a) {
            if (bxs.c(this.b, cmz2.g())) {
                ctp2 = ctp.e;
            }
            if (bxs.c(this.b, cmz3.g())) {
                ctp2 = ctp.f;
            }
        }
        if (ctp2 == ctp.b) {
            if (bxs.c(this.b, cmz5.g())) {
                ctp2 = ctp.c;
            }
            if (bxs.c(this.b, cmz4.g())) {
                ctp2 = ctp.d;
            }
        }
        if (ctp2 == null) {
            ctp2 = ctp.a;
        }
        this.e = this.e.a(this.d.d(), (Comparable)((Object)ctp2));
        this.b.a(this.c, this.e, 3);
    }

    private boolean d(cmz cmz2) {
        axn axn2 = this.b(cmz2);
        if (axn2 == null) {
            return false;
        }
        axn2.d();
        return axn2.b(this);
    }

    public axn a(boolean bl2, boolean bl3) {
        cmz cmz2 = this.c.i();
        cmz cmz3 = this.c.j();
        cmz cmz4 = this.c.k();
        cmz cmz5 = this.c.l();
        boolean bl4 = this.d(cmz2);
        boolean bl5 = this.d(cmz3);
        boolean bl6 = this.d(cmz4);
        boolean bl7 = this.d(cmz5);
        ctp ctp2 = null;
        if ((bl4 || bl5) && !bl6 && !bl7) {
            ctp2 = ctp.a;
        }
        if ((bl6 || bl7) && !bl4 && !bl5) {
            ctp2 = ctp.b;
        }
        if (!this.f) {
            if (bl5 && bl7 && !bl4 && !bl6) {
                ctp2 = ctp.g;
            }
            if (bl5 && bl6 && !bl4 && !bl7) {
                ctp2 = ctp.h;
            }
            if (bl4 && bl6 && !bl5 && !bl7) {
                ctp2 = ctp.i;
            }
            if (bl4 && bl7 && !bl5 && !bl6) {
                ctp2 = ctp.j;
            }
        }
        if (ctp2 == null) {
            if (bl4 || bl5) {
                ctp2 = ctp.a;
            }
            if (bl6 || bl7) {
                ctp2 = ctp.b;
            }
            if (!this.f) {
                if (bl2) {
                    if (bl5 && bl7) {
                        ctp2 = ctp.g;
                    }
                    if (bl6 && bl5) {
                        ctp2 = ctp.h;
                    }
                    if (bl7 && bl4) {
                        ctp2 = ctp.j;
                    }
                    if (bl4 && bl6) {
                        ctp2 = ctp.i;
                    }
                } else {
                    if (bl4 && bl6) {
                        ctp2 = ctp.i;
                    }
                    if (bl7 && bl4) {
                        ctp2 = ctp.j;
                    }
                    if (bl6 && bl5) {
                        ctp2 = ctp.h;
                    }
                    if (bl5 && bl7) {
                        ctp2 = ctp.g;
                    }
                }
            }
        }
        if (ctp2 == ctp.a) {
            if (bxs.c(this.b, cmz2.g())) {
                ctp2 = ctp.e;
            }
            if (bxs.c(this.b, cmz3.g())) {
                ctp2 = ctp.f;
            }
        }
        if (ctp2 == ctp.b) {
            if (bxs.c(this.b, cmz5.g())) {
                ctp2 = ctp.c;
            }
            if (bxs.c(this.b, cmz4.g())) {
                ctp2 = ctp.d;
            }
        }
        if (ctp2 == null) {
            ctp2 = ctp.a;
        }
        this.a(ctp2);
        this.e = this.e.a(this.d.d(), (Comparable)((Object)ctp2));
        if (bl3 || this.b.n(this.c) != this.e) {
            this.b.a(this.c, this.e, 3);
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                axn axn2 = this.b((cmz)this.g.get(i2));
                if (axn2 == null) continue;
                axn2.d();
                if (!axn2.b(this)) continue;
                axn2.c(this);
            }
        }
        return this;
    }

    public dbk c() {
        return this.e;
    }
}

