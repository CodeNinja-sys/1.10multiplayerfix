/*
 * Decompiled with CFR 0.150.
 */
public class xw
extends oh {
    public xw(long l2, oh oh2) {
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
                int n10 = arrn[i3 + 1 + (i2 + 1) * n8];
                this.a((long)(i3 + n2), (long)(i2 + n3));
                if (n10 == 0) {
                    arrn2[i3 + i2 * n4] = 0;
                    continue;
                }
                int n11 = this.a(6);
                n11 = n11 == 0 ? 4 : (n11 <= 1 ? 3 : 1);
                arrn2[i3 + i2 * n4] = n11;
            }
        }
        return arrn2;
    }
}

