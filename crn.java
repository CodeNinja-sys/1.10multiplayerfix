/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class crn
extends oh {
    private static final d c = org.apache.logging.log4j.c.c();
    private final oh d;

    public crn(long l2, oh oh2, oh oh3) {
        super(l2);
        this.a = oh2;
        this.d = oh3;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn2 = this.d.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn3 = azw.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                anr anr2;
                anr anr3;
                boolean bl2;
                boolean bl3;
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n6 = arrn[i3 + 1 + (i2 + 1) * (n4 + 2)];
                int n7 = arrn2[i3 + 1 + (i2 + 1) * (n4 + 2)];
                boolean bl4 = bl3 = (n7 - 2) % 29 == 0;
                if (n6 > 255) {
                    c.a("old! {}", n6);
                }
                boolean bl5 = bl2 = (anr3 = anr.a(n6)) != null && anr3.b();
                if (n6 != 0 && n7 >= 2 && (n7 - 2) % 29 == 1 && !bl2) {
                    anr2 = anr.b(anr3);
                    arrn3[i3 + i2 * n4] = anr2 == null ? n6 : anr.a(anr2);
                    continue;
                }
                if (this.a(3) == 0 || bl3) {
                    int n8;
                    anr2 = anr3;
                    if (anr3 == cff.d) {
                        anr2 = cff.s;
                    } else if (anr3 == cff.f) {
                        anr2 = cff.t;
                    } else if (anr3 == cff.C) {
                        anr2 = cff.D;
                    } else if (anr3 == cff.E) {
                        anr2 = cff.c;
                    } else if (anr3 == cff.g) {
                        anr2 = cff.u;
                    } else if (anr3 == cff.H) {
                        anr2 = cff.I;
                    } else if (anr3 == cff.F) {
                        anr2 = cff.G;
                    } else if (anr3 == cff.c) {
                        anr2 = this.a(3) == 0 ? cff.t : cff.f;
                    } else if (anr3 == cff.n) {
                        anr2 = cff.o;
                    } else if (anr3 == cff.w) {
                        anr2 = cff.x;
                    } else if (anr3 == cff.a) {
                        anr2 = cff.z;
                    } else if (anr3 == cff.e) {
                        anr2 = cff.J;
                    } else if (anr3 == cff.K) {
                        anr2 = cff.L;
                    } else if (crn.a(n6, anr.a(cff.N))) {
                        anr2 = cff.M;
                    } else if (anr3 == cff.z && this.a(3) == 0) {
                        n8 = this.a(2);
                        anr2 = n8 == 0 ? cff.c : cff.f;
                    }
                    n8 = anr.a(anr2);
                    if (bl3 && n8 != n6) {
                        anr anr4 = anr.b(anr2);
                        int n9 = n8 = anr4 == null ? n6 : anr.a(anr4);
                    }
                    if (n8 == n6) {
                        arrn3[i3 + i2 * n4] = n6;
                        continue;
                    }
                    int n10 = arrn[i3 + 1 + (i2 + 0) * (n4 + 2)];
                    int n11 = arrn[i3 + 2 + (i2 + 1) * (n4 + 2)];
                    int n12 = arrn[i3 + 0 + (i2 + 1) * (n4 + 2)];
                    int n13 = arrn[i3 + 1 + (i2 + 2) * (n4 + 2)];
                    int n14 = 0;
                    if (crn.a(n10, n6)) {
                        ++n14;
                    }
                    if (crn.a(n11, n6)) {
                        ++n14;
                    }
                    if (crn.a(n12, n6)) {
                        ++n14;
                    }
                    if (crn.a(n13, n6)) {
                        ++n14;
                    }
                    if (n14 >= 3) {
                        arrn3[i3 + i2 * n4] = n8;
                        continue;
                    }
                    arrn3[i3 + i2 * n4] = n6;
                    continue;
                }
                arrn3[i3 + i2 * n4] = n6;
            }
        }
        return arrn3;
    }
}

