/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ddz
extends ko {
    private static final dbk a = blg.s.s().a(bjc.a, (Comparable)((Object)zg.f));
    private static final dbk b = blg.u.s().a(bfy.e, (Comparable)((Object)zg.f)).a(aai.b, Boolean.valueOf(false));

    public ddz(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4 = random.nextInt(3) + random.nextInt(2) + 6;
        int n5 = cmz2.a();
        int n6 = cmz2.b();
        int n7 = cmz2.c();
        if (n6 < 1 || n6 + n4 + 1 >= 256) {
            return false;
        }
        cmz cmz3 = cmz2.h();
        bfa bfa2 = iu2.n(cmz3).t();
        if (bfa2 != blg.c && bfa2 != blg.d) {
            return false;
        }
        if (!this.a(iu2, cmz2, n4)) {
            return false;
        }
        this.a(iu2, cmz3);
        this.a(iu2, cmz3.l());
        this.a(iu2, cmz3.j());
        this.a(iu2, cmz3.j().l());
        bqk bqk2 = afj.a.a(random);
        int n8 = n4 - random.nextInt(4);
        int n9 = 2 - random.nextInt(3);
        int n10 = n5;
        int n11 = n7;
        int n12 = n6 + n4 - 1;
        for (n3 = 0; n3 < n4; ++n3) {
            cmz cmz4;
            ahk ahk2;
            if (n3 >= n8 && n9 > 0) {
                n10 += bqk2.h();
                n11 += bqk2.j();
                --n9;
            }
            if ((ahk2 = iu2.n(cmz4 = new cmz(n10, n2 = n6 + n3, n11)).a()) != ahk.a && ahk2 != ahk.j) continue;
            this.b(iu2, cmz4);
            this.b(iu2, cmz4.l());
            this.b(iu2, cmz4.j());
            this.b(iu2, cmz4.l().j());
        }
        for (n3 = -2; n3 <= 0; ++n3) {
            for (n2 = -2; n2 <= 0; ++n2) {
                int n13 = -1;
                this.a(iu2, n10 + n3, n12 + n13, n11 + n2);
                this.a(iu2, 1 + n10 - n3, n12 + n13, n11 + n2);
                this.a(iu2, n10 + n3, n12 + n13, 1 + n11 - n2);
                this.a(iu2, 1 + n10 - n3, n12 + n13, 1 + n11 - n2);
                if (n3 <= -2 && n2 <= -1 || n3 == -1 && n2 == -2) continue;
                n13 = 1;
                this.a(iu2, n10 + n3, n12 + n13, n11 + n2);
                this.a(iu2, 1 + n10 - n3, n12 + n13, n11 + n2);
                this.a(iu2, n10 + n3, n12 + n13, 1 + n11 - n2);
                this.a(iu2, 1 + n10 - n3, n12 + n13, 1 + n11 - n2);
            }
        }
        if (random.nextBoolean()) {
            this.a(iu2, n10, n12 + 2, n11);
            this.a(iu2, n10 + 1, n12 + 2, n11);
            this.a(iu2, n10 + 1, n12 + 2, n11 + 1);
            this.a(iu2, n10, n12 + 2, n11 + 1);
        }
        for (n3 = -3; n3 <= 4; ++n3) {
            for (n2 = -3; n2 <= 4; ++n2) {
                if (n3 == -3 && n2 == -3 || n3 == -3 && n2 == 4 || n3 == 4 && n2 == -3 || n3 == 4 && n2 == 4 || Math.abs(n3) >= 3 && Math.abs(n2) >= 3) continue;
                this.a(iu2, n10 + n3, n12, n11 + n2);
            }
        }
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = -1; n2 <= 2; ++n2) {
                int n14;
                int n15;
                if (n3 >= 0 && n3 <= 1 && n2 >= 0 && n2 <= 1 || random.nextInt(3) > 0) continue;
                int n16 = random.nextInt(3) + 2;
                for (n15 = 0; n15 < n16; ++n15) {
                    this.b(iu2, new cmz(n5 + n3, n12 - n15 - 1, n7 + n2));
                }
                for (n15 = -1; n15 <= 1; ++n15) {
                    for (n14 = -1; n14 <= 1; ++n14) {
                        this.a(iu2, n10 + n3 + n15, n12, n11 + n2 + n14);
                    }
                }
                for (n15 = -2; n15 <= 2; ++n15) {
                    for (n14 = -2; n14 <= 2; ++n14) {
                        if (Math.abs(n15) == 2 && Math.abs(n14) == 2) continue;
                        this.a(iu2, n10 + n3 + n15, n12 - 1, n11 + n2 + n14);
                    }
                }
            }
        }
        return true;
    }

    private boolean a(iu iu2, cmz cmz2, int n2) {
        int n3 = cmz2.a();
        int n4 = cmz2.b();
        int n5 = cmz2.c();
        pj pj2 = new pj();
        for (int i2 = 0; i2 <= n2 + 1; ++i2) {
            int n6 = 1;
            if (i2 == 0) {
                n6 = 0;
            }
            if (i2 >= n2 - 1) {
                n6 = 2;
            }
            for (int i3 = -n6; i3 <= n6; ++i3) {
                for (int i4 = -n6; i4 <= n6; ++i4) {
                    if (this.a(iu2.n(pj2.a(n3 + i3, n4 + i2, n5 + i4)).t())) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void b(iu iu2, cmz cmz2) {
        if (this.a(iu2.n(cmz2).t())) {
            this.a(iu2, cmz2, a);
        }
    }

    private void a(iu iu2, int n2, int n3, int n4) {
        cmz cmz2 = new cmz(n2, n3, n4);
        ahk ahk2 = iu2.n(cmz2).a();
        if (ahk2 == ahk.a) {
            this.a(iu2, cmz2, b);
        }
    }
}

