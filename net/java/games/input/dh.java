/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class dh {
    private static final int a = 120;
    private long b;
    private int c;
    private int d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;

    dh() {
    }

    public final void a(long l2, int n2, int n3, int n4, long l3, long l4, long l5, long l6) {
        this.b = l2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = l3;
        this.g = l4;
        this.h = l5;
        this.i = l6;
    }

    public final void a(dh dh2) {
        this.a(dh2.b, dh2.c, dh2.d, dh2.e, dh2.f, dh2.g, dh2.h, dh2.i);
    }

    public final int a() {
        return this.e / 120;
    }

    private final int h() {
        return this.e;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return (int)this.g;
    }

    public final int e() {
        return (int)this.h;
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.b * 1000000L;
    }
}

