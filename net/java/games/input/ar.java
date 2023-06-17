/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.k;

public final class ar {
    private k a;
    private float b;
    private long c;

    public final void a(ar ar2) {
        this.a(ar2.a(), ar2.b(), ar2.c());
    }

    public final void a(k k2, float f2, long l2) {
        this.a = k2;
        this.b = f2;
        this.c = l2;
    }

    public final k a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final String toString() {
        return "Event: component = " + this.a + " | value = " + this.b;
    }
}

