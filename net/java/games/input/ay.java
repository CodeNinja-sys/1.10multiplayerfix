/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.ar;
import net.java.games.input.aw;
import net.java.games.input.bw;
import net.java.games.input.i;
import net.java.games.input.r;
import net.java.games.input.s;

public class ay
extends i {
    private aw a;
    private bw c;

    ay(aw aw2, bw bw2) {
        super(aw2.g(), bw2.c(), aw2.b(), aw2.d());
        this.a = aw2;
        this.c = bw2;
    }

    protected boolean a(ar ar2) {
        return this.c.a(ar2);
    }

    public final r e() {
        return this.a.e();
    }

    public final void a() {
        this.a.a();
        this.c.a();
    }

    public s h() {
        return this.a.h();
    }
}

