/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.m;

public class l {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public l(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[leased: ");
        stringBuilder.append(this.a);
        stringBuilder.append("; pending: ");
        stringBuilder.append(this.b);
        stringBuilder.append("; available: ");
        stringBuilder.append(this.c);
        stringBuilder.append("; max: ");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

