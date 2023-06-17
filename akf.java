/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class akf
extends ko {
    private static final dbk a = blg.r.s().a(ff.a, (Comparable)((Object)zg.b));
    private static final dbk b = blg.t.s().a(dbo.e, (Comparable)((Object)zg.b)).a(aai.b, Boolean.valueOf(false));

    public akf(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5 = random.nextInt(4) + 6;
        int n6 = 1 + random.nextInt(2);
        int n7 = n5 - n6;
        int n8 = 2 + random.nextInt(2);
        boolean bl2 = true;
        if (cmz2.b() < 1 || cmz2.b() + n5 + 1 > 256) {
            return false;
        }
        for (int i2 = cmz2.b(); i2 <= cmz2.b() + 1 + n5 && bl2; ++i2) {
            n4 = i2 - cmz2.b() < n6 ? 0 : n8;
            pj pj2 = new pj();
            for (n3 = cmz2.a() - n4; n3 <= cmz2.a() + n4 && bl2; ++n3) {
                for (n2 = cmz2.c() - n4; n2 <= cmz2.c() + n4 && bl2; ++n2) {
                    if (i2 >= 0 && i2 < 256) {
                        ahk ahk2 = iu2.n(pj2.a(n3, i2, n2)).a();
                        if (ahk2 == ahk.a || ahk2 == ahk.j) continue;
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
        if (bfa2 != blg.c && bfa2 != blg.d && bfa2 != blg.ak || cmz2.b() >= 256 - n5 - 1) {
            return false;
        }
        this.a(iu2, cmz2.h());
        n4 = random.nextInt(2);
        int n9 = 1;
        n3 = 0;
        for (n2 = 0; n2 <= n7; ++n2) {
            int n10 = cmz2.b() + n5 - n2;
            for (int i3 = cmz2.a() - n4; i3 <= cmz2.a() + n4; ++i3) {
                int n11 = i3 - cmz2.a();
                for (int i4 = cmz2.c() - n4; i4 <= cmz2.c() + n4; ++i4) {
                    cmz cmz3;
                    int n12 = i4 - cmz2.c();
                    if (Math.abs(n11) == n4 && Math.abs(n12) == n4 && n4 > 0 || iu2.n(cmz3 = new cmz(i3, n10, i4)).b()) continue;
                    this.a(iu2, cmz3, b);
                }
            }
            if (n4 >= n9) {
                n4 = n3;
                n3 = 1;
                if (++n9 <= n8) continue;
                n9 = n8;
                continue;
            }
            ++n4;
        }
        n2 = random.nextInt(3);
        for (int i5 = 0; i5 < n5 - n2; ++i5) {
            ahk ahk3 = iu2.n(cmz2.b(i5)).a();
            if (ahk3 != ahk.a && ahk3 != ahk.j) continue;
            this.a(iu2, cmz2.b(i5), a);
        }
        return true;
    }
}

