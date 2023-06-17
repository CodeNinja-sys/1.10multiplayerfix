/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.d.ku;

public final class fc
extends ku {
    private String b;
    private int c;

    public fc(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        this.b = string;
        this.c = 0;
    }

    public fc() {
        this.b = "";
        this.c = 0;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public int a() {
        if (this.c < this.b.length()) {
            return this.b.charAt(this.c);
        }
        return -1;
    }

    public int b() {
        return this.b.length();
    }

    public int c() {
        return this.c;
    }

    public int d() {
        if (this.c < this.b.length()) {
            return this.b.charAt(this.c++);
        }
        return -1;
    }

    public int e() {
        if (this.c > 0) {
            return this.b.charAt(--this.c);
        }
        return -1;
    }

    public void a(int n2) {
        if (n2 < 0 || n2 > this.b.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.c = n2;
    }

    public int a(char[] arrc, int n2) {
        int n3 = this.b.length();
        if (n2 < 0 || n2 + n3 > arrc.length) {
            throw new IndexOutOfBoundsException(Integer.toString(n3));
        }
        this.b.getChars(0, n3, arrc, n2);
        return n3;
    }

    public String i() {
        return this.b;
    }

    public void a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.b = string;
        this.c = 0;
    }
}

