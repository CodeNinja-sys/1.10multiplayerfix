/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.bd;
import net.java.games.input.bf;
import net.java.games.input.bs;
import net.java.games.input.bt;

final class bv
extends bd {
    private int d;
    private final bs e;

    private bv(bs bs2) {
        this.e = bs2;
    }

    public final void a(int n2) {
        this.d = n2;
        bf.a(this);
    }

    protected final Object e() {
        bs.b(this.e).a(21, bs.a(this.e), this.d);
        return null;
    }

    bv(bs bs2, bt bt2) {
        this(bs2);
    }
}

