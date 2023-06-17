/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.ax;

final class LinuxEvent {
    private long a;
    private final ax b = new ax();
    private int c;

    LinuxEvent() {
    }

    public final void a(long l2, long l3, int n2, int n3, int n4) {
        this.a = (l2 * 1000000L + l3) * 1000L;
        this.b.a(n2, n3);
        this.c = n4;
    }

    public final int a() {
        return this.c;
    }

    public final ax b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }
}

