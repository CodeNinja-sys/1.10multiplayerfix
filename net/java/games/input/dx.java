/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.ds;
import net.java.games.input.dt;

final class dx
extends Thread {
    private final ds a;

    private dx(ds ds2) {
        this.a = ds2;
    }

    public final void run() {
        for (int i2 = 0; i2 < ds.a(this.a).size(); ++i2) {
        }
        ds.b(this.a).c();
    }

    dx(ds ds2, dt dt2) {
        this(ds2);
    }
}

