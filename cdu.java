/*
 * Decompiled with CFR 0.150.
 */
public class cdu
extends ar {
    public static final ddi a = ddi.b("has_record");

    public static void a(cgy cgy2) {
        cgy2.a(bst.d, (cui)new amo("RecordPlayer", new String[]{"RecordItem"}));
    }

    protected cdu() {
        super(ahk.d, bif.l);
        this.D(this.O.b().a(a, Boolean.valueOf(false)));
        this.a(zm.c);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            this.e(iu2, cmz2, dbk2);
            dbk2 = dbk2.a(a, Boolean.valueOf(false));
            iu2.a(cmz2, dbk2, 2);
            return true;
        }
        return false;
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, bhl bhl2) {
        if (iu2.C) {
            return;
        }
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof d)) {
            return;
        }
        ((d)bql2).a(bhl2.j());
        iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(true)), 2);
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        if (iu2.C) {
            return;
        }
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof d)) {
            return;
        }
        d d2 = (d)bql2;
        bhl bhl2 = d2.a();
        if (bhl2 == null) {
            return;
        }
        iu2.b(1010, cmz2, 0);
        iu2.a(cmz2, (bi)null);
        d2.a((bhl)null);
        float f2 = 0.7f;
        double d3 = (double)(iu2.p.nextFloat() * 0.7f) + (double)0.15f;
        double d4 = (double)(iu2.p.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
        double d5 = (double)(iu2.p.nextFloat() * 0.7f) + (double)0.15f;
        bhl bhl3 = bhl2.j();
        er er2 = new er(iu2, (double)cmz2.a() + d3, (double)cmz2.b() + d4, (double)cmz2.c() + d5, bhl3);
        er2.l();
        iu2.b(er2);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        this.e(iu2, cmz2, dbk2);
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        if (iu2.C) {
            return;
        }
        super.a(iu2, cmz2, dbk2, f2, 0);
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new d();
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        bhl bhl2;
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof d && (bhl2 = ((d)bql2).a()) != null) {
            return azg.a(bhl2.a()) + 1 - azg.a(hp.cA);
        }
        return 0;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Boolean.valueOf(n2 > 0));
    }

    @Override
    public int e(dbk dbk2) {
        return (Boolean)dbk2.b(a) != false ? 1 : 0;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

