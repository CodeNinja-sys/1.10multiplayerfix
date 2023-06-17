/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.cj;
import net.java.games.input.co;
import net.java.games.input.h;
import net.java.games.input.l;

class ci
extends h {
    private final co a;

    public ci(l l2, co co2) {
        super(l2.a(), l2);
        this.a = co2;
    }

    public final boolean c() {
        return this.a.d();
    }

    public boolean b() {
        return this.a.e();
    }

    public final co j() {
        return this.a;
    }

    protected float a() {
        return cj.a(this.a);
    }
}

