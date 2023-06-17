/*
 * Decompiled with CFR 0.150.
 */
public class cqh
extends oh {
    private anr[] c = new anr[]{cff.d, cff.d, cff.d, cff.K, cff.K, cff.c};
    private final anr[] d = new anr[]{cff.f, cff.E, cff.e, cff.c, cff.C, cff.h};
    private final anr[] e = new anr[]{cff.f, cff.e, cff.g, cff.c};
    private final anr[] f = new anr[]{cff.n, cff.n, cff.n, cff.F};
    private final dw g;

    public cqh(long l2, oh oh2, aaf aaf2, String string) {
        super(l2);
        this.a = oh2;
        if (aaf2 == aaf.h) {
            this.c = new anr[]{cff.d, cff.f, cff.e, cff.h, cff.c, cff.g};
            this.g = null;
        } else {
            this.g = aaf2 == aaf.f ? bqr.a(string).b() : null;
        }
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2, n3, n4, n5);
        int[] arrn2 = azw.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n6 = arrn[i3 + i2 * n4];
                int n7 = (n6 & 0xF00) >> 8;
                n6 &= 0xFFFFF0FF;
                if (this.g != null && this.g.F >= 0) {
                    arrn2[i3 + i2 * n4] = this.g.F;
                    continue;
                }
                if (cqh.b(n6)) {
                    arrn2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == anr.a(cff.p)) {
                    arrn2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == 1) {
                    if (n7 > 0) {
                        if (this.a(3) == 0) {
                            arrn2[i3 + i2 * n4] = anr.a(cff.O);
                            continue;
                        }
                        arrn2[i3 + i2 * n4] = anr.a(cff.N);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = anr.a(this.c[this.a(this.c.length)]);
                    continue;
                }
                if (n6 == 2) {
                    if (n7 > 0) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.w);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = anr.a(this.d[this.a(this.d.length)]);
                    continue;
                }
                if (n6 == 3) {
                    if (n7 > 0) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.H);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = anr.a(this.e[this.a(this.e.length)]);
                    continue;
                }
                arrn2[i3 + i2 * n4] = n6 == 4 ? anr.a(this.f[this.a(this.f.length)]) : anr.a(cff.p);
            }
        }
        return arrn2;
    }
}

