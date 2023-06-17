/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.b;

public class c {
    private int a = -1;
    private long b;
    private String c;
    private String d;
    private int e = 255;

    public int a() {
        return this.a;
    }

    public void a(int n2) {
        if (n2 < -1 || n2 > 9) {
            throw new IllegalArgumentException("Invalid gzip compression level: " + n2);
        }
        this.a = n2;
    }

    public long b() {
        return this.b;
    }

    public void a(long l2) {
        this.b = l2;
    }

    public String c() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    public String d() {
        return this.d;
    }

    public void b(String string) {
        this.d = string;
    }

    public int e() {
        return this.e;
    }

    public void b(int n2) {
        this.e = n2;
    }
}

