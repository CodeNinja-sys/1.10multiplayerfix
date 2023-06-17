/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

public enum o {
    a("7bit"),
    b("8bit"),
    c("binary");

    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o() {
        void var3_1;
        this.d = var3_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o() {
        this.d = this.name();
    }

    public String a() {
        return this.d;
    }

    public String toString() {
        return this.d;
    }
}

