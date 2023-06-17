/*
 * Decompiled with CFR 0.150.
 */
public class cex
extends bfa {
    public static final byc a = byc.a("facing", bta.class);
    public static final ddi b = ddi.b("powered");
    protected static final cxt c = new cxt(0.3125, 0.2f, 0.625, 0.6875, 0.8f, 1.0);
    protected static final cxt d = new cxt(0.3125, 0.2f, 0.0, 0.6875, 0.8f, 0.375);
    protected static final cxt e = new cxt(0.625, 0.2f, 0.3125, 1.0, 0.8f, 0.6875);
    protected static final cxt f = new cxt(0.0, 0.2f, 0.3125, 0.375, 0.8f, 0.6875);
    protected static final cxt g = new cxt(0.25, 0.0, 0.25, 0.75, 0.6f, 0.75);
    protected static final cxt h = new cxt(0.25, 0.4f, 0.25, 0.75, 1.0, 0.75);

    protected cex() {
        super(ahk.q);
        this.D(this.O.b().a(a, (Comparable)((Object)bta.e)).a(b, Boolean.valueOf(false)));
        this.a(zm.d);
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

    @Override
    public boolean a_(iu iu2, cmz cmz2, bqk bqk2) {
        return cex.b(iu2, cmz2, bqk2.e());
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        for (bqk bqk2 : bqk.values()) {
            if (!cex.b(iu2, cmz2, bqk2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean b(iu iu2, cmz cmz2, bqk bqk2) {
        return rz.b(iu2, cmz2, bqk2);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        dbk dbk2 = this.s().a(b, Boolean.valueOf(false));
        if (cex.b(iu2, cmz2, bqk2.e())) {
            return dbk2.a(a, (Comparable)((Object)bta.a(bqk2, bga2.B_())));
        }
        for (bqk bqk3 : afj.a) {
            if (bqk3 == bqk2 || !cex.b(iu2, cmz2, bqk3.e())) continue;
            return dbk2.a(a, (Comparable)((Object)bta.a(bqk3, bga2.B_())));
        }
        if (iu2.n(cmz2.h()).q()) {
            return dbk2.a(a, (Comparable)((Object)bta.a(bqk.b, bga2.B_())));
        }
        return dbk2;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (this.e(iu2, cmz2, dbk2) && !cex.b(iu2, cmz2, ((bta)((Object)dbk2.b(a))).c().e())) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
    }

    private boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.a(iu2, cmz2)) {
            return true;
        }
        this.b(iu2, cmz2, dbk2, 0);
        iu2.f(cmz2);
        return false;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bta)((Object)dbk2.b(a))) {
            default: {
                return f;
            }
            case c: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
            case f: 
            case g: {
                return g;
            }
            case a: 
            case h: 
        }
        return h;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        dbk2 = dbk2.a(b);
        iu2.a(cmz2, dbk2, 3);
        float f5 = (Boolean)dbk2.b(b) != false ? 0.6f : 0.5f;
        iu2.a(null, cmz2, dah.dl, csg.e, 0.3f, f5);
        iu2.b(cmz2, this);
        bqk bqk3 = ((bta)((Object)dbk2.b(a))).c();
        iu2.b(cmz2.c(bqk3.e()), this);
        return true;
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            iu2.b(cmz2, this);
            bqk bqk2 = ((bta)((Object)dbk2.b(a))).c();
            iu2.b(cmz2.c(bqk2.e()), this);
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return (Boolean)dbk2.b(b) != false ? 15 : 0;
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!((Boolean)dbk2.b(b)).booleanValue()) {
            return 0;
        }
        if (((bta)((Object)dbk2.b(a))).c() == bqk2) {
            return 15;
        }
        return 0;
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bta.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bta)((Object)dbk2.b(a))).b();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case c: {
                switch ((bta)((Object)dbk2.b(a))) {
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)bta.c));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)bta.b));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)bta.e));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)bta.d));
                    }
                }
                return dbk2;
            }
            case d: {
                switch ((bta)((Object)dbk2.b(a))) {
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)bta.e));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)bta.d));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)bta.b));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)bta.c));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)bta.g));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)bta.f));
                    }
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)bta.h));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)bta.a));
                    }
                }
            }
            case b: {
                switch ((bta)((Object)dbk2.b(a))) {
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)bta.d));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)bta.e));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)bta.c));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)bta.b));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)bta.g));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)bta.f));
                    }
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)bta.h));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)bta.a));
                    }
                }
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a(((bta)((Object)dbk2.b(a))).c()));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }
}

