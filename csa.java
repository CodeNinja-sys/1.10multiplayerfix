/*
 * Decompiled with CFR 0.150.
 */
public class csa
extends bfa {
    public static final yc a = cli.j;
    public static final ddi b = ddi.b("open");
    public static final byc c = byc.a("half", ahz.class);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
    protected static final cxt e = new cxt(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt f = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
    protected static final cxt g = new cxt(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
    protected static final cxt h = new cxt(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0);
    protected static final cxt i = new cxt(0.0, 0.8125, 0.0, 1.0, 1.0, 1.0);

    protected csa(ahk ahk2) {
        super(ahk2);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Boolean.valueOf(false)).a(c, (Comparable)((Object)ahz.b)));
        this.a(zm.d);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        cxt cxt2;
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            switch ((bqk)((Object)dbk2.b(a))) {
                default: {
                    cxt2 = g;
                    break;
                }
                case d: {
                    cxt2 = f;
                    break;
                }
                case e: {
                    cxt2 = e;
                    break;
                }
                case f: {
                    cxt2 = d;
                    break;
                }
            }
        } else {
            cxt2 = dbk2.b(c) == ahz.a ? i : h;
        }
        return cxt2;
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
    public boolean a(bnj bnj2, cmz cmz2) {
        return (Boolean)bnj2.n(cmz2).b(b) == false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (this.L == ahk.f) {
            return true;
        }
        dbk2 = dbk2.a(b);
        iu2.a(cmz2, dbk2, 2);
        this.a(bdl2, iu2, cmz2, (Boolean)dbk2.b(b));
        return true;
    }

    protected void a(bdl bdl2, iu iu2, cmz cmz2, boolean bl2) {
        if (bl2) {
            int n2 = this.L == ahk.f ? 1037 : 1007;
            iu2.a(bdl2, n2, cmz2, 0);
        } else {
            int n3 = this.L == ahk.f ? 1036 : 1013;
            iu2.a(bdl2, n3, cmz2, 0);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        boolean bl2;
        if (iu2.C) {
            return;
        }
        boolean bl3 = iu2.x(cmz2);
        if ((bl3 || bfa2.s().m()) && (bl2 = ((Boolean)dbk2.b(b)).booleanValue()) != bl3) {
            iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(bl3)), 2);
            this.a(null, iu2, cmz2, bl3);
        }
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        dbk dbk2 = this.s();
        if (bqk2.l().d()) {
            dbk2 = dbk2.a(a, (Comparable)((Object)bqk2)).a(b, Boolean.valueOf(false));
            dbk2 = dbk2.a(c, (Comparable)((Object)(f3 > 0.5f ? ahz.a : ahz.b)));
        } else {
            dbk2 = dbk2.a(a, (Comparable)((Object)bga2.B_().e())).a(b, Boolean.valueOf(false));
            dbk2 = dbk2.a(c, (Comparable)((Object)(bqk2 == bqk.b ? ahz.b : ahz.a)));
        }
        return dbk2;
    }

    @Override
    public boolean a_(iu iu2, cmz cmz2, bqk bqk2) {
        return true;
    }

    protected static bqk b(int n2) {
        switch (n2 & 3) {
            case 0: {
                return bqk.c;
            }
            case 1: {
                return bqk.d;
            }
            case 2: {
                return bqk.e;
            }
        }
        return bqk.f;
    }

    protected static int a(bqk bqk2) {
        switch (bqk2) {
            case c: {
                return 0;
            }
            case d: {
                return 1;
            }
            case e: {
                return 2;
            }
        }
        return 3;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)csa.b(n2))).a(b, Boolean.valueOf((n2 & 4) != 0)).a(c, (Comparable)((Object)((n2 & 8) == 0 ? ahz.b : ahz.a)));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= csa.a((bqk)((Object)dbk2.b(a)));
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 4;
        }
        if (dbk2.b(c) == ahz.a) {
            n2 |= 8;
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
        return new bkp(this, a, b, c);
    }
}

