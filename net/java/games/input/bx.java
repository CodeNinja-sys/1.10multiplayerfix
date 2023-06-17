/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.h;
import net.java.games.input.m;

class bx
extends h {
    private float a;
    private boolean b;

    public bx(m m2) {
        this(m2, true);
    }

    public bx(m m2, boolean bl2) {
        super(m2.a(), m2);
        this.b = bl2;
    }

    public final boolean c() {
        return false;
    }

    public final boolean b() {
        return this.b;
    }

    final void a(float f2) {
        this.a = f2;
        this.g();
    }

    protected final float a() {
        return this.a;
    }
}

