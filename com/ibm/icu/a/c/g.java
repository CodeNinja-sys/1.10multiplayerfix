/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

public class g {
    private char b;
    protected String a;

    protected g(char c2) {
        this.b = c2;
    }

    g(char c2, String string) {
        this.b = c2;
        this.a = string;
    }

    public char a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b + "-" + this.a;
    }

    public String toString() {
        return this.c();
    }
}

