/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.f;

public enum i {
    a(1),
    b(2),
    c(3);

    private final int d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private i() {
        void var3_1;
        this.d = var3_1;
    }

    public int a() {
        return this.d;
    }

    public static i a(int n2) {
        for (i i2 : i.values()) {
            if (i2.d != n2) continue;
            return i2;
        }
        throw new IllegalArgumentException("unknown " + i.class.getSimpleName() + " value: " + n2);
    }
}

