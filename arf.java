/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class arf
extends en {
    protected arf(ahk ahk2) {
        super(ahk2);
        this.b(false);
        if (ahk2 == ahk.i) {
            this.b(true);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!this.d(iu2, cmz2, dbk2)) {
            this.e(iu2, cmz2, dbk2);
        }
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        cyi cyi2 = arf.a(this.L);
        iu2.a(cmz2, cyi2.s().a(a, dbk2.b(a)), 2);
        iu2.a(cmz2, (bfa)cyi2, this.a(iu2));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (this.L != ahk.i) {
            return;
        }
        if (!iu2.F().b("doFireTick")) {
            return;
        }
        int n2 = random.nextInt(3);
        if (n2 > 0) {
            cmz cmz3 = cmz2;
            for (int i2 = 0; i2 < n2; ++i2) {
                if ((cmz3 = cmz3.e(random.nextInt(3) - 1, 1, random.nextInt(3) - 1)).b() >= 0 && cmz3.b() < 256 && !iu2.d(cmz3)) {
                    return;
                }
                bfa bfa2 = iu2.n(cmz3).t();
                if (bfa2.L == ahk.a) {
                    if (!this.c(iu2, cmz3)) continue;
                    iu2.a(cmz3, blg.ab.s());
                    return;
                }
                if (!bfa2.L.c()) continue;
                return;
            }
        } else {
            for (int i3 = 0; i3 < 3; ++i3) {
                cmz cmz4 = cmz2.e(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                if (cmz4.b() >= 0 && cmz4.b() < 256 && !iu2.d(cmz4)) {
                    return;
                }
                if (!iu2.c(cmz4.g()) || !this.d(iu2, cmz4)) continue;
                iu2.a(cmz4.g(), blg.ab.s());
            }
        }
    }

    protected boolean c(iu iu2, cmz cmz2) {
        for (bqk bqk2 : bqk.values()) {
            if (!this.d(iu2, cmz2.c(bqk2))) continue;
            return true;
        }
        return false;
    }

    private boolean d(iu iu2, cmz cmz2) {
        if (cmz2.b() >= 0 && cmz2.b() < 256 && !iu2.d(cmz2)) {
            return false;
        }
        return iu2.n(cmz2).a().g();
    }
}

