/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class azm
extends ko {
    private static final dbk a = blg.r.s().a(ff.a, (Comparable)((Object)zg.b));
    private static final dbk b = blg.t.s().a(dbo.e, (Comparable)((Object)zg.b)).a(aai.b, Boolean.valueOf(false));

    public azm() {
        super(false);
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = random.nextInt(5) + 7;
        int n7 = n6 - random.nextInt(2) - 3;
        int n8 = n6 - n7;
        int n9 = 1 + random.nextInt(n8 + 1);
        if (cmz2.b() < 1 || cmz2.b() + n6 + 1 > 256) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = cmz2.b(); i2 <= cmz2.b() + 1 + n6 && bl2; ++i2) {
            n5 = 1;
            n5 = i2 - cmz2.b() < n7 ? 0 : n9;
            pj pj2 = new pj();
            for (n4 = cmz2.a() - n5; n4 <= cmz2.a() + n5 && bl2; ++n4) {
                for (n3 = cmz2.c() - n5; n3 <= cmz2.c() + n5 && bl2; ++n3) {
                    if (i2 >= 0 && i2 < 256) {
                        if (this.a(iu2.n(pj2.a(n4, i2, n3)).t())) continue;
                        bl2 = false;
                        continue;
                    }
                    bl2 = false;
                }
            }
        }
        if (!bl2) {
            return false;
        }
        bfa bfa2 = iu2.n(cmz2.h()).t();
        if (bfa2 != blg.c && bfa2 != blg.d || cmz2.b() >= 256 - n6 - 1) {
            return false;
        }
        this.a(iu2, cmz2.h());
        n5 = 0;
        for (n2 = cmz2.b() + n6; n2 >= cmz2.b() + n7; --n2) {
            for (n4 = cmz2.a() - n5; n4 <= cmz2.a() + n5; ++n4) {
                n3 = n4 - cmz2.a();
                for (int i3 = cmz2.c() - n5; i3 <= cmz2.c() + n5; ++i3) {
                    cmz cmz3;
                    int n10 = i3 - cmz2.c();
                    if (Math.abs(n3) == n5 && Math.abs(n10) == n5 && n5 > 0 || iu2.n(cmz3 = new cmz(n4, n2, i3)).b()) continue;
                    this.a(iu2, cmz3, b);
                }
            }
            if (n5 >= 1 && n2 == cmz2.b() + n7 + 1) {
                --n5;
                continue;
            }
            if (n5 >= n9) continue;
            ++n5;
        }
        for (n2 = 0; n2 < n6 - 1; ++n2) {
            ahk ahk2 = iu2.n(cmz2.b(n2)).a();
            if (ahk2 != ahk.a && ahk2 != ahk.j) continue;
            this.a(iu2, cmz2.b(n2), a);
        }
        return true;
    }
}

