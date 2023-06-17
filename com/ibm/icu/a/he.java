/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.d.ku;

public final class he
extends ku {
    private final char[] b;
    private final int c;
    private final int d;
    private int e;

    public he(char[] arrc, int n2, int n3) {
        if (n2 < 0 || n3 > arrc.length || n2 > n3) {
            throw new IllegalArgumentException("start: " + n2 + " or limit: " + n3 + " out of range [0, " + arrc.length + ")");
        }
        this.b = arrc;
        this.c = n2;
        this.d = n3;
        this.e = n2;
    }

    public int a() {
        return this.e < this.d ? this.b[this.e] : -1;
    }

    public int b() {
        return this.d - this.c;
    }

    public int c() {
        return this.e - this.c;
    }

    public int d() {
        return this.e < this.d ? this.b[this.e++] : -1;
    }

    public int e() {
        return this.e > this.c ? this.b[--this.e] : -1;
    }

    public void a(int n2) {
        if (n2 < 0 || n2 > this.d - this.c) {
            throw new IndexOutOfBoundsException("index: " + n2 + " out of range [0, " + (this.d - this.c) + ")");
        }
        this.e = this.c + n2;
    }

    public int a(char[] arrc, int n2) {
        int n3 = this.d - this.c;
        System.arraycopy(this.b, this.c, arrc, n2, n3);
        return n3;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }
}

