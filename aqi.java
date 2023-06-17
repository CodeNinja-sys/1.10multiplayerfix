/*
 * Decompiled with CFR 0.150.
 */
public class aqi
extends ar {
    public static final yc a = cli.j;
    protected static final cxt b = new cxt(0.0625, 0.0, 0.0, 0.9375, 0.875, 0.9375);
    protected static final cxt c = new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.875, 1.0);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
    protected static final cxt e = new cxt(0.0625, 0.0, 0.0625, 1.0, 0.875, 0.9375);
    protected static final cxt f = new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
    public final asr g;

    protected aqi(asr asr2) {
        super(ahk.d);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)));
        this.g = asr2;
        this.a(asr2 == asr.b ? zm.d : zm.c);
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
    public cpb g(dbk dbk2) {
        return cpb.c;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (bnj2.n(cmz2.i()).t() == this) {
            return b;
        }
        if (bnj2.n(cmz2.j()).t() == this) {
            return c;
        }
        if (bnj2.n(cmz2.k()).t() == this) {
            return d;
        }
        if (bnj2.n(cmz2.l()).t() == this) {
            return e;
        }
        return f;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.e(iu2, cmz2, dbk2);
        for (bqk bqk2 : afj.a) {
            cmz cmz3 = cmz2.c(bqk2);
            dbk dbk3 = iu2.n(cmz3);
            if (dbk3.t() != this) continue;
            this.e(iu2, cmz3, dbk3);
        }
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)bga2.B_()));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2;
        boolean bl2;
        bqk bqk2 = bqk.b(cmk.c((double)(bga2.ba * 4.0f / 360.0f) + 0.5) & 3).e();
        dbk2 = dbk2.a(a, (Comparable)((Object)bqk2));
        cmz cmz3 = cmz2.i();
        cmz cmz4 = cmz2.j();
        cmz cmz5 = cmz2.k();
        cmz cmz6 = cmz2.l();
        boolean bl3 = this == iu2.n(cmz3).t();
        boolean bl4 = this == iu2.n(cmz4).t();
        boolean bl5 = this == iu2.n(cmz5).t();
        boolean bl6 = bl2 = this == iu2.n(cmz6).t();
        if (bl3 || bl4 || bl5 || bl2) {
            if (bqk2.l() == ctv.a && (bl3 || bl4)) {
                if (bl3) {
                    iu2.a(cmz3, dbk2, 3);
                } else {
                    iu2.a(cmz4, dbk2, 3);
                }
                iu2.a(cmz2, dbk2, 3);
            } else if (bqk2.l() == ctv.c && (bl5 || bl2)) {
                if (bl5) {
                    iu2.a(cmz5, dbk2, 3);
                } else {
                    iu2.a(cmz6, dbk2, 3);
                }
                iu2.a(cmz2, dbk2, 3);
            }
        } else {
            iu2.a(cmz2, dbk2, 3);
        }
        if (bhl2.s() && (bql2 = iu2.q(cmz2)) instanceof bdm) {
            ((bdm)bql2).a(bhl2.q());
        }
    }

    public dbk e(iu iu2, cmz cmz2, dbk dbk2) {
        if (iu2.C) {
            return dbk2;
        }
        dbk dbk3 = iu2.n(cmz2.i());
        dbk dbk4 = iu2.n(cmz2.j());
        dbk dbk5 = iu2.n(cmz2.k());
        dbk dbk6 = iu2.n(cmz2.l());
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        if (dbk3.t() == this || dbk4.t() == this) {
            cmz cmz3 = dbk3.t() == this ? cmz2.i() : cmz2.j();
            dbk dbk7 = iu2.n(cmz3.k());
            dbk dbk8 = iu2.n(cmz3.l());
            bqk2 = bqk.f;
            bqk bqk3 = dbk3.t() == this ? (bqk)((Object)dbk3.b(a)) : (bqk)((Object)dbk4.b(a));
            if (bqk3 == bqk.e) {
                bqk2 = bqk.e;
            }
            if ((dbk5.b() || dbk7.b()) && !dbk6.b() && !dbk8.b()) {
                bqk2 = bqk.f;
            }
            if ((dbk6.b() || dbk8.b()) && !dbk5.b() && !dbk7.b()) {
                bqk2 = bqk.e;
            }
        } else {
            boolean bl2 = dbk3.b();
            boolean bl3 = dbk4.b();
            if (dbk5.t() == this || dbk6.t() == this) {
                cmz cmz4 = dbk5.t() == this ? cmz2.k() : cmz2.l();
                dbk dbk9 = iu2.n(cmz4.i());
                dbk dbk10 = iu2.n(cmz4.j());
                bqk2 = bqk.d;
                bqk bqk4 = dbk5.t() == this ? (bqk)((Object)dbk5.b(a)) : (bqk)((Object)dbk6.b(a));
                if (bqk4 == bqk.c) {
                    bqk2 = bqk.c;
                }
                if ((bl2 || dbk9.b()) && !bl3 && !dbk10.b()) {
                    bqk2 = bqk.d;
                }
                if ((bl3 || dbk10.b()) && !bl2 && !dbk9.b()) {
                    bqk2 = bqk.c;
                }
            }
        }
        dbk2 = dbk2.a(a, (Comparable)((Object)bqk2));
        iu2.a(cmz2, dbk2, 3);
        return dbk2;
    }

    public dbk f(iu iu2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = null;
        for (bqk bqk3 : afj.a) {
            dbk dbk3 = iu2.n(cmz2.c(bqk3));
            if (dbk3.t() == this) {
                return dbk2;
            }
            if (!dbk3.b()) continue;
            if (bqk2 == null) {
                bqk2 = bqk3;
                continue;
            }
            bqk2 = null;
            break;
        }
        if (bqk2 != null) {
            return dbk2.a(a, (Comparable)((Object)bqk2.e()));
        }
        Object object = (bqk)((Object)dbk2.b(a));
        if (iu2.n(cmz2.c((bqk)object)).b()) {
            object = ((bqk)object).e();
        }
        if (iu2.n(cmz2.c((bqk)object)).b()) {
            object = ((bqk)object).f();
        }
        if (iu2.n(cmz2.c((bqk)object)).b()) {
            object = ((bqk)object).e();
        }
        return dbk2.a(a, (Comparable)object);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        int n2 = 0;
        cmz cmz3 = cmz2.k();
        cmz cmz4 = cmz2.l();
        cmz cmz5 = cmz2.i();
        cmz cmz6 = cmz2.j();
        if (iu2.n(cmz3).t() == this) {
            if (this.d(iu2, cmz3)) {
                return false;
            }
            ++n2;
        }
        if (iu2.n(cmz4).t() == this) {
            if (this.d(iu2, cmz4)) {
                return false;
            }
            ++n2;
        }
        if (iu2.n(cmz5).t() == this) {
            if (this.d(iu2, cmz5)) {
                return false;
            }
            ++n2;
        }
        if (iu2.n(cmz6).t() == this) {
            if (this.d(iu2, cmz6)) {
                return false;
            }
            ++n2;
        }
        return n2 <= 1;
    }

    private boolean d(iu iu2, cmz cmz2) {
        if (iu2.n(cmz2).t() != this) {
            return false;
        }
        for (bqk bqk2 : afj.a) {
            if (iu2.n(cmz2.c(bqk2)).t() != this) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        super.a(dbk2, iu2, cmz2, bfa2);
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bdm) {
            bql2.g_();
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof tb) {
            ckw.a(iu2, cmz2, (tb)((Object)bql2));
            iu2.f(cmz2, this);
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bme bme2 = this.c(iu2, cmz2);
        if (bme2 != null) {
            bdl2.a(bme2);
            if (this.g == asr.a) {
                bdl2.a(bpv.ac);
            } else if (this.g == asr.b) {
                bdl2.a(bpv.W);
            }
        }
        return true;
    }

    public bme c(iu iu2, cmz cmz2) {
        return this.a(iu2, cmz2, false);
    }

    public bme a(iu iu2, cmz cmz2, boolean bl2) {
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof bdm)) {
            return null;
        }
        bme bme2 = (bdm)bql2;
        if (!bl2 && this.e(iu2, cmz2)) {
            return null;
        }
        for (bqk bqk2 : afj.a) {
            cmz cmz3 = cmz2.c(bqk2);
            bfa bfa2 = iu2.n(cmz3).t();
            if (bfa2 != this) continue;
            if (this.e(iu2, cmz3)) {
                return null;
            }
            bql bql3 = iu2.q(cmz3);
            if (!(bql3 instanceof bdm)) continue;
            if (bqk2 == bqk.e || bqk2 == bqk.c) {
                bme2 = new ayf("container.chestDouble", (bdm)bql3, bme2);
                continue;
            }
            bme2 = new ayf("container.chestDouble", bme2, (bdm)bql3);
        }
        return bme2;
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new bdm();
    }

    @Override
    public boolean i(dbk dbk2) {
        return this.g == asr.b;
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!dbk2.m()) {
            return 0;
        }
        int n2 = 0;
        bql bql2 = bnj2.q(cmz2);
        if (bql2 instanceof bdm) {
            n2 = ((bdm)bql2).j;
        }
        return cmk.a(n2, 0, 15);
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bqk2 == bqk.b) {
            return dbk2.a(bnj2, cmz2, bqk2);
        }
        return 0;
    }

    private boolean e(iu iu2, cmz cmz2) {
        return this.f(iu2, cmz2) || this.g(iu2, cmz2);
    }

    private boolean f(iu iu2, cmz cmz2) {
        return iu2.n(cmz2.g()).l();
    }

    private boolean g(iu iu2, cmz cmz2) {
        for (cpk cpk2 : iu2.a(fl.class, new cxt(cmz2.a(), cmz2.b() + 1, cmz2.c(), cmz2.a() + 1, cmz2.b() + 2, cmz2.c() + 1))) {
            fl fl2 = (fl)cpk2;
            if (!fl2.C()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        return apq.b(this.c(iu2, cmz2));
    }

    @Override
    public dbk a(int n2) {
        bqk bqk2 = bqk.a(n2);
        if (bqk2.l() == ctv.b) {
            bqk2 = bqk.c;
        }
        return this.s().a(a, (Comparable)((Object)bqk2));
    }

    @Override
    public int e(dbk dbk2) {
        return ((bqk)((Object)dbk2.b(a))).b();
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

