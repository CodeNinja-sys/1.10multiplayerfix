/*
 * Decompiled with CFR 0.150.
 */
public class acu {
    private final String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private final Object[][] b = new Object[][]{{blg.f, blg.e, hp.l, hp.k, hp.m}, {hp.q, hp.u, hp.b, hp.y, hp.F}, {hp.p, hp.t, hp.a, hp.x, hp.E}, {hp.r, hp.v, hp.c, hp.z, hp.G}, {hp.K, hp.L, hp.M, hp.N, hp.O}};

    public void a(gx gx2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                azg azg2 = (azg)this.b[i3 + 1][i2];
                gx2.a(new bhl(azg2), this.a[i3], Character.valueOf('#'), hp.A, Character.valueOf('X'), object);
            }
        }
        gx2.a(new bhl(hp.bl), " #", "# ", Character.valueOf('#'), hp.l);
    }
}

