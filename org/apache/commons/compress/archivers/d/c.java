/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

public enum c {
    a(0),
    b(1),
    c(2);

    int d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c() {
        void var3_1;
        this.d = var3_1;
    }

    public static c a(int n2) {
        for (c c2 : org.apache.commons.compress.archivers.d.c.values()) {
            if (c2.d != n2) continue;
            return c2;
        }
        return null;
    }
}

