/*
 * Decompiled with CFR 0.150.
 */
public class dbp
extends oh {
    public dbp(long l2, oh oh2) {
        super(l2);
        this.a = oh2;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = n2 >> 1;
        int n8 = n3 >> 1;
        int n9 = (n4 >> 1) + 2;
        int n10 = (n5 >> 1) + 2;
        int[] arrn = this.a.a(n7, n8, n9, n10);
        int n11 = n9 - 1 << 1;
        int n12 = n10 - 1 << 1;
        int[] arrn2 = azw.a(n11 * n12);
        for (int i2 = 0; i2 < n10 - 1; ++i2) {
            int n13;
            n6 = (i2 << 1) * n11;
            int n14 = arrn[n13 + 0 + (i2 + 0) * n9];
            int n15 = arrn[n13 + 0 + (i2 + 1) * n9];
            for (n13 = 0; n13 < n9 - 1; ++n13) {
                this.a((long)(n13 + n7 << 1), (long)(i2 + n8 << 1));
                int n16 = arrn[n13 + 1 + (i2 + 0) * n9];
                int n17 = arrn[n13 + 1 + (i2 + 1) * n9];
                arrn2[n6] = n14;
                arrn2[n6++ + n11] = this.a(n14, n15);
                arrn2[n6] = this.a(n14, n16);
                arrn2[n6++ + n11] = this.b(n14, n16, n15, n17);
                n14 = n16;
                n15 = n17;
            }
        }
        int[] arrn3 = azw.a(n4 * n5);
        for (n6 = 0; n6 < n5; ++n6) {
            System.arraycopy(arrn2, (n6 + (n3 & 1)) * n11 + (n2 & 1), arrn3, n6 * n4, n4);
        }
        return arrn3;
    }

    public static oh a(long l2, oh oh2, int n2) {
        oh oh3 = oh2;
        for (int i2 = 0; i2 < n2; ++i2) {
            oh3 = new dbp(l2 + (long)i2, oh3);
        }
        return oh3;
    }
}

