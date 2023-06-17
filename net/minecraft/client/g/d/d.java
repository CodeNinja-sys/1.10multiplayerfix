/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.d;

public enum d {
    a(4, "Float", 5126),
    b(1, "Unsigned Byte", 5121),
    c(1, "Byte", 5120),
    d(2, "Unsigned Short", 5123),
    e(2, "Short", 5122),
    f(4, "Unsigned Int", 5125),
    g(4, "Int", 5124);

    private final int h;
    private final String i;
    private final int j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d(int n3) {
        void var5_3;
        void var4_2;
        this.h = n3;
        this.i = var4_2;
        this.j = var5_3;
    }

    public int a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }
}

