/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class qw
extends to {
    private final bfa a;

    public qw(bfa bfa2) {
        this.a = bfa2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        Object object;
        int n2;
        int n3;
        cmz2 = cmz2.e(-8, 0, -8);
        while (cmz2.b() > 5 && iu2.c(cmz2)) {
            cmz2 = cmz2.h();
        }
        if (cmz2.b() <= 4) {
            return false;
        }
        cmz2 = cmz2.c(4);
        boolean[] arrbl = new boolean[2048];
        int n4 = random.nextInt(4) + 4;
        for (n3 = 0; n3 < n4; ++n3) {
            double d2 = random.nextDouble() * 6.0 + 3.0;
            double d3 = random.nextDouble() * 4.0 + 2.0;
            double d4 = random.nextDouble() * 6.0 + 3.0;
            double d5 = random.nextDouble() * (16.0 - d2 - 2.0) + 1.0 + d2 / 2.0;
            double d6 = random.nextDouble() * (8.0 - d3 - 4.0) + 2.0 + d3 / 2.0;
            double d7 = random.nextDouble() * (16.0 - d4 - 2.0) + 1.0 + d4 / 2.0;
            for (int i2 = 1; i2 < 15; ++i2) {
                for (int i3 = 1; i3 < 15; ++i3) {
                    for (int i4 = 1; i4 < 7; ++i4) {
                        double d8 = ((double)i2 - d5) / (d2 / 2.0);
                        double d9 = ((double)i4 - d6) / (d3 / 2.0);
                        double d10 = ((double)i3 - d7) / (d4 / 2.0);
                        double d11 = d8 * d8 + d9 * d9 + d10 * d10;
                        if (!(d11 < 1.0)) continue;
                        arrbl[(i2 * 16 + i3) * 8 + i4] = true;
                    }
                }
            }
        }
        for (n3 = 0; n3 < 16; ++n3) {
            for (int i5 = 0; i5 < 16; ++i5) {
                for (n2 = 0; n2 < 8; ++n2) {
                    boolean bl2;
                    boolean bl3 = bl2 = !arrbl[(n3 * 16 + i5) * 8 + n2] && (n3 < 15 && arrbl[((n3 + 1) * 16 + i5) * 8 + n2] || n3 > 0 && arrbl[((n3 - 1) * 16 + i5) * 8 + n2] || i5 < 15 && arrbl[(n3 * 16 + i5 + 1) * 8 + n2] || i5 > 0 && arrbl[(n3 * 16 + (i5 - 1)) * 8 + n2] || n2 < 7 && arrbl[(n3 * 16 + i5) * 8 + n2 + 1] || n2 > 0 && arrbl[(n3 * 16 + i5) * 8 + (n2 - 1)]);
                    if (!bl2) continue;
                    object = iu2.n(cmz2.e(n3, n2, i5)).a();
                    if (n2 >= 4 && ((ahk)object).d()) {
                        return false;
                    }
                    if (n2 >= 4 || ((ahk)object).a() || iu2.n(cmz2.e(n3, n2, i5)).t() == this.a) continue;
                    return false;
                }
            }
        }
        for (n3 = 0; n3 < 16; ++n3) {
            for (int i6 = 0; i6 < 16; ++i6) {
                for (n2 = 0; n2 < 8; ++n2) {
                    if (!arrbl[(n3 * 16 + i6) * 8 + n2]) continue;
                    iu2.a(cmz2.e(n3, n2, i6), n2 >= 4 ? blg.a.s() : this.a.s(), 2);
                }
            }
        }
        for (n3 = 0; n3 < 16; ++n3) {
            for (int i7 = 0; i7 < 16; ++i7) {
                for (n2 = 4; n2 < 8; ++n2) {
                    cmz cmz3;
                    if (!arrbl[(n3 * 16 + i7) * 8 + n2] || iu2.n(cmz3 = cmz2.e(n3, n2 - 1, i7)).t() != blg.d || iu2.b(bzq.a, cmz2.e(n3, n2, i7)) <= 0) continue;
                    object = iu2.a(cmz3);
                    if (((anr)object).x.t() == blg.bw) {
                        iu2.a(cmz3, blg.bw.s(), 2);
                        continue;
                    }
                    iu2.a(cmz3, blg.c.s(), 2);
                }
            }
        }
        if (this.a.s().a() == ahk.i) {
            for (n3 = 0; n3 < 16; ++n3) {
                for (int i8 = 0; i8 < 16; ++i8) {
                    for (n2 = 0; n2 < 8; ++n2) {
                        boolean bl4;
                        boolean bl5 = bl4 = !arrbl[(n3 * 16 + i8) * 8 + n2] && (n3 < 15 && arrbl[((n3 + 1) * 16 + i8) * 8 + n2] || n3 > 0 && arrbl[((n3 - 1) * 16 + i8) * 8 + n2] || i8 < 15 && arrbl[(n3 * 16 + i8 + 1) * 8 + n2] || i8 > 0 && arrbl[(n3 * 16 + (i8 - 1)) * 8 + n2] || n2 < 7 && arrbl[(n3 * 16 + i8) * 8 + n2 + 1] || n2 > 0 && arrbl[(n3 * 16 + i8) * 8 + (n2 - 1)]);
                        if (!bl4 || n2 >= 4 && random.nextInt(2) == 0 || !iu2.n(cmz2.e(n3, n2, i8)).a().a()) continue;
                        iu2.a(cmz2.e(n3, n2, i8), blg.b.s(), 2);
                    }
                }
            }
        }
        if (this.a.s().a() == ahk.h) {
            for (n3 = 0; n3 < 16; ++n3) {
                for (int i9 = 0; i9 < 16; ++i9) {
                    n2 = 4;
                    if (!iu2.t(cmz2.e(n3, 4, i9))) continue;
                    iu2.a(cmz2.e(n3, 4, i9), blg.aI.s(), 2);
                }
            }
        }
        return true;
    }
}

