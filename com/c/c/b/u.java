/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

public class u {
    private String a;
    private int b;

    public u(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public int a() {
        return this.b;
    }

    public String toString() {
        return String.format("%s --> %.2f ms", this.a, this.b);
    }
}

