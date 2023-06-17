/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.f;

public enum g {
    a(5),
    b(6),
    c(7),
    d(8);

    private final int e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g() {
        void var3_1;
        this.e = var3_1;
    }

    public int a() {
        return this.e;
    }

    public static g a(int n2) {
        for (g g2 : g.values()) {
            if (g2.e != n2) continue;
            return g2;
        }
        throw new IllegalArgumentException("unknown " + g.class.getSimpleName() + " value: " + n2);
    }
}

