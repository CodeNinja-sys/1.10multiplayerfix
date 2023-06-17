/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

enum d {
    a("smaller"),
    b("xx-small"),
    c("x-small"),
    d("small"),
    e("medium"),
    f("large"),
    g("x-large"),
    h("xx-large"),
    i("larger");

    private final String j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var3_1;
        this.j = var3_1;
    }

    public String a() {
        return this.j;
    }

    public static d a(String string) {
        for (d d2 : org.apache.logging.log4j.core.g.d.values()) {
            if (!d2.j.equals(string)) continue;
            return d2;
        }
        return d;
    }

    public d b() {
        return this.ordinal() < h.ordinal() ? org.apache.logging.log4j.core.g.d.values()[this.ordinal() + 1] : this;
    }
}

