/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class axx
extends to {
    private final bfa a;

    public axx(bfa bfa2) {
        super(true);
        this.a = bfa2;
    }

    public axx() {
        super(false);
        this.a = null;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5;
        bfa bfa2 = this.a;
        if (bfa2 == null) {
            bfa2 = random.nextBoolean() ? blg.bg : blg.bh;
        }
        int n6 = random.nextInt(3) + 4;
        if (random.nextInt(12) == 0) {
            n6 *= 2;
        }
        boolean bl2 = true;
        if (cmz2.b() < 1 || cmz2.b() + n6 + 1 >= 256) {
            return false;
        }
        for (int i2 = cmz2.b(); i2 <= cmz2.b() + 1 + n6; ++i2) {
            n5 = 3;
            if (i2 <= cmz2.b() + 3) {
                n5 = 0;
            }
            pj pj2 = new pj();
            for (n4 = cmz2.a() - n5; n4 <= cmz2.a() + n5 && bl2; ++n4) {
                for (n3 = cmz2.c() - n5; n3 <= cmz2.c() + n5 && bl2; ++n3) {
                    if (i2 >= 0 && i2 < 256) {
                        ahk ahk2 = iu2.n(pj2.a(n4, i2, n3)).a();
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
        bfa bfa3 = iu2.n(cmz2.h()).t();
        if (bfa3 != blg.d && bfa3 != blg.c && bfa3 != blg.bw) {
            return false;
        }
        n5 = cmz2.b() + n6;
        if (bfa2 == blg.bh) {
            n5 = cmz2.b() + n6 - 3;
        }
        for (n2 = n5; n2 <= cmz2.b() + n6; ++n2) {
            n4 = 1;
            if (n2 < cmz2.b() + n6) {
                ++n4;
            }
            if (bfa2 == blg.bg) {
                n4 = 3;
            }
            n3 = cmz2.a() - n4;
            int n7 = cmz2.a() + n4;
            int n8 = cmz2.c() - n4;
            int n9 = cmz2.c() + n4;
            for (int i3 = n3; i3 <= n7; ++i3) {
                for (int i4 = n8; i4 <= n9; ++i4) {
                    cmz cmz3;
                    int n10 = 5;
                    if (i3 == n3) {
                        --n10;
                    } else if (i3 == n7) {
                        ++n10;
                    }
                    if (i4 == n8) {
                        n10 -= 3;
                    } else if (i4 == n9) {
                        n10 += 3;
                    }
                    afg afg2 = afg.a(n10);
                    if (bfa2 == blg.bg || n2 < cmz2.b() + n6) {
                        if ((i3 == n3 || i3 == n7) && (i4 == n8 || i4 == n9)) continue;
                        if (i3 == cmz2.a() - (n4 - 1) && i4 == n8) {
                            afg2 = afg.a;
                        }
                        if (i3 == n3 && i4 == cmz2.c() - (n4 - 1)) {
                            afg2 = afg.a;
                        }
                        if (i3 == cmz2.a() + (n4 - 1) && i4 == n8) {
                            afg2 = afg.c;
                        }
                        if (i3 == n7 && i4 == cmz2.c() - (n4 - 1)) {
                            afg2 = afg.c;
                        }
                        if (i3 == cmz2.a() - (n4 - 1) && i4 == n9) {
                            afg2 = afg.g;
                        }
                        if (i3 == n3 && i4 == cmz2.c() + (n4 - 1)) {
                            afg2 = afg.g;
                        }
                        if (i3 == cmz2.a() + (n4 - 1) && i4 == n9) {
                            afg2 = afg.i;
                        }
                        if (i3 == n7 && i4 == cmz2.c() + (n4 - 1)) {
                            afg2 = afg.i;
                        }
                    }
                    if (afg2 == afg.e && n2 < cmz2.b() + n6) {
                        afg2 = afg.k;
                    }
                    if (cmz2.b() < cmz2.b() + n6 - 1 && afg2 == afg.k || iu2.n(cmz3 = new cmz(i3, n2, i4)).b()) continue;
                    this.a(iu2, cmz3, bfa2.s().a(biv.a, (Comparable)((Object)afg2)));
                }
            }
        }
        for (n2 = 0; n2 < n6; ++n2) {
            dbk dbk2 = iu2.n(cmz2.b(n2));
            if (dbk2.b()) continue;
            this.a(iu2, cmz2.b(n2), bfa2.s().a(biv.a, (Comparable)((Object)afg.j)));
        }
        return true;
    }
}

