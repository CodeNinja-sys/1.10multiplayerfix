/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class aqr
extends lp
implements btz {
    public static final byc a = byc.a("variant", bon.class);
    public static final byc c = byc.a("half", bse.class);
    public static final byc d = cli.j;

    public aqr() {
        super(ahk.l);
        this.D(this.O.b().a(a, (Comparable)((Object)bon.a)).a(c, (Comparable)((Object)bse.b)).a(d, (Comparable)((Object)bqk.c)));
        this.c(0.0f);
        this.a(acv.c);
        this.b("doublePlant");
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return x;
    }

    private bon a(bnj bnj2, cmz cmz2, dbk dbk2) {
        if (dbk2.t() == this) {
            dbk2 = dbk2.b(bnj2, cmz2);
            return (bon)((Object)dbk2.b(a));
        }
        return bon.d;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return super.a(iu2, cmz2) && iu2.c(cmz2.g());
    }

    @Override
    public boolean a_(bnj bnj2, cmz cmz2) {
        dbk dbk2 = bnj2.n(cmz2);
        if (dbk2.t() == this) {
            bon bon2 = (bon)((Object)dbk2.b(bnj2, cmz2).b(a));
            return bon2 == bon.d || bon2 == bon.c;
        }
        return true;
    }

    @Override
    protected void f(iu iu2, cmz cmz2, dbk dbk2) {
        aqr aqr2;
        if (this.e(iu2, cmz2, dbk2)) {
            return;
        }
        boolean bl2 = dbk2.b(c) == bse.a;
        cmz cmz3 = bl2 ? cmz2 : cmz2.g();
        cmz cmz4 = bl2 ? cmz2.h() : cmz2;
        aqr aqr3 = bl2 ? this : iu2.n(cmz3).t();
        bfa bfa2 = aqr2 = bl2 ? iu2.n(cmz4).t() : this;
        if (aqr3 == this) {
            iu2.a(cmz3, blg.a.s(), 2);
        }
        if (aqr2 == this) {
            iu2.a(cmz4, blg.a.s(), 3);
            if (!bl2) {
                this.b(iu2, cmz4, dbk2, 0);
            }
        }
    }

    @Override
    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (dbk2.b(c) == bse.a) {
            return iu2.n(cmz2.h()).t() == this;
        }
        dbk dbk3 = iu2.n(cmz2.g());
        return dbk3.t() == this && super.e(iu2, cmz2, dbk3);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (dbk2.b(c) == bse.a) {
            return null;
        }
        bon bon2 = (bon)((Object)dbk2.b(a));
        if (bon2 == bon.d) {
            return null;
        }
        if (bon2 == bon.c) {
            if (random.nextInt(8) == 0) {
                return hp.P;
            }
            return null;
        }
        return azg.a(this);
    }

    @Override
    public int d(dbk dbk2) {
        if (dbk2.b(c) == bse.a || dbk2.b(a) == bon.c) {
            return 0;
        }
        return ((bon)((Object)dbk2.b(a))).b();
    }

    public void a(iu iu2, cmz cmz2, bon bon2, int n2) {
        iu2.a(cmz2, this.s().a(c, (Comparable)((Object)bse.b)).a(a, (Comparable)((Object)bon2)), n2);
        iu2.a(cmz2.g(), this.s().a(c, (Comparable)((Object)bse.a)), n2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        iu2.a(cmz2.g(), this.s().a(c, (Comparable)((Object)bse.a)), 2);
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        if (!iu2.C && bhl2 != null && bhl2.a() == hp.bl && dbk2.b(c) == bse.b && this.b(iu2, cmz2, dbk2, bdl2)) {
            return;
        }
        super.a(iu2, bdl2, cmz2, dbk2, bql2, bhl2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        if (dbk2.b(c) == bse.a) {
            if (iu2.n(cmz2.h()).t() == this) {
                if (bdl2.G.d) {
                    iu2.f(cmz2.h());
                } else {
                    dbk dbk3 = iu2.n(cmz2.h());
                    bon bon2 = (bon)((Object)dbk3.b(a));
                    if (bon2 == bon.d || bon2 == bon.c) {
                        if (iu2.C) {
                            iu2.f(cmz2.h());
                        } else if (bdl2.bt() != null && bdl2.bt().a() == hp.bl) {
                            this.b(iu2, cmz2, dbk3, bdl2);
                            iu2.f(cmz2.h());
                        } else {
                            iu2.b(cmz2.h(), true);
                        }
                    } else {
                        iu2.b(cmz2.h(), true);
                    }
                }
            }
        } else if (iu2.n(cmz2.g()).t() == this) {
            iu2.a(cmz2.g(), blg.a.s(), 2);
        }
        super.a(iu2, cmz2, dbk2, bdl2);
    }

    private boolean b(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        bon bon2 = (bon)((Object)dbk2.b(a));
        if (bon2 == bon.d || bon2 == bon.c) {
            bdl2.a(bpv.a(this));
            int n2 = (bon2 == bon.c ? deq.b : deq.c).b();
            aqr.a(iu2, cmz2, new bhl(blg.H, 2, n2));
            return true;
        }
        return false;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (bon bon2 : bon.values()) {
            list.add(new bhl(azg2, 1, bon2.b()));
        }
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this, 1, this.a((bnj)iu2, cmz2, dbk2).b());
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        bon bon2 = this.a((bnj)iu2, cmz2, dbk2);
        return bon2 != bon.c && bon2 != bon.d;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return true;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        aqr.a(iu2, cmz2, new bhl(this, 1, this.a((bnj)iu2, cmz2, dbk2).b()));
    }

    @Override
    public dbk a(int n2) {
        if ((n2 & 8) > 0) {
            return this.s().a(c, (Comparable)((Object)bse.a));
        }
        return this.s().a(c, (Comparable)((Object)bse.b)).a(a, (Comparable)((Object)bon.a(n2 & 7)));
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk dbk3;
        if (dbk2.b(c) == bse.a && (dbk3 = bnj2.n(cmz2.h())).t() == this) {
            dbk2 = dbk2.a(a, dbk3.b(a));
        }
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        if (dbk2.b(c) == bse.a) {
            return 8 | ((bqk)((Object)dbk2.b(d))).c();
        }
        return ((bon)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, c, a, d);
    }

    @Override
    public bjp aA_() {
        return bjp.b;
    }
}

