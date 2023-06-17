/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

public enum g {
    a(14),
    b(12),
    c(10),
    d(8),
    e(6),
    f(4),
    g(2),
    h(1),
    i(15);

    private int j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g() {
        void var3_1;
        this.j = var3_1;
    }

    public static g a(int n2) {
        g g2 = i;
        for (g g3 : org.apache.commons.compress.archivers.d.g.values()) {
            if (n2 != g3.j) continue;
            g2 = g3;
        }
        return g2;
    }
}

