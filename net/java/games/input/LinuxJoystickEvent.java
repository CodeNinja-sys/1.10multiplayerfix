/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class LinuxJoystickEvent {
    private long a;
    private int b;
    private int c;
    private int d;

    LinuxJoystickEvent() {
    }

    public final void a(long l2, int n2, int n3, int n4) {
        this.a = l2 * 1000000L;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final long d() {
        return this.a;
    }
}

