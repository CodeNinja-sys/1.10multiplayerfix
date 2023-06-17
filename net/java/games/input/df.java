/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.h;
import net.java.games.input.m;

final class df
extends h {
    private final RawDevice a;

    public df(RawDevice rawDevice, m m2) {
        super(m2.a(), m2);
        this.a = rawDevice;
    }

    public final boolean c() {
        return true;
    }

    public final boolean b() {
        return true;
    }

    protected final float a() {
        if (this.d() == m.a) {
            return this.a.f();
        }
        if (this.d() == m.b) {
            return this.a.g();
        }
        if (this.d() == m.c) {
            return this.a.c();
        }
        throw new RuntimeException("Unknown raw axis: " + this.d());
    }
}

