/*
 * Decompiled with CFR 0.150.
 */
public class blp
extends oh {
    public blp(long l2, oh oh2) {
        super(l2);
        this.a = oh2;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn2 = azw.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n6;
                int n7;
                int n8;
                int n9;
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n10 = arrn[i3 + 1 + (i2 + 1) * (n4 + 2)];
                anr anr2 = anr.b(n10);
                if (n10 == anr.a(cff.p)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 == anr.a(cff.a) || n8 == anr.a(cff.a) || n7 == anr.a(cff.a) || n6 == anr.a(cff.a)) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.q);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (anr2 != null && anr2.g() == bnq.class) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (!(this.c(n9) && this.c(n8) && this.c(n7) && this.c(n6))) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.y);
                        continue;
                    }
                    if (blp.b(n9) || blp.b(n8) || blp.b(n7) || blp.b(n6)) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.r);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (n10 == anr.a(cff.e) || n10 == anr.a(cff.J) || n10 == anr.a(cff.v)) {
                    this.a(arrn, arrn2, i3, i2, n4, n10, anr.a(cff.A));
                    continue;
                }
                if (anr2 != null && anr2.p()) {
                    this.a(arrn, arrn2, i3, i2, n4, n10, anr.a(cff.B));
                    continue;
                }
                if (n10 == anr.a(cff.M) || n10 == anr.a(cff.N)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (blp.b(n9) || blp.b(n8) || blp.b(n7) || blp.b(n6)) {
                        arrn2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    if (!(this.d(n9) && this.d(n8) && this.d(n7) && this.d(n6))) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.d);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (n10 != anr.a(cff.a) && n10 != anr.a(cff.z) && n10 != anr.a(cff.i) && n10 != anr.a(cff.h)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (blp.b(n9) || blp.b(n8) || blp.b(n7) || blp.b(n6)) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.r);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = n10;
                    continue;
                }
                arrn2[i3 + i2 * n4] = n10;
            }
        }
        return arrn2;
    }

    private void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6) {
        if (blp.b(n5)) {
            arrn2[n2 + n3 * n4] = n5;
            return;
        }
        int n7 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
        int n8 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
        int n9 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
        int n10 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
        arrn2[n2 + n3 * n4] = blp.b(n7) || blp.b(n8) || blp.b(n9) || blp.b(n10) ? n6 : n5;
    }

    private boolean c(int n2) {
        if (anr.b(n2) != null && anr.b(n2).g() == bnq.class) {
            return true;
        }
        return n2 == anr.a(cff.y) || n2 == anr.a(cff.w) || n2 == anr.a(cff.x) || n2 == anr.a(cff.f) || n2 == anr.a(cff.g) || blp.b(n2);
    }

    private boolean d(int n2) {
        return anr.b(n2) instanceof aex;
    }
}

