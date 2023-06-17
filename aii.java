/*
 * Decompiled with CFR 0.150.
 */
public enum aii {
    a(dah.dL, 20, 600),
    b(dah.dK, 12000, 24000),
    c(dah.dG, 1200, 3600),
    d(dah.dH, Integer.MAX_VALUE, Integer.MAX_VALUE),
    e(dah.dM, 1200, 3600),
    f(dah.dI, 0, 0),
    g(dah.dJ, 6000, 24000);

    private final bi h;
    private final int i;
    private final int j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aii(int n2) {
        void var5_3;
        void var4_2;
        this.h = (bi)n2;
        this.i = var4_2;
        this.j = var5_3;
    }

    public bi a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }
}

