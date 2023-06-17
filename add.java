/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class add
extends lp
implements btz {
    public static final byc a = byc.a("type", deq.class);
    protected static final cxt c = new cxt(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);

    protected add() {
        super(ahk.l);
        this.D(this.O.b().a(a, (Comparable)((Object)deq.a)));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c;
    }

    @Override
    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        return this.m(iu2.n(cmz2.h()));
    }

    @Override
    public boolean a_(bnj bnj2, cmz cmz2) {
        return true;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (random.nextInt(8) == 0) {
            return hp.P;
        }
        return null;
    }

    @Override
    public int a(int n2, Random random) {
        return 1 + random.nextInt(n2 * 2 + 1);
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        if (!iu2.C && bhl2 != null && bhl2.a() == hp.bl) {
            bdl2.a(bpv.a(this));
            add.a(iu2, cmz2, new bhl(blg.H, 1, ((deq)((Object)dbk2.b(a))).b()));
        } else {
            super.a(iu2, bdl2, cmz2, dbk2, bql2, bhl2);
        }
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this, 1, dbk2.t().e(dbk2));
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (int i2 = 1; i2 < 3; ++i2) {
            list.add(new bhl(azg2, 1, i2));
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        return dbk2.b(a) != deq.a;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return true;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        bon bon2 = bon.c;
        if (dbk2.b(a) == deq.c) {
            bon2 = bon.d;
        }
        if (blg.cF.a(iu2, cmz2)) {
            blg.cF.a(iu2, cmz2, bon2, 2);
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)deq.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((deq)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public bjp aA_() {
        return bjp.c;
    }
}

