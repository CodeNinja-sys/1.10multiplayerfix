/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cfw
extends ar {
    public static final ddi[] a = new ddi[]{ddi.b("has_bottle_0"), ddi.b("has_bottle_1"), ddi.b("has_bottle_2")};
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    protected static final cxt c = new cxt(0.4375, 0.0, 0.4375, 0.5625, 0.875, 0.5625);

    public cfw() {
        super(ahk.f);
        this.D(this.O.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
    }

    @Override
    public String az_() {
        return caf.a("item.brewingStand.name");
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new buj();
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        cfw.a(cmz2, cxt2, list, c);
        cfw.a(cmz2, cxt2, list, b);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof buj) {
            bdl2.a((buj)bql2);
            bdl2.a(bpv.O);
        }
        return true;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2;
        if (bhl2.s() && (bql2 = iu2.q(cmz2)) instanceof buj) {
            ((buj)bql2).a(bhl2.q());
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        double d2 = (float)cmz2.a() + 0.4f + random.nextFloat() * 0.2f;
        double d3 = (float)cmz2.b() + 0.7f + random.nextFloat() * 0.3f;
        double d4 = (float)cmz2.c() + 0.4f + random.nextFloat() * 0.2f;
        iu2.a(lz.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof buj) {
            ckw.a(iu2, cmz2, (tb)((buj)bql2));
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.bP;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.bP);
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
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s();
        for (int i2 = 0; i2 < 3; ++i2) {
            dbk2 = dbk2.a(a[i2], Boolean.valueOf((n2 & 1 << i2) > 0));
        }
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (!((Boolean)dbk2.b(a[i2])).booleanValue()) continue;
            n2 |= 1 << i2;
        }
        return n2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a[0], a[1], a[2]);
    }
}

