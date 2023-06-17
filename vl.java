/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class vl
extends bfa {
    public static final yc a = yc.a("facing", new dgb());
    protected static final cxt b = new cxt(0.4f, 0.0, 0.4f, 0.6f, 0.6f, 0.6f);
    protected static final cxt c = new cxt(0.35f, 0.2f, 0.7f, 0.65f, 0.8f, 1.0);
    protected static final cxt d = new cxt(0.35f, 0.2f, 0.0, 0.65f, 0.8f, 0.3f);
    protected static final cxt e = new cxt(0.7f, 0.2f, 0.35f, 1.0, 0.8f, 0.65f);
    protected static final cxt f = new cxt(0.0, 0.2f, 0.35f, 0.3f, 0.8f, 0.65f);

    protected vl() {
        super(ahk.q);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.b)));
        this.b(true);
        this.a(zm.c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bqk)((Object)dbk2.b(a))) {
            case f: {
                return f;
            }
            case e: {
                return e;
            }
            case d: {
                return d;
            }
            case c: {
                return c;
            }
        }
        return b;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    private boolean c(iu iu2, cmz cmz2) {
        if (iu2.n(cmz2).q()) {
            return true;
        }
        bfa bfa2 = iu2.n(cmz2).t();
        return bfa2 instanceof gd || bfa2 == blg.w || bfa2 == blg.bZ || bfa2 == blg.cG;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        for (bqk bqk2 : a.a()) {
            if (!this.b(iu2, cmz2, bqk2)) continue;
            return true;
        }
        return false;
    }

    private boolean b(iu iu2, cmz cmz2, bqk bqk2) {
        cmz cmz3 = cmz2.c(bqk2.e());
        boolean bl2 = bqk2.l().d();
        return bl2 && iu2.d(cmz3, true) || bqk2.equals(bqk.b) && this.c(iu2, cmz3);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        if (this.b(iu2, cmz2, bqk2)) {
            return this.s().a(a, (Comparable)((Object)bqk2));
        }
        for (bqk bqk3 : afj.a) {
            if (!iu2.d(cmz2.c(bqk3.e()), true)) continue;
            return this.s().a(a, (Comparable)((Object)bqk3));
        }
        return this.s();
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.f(iu2, cmz2, dbk2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        this.e(iu2, cmz2, dbk2);
    }

    protected boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (!this.f(iu2, cmz2, dbk2)) {
            return true;
        }
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        ctv ctv2 = bqk2.l();
        bqk bqk3 = bqk2.e();
        boolean bl2 = false;
        if (ctv2.d() && !iu2.d(cmz2.c(bqk3), true)) {
            bl2 = true;
        } else if (ctv2.c() && !this.c(iu2, cmz2.c(bqk3))) {
            bl2 = true;
        }
        if (bl2) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
            return true;
        }
        return false;
    }

    protected boolean f(iu iu2, cmz cmz2, dbk dbk2) {
        if (dbk2.t() == this && this.b(iu2, cmz2, (bqk)((Object)dbk2.b(a)))) {
            return true;
        }
        if (iu2.n(cmz2).t() == this) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        double d2 = (double)cmz2.a() + 0.5;
        double d3 = (double)cmz2.b() + 0.7;
        double d4 = (double)cmz2.c() + 0.5;
        double d5 = 0.22;
        double d6 = 0.27;
        if (bqk2.l().d()) {
            bqk bqk3 = bqk2.e();
            iu2.a(lz.l, d2 + 0.27 * (double)bqk3.h(), d3 + 0.22, d4 + 0.27 * (double)bqk3.j(), 0.0, 0.0, 0.0, new int[0]);
            iu2.a(lz.A, d2 + 0.27 * (double)bqk3.h(), d3 + 0.22, d4 + 0.27 * (double)bqk3.j(), 0.0, 0.0, 0.0, new int[0]);
        } else {
            iu2.a(lz.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
            iu2.a(lz.A, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s();
        switch (n2) {
            case 1: {
                dbk2 = dbk2.a(a, (Comparable)((Object)bqk.f));
                break;
            }
            case 2: {
                dbk2 = dbk2.a(a, (Comparable)((Object)bqk.e));
                break;
            }
            case 3: {
                dbk2 = dbk2.a(a, (Comparable)((Object)bqk.d));
                break;
            }
            case 4: {
                dbk2 = dbk2.a(a, (Comparable)((Object)bqk.c));
                break;
            }
            default: {
                dbk2 = dbk2.a(a, (Comparable)((Object)bqk.b));
            }
        }
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        switch ((bqk)((Object)dbk2.b(a))) {
            case f: {
                n2 |= 1;
                break;
            }
            case e: {
                n2 |= 2;
                break;
            }
            case d: {
                n2 |= 3;
                break;
            }
            case c: {
                n2 |= 4;
                break;
            }
            default: {
                n2 |= 5;
            }
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(a))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

