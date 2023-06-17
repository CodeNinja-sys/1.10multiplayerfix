/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.dj;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.q;
import net.java.games.input.s;

public abstract class cf
extends i {
    protected cf(String string, k[] arrk, q[] arrq, dj[] arrdj) {
        super(string, arrk, arrq, arrdj);
    }

    public s h() {
        return s.b;
    }

    public k k() {
        return this.a(m.a);
    }

    public k l() {
        return this.a(m.b);
    }

    public k m() {
        return this.a(m.c);
    }

    public k n() {
        k k2 = this.a(n.aw);
        if (k2 == null) {
            k2 = this.a(n.b);
        }
        return k2;
    }

    public k o() {
        k k2 = this.a(n.ay);
        if (k2 == null) {
            k2 = this.a(n.c);
        }
        return k2;
    }

    public k p() {
        k k2 = this.a(n.ax);
        if (k2 == null) {
            k2 = this.a(n.d);
        }
        return k2;
    }

    public k q() {
        return this.a(n.aw);
    }

    public k r() {
        return this.a(n.ay);
    }

    public k s() {
        return this.a(n.ax);
    }

    public k t() {
        return this.a(n.az);
    }

    public k u() {
        return this.a(n.au);
    }

    public k v() {
        return this.a(n.av);
    }

    public k w() {
        return this.a(n.at);
    }

    public k x() {
        return this.a(n.d);
    }

    public k y() {
        return this.a(n.e);
    }
}

