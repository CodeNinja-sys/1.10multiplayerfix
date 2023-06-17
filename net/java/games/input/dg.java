/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.h;
import net.java.games.input.n;

final class dg
extends h {
    private final RawDevice a;
    private final int b;

    public dg(RawDevice rawDevice, n n2, int n3) {
        super(n2.a(), n2);
        this.a = rawDevice;
        this.b = n3;
    }

    protected final float a() {
        return this.a.b(this.b) ? 1.0f : 0.0f;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }
}

