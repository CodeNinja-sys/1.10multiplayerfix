/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class crh
extends ar {
    public static final yc a = ajj.o;
    public static final ddi b = ddi.b("triggered");
    public static final bbx c = new bbx(new ckc());
    protected Random d = new Random();

    protected crh() {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Boolean.valueOf(false)));
        this.a(zm.d);
    }

    @Override
    public int a(iu iu2) {
        return 4;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        super.a(iu2, cmz2, dbk2);
        this.e(iu2, cmz2, dbk2);
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        if (iu2.C) {
            return;
        }
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        boolean bl2 = iu2.n(cmz2.i()).b();
        boolean bl3 = iu2.n(cmz2.j()).b();
        if (bqk2 == bqk.c && bl2 && !bl3) {
            bqk2 = bqk.d;
        } else if (bqk2 == bqk.d && bl3 && !bl2) {
            bqk2 = bqk.c;
        } else {
            boolean bl4 = iu2.n(cmz2.k()).b();
            boolean bl5 = iu2.n(cmz2.l()).b();
            if (bqk2 == bqk.e && bl4 && !bl5) {
                bqk2 = bqk.f;
            } else if (bqk2 == bqk.f && bl5 && !bl4) {
                bqk2 = bqk.e;
            }
        }
        iu2.a(cmz2, dbk2.a(a, (Comparable)((Object)bqk2)).a(b, Boolean.valueOf(false)), 2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bqo) {
            bdl2.a((bqo)bql2);
            if (bql2 instanceof cvy) {
                bdl2.a(bpv.Q);
            } else {
                bdl2.a(bpv.S);
            }
        }
        return true;
    }

    protected void c(iu iu2, cmz cmz2) {
        anx anx2 = new anx(iu2, cmz2);
        bqo bqo2 = (bqo)anx2.g();
        if (bqo2 == null) {
            return;
        }
        int n2 = bqo2.k();
        if (n2 < 0) {
            iu2.b(1001, cmz2, 0);
            return;
        }
        bhl bhl2 = bqo2.a(n2);
        atl atl2 = this.a(bhl2);
        if (atl2 != atl.c) {
            bhl bhl3 = atl2.b(anx2, bhl2);
            bqo2.a(n2, bhl3.b <= 0 ? null : bhl3);
        }
    }

    protected atl a(bhl bhl2) {
        return (atl)c.c(bhl2 == null ? null : bhl2.a());
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        boolean bl2 = iu2.x(cmz2) || iu2.x(cmz2.g());
        boolean bl3 = (Boolean)dbk2.b(b);
        if (bl2 && !bl3) {
            iu2.a(cmz2, (bfa)this, this.a(iu2));
            iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(true)), 4);
        } else if (!bl2 && bl3) {
            iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(false)), 4);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (!iu2.C) {
            this.c(iu2, cmz2);
        }
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new bqo();
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)ath.a(cmz2, bga2))).a(b, Boolean.valueOf(false));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2;
        iu2.a(cmz2, dbk2.a(a, (Comparable)((Object)ath.a(cmz2, bga2))), 2);
        if (bhl2.s() && (bql2 = iu2.q(cmz2)) instanceof bqo) {
            ((bqo)bql2).a(bhl2.q());
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bqo) {
            ckw.a(iu2, cmz2, (tb)((bqo)bql2));
            iu2.f(cmz2, this);
        }
        super.b(iu2, cmz2, dbk2);
    }

    public static bts a(bcl bcl2) {
        bqk bqk2 = (bqk)((Object)bcl2.f().b(a));
        double d2 = bcl2.b() + 0.7 * (double)bqk2.h();
        double d3 = bcl2.c() + 0.7 * (double)bqk2.i();
        double d4 = bcl2.d() + 0.7 * (double)bqk2.j();
        return new ayk(d2, d3, d4);
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        return apq.a(iu2.q(cmz2));
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bqk.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(a))).b();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
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
        return new bkp(this, a, b);
    }
}

