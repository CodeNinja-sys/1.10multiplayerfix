/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class afp
extends ajj {
    protected static final cxt a = new cxt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);
    protected static final cxt b = new cxt(0.375, 0.375, 0.0, 0.625, 0.625, 1.0);
    protected static final cxt c = new cxt(0.0, 0.375, 0.375, 1.0, 0.625, 0.625);

    protected afp() {
        super(ahk.q);
        this.D(this.O.b().a(o, (Comparable)((Object)bqk.b)));
        this.a(zm.c);
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(o, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(o)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(o, (Comparable)((Object)cdk2.b((bqk)((Object)dbk2.b(o)))));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch (((bqk)((Object)dbk2.b(o))).l()) {
            default: {
                return c;
            }
            case c: {
                return b;
            }
            case b: 
        }
        return a;
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
    public boolean a(iu iu2, cmz cmz2) {
        return true;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        bqk bqk3;
        dbk dbk2 = iu2.n(cmz2.c(bqk2.e()));
        if (dbk2.t() == blg.cQ && (bqk3 = (bqk)((Object)dbk2.b(o))) == bqk2) {
            return this.s().a(o, (Comparable)((Object)bqk2.e()));
        }
        return this.s().a(o, (Comparable)((Object)bqk2));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        bqk bqk2 = (bqk)((Object)dbk2.b(o));
        double d2 = (double)cmz2.a() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d3 = (double)cmz2.b() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d4 = (double)cmz2.c() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d5 = 0.4f - (random.nextFloat() + random.nextFloat()) * 0.4f;
        if (random.nextInt(5) == 0) {
            iu2.a(lz.R, d2 + (double)bqk2.h() * d5, d3 + (double)bqk2.i() * d5, d4 + (double)bqk2.j() * d5, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, new int[0]);
        }
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s();
        dbk2 = dbk2.a(o, (Comparable)((Object)bqk.a(n2)));
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        return ((bqk)((Object)dbk2.b(o))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, o);
    }

    @Override
    public bez j(dbk dbk2) {
        return bez.a;
    }
}

