/*
 * Decompiled with CFR 0.150.
 */
public enum byv {
    a("all", 1, 11, 20),
    b("fire", 10, 8, 12),
    c("fall", 5, 6, 10),
    d("explosion", 5, 8, 12),
    e("projectile", 3, 6, 15);

    private final String f;
    private final int g;
    private final int h;
    private final int i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private byv(int n2, int n3) {
        void var6_4;
        void var5_3;
        this.f = (String)n2;
        this.g = n3;
        this.h = var5_3;
        this.i = var6_4;
    }

    public String a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }
}

