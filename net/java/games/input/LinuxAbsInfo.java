/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class LinuxAbsInfo {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    LinuxAbsInfo() {
    }

    public final void a(int n2, int n3, int n4, int n5, int n6) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
    }

    public final String toString() {
        return "AbsInfo: value = " + this.a + " | min = " + this.b + " | max = " + this.c + " | fuzz = " + this.d + " | flat = " + this.e;
    }

    public final int a() {
        return this.a;
    }

    final int b() {
        return this.c;
    }

    final int c() {
        return this.b;
    }

    final int d() {
        return this.e;
    }

    final int e() {
        return this.d;
    }
}

