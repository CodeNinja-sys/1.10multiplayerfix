/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

public class bj
extends RuntimeException {
    private static final long a = 1L;
    private int b = -1;

    public bj() {
    }

    public bj(String string) {
        super(string);
    }

    public bj(String string, int n2) {
        super(string + (n2 < 0 ? "" : " [at index " + n2 + "]"));
        this.b = n2;
    }

    public int a() {
        return this.b;
    }
}

