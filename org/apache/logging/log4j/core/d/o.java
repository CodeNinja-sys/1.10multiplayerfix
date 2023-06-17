/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

public class o {
    private final String a;
    private final String b;

    public o(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        return this.a + "=" + this.b;
    }

    public static o a(String string, String string2) {
        return new o(string, string2);
    }
}

