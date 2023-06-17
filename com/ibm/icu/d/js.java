/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import java.text.CharacterIterator;

public final class js
implements CharacterIterator {
    private String a;
    private int b;
    private int c;
    private int d;

    public js(String string) {
        this(string, 0);
    }

    public js(String string, int n2) {
        this(string, 0, string.length(), n2);
    }

    public js(String string, int n2, int n3, int n4) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = string;
        if (n2 < 0 || n2 > n3 || n3 > string.length()) {
            throw new IllegalArgumentException("Invalid substring range");
        }
        if (n4 < n2 || n4 > n3) {
            throw new IllegalArgumentException("Invalid position");
        }
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public void a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = string;
        this.b = 0;
        this.c = string.length();
        this.d = 0;
    }

    public char first() {
        this.d = this.b;
        return this.current();
    }

    public char last() {
        this.d = this.c != this.b ? this.c - 1 : this.c;
        return this.current();
    }

    public char setIndex(int n2) {
        if (n2 < this.b || n2 > this.c) {
            throw new IllegalArgumentException("Invalid index");
        }
        this.d = n2;
        return this.current();
    }

    public char current() {
        if (this.d >= this.b && this.d < this.c) {
            return this.a.charAt(this.d);
        }
        return '\uffff';
    }

    public char next() {
        if (this.d < this.c - 1) {
            ++this.d;
            return this.a.charAt(this.d);
        }
        this.d = this.c;
        return '\uffff';
    }

    public char previous() {
        if (this.d > this.b) {
            --this.d;
            return this.a.charAt(this.d);
        }
        return '\uffff';
    }

    public int getBeginIndex() {
        return this.b;
    }

    public int getEndIndex() {
        return this.c;
    }

    public int getIndex() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof js)) {
            return false;
        }
        js js2 = (js)object;
        if (this.hashCode() != js2.hashCode()) {
            return false;
        }
        if (!this.a.equals(js2.a)) {
            return false;
        }
        return this.d == js2.d && this.b == js2.b && this.c == js2.c;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.d ^ this.b ^ this.c;
    }

    public Object clone() {
        try {
            js js2 = (js)super.clone();
            return js2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }
}

