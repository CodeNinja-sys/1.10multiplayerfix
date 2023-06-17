/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum f {
    a(2048),
    b(1024),
    c(512),
    d(256),
    e(128),
    f(64),
    g(32),
    h(16),
    i(8),
    j(4),
    k(2),
    l(1);

    private int m;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f() {
        void var3_1;
        this.m = var3_1;
    }

    public static Set a(int n2) {
        HashSet<f> hashSet = new HashSet<f>();
        for (f f2 : org.apache.commons.compress.archivers.d.f.values()) {
            if ((n2 & f2.m) != f2.m) continue;
            hashSet.add(f2);
        }
        if (hashSet.isEmpty()) {
            return Collections.emptySet();
        }
        return EnumSet.copyOf(hashSet);
    }
}

