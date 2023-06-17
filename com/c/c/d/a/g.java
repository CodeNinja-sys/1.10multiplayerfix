/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

class g
implements Comparable {
    String a;
    Long b;

    public int a(g g2) {
        return this.b.compareTo(g2.b);
    }

    g(String string, Long l2) {
        this.a = string;
        this.b = l2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof g)) {
            return false;
        }
        g g2 = (g)object;
        return this.a.equals(g2.a);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((g)object);
    }
}

