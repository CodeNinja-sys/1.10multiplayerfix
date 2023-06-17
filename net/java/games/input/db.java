/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.h;
import net.java.games.input.o;

final class db
extends h {
    private final RawDevice a;
    private final int b;

    public db(RawDevice rawDevice, int n2, o o2) {
        super(o2.a(), o2);
        this.a = rawDevice;
        this.b = n2;
    }

    protected final float a() {
        return this.a.a(this.b) ? 1.0f : 0.0f;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }
}

