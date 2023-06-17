/*
 * Decompiled with CFR 0.150.
 */
public enum deq implements hn
{
    a(0, "dead_bush"),
    b(1, "tall_grass"),
    c(2, "fern");

    private static final deq[] d;
    private final int e;
    private final String f;

    /*
     * WARNING - void declaration
     */
    private deq() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public int b() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    public static deq a(int n2) {
        if (n2 < 0 || n2 >= d.length) {
            n2 = 0;
        }
        return d[n2];
    }

    @Override
    public String a() {
        return this.f;
    }

    static {
        d = new deq[deq.values().length];
        deq[] arrdeq = deq.values();
        int n2 = arrdeq.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            deq deq2;
            deq.d[deq2.b()] = deq2 = arrdeq[i2];
        }
    }
}

