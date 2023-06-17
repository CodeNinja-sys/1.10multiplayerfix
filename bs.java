/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bs
extends bfa
implements btz {
    public static final ddi a = ddi.b("snowy");

    protected bs() {
        super(ahk.b);
        this.D(this.O.b().a(a, Boolean.valueOf(false)));
        this.b(true);
        this.a(zm.b);
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        bfa bfa2 = bnj2.n(cmz2.g()).t();
        return dbk2.a(a, Boolean.valueOf(bfa2 == blg.aJ || bfa2 == blg.aH));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        if (iu2.j(cmz2.g()) < 4 && iu2.n(cmz2.g()).c() > 2) {
            iu2.a(cmz2, blg.d.s());
            return;
        }
        if (iu2.j(cmz2.g()) >= 9) {
            for (int i2 = 0; i2 < 4; ++i2) {
                cmz cmz3 = cmz2.e(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (cmz3.b() >= 0 && cmz3.b() < 256 && !iu2.d(cmz3)) {
                    return;
                }
                dbk dbk3 = iu2.n(cmz3.g());
                dbk dbk4 = iu2.n(cmz3);
                if (dbk4.t() != blg.d || dbk4.b(bwt.a) != dgu.a || iu2.j(cmz3.g()) < 4 || dbk3.c() > 2) continue;
                iu2.a(cmz3, blg.c.s());
            }
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return blg.d.a(blg.d.s().a(bwt.a, (Comparable)((Object)dgu.a)), random, n2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return true;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        cmz cmz3 = cmz2.g();
        block0: for (int i2 = 0; i2 < 128; ++i2) {
            cmz cmz4 = cmz3;
            for (int i3 = 0; i3 < i2 / 16; ++i3) {
                if (iu2.n((cmz4 = cmz4.e(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1)).h()).t() != blg.c || iu2.n(cmz4).l()) continue block0;
            }
            if (iu2.n((cmz)cmz4).t().L != ahk.a) continue;
            if (random.nextInt(8) == 0) {
                dbk dbk3;
                amt amt2 = iu2.a(cmz4).a(random, cmz4);
                amh amh2 = amt2.b().a();
                if (!amh2.e(iu2, cmz4, dbk3 = amh2.s().a(amh2.h(), (Comparable)((Object)amt2)))) continue;
                iu2.a(cmz4, dbk3, 3);
                continue;
            }
            dbk dbk4 = blg.H.s().a(add.a, (Comparable)((Object)deq.b));
            if (!blg.H.e(iu2, cmz4, dbk4)) continue;
            iu2.a(cmz4, dbk4, 3);
        }
    }

    @Override
    public kj b() {
        return kj.b;
    }

    @Override
    public int e(dbk dbk2) {
        return 0;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

