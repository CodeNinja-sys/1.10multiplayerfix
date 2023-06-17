/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

final class bt {
    private byte[] a;
    private int b;

    public bt(byte[] arrby, int n2) {
        this.a = arrby;
        this.b = n2;
    }

    public byte a(int n2) {
        return this.a[this.b + n2];
    }
}

