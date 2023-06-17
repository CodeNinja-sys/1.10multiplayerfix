/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cic
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (pj pj2 : cmz.b(cmz2.e(-1, -2, -1), cmz2.e(1, 2, 1))) {
            boolean bl2;
            boolean bl3 = pj2.a() == cmz2.a();
            boolean bl4 = pj2.b() == cmz2.b();
            boolean bl5 = pj2.c() == cmz2.c();
            boolean bl6 = bl2 = Math.abs(pj2.b() - cmz2.b()) == 2;
            if (bl3 && bl4 && bl5) {
                this.a(iu2, new cmz(pj2), blg.db.s());
                continue;
            }
            if (bl4) {
                this.a(iu2, pj2, blg.a.s());
                continue;
            }
            if (bl2 && bl3 && bl5) {
                this.a(iu2, pj2, blg.h.s());
                continue;
            }
            if (!bl3 && !bl5 || bl2) {
                this.a(iu2, pj2, blg.a.s());
                continue;
            }
            this.a(iu2, pj2, blg.h.s());
        }
        return true;
    }
}

