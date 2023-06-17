/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import org.apache.commons.c.am;

class g {
    private final Object a;
    private int b;

    static boolean a(g[] arrg, Object object) {
        int n2 = arrg.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrg[i2].c() != object) continue;
            return true;
        }
        return false;
    }

    g(Object object) {
        this.a = object;
        this.b = 1;
    }

    g(Object object, int n2) {
        this.a = object;
        this.b = n2;
    }

    void a() {
        ++this.b;
    }

    int b() {
        return this.b;
    }

    Object c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof g) {
            g g2 = (g)object;
            if (this.a.getClass() != g2.a.getClass()) {
                return false;
            }
            if (this.b != g2.b) {
                return false;
            }
            if (this.a instanceof StringBuilder) {
                return this.a.toString().equals(g2.a.toString());
            }
            if (this.a instanceof Number) {
                return this.a.equals(g2.a);
            }
            return this.a == g2.a;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return am.d(this.a.toString(), this.b);
    }
}

