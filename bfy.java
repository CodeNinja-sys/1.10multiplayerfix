/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bfy
extends aai {
    public static final byc e = byc.a("variant", zg.class, new aox());

    public bfy() {
        this.D(this.O.b().a(e, (Comparable)((Object)zg.e)).a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
    }

    @Override
    protected void a(iu iu2, cmz cmz2, dbk dbk2, int n2) {
        if (dbk2.b(e) == zg.f && iu2.p.nextInt(n2) == 0) {
            bfy.a(iu2, cmz2, new bhl(hp.e));
        }
    }

    @Override
    public int d(dbk dbk2) {
        return ((zg)((Object)dbk2.b(e))).b();
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this, 1, dbk2.t().e(dbk2) & 3);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2, 1, 0));
        list.add(new bhl(azg2, 1, 1));
    }

    @Override
    protected bhl a_(dbk dbk2) {
        return new bhl(azg.a(this), 1, ((zg)((Object)dbk2.b(e))).b() - 4);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(e, (Comparable)((Object)this.b(n2))).a(a, Boolean.valueOf((n2 & 4) == 0)).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((zg)((Object)dbk2.b(e))).b() - 4;
        if (!((Boolean)dbk2.b(a)).booleanValue()) {
            n2 |= 4;
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public zg b(int n2) {
        return zg.a((n2 & 3) + 4);
    }

    @Override
    protected bkp a() {
        return new bkp(this, e, b, a);
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        if (!iu2.C && bhl2 != null && bhl2.a() == hp.bl) {
            bdl2.a(bpv.a(this));
            bfy.a(iu2, cmz2, new bhl(azg.a(this), 1, ((zg)((Object)dbk2.b(e))).b() - 4));
            return;
        }
        super.a(iu2, bdl2, cmz2, dbk2, bql2, bhl2);
    }
}

