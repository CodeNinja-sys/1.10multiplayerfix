/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.util.Arrays;

class h {
    int a;
    long b;
    byte[] c;
    int d;
    int e;
    boolean f;
    int g;
    int h;

    h() {
    }

    public String toString() {
        return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", this.getClass().getSimpleName(), Arrays.toString(this.c), this.g, this.f, this.a, this.b, this.h, this.d, this.e);
    }
}

