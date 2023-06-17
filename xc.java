/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class xc
extends vh {
    public static final ddi c = ddi.b("locked");
    public static final qf d = qf.a("delay", 1, 4);

    protected xc(boolean bl2) {
        super(bl2);
        this.D(this.O.b().a(j, (Comparable)((Object)bqk.c)).a(d, Integer.valueOf(1)).a(c, Boolean.valueOf(false)));
    }

    @Override
    public String az_() {
        return caf.a("item.diode.name");
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return dbk2.a(c, Boolean.valueOf(this.a(bnj2, cmz2, dbk2)));
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(j, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(j)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(j))));
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (!bdl2.G.e) {
            return false;
        }
        iu2.a(cmz2, dbk2.a(d), 3);
        return true;
    }

    @Override
    protected int r(dbk dbk2) {
        return (Integer)dbk2.b(d) * 2;
    }

    @Override
    protected dbk s(dbk dbk2) {
        Integer n2 = (Integer)dbk2.b(d);
        Boolean bl2 = (Boolean)dbk2.b(c);
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        return blg.bc.s().a(j, (Comparable)((Object)bqk2)).a(d, n2).a(c, bl2);
    }

    @Override
    protected dbk t(dbk dbk2) {
        Integer n2 = (Integer)dbk2.b(d);
        Boolean bl2 = (Boolean)dbk2.b(c);
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        return blg.bb.s().a(j, (Comparable)((Object)bqk2)).a(d, n2).a(c, bl2);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.bi;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.bi);
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2, dbk dbk2) {
        return this.b(bnj2, cmz2, dbk2) > 0;
    }

    @Override
    protected boolean n(dbk dbk2) {
        return xc.o(dbk2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        if (!this.b) {
            return;
        }
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        double d2 = (double)((float)cmz2.a() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d3 = (double)((float)cmz2.b() + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        double d4 = (double)((float)cmz2.c() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
        float f2 = -5.0f;
        if (random.nextBoolean()) {
            f2 = (Integer)dbk2.b(d) * 2 - 1;
        }
        double d5 = (f2 /= 16.0f) * (float)bqk2.h();
        double d6 = f2 * (float)bqk2.j();
        iu2.a(lz.E, d2 + d5, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        super.b(iu2, cmz2, dbk2);
        this.h(iu2, cmz2, dbk2);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(j, (Comparable)((Object)bqk.b(n2))).a(c, Boolean.valueOf(false)).a(d, Integer.valueOf(1 + (n2 >> 2)));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(j))).c();
        return n2 |= (Integer)dbk2.b(d) - 1 << 2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, j, d, c);
    }
}

