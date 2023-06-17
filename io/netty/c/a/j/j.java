/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

public enum j {
    a(0),
    b(1),
    c(2),
    d(-1);

    private final byte e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j() {
        void var3_1;
        this.e = var3_1;
    }

    public static j a(byte by2) {
        return j.b(by2);
    }

    public static j b(byte by2) {
        for (j j2 : j.values()) {
            if (j2.e != by2) continue;
            return j2;
        }
        return d;
    }

    public byte a() {
        return this.e;
    }
}

