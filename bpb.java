/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bpb
extends ko {
    private static final dbk a = blg.r.s().a(ff.a, (Comparable)((Object)zg.c));
    private static final dbk b = blg.t.s().a(dbo.e, (Comparable)((Object)zg.c)).a(dbo.b, Boolean.valueOf(false));
    private final boolean c;

    public bpb(boolean bl2, boolean bl3) {
        super(bl2);
        this.c = bl3;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5 = random.nextInt(3) + 5;
        if (this.c) {
            n5 += random.nextInt(7);
        }
        boolean bl2 = true;
        if (cmz2.b() < 1 || cmz2.b() + n5 + 1 > 256) {
            return false;
        }
        for (int i2 = cmz2.b(); i2 <= cmz2.b() + 1 + n5; ++i2) {
            n4 = 1;
            if (i2 == cmz2.b()) {
                n4 = 0;
            }
            if (i2 >= cmz2.b() + 1 + n5 - 2) {
                n4 = 2;
            }
            pj pj2 = new pj();
            for (n3 = cmz2.a() - n4; n3 <= cmz2.a() + n4 && bl2; ++n3) {
                for (n2 = cmz2.c() - n4; n2 <= cmz2.c() + n4 && bl2; ++n2) {
                    if (i2 >= 0 && i2 < 256) {
                        if (this.a(iu2.n(pj2.a(n3, i2, n2)).t())) continue;
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
        for (n4 = cmz2.b() - 3 + n5; n4 <= cmz2.b() + n5; ++n4) {
            int n6 = n4 - (cmz2.b() + n5);
            n3 = 1 - n6 / 2;
            for (n2 = cmz2.a() - n3; n2 <= cmz2.a() + n3; ++n2) {
                int n7 = n2 - cmz2.a();
                for (int i3 = cmz2.c() - n3; i3 <= cmz2.c() + n3; ++i3) {
                    cmz cmz3;
                    ahk ahk2;
                    int n8 = i3 - cmz2.c();
                    if (Math.abs(n7) == n3 && Math.abs(n8) == n3 && (random.nextInt(2) == 0 || n6 == 0) || (ahk2 = iu2.n(cmz3 = new cmz(n2, n4, i3)).a()) != ahk.a && ahk2 != ahk.j) continue;
                    this.a(iu2, cmz3, b);
                }
            }
        }
        for (n4 = 0; n4 < n5; ++n4) {
            ahk ahk3 = iu2.n(cmz2.b(n4)).a();
            if (ahk3 != ahk.a && ahk3 != ahk.j) continue;
            this.a(iu2, cmz2.b(n4), a);
        }
        return true;
    }
}

