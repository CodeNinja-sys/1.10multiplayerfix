/*
 * Decompiled with CFR 0.150.
 */
public class abt
extends oh {
    public abt(long l2, oh oh2) {
        super(l2);
        this.a = oh2;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = n4 + 2;
        int n9 = n5 + 2;
        int[] arrn = this.a.a(n6, n7, n8, n9);
        int[] arrn2 = azw.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n10 = this.c(arrn[i3 + 0 + (i2 + 1) * n8]);
                int n11 = this.c(arrn[i3 + 2 + (i2 + 1) * n8]);
                int n12 = this.c(arrn[i3 + 1 + (i2 + 0) * n8]);
                int n13 = this.c(arrn[i3 + 1 + (i2 + 2) * n8]);
                int n14 = this.c(arrn[i3 + 1 + (i2 + 1) * n8]);
                arrn2[i3 + i2 * n4] = n14 != n10 || n14 != n12 || n14 != n11 || n14 != n13 ? anr.a(cff.i) : -1;
            }
        }
        return arrn2;
    }

    private int c(int n2) {
        if (n2 >= 2) {
            return 2 + (n2 & 1);
        }
        return n2;
    }
}

