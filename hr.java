/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class hr
extends azg {
    public static final int[] a = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};

    public hr() {
        this.a(true);
        this.e(0);
        this.a(zm.l);
    }

    @Override
    public String b(bhl bhl2) {
        int n2 = bhl2.h();
        return super.a() + "." + dck.a(n2).d();
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (!bdl2.a(cmz2.c(bqk2), bqk2, bhl2)) {
            return cey.c;
        }
        dck dck2 = dck.a(bhl2.h());
        if (dck2 == dck.a) {
            if (hr.a(bhl2, iu2, cmz2)) {
                if (!iu2.C) {
                    iu2.b(2005, cmz2, 0);
                }
                return cey.a;
            }
        } else if (dck2 == dck.m) {
            dbk dbk2 = iu2.n(cmz2);
            bfa bfa2 = dbk2.t();
            if (bfa2 == blg.r && dbk2.b(ff.a) == zg.d) {
                if (bqk2 == bqk.a || bqk2 == bqk.b) {
                    return cey.c;
                }
                if (iu2.c(cmz2 = cmz2.c(bqk2))) {
                    dbk dbk3 = blg.bN.a(iu2, cmz2, bqk2, f2, f3, f4, 0, bdl2);
                    iu2.a(cmz2, dbk3, 10);
                    if (!bdl2.G.d) {
                        --bhl2.b;
                    }
                }
                return cey.a;
            }
            return cey.c;
        }
        return cey.b;
    }

    public static boolean a(bhl bhl2, iu iu2, cmz cmz2) {
        btz btz2;
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() instanceof btz && (btz2 = (btz)((Object)dbk2.t())).a(iu2, cmz2, dbk2, iu2.C)) {
            if (!iu2.C) {
                if (btz2.a(iu2, iu2.p, cmz2, dbk2)) {
                    btz2.b(iu2, iu2.p, cmz2, dbk2);
                }
                --bhl2.b;
            }
            return true;
        }
        return false;
    }

    public static void a(iu iu2, cmz cmz2, int n2) {
        dbk dbk2;
        if (n2 == 0) {
            n2 = 15;
        }
        if ((dbk2 = iu2.n(cmz2)).a() == ahk.a) {
            return;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            double d2 = j.nextGaussian() * 0.02;
            double d3 = j.nextGaussian() * 0.02;
            double d4 = j.nextGaussian() * 0.02;
            iu2.a(lz.v, (double)((float)cmz2.a() + j.nextFloat()), (double)cmz2.b() + (double)j.nextFloat() * dbk2.c((bnj)iu2, (cmz)cmz2).e, (double)((float)cmz2.c() + j.nextFloat()), d2, d3, d4, new int[0]);
        }
    }

    @Override
    public boolean a(bhl bhl2, bdl bdl2, bga bga2, bqp bqp2) {
        if (bga2 instanceof ne) {
            ne ne2 = (ne)bga2;
            dck dck2 = dck.a(bhl2.h());
            if (!ne2.B() && ne2.x() != dck2) {
                ne2.b(dck2);
                --bhl2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new bhl(azg2, 1, i2));
        }
    }
}

