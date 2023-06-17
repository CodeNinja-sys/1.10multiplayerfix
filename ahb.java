/*
 * Decompiled with CFR 0.150.
 */
public class ahb
extends oh {
    public ahb(long l2) {
        super(l2);
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = azw.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a((long)(n2 + i3), (long)(n3 + i2));
                arrn[i3 + i2 * n4] = this.a(10) == 0 ? 1 : 0;
            }
        }
        if (n2 > -n4 && n2 <= 0 && n3 > -n5 && n3 <= 0) {
            arrn[-n2 + -n3 * n4] = 1;
        }
        return arrn;
    }
}

