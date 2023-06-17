/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.f;

public enum h {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final int f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h() {
        void var3_1;
        this.f = var3_1;
    }

    public int a() {
        return this.f;
    }

    public static h a(int n2) {
        for (h h2 : h.values()) {
            if (h2.f != n2) continue;
            return h2;
        }
        throw new IllegalArgumentException("unknown " + h.class.getSimpleName() + " value: " + n2);
    }
}

