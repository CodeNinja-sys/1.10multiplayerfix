/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ba;

public final class bb {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    private bb() {
    }

    private bb(int n2, int n3, int n4, int n5, int n6) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
    }

    private bb(bb bb2) {
        this(bb2.a, bb2.b, bb2.c, bb2.d, bb2.e);
    }

    public String toString() {
        return " rc: " + this.a + " mrc: " + this.b + " wrc: " + this.c + " wc: " + this.d + " wwc: " + this.e;
    }

    /* synthetic */ bb(ba ba2) {
        this();
    }

    /* synthetic */ bb(bb bb2, ba ba2) {
        this(bb2);
    }
}

