/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

public enum w {
    a(1.5f, "0.9"),
    b(1.1f, "1.1"),
    c(1.2f, "1.2"),
    d(1.3f, "1.3"),
    e(1.4f, "1.4"),
    f(1.5f, "1.5"),
    g(1.6f, "1.6"),
    h(1.7f, "1.7"),
    i(1.8f, "1.8");

    private final float j;
    private final String k;

    /*
     * WARNING - void declaration
     */
    private w() {
        void var4_2;
        void var3_1;
        this.j = var3_1;
        this.k = var4_2;
    }

    public boolean a(w w2) {
        return this.j >= w2.j;
    }

    static w a(String string) {
        return w.b(string);
    }

    static w b(String string) {
        if ("0.9".equals(string)) {
            return a;
        }
        if ("1.1".equals(string)) {
            return b;
        }
        if ("1.2".equals(string)) {
            return c;
        }
        if ("1.3".equals(string)) {
            return d;
        }
        if ("1.4".equals(string)) {
            return e;
        }
        if ("1.5".equals(string)) {
            return f;
        }
        if ("1.6".equals(string)) {
            return g;
        }
        if ("1.7".equals(string)) {
            return h;
        }
        if ("1.8".equals(string)) {
            return i;
        }
        return null;
    }

    public String toString() {
        return this.k;
    }
}

