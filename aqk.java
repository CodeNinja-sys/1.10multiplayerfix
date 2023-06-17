/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aqk
extends vl {
    private static final Map g = sz.c();
    private final boolean h;

    private boolean a(iu iu2, cmz cmz2, boolean bl2) {
        if (!g.containsKey(iu2)) {
            g.put(iu2, ov.a());
        }
        List list = (List)g.get(iu2);
        if (bl2) {
            list.add(new dce(cmz2, iu2.z()));
        }
        int n2 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            dce dce2 = (dce)list.get(i2);
            if (!dce2.a.equals(cmz2) || ++n2 < 8) continue;
            return true;
        }
        return false;
    }

    protected aqk(boolean bl2) {
        this.h = bl2;
        this.b(true);
        this.a((zm)null);
    }

    @Override
    public int a(iu iu2) {
        return 2;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.h) {
            for (bqk bqk2 : bqk.values()) {
                iu2.b(cmz2.c(bqk2), this);
            }
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.h) {
            for (bqk bqk2 : bqk.values()) {
                iu2.b(cmz2.c(bqk2), this);
            }
        }
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (this.h && dbk2.b(a) != bqk2) {
            return 15;
        }
        return 0;
    }

    private boolean g(iu iu2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = ((bqk)((Object)dbk2.b(a))).e();
        return iu2.b(cmz2.c(bqk2), bqk2);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        boolean bl2 = this.g(iu2, cmz2, dbk2);
        List list = (List)g.get(iu2);
        while (list != null && !list.isEmpty() && iu2.z() - ((dce)list.get((int)0)).b > 60L) {
            list.remove(0);
        }
        if (this.h) {
            if (bl2) {
                iu2.a(cmz2, blg.aE.s().a(a, dbk2.b(a)), 3);
                if (this.a(iu2, cmz2, true)) {
                    iu2.a(null, cmz2, dah.eR, csg.e, 0.5f, 2.6f + (iu2.p.nextFloat() - iu2.p.nextFloat()) * 0.8f);
                    for (int i2 = 0; i2 < 5; ++i2) {
                        double d2 = (double)cmz2.a() + random.nextDouble() * 0.6 + 0.2;
                        double d3 = (double)cmz2.b() + random.nextDouble() * 0.6 + 0.2;
                        double d4 = (double)cmz2.c() + random.nextDouble() * 0.6 + 0.2;
                        iu2.a(lz.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
                    }
                    iu2.a(cmz2, iu2.n(cmz2).t(), 160);
                }
            }
        } else if (!bl2 && !this.a(iu2, cmz2, false)) {
            iu2.a(cmz2, blg.aF.s().a(a, dbk2.b(a)), 3);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (this.e(iu2, cmz2, dbk2)) {
            return;
        }
        if (this.h == this.g(iu2, cmz2, dbk2)) {
            iu2.a(cmz2, (bfa)this, this.a(iu2));
        }
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bqk2 == bqk.a) {
            return dbk2.a(bnj2, cmz2, bqk2);
        }
        return 0;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.aF);
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        if (!this.h) {
            return;
        }
        double d2 = (double)cmz2.a() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
        double d3 = (double)cmz2.b() + 0.7 + (random.nextDouble() - 0.5) * 0.2;
        double d4 = (double)cmz2.c() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        if (bqk2.l().d()) {
            bqk bqk3 = bqk2.e();
            double d5 = 0.27;
            d2 += 0.27 * (double)bqk3.h();
            d3 += 0.22;
            d4 += 0.27 * (double)bqk3.j();
        }
        iu2.a(lz.E, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.aF);
    }

    @Override
    public boolean a(bfa bfa2) {
        return bfa2 == blg.aE || bfa2 == blg.aF;
    }
}

