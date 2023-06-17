/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum az {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7),
    i(8),
    j(9),
    k(10),
    l(12),
    m(14),
    n(96),
    o(97),
    p(98),
    q(99),
    r(-1);

    private final int s;
    private static final Map t;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private az() {
        void var3_1;
        this.s = var3_1;
    }

    public int a() {
        return this.s;
    }

    public static az a(int n2) {
        return (az)((Object)t.get(n2));
    }

    static {
        HashMap<Integer, az> hashMap = new HashMap<Integer, az>();
        for (az az2 : az.values()) {
            hashMap.put(az2.a(), az2);
        }
        t = Collections.unmodifiableMap(hashMap);
    }
}

