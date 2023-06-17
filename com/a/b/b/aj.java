/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

class aj
implements CharSequence {
    char[] a;

    aj() {
    }

    public int length() {
        return this.a.length;
    }

    public char charAt(int n2) {
        return this.a[n2];
    }

    public CharSequence subSequence(int n2, int n3) {
        return new String(this.a, n2, n3 - n2);
    }
}

