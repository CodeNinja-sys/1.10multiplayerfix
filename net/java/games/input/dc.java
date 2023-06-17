/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class dc {
    private long a;
    private int b;
    private int c;
    private int d;
    private int e;
    private long f;

    dc() {
    }

    public final void a(long l2, int n2, int n3, int n4, int n5, long l3) {
        this.a = l2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = l3;
    }

    public final void a(dc dc2) {
        this.a(dc2.a, dc2.b, dc2.c, dc2.d, dc2.e, dc2.f);
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        return this.a * 1000000L;
    }
}

