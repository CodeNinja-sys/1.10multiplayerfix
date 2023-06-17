/*
 * Decompiled with CFR 0.150.
 */
import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import a.a.a.a.c.ad;
import java.util.Random;

public class bel {
    private final alj a;
    private final Random b;
    private final as c = new bl(4096);

    public bel(alj alj2) {
        this.a = alj2;
        this.b = new Random(alj2.y());
    }

    public void a(cpk cpk2, float f2) {
        if (this.a.q.a().a() == 1) {
            int n2 = cmk.c(cpk2.aU);
            int n3 = cmk.c(cpk2.aV) - 1;
            int n4 = cmk.c(cpk2.aW);
            boolean bl2 = true;
            boolean bl3 = false;
            for (int i2 = -2; i2 <= 2; ++i2) {
                for (int i3 = -2; i3 <= 2; ++i3) {
                    for (int i4 = -1; i4 < 3; ++i4) {
                        int n5 = n2 + i3 * 1 + i2 * 0;
                        int n6 = n3 + i4;
                        int n7 = n4 + i3 * 0 - i2 * 1;
                        boolean bl4 = i4 < 0;
                        this.a.a(new cmz(n5, n6, n7), bl4 ? blg.Z.s() : blg.a.s());
                    }
                }
            }
            cpk2.a_(n2, n3, n4, cpk2.ba, 0.0f);
            cpk2.aX = 0.0;
            cpk2.aY = 0.0;
            cpk2.aZ = 0.0;
            return;
        }
        if (this.b(cpk2, f2)) {
            return;
        }
        this.a(cpk2);
        this.b(cpk2, f2);
    }

    public boolean b(cpk cpk2, float f2) {
        cmz cmz2;
        int n2 = 128;
        double d2 = -1.0;
        int n3 = cmk.c(cpk2.aU);
        int n4 = cmk.c(cpk2.aW);
        boolean bl2 = true;
        cmz cmz3 = cmz.e;
        long l2 = zz.a(n3, n4);
        if (this.c.b(l2)) {
            cmz2 = (rk)this.c.c(l2);
            d2 = 0.0;
            cmz3 = cmz2;
            ((rk)cmz2).a = this.a.z();
            bl2 = false;
        } else {
            cmz2 = new cmz(cpk2);
            for (int i2 = -128; i2 <= 128; ++i2) {
                for (int i3 = -128; i3 <= 128; ++i3) {
                    cmz cmz4 = cmz2.e(i2, this.a.L() - 1 - cmz2.b(), i3);
                    while (cmz4.b() >= 0) {
                        cmz cmz5 = cmz4.h();
                        if (this.a.n(cmz4).t() == blg.aY) {
                            cmz5 = cmz4.h();
                            while (this.a.n(cmz5).t() == blg.aY) {
                                cmz4 = cmz5;
                                cmz5 = cmz4.h();
                            }
                            double d3 = cmz4.f(cmz2);
                            if (d2 < 0.0 || d3 < d2) {
                                d2 = d3;
                                cmz3 = cmz4;
                            }
                        }
                        cmz4 = cmz5;
                    }
                }
            }
        }
        if (d2 >= 0.0) {
            if (bl2) {
                this.c.a(l2, new rk(this, cmz3, this.a.z()));
            }
            double d4 = (double)cmz3.a() + 0.5;
            double d5 = (double)cmz3.c() + 0.5;
            aiz aiz2 = blg.aY.d(this.a, cmz3);
            boolean bl3 = aiz2.b().f().d() == yy.b;
            double d6 = aiz2.b().l() == ctv.a ? (double)aiz2.a().c() : (double)aiz2.a().a();
            double d7 = (double)(aiz2.a().b() + 1) - cpk2.cv().c * (double)aiz2.e();
            if (bl3) {
                d6 += 1.0;
            }
            if (aiz2.b().l() == ctv.a) {
                d5 = d6 + (1.0 - cpk2.cv().b) * (double)aiz2.d() * (double)aiz2.b().f().d().a();
            } else {
                d4 = d6 + (1.0 - cpk2.cv().b) * (double)aiz2.d() * (double)aiz2.b().f().d().a();
            }
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            if (aiz2.b().e() == cpk2.cw()) {
                f3 = 1.0f;
                f4 = 1.0f;
            } else if (aiz2.b().e() == cpk2.cw().e()) {
                f3 = -1.0f;
                f4 = -1.0f;
            } else if (aiz2.b().e() == cpk2.cw().f()) {
                f5 = 1.0f;
                f6 = -1.0f;
            } else {
                f5 = -1.0f;
                f6 = 1.0f;
            }
            double d8 = cpk2.aX;
            double d9 = cpk2.aZ;
            cpk2.aX = d8 * (double)f3 + d9 * (double)f6;
            cpk2.aZ = d8 * (double)f5 + d9 * (double)f4;
            cpk2.ba = f2 - (float)(cpk2.cw().e().c() * 90) + (float)(aiz2.b().c() * 90);
            if (cpk2 instanceof czt) {
                ((czt)cpk2).a.a(d4, d7, d5, cpk2.ba, cpk2.bb);
            } else {
                cpk2.a_(d4, d7, d5, cpk2.ba, cpk2.bb);
            }
            return true;
        }
        return false;
    }

    public boolean a(cpk cpk2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        double d2;
        int n11;
        double d3;
        int n12;
        int n13 = 16;
        double d4 = -1.0;
        int n14 = cmk.c(cpk2.aU);
        int n15 = cmk.c(cpk2.aV);
        int n16 = cmk.c(cpk2.aW);
        int n17 = n14;
        int n18 = n15;
        int n19 = n16;
        int n20 = 0;
        int n21 = this.b.nextInt(4);
        pj pj2 = new pj();
        for (n12 = n14 - 16; n12 <= n14 + 16; ++n12) {
            d3 = (double)n12 + 0.5 - cpk2.aU;
            for (n11 = n16 - 16; n11 <= n16 + 16; ++n11) {
                d2 = (double)n11 + 0.5 - cpk2.aW;
                block2: for (n10 = this.a.L() - 1; n10 >= 0; --n10) {
                    if (!this.a.c(pj2.a(n12, n10, n11))) continue;
                    while (n10 > 0 && this.a.c(pj2.a(n12, n10 - 1, n11))) {
                        --n10;
                    }
                    for (n9 = n21; n9 < n21 + 4; ++n9) {
                        n8 = n9 % 2;
                        n7 = 1 - n8;
                        if (n9 % 4 >= 2) {
                            n8 = -n8;
                            n7 = -n7;
                        }
                        for (n6 = 0; n6 < 3; ++n6) {
                            for (n5 = 0; n5 < 4; ++n5) {
                                for (n4 = -1; n4 < 4; ++n4) {
                                    n3 = n12 + (n5 - 1) * n8 + n6 * n7;
                                    n2 = n10 + n4;
                                    int n22 = n11 + (n5 - 1) * n7 - n6 * n8;
                                    pj2.a(n3, n2, n22);
                                    if (n4 < 0 && !this.a.n(pj2).a().a() || n4 >= 0 && !this.a.c(pj2)) continue block2;
                                }
                            }
                        }
                        double d5 = (double)n10 + 0.5 - cpk2.aV;
                        double d6 = d3 * d3 + d5 * d5 + d2 * d2;
                        if (!(d4 < 0.0) && !(d6 < d4)) continue;
                        d4 = d6;
                        n17 = n12;
                        n18 = n10;
                        n19 = n11;
                        n20 = n9 % 4;
                    }
                }
            }
        }
        if (d4 < 0.0) {
            for (n12 = n14 - 16; n12 <= n14 + 16; ++n12) {
                d3 = (double)n12 + 0.5 - cpk2.aU;
                for (n11 = n16 - 16; n11 <= n16 + 16; ++n11) {
                    d2 = (double)n11 + 0.5 - cpk2.aW;
                    block10: for (n10 = this.a.L() - 1; n10 >= 0; --n10) {
                        if (!this.a.c(pj2.a(n12, n10, n11))) continue;
                        while (n10 > 0 && this.a.c(pj2.a(n12, n10 - 1, n11))) {
                            --n10;
                        }
                        for (n9 = n21; n9 < n21 + 2; ++n9) {
                            n8 = n9 % 2;
                            n7 = 1 - n8;
                            for (int i2 = 0; i2 < 4; ++i2) {
                                for (n5 = -1; n5 < 4; ++n5) {
                                    int n23 = n12 + (i2 - 1) * n8;
                                    n3 = n10 + n5;
                                    n2 = n11 + (i2 - 1) * n7;
                                    pj2.a(n23, n3, n2);
                                    if (n5 < 0 && !this.a.n(pj2).a().a() || n5 >= 0 && !this.a.c(pj2)) continue block10;
                                }
                            }
                            double d7 = (double)n10 + 0.5 - cpk2.aV;
                            double d8 = d3 * d3 + d7 * d7 + d2 * d2;
                            if (!(d4 < 0.0) && !(d8 < d4)) continue;
                            d4 = d8;
                            n17 = n12;
                            n18 = n10;
                            n19 = n11;
                            n20 = n9 % 2;
                        }
                    }
                }
            }
        }
        n12 = n20;
        int n24 = n17;
        int n25 = n18;
        n11 = n19;
        int n26 = n12 % 2;
        int n27 = 1 - n26;
        if (n12 % 4 >= 2) {
            n26 = -n26;
            n27 = -n27;
        }
        if (d4 < 0.0) {
            n25 = n18 = cmk.a(n18, 70, this.a.L() - 10);
            for (n10 = -1; n10 <= 1; ++n10) {
                for (n9 = 1; n9 < 3; ++n9) {
                    for (n8 = -1; n8 < 3; ++n8) {
                        n7 = n24 + (n9 - 1) * n26 + n10 * n27;
                        n6 = n25 + n8;
                        n5 = n11 + (n9 - 1) * n27 - n10 * n26;
                        n4 = n8 < 0 ? 1 : 0;
                        this.a.a(new cmz(n7, n6, n5), n4 != 0 ? blg.Z.s() : blg.a.s());
                    }
                }
            }
        }
        dbk dbk2 = blg.aY.s().a(axz.a, (Comparable)((Object)(n26 == 0 ? ctv.c : ctv.a)));
        for (n9 = 0; n9 < 4; ++n9) {
            for (n8 = 0; n8 < 4; ++n8) {
                for (n7 = -1; n7 < 4; ++n7) {
                    n6 = n24 + (n8 - 1) * n26;
                    n5 = n25 + n7;
                    n4 = n11 + (n8 - 1) * n27;
                    boolean bl2 = n8 == 0 || n8 == 3 || n7 == -1 || n7 == 3;
                    this.a.a(new cmz(n6, n5, n4), bl2 ? blg.Z.s() : dbk2, 2);
                }
            }
            for (n8 = 0; n8 < 4; ++n8) {
                for (n7 = -1; n7 < 4; ++n7) {
                    n6 = n24 + (n8 - 1) * n26;
                    n5 = n25 + n7;
                    n4 = n11 + (n8 - 1) * n27;
                    cmz cmz2 = new cmz(n6, n5, n4);
                    this.a.b(cmz2, this.a.n(cmz2).t());
                }
            }
        }
        return true;
    }

    public void a(long l2) {
        if (l2 % 100L == 0L) {
            long l3 = l2 - 300L;
            ad ad2 = this.c.c().a();
            while (ad2.hasNext()) {
                rk rk2 = (rk)ad2.next();
                if (rk2 != null && rk2.a >= l3) continue;
                ad2.remove();
            }
        }
    }
}

