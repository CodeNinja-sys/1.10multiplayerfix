/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class apk
extends to {
    public static final cmz a = cmz.e;
    public static final cmz b = new cmz(a.a() - 4 & 0xFFFFFFF0, 0, a.c() - 4 & 0xFFFFFFF0);
    private final boolean c;

    public apk(boolean bl2) {
        this.c = bl2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (Object object : cmz.b(new cmz(cmz2.a() - 4, cmz2.b() - 1, cmz2.c() - 4), new cmz(cmz2.a() + 4, cmz2.b() + 32, cmz2.c() + 4))) {
            double d2 = ((cjx)object).d(cmz2.a(), ((pj)object).b(), cmz2.c());
            if (!(d2 <= 3.5)) continue;
            if (((pj)object).b() < cmz2.b()) {
                if (d2 <= 2.5) {
                    this.a(iu2, (cmz)object, blg.h.s());
                    continue;
                }
                if (((pj)object).b() >= cmz2.b()) continue;
                this.a(iu2, (cmz)object, blg.bH.s());
                continue;
            }
            if (((pj)object).b() > cmz2.b()) {
                this.a(iu2, (cmz)object, blg.a.s());
                continue;
            }
            if (d2 > 2.5) {
                this.a(iu2, (cmz)object, blg.h.s());
                continue;
            }
            if (this.c) {
                this.a(iu2, new cmz((cjx)object), blg.bF.s());
                continue;
            }
            this.a(iu2, new cmz((cjx)object), blg.a.s());
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(iu2, cmz2.b(i2), blg.h.s());
        }
        cmz cmz3 = cmz2.b(2);
        for (bqk bqk2 : afj.a) {
            this.a(iu2, cmz3.c(bqk2), blg.aa.s().a(vl.a, (Comparable)((Object)bqk2)));
        }
        return true;
    }
}

