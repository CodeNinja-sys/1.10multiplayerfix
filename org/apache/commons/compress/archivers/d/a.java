/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

class a {
    private final int a;
    private final int b;
    private final int c;
    private final String d;

    a(int n2, int n3, int n4, String string) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = string;
    }

    int a() {
        return this.a;
    }

    int b() {
        return this.b;
    }

    int c() {
        return this.c;
    }

    String d() {
        return this.d;
    }

    public String toString() {
        return String.format("[%d]: %s", this.a, this.d);
    }
}

