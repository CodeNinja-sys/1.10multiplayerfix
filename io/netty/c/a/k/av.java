/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

public enum av {
    a("spdy/3.1"),
    b("http/1.1"),
    c("http/1.0"),
    d("Unknown");

    private final String e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private av() {
        void var3_1;
        this.e = var3_1;
    }

    public String a() {
        return this.e;
    }

    public static av a(String string) {
        for (av av2 : av.values()) {
            if (!av2.a().equals(string)) continue;
            return av2;
        }
        return d;
    }
}

