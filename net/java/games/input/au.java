/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.dj;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.o;
import net.java.games.input.q;
import net.java.games.input.s;

public abstract class au
extends i {
    protected au(String string, k[] arrk, q[] arrq, dj[] arrdj) {
        super(string, arrk, arrq, arrdj);
    }

    public s h() {
        return s.c;
    }

    public final boolean a(o o2) {
        k k2 = this.a((l)o2);
        if (k2 == null) {
            return false;
        }
        return k2.f() != 0.0f;
    }
}

