/*
 * Decompiled with CFR 0.150.
 */
public class bee
extends oh {
    private final oh c;
    private final oh d;

    public bee(long l2, oh oh2, oh oh3) {
        super(l2);
        this.c = oh2;
        this.d = oh3;
    }

    @Override
    public void a(long l2) {
        this.c.a(l2);
        this.d.a(l2);
        super.a(l2);
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.c.a(n2, n3, n4, n5);
        int[] arrn2 = this.d.a(n2, n3, n4, n5);
        int[] arrn3 = azw.a(n4 * n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            if (arrn[i2] == anr.a(cff.a) || arrn[i2] == anr.a(cff.z)) {
                arrn3[i2] = arrn[i2];
                continue;
            }
            if (arrn2[i2] == anr.a(cff.i)) {
                if (arrn[i2] == anr.a(cff.n)) {
                    arrn3[i2] = anr.a(cff.m);
                    continue;
                }
                if (arrn[i2] == anr.a(cff.p) || arrn[i2] == anr.a(cff.q)) {
                    arrn3[i2] = anr.a(cff.q);
                    continue;
                }
                arrn3[i2] = arrn2[i2] & 0xFF;
                continue;
            }
            arrn3[i2] = arrn[i2];
        }
        return arrn3;
    }
}

