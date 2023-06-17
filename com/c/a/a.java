/*
 * Decompiled with CFR 0.150.
 */
package com.c.a;

public class a {
    public static final a a = new a("Minecraft", 1);
    public static final a b = new a("Scrolls", 1);
    private final String c;
    private final int d;

    public a(String string, int n2) {
        this.c = string;
        this.d = n2;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return "Agent{name='" + this.c + '\'' + ", version=" + this.d + '}';
    }
}

