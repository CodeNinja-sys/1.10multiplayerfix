/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.bd;
import net.java.games.input.bf;
import net.java.games.input.bs;
import net.java.games.input.bt;

final class bu
extends bd {
    private int d;
    private float e;
    private final bs f;

    private bu(bs bs2) {
        this.f = bs2;
    }

    public final int a(int n2, float f2) {
        this.d = n2;
        this.e = f2;
        bf.a(this);
        return this.d;
    }

    protected final Object e() {
        this.d = this.f.a(this.d, this.e);
        return null;
    }

    bu(bs bs2, bt bt2) {
        this(bs2);
    }
}

