/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import org.apache.logging.log4j.b;

public enum ad {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7);

    private final int i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ad() {
        void var3_1;
        this.i = var3_1;
    }

    public int a() {
        return this.i;
    }

    public boolean a(String string) {
        return this.name().equalsIgnoreCase(string);
    }

    public static ad a(b b2) {
        switch (b2) {
            case h: {
                return h;
            }
            case g: {
                return h;
            }
            case f: {
                return h;
            }
            case e: {
                return g;
            }
            case d: {
                return e;
            }
            case c: {
                return d;
            }
            case b: {
                return b;
            }
            case a: {
                return a;
            }
        }
        return h;
    }
}

