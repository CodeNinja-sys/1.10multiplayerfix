/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxEventDevice;
import net.java.games.input.ar;
import net.java.games.input.bb;
import net.java.games.input.dj;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.r;
import net.java.games.input.s;

final class aw
extends i {
    private final r a;
    private final LinuxEventDevice c;
    private final s d;

    protected aw(LinuxEventDevice linuxEventDevice, k[] arrk, q[] arrq, dj[] arrdj, s s2) {
        super(linuxEventDevice.i(), arrk, arrq, arrdj);
        this.c = linuxEventDevice;
        this.a = linuxEventDevice.d();
        this.d = s2;
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

    public s h() {
        return this.d;
    }
}

