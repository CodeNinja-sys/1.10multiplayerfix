/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxEventDevice;
import net.java.games.input.ar;
import net.java.games.input.bb;
import net.java.games.input.cf;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.r;

final class cb
extends cf {
    private final r a;
    private final LinuxEventDevice c;

    protected cb(LinuxEventDevice linuxEventDevice, k[] arrk, q[] arrq, dj[] arrdj) {
        super(linuxEventDevice.i(), arrk, arrq, arrdj);
        this.c = linuxEventDevice;
        this.a = linuxEventDevice.d();
    }

    public final r e() {
        return this.a;
    }

    public final void a() {
        this.c.h();
    }

    protected final boolean a(ar ar2) {
        return bb.a(ar2, this.c);
    }
}

