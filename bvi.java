/*
 * Decompiled with CFR 0.150.
 */
public class bvi {
    private final String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private final azg[][] b = new azg[][]{{hp.aM, hp.l, hp.k, hp.m}, {hp.S, hp.aa, hp.ae, hp.ai}, {hp.T, hp.ab, hp.af, hp.aj}, {hp.U, hp.ac, hp.ag, hp.ak}, {hp.V, hp.ad, hp.ah, hp.al}};

    public void a(gx gx2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            azg azg2 = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                azg azg3 = this.b[i3 + 1][i2];
                gx2.a(new bhl(azg3), this.a[i3], Character.valueOf('X'), azg2);
            }
        }
    }
}

