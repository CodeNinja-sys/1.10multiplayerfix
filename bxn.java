/*
 * Decompiled with CFR 0.150.
 */
public class bxn {
    private final String[][] a = new String[][]{{"X", "X", "#"}};
    private final Object[][] b = new Object[][]{{blg.f, blg.e, hp.l, hp.k, hp.m}, {hp.o, hp.s, hp.n, hp.w, hp.D}};

    public void a(gx gx2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                azg azg2 = (azg)this.b[i3 + 1][i2];
                gx2.a(new bhl(azg2), this.a[i3], Character.valueOf('#'), hp.A, Character.valueOf('X'), object);
            }
        }
        gx2.a(new bhl(hp.f, 1), " #X", "# X", " #X", Character.valueOf('X'), hp.H, Character.valueOf('#'), hp.A);
        gx2.a(new bhl(hp.g, 4), "X", "#", "Y", Character.valueOf('Y'), hp.I, Character.valueOf('X'), hp.am, Character.valueOf('#'), hp.A);
        gx2.a(new bhl(hp.h, 2), " # ", "#X#", " # ", Character.valueOf('X'), hp.g, Character.valueOf('#'), hp.ba);
    }
}

