/*
 * Decompiled with CFR 0.150.
 */
public enum in {
    a("leather", 5, new int[]{1, 2, 3, 1}, 15, dah.s, 0.0f),
    b("chainmail", 15, new int[]{1, 4, 5, 2}, 12, dah.n, 0.0f),
    c("iron", 15, new int[]{2, 5, 6, 2}, 9, dah.r, 0.0f),
    d("gold", 7, new int[]{1, 3, 5, 2}, 25, dah.q, 0.0f),
    e("diamond", 33, new int[]{3, 6, 8, 3}, 10, dah.o, 2.0f);

    private final String f;
    private final int g;
    private final int[] h;
    private final int i;
    private final bi j;
    private final float k;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private in(int[] arrn, int n2, bi bi2, float f2) {
        void var8_6;
        void var7_5;
        this.f = arrn;
        this.g = n2;
        this.h = (int[])bi2;
        this.i = (int)f2;
        this.j = var7_5;
        this.k = var8_6;
    }

    public int a(dfm dfm2) {
        return uh.g()[dfm2.b()] * this.g;
    }

    public int b(dfm dfm2) {
        return this.h[dfm2.b()];
    }

    public int a() {
        return this.i;
    }

    public bi b() {
        return this.j;
    }

    public azg c() {
        if (this == a) {
            return hp.aM;
        }
        if (this == b) {
            return hp.l;
        }
        if (this == d) {
            return hp.m;
        }
        if (this == c) {
            return hp.l;
        }
        if (this == e) {
            return hp.k;
        }
        return null;
    }

    public String d() {
        return this.f;
    }

    public float e() {
        return this.k;
    }
}

