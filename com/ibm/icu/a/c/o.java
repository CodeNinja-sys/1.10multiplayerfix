/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

public class o
extends Exception {
    private static final long a = 1L;
    private int b = -1;

    public o(String string) {
        this(string, 0);
    }

    public o(String string, int n2) {
        super(string);
        this.b = n2;
    }

    public int a() {
        return this.b;
    }
}

