/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class avw
extends ar {
    public static final yc a = cli.j;
    protected static final cxt b = new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);

    protected avw() {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)));
        this.a(zm.c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b;
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
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.Z);
    }

    @Override
    public int a(Random random) {
        return 8;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)bga2.B_().e()));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        iu2.a(cmz2, dbk2.a(a, (Comparable)((Object)bga2.B_().e())), 2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        aqx aqx2 = bdl2.aJ();
        bql bql2 = iu2.q(cmz2);
        if (aqx2 == null || !(bql2 instanceof abn)) {
            return true;
        }
        if (iu2.n(cmz2.g()).l()) {
            return true;
        }
        if (iu2.C) {
            return true;
        }
        aqx2.a((abn)bql2);
        bdl2.a(aqx2);
        bdl2.a(bpv.X);
        return true;
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new abn();
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        for (int i2 = 0; i2 < 3; ++i2) {
            int n2 = random.nextInt(2) * 2 - 1;
            int n3 = random.nextInt(2) * 2 - 1;
            double d2 = (double)cmz2.a() + 0.5 + 0.25 * (double)n2;
            double d3 = (float)cmz2.b() + random.nextFloat();
            double d4 = (double)cmz2.c() + 0.5 + 0.25 * (double)n3;
            double d5 = random.nextFloat() * (float)n2;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.125;
            double d7 = random.nextFloat() * (float)n3;
            iu2.a(lz.y, d2, d3, d4, d5, d6, d7, new int[0]);
        }
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

