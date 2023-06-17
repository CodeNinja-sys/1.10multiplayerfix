/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.ax;
import net.java.games.input.bb;
import net.java.games.input.bq;
import net.java.games.input.h;

class az
extends h {
    private final bq a;

    public az(bq bq2) {
        super(bq2.c().a(), bq2.c());
        this.a = bq2;
    }

    public final boolean c() {
        return this.a.e();
    }

    public final boolean b() {
        return this.a.f();
    }

    protected float a() {
        return this.a(bb.a(this.a), this.a.d());
    }

    float a(float f2, ax ax2) {
        return this.j().a(f2);
    }

    public final float e() {
        return this.a.g();
    }

    public final bq j() {
        return this.a;
    }
}

