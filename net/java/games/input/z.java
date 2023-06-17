/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class z {
    private int a;
    private int b;
    private int c;
    private int d;

    z() {
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    public final void a(z z2) {
        this.a(z2.a, z2.b, z2.c, z2.d);
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final long c() {
        return (long)this.c * 1000000L;
    }
}

