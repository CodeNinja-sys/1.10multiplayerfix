/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import org.apache.logging.log4j.e.a;

public enum j {
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
    l(11),
    m(12),
    n(13),
    o(14),
    p(15),
    q(16),
    r(17),
    s(18),
    t(19),
    u(20),
    v(21),
    w(22),
    x(23);

    private final int y;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j() {
        void var3_1;
        this.y = var3_1;
    }

    public static j a(String string) {
        return org.apache.logging.log4j.core.net.j.a(string, null);
    }

    public static j a(String string, j j2) {
        return (j)org.apache.logging.log4j.e.a.a(j.class, string, j2);
    }

    public int a() {
        return this.y;
    }

    public boolean b(String string) {
        return this.name().equalsIgnoreCase(string);
    }
}

