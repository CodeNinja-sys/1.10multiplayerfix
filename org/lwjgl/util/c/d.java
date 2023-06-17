/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.c;

import net.java.games.input.h;
import net.java.games.input.o;
import org.lwjgl.a.g;

final class d
extends h {
    private final int a;
    private float b;

    d(o o2, int n2) {
        super(o2.a(), o2);
        this.a = n2;
    }

    public void j() {
        this.b = g.a(this.a) ? 1.0f : 0.0f;
    }

    protected float a() {
        return this.b;
    }

    public boolean c() {
        return false;
    }

    public boolean b() {
        return false;
    }
}

