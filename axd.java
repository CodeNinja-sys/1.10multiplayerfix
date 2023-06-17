/*
 * Decompiled with CFR 0.150.
 */
public class axd
extends oh {
    public axd(long l2, oh oh2) {
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
                if (this.a(arrn, arrn2, i3, i2, n4, n10, anr.a(cff.e), anr.a(cff.v)) || this.b(arrn, arrn2, i3, i2, n4, n10, anr.a(cff.N), anr.a(cff.M)) || this.b(arrn, arrn2, i3, i2, n4, n10, anr.a(cff.O), anr.a(cff.M)) || this.b(arrn, arrn2, i3, i2, n4, n10, anr.a(cff.H), anr.a(cff.g))) continue;
                if (n10 == anr.a(cff.d)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 == anr.a(cff.n) || n8 == anr.a(cff.n) || n7 == anr.a(cff.n) || n6 == anr.a(cff.n)) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.J);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (n10 == anr.a(cff.h)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 == anr.a(cff.d) || n8 == anr.a(cff.d) || n7 == anr.a(cff.d) || n6 == anr.a(cff.d) || n9 == anr.a(cff.F) || n8 == anr.a(cff.F) || n7 == anr.a(cff.F) || n6 == anr.a(cff.F) || n9 == anr.a(cff.n) || n8 == anr.a(cff.n) || n7 == anr.a(cff.n) || n6 == anr.a(cff.n)) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.c);
                        continue;
                    }
                    if (n9 == anr.a(cff.w) || n6 == anr.a(cff.w) || n8 == anr.a(cff.w) || n7 == anr.a(cff.w)) {
                        arrn2[i3 + i2 * n4] = anr.a(cff.y);
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

    private boolean a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (axd.a(n5, n6)) {
            int n8 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
            int n9 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
            int n10 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
            int n11 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
            arrn2[n2 + n3 * n4] = !this.b(n8, n6) || !this.b(n9, n6) || !this.b(n10, n6) || !this.b(n11, n6) ? n7 : n5;
            return true;
        }
        return false;
    }

    private boolean b(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n5 == n6) {
            int n8 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
            int n9 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
            int n10 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
            int n11 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
            arrn2[n2 + n3 * n4] = !axd.a(n8, n6) || !axd.a(n9, n6) || !axd.a(n10, n6) || !axd.a(n11, n6) ? n7 : n5;
            return true;
        }
        return false;
    }

    private boolean b(int n2, int n3) {
        if (axd.a(n2, n3)) {
            return true;
        }
        anr anr2 = anr.b(n2);
        anr anr3 = anr.b(n3);
        if (anr2 != null && anr3 != null) {
            daz daz2;
            daz daz3 = anr2.h();
            return daz3 == (daz2 = anr3.h()) || daz3 == daz.c || daz2 == daz.c;
        }
        return false;
    }
}

