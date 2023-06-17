/*
 * Decompiled with CFR 0.150.
 */
enum bmi {
    a(0, 1, 2, 3),
    b(2, 3, 0, 1),
    c(3, 0, 1, 2),
    d(0, 1, 2, 3),
    e(3, 0, 1, 2),
    f(1, 2, 3, 0);

    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private static final bmi[] k;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bmi(int n3, int n4) {
        void var6_4;
        void var5_3;
        this.g = n3;
        this.h = n4;
        this.i = var5_3;
        this.j = var6_4;
    }

    public static bmi a(bqk bqk2) {
        return k[bqk2.b()];
    }

    static /* synthetic */ int a(bmi bmi2) {
        return bmi2.g;
    }

    static /* synthetic */ int b(bmi bmi2) {
        return bmi2.h;
    }

    static /* synthetic */ int c(bmi bmi2) {
        return bmi2.i;
    }

    static /* synthetic */ int d(bmi bmi2) {
        return bmi2.j;
    }

    static {
        k = new bmi[6];
        bmi.k[bqk.a.b()] = a;
        bmi.k[bqk.b.b()] = b;
        bmi.k[bqk.c.b()] = c;
        bmi.k[bqk.d.b()] = d;
        bmi.k[bqk.e.b()] = e;
        bmi.k[bqk.f.b()] = f;
    }
}

