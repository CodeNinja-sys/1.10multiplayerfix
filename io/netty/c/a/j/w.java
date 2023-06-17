/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

public enum w {
    a(1),
    b(2),
    c(3),
    d(-1);

    private final byte e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private w() {
        void var3_1;
        this.e = var3_1;
    }

    public static w a(byte by2) {
        return w.b(by2);
    }

    public static w b(byte by2) {
        for (w w2 : w.values()) {
            if (w2.e != by2) continue;
            return w2;
        }
        return d;
    }

    public byte a() {
        return this.e;
    }
}

