/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

final class l
implements CharSequence {
    private byte[] a;
    private int b;

    public l(byte[] arrby, int n2) {
        this.a = arrby;
        this.b = n2;
    }

    public char charAt(int n2) {
        return (char)(this.a[n2] & 0xFF);
    }

    public int length() {
        return this.b;
    }

    public CharSequence subSequence(int n2, int n3) {
        return null;
    }
}

