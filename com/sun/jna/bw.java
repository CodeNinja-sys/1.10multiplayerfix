/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import java.nio.CharBuffer;

public final class bw
implements CharSequence,
Comparable {
    private String a;

    public bw(String string) {
        if (string == null) {
            throw new NullPointerException("String initializer must be non-null");
        }
        this.a = string;
    }

    public String toString() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof bw && this.toString().equals(object.toString());
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public int compareTo(Object object) {
        return this.toString().compareTo(object.toString());
    }

    public int length() {
        return this.toString().length();
    }

    public char charAt(int n2) {
        return this.toString().charAt(n2);
    }

    public CharSequence subSequence(int n2, int n3) {
        return CharBuffer.wrap(this.toString()).subSequence(n2, n3);
    }
}

