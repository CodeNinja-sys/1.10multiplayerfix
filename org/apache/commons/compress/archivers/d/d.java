/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

public enum d {
    a(1),
    b(2),
    c(3),
    d(4),
    e(5),
    f(6);

    int g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var3_1;
        this.g = var3_1;
    }

    public static d a(int n2) {
        for (d d2 : org.apache.commons.compress.archivers.d.d.values()) {
            if (d2.g != n2) continue;
            return d2;
        }
        return null;
    }
}

