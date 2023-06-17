/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxEventDevice;
import net.java.games.input.ar;
import net.java.games.input.au;
import net.java.games.input.bb;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.r;

final class ca
extends au {
    private final r a;
    private final LinuxEventDevice c;

    protected ca(LinuxEventDevice linuxEventDevice, k[] arrk, q[] arrq, dj[] arrdj) {
        super(linuxEventDevice.i(), arrk, arrq, arrdj);
        this.c = linuxEventDevice;
        this.a = linuxEventDevice.d();
    }

    public final r e() {
        return this.a;
    }

    protected final boolean a(ar ar2) {
        return bb.a(ar2, this.c);
    }

    public final void a() {
        this.c.h();
    }
}

