/*
 * Decompiled with CFR 0.150.
 */
public enum bta implements hn
{
    a(0, "down_x", bqk.a),
    b(1, "east", bqk.f),
    c(2, "west", bqk.e),
    d(3, "south", bqk.d),
    e(4, "north", bqk.c),
    f(5, "up_z", bqk.b),
    g(6, "up_x", bqk.b),
    h(7, "down_z", bqk.a);

    private static final bta[] i;
    private final int j;
    private final String k;
    private final bqk l;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bta(bqk bqk2) {
        void var5_3;
        void var4_2;
        this.j = (int)bqk2;
        this.k = var4_2;
        this.l = var5_3;
    }

    public int b() {
        return this.j;
    }

    public bqk c() {
        return this.l;
    }

    public String toString() {
        return this.k;
    }

    public static bta a(int n2) {
        if (n2 < 0 || n2 >= i.length) {
            n2 = 0;
        }
        return i[n2];
    }

    public static bta a(bqk bqk2, bqk bqk3) {
        switch (bqk2) {
            case a: {
                switch (bqk3.l()) {
                    case a: {
                        return a;
                    }
                    case c: {
                        return h;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + bqk3 + " for facing " + bqk2);
            }
            case b: {
                switch (bqk3.l()) {
                    case a: {
                        return g;
                    }
                    case c: {
                        return f;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + bqk3 + " for facing " + bqk2);
            }
            case c: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
            case f: {
                return b;
            }
        }
        throw new IllegalArgumentException("Invalid facing: " + bqk2);
    }

    @Override
    public String a() {
        return this.k;
    }

    static {
        i = new bta[bta.values().length];
        bta[] arrbta = bta.values();
        int n2 = arrbta.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bta bta2;
            bta.i[bta2.b()] = bta2 = arrbta[i2];
        }
    }
}

