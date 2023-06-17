/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxJoystickDevice;
import net.java.games.input.ar;
import net.java.games.input.dj;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.s;

final class bw
extends i {
    private final LinuxJoystickDevice a;

    protected bw(LinuxJoystickDevice linuxJoystickDevice, k[] arrk, q[] arrq, dj[] arrdj) {
        super(linuxJoystickDevice.g(), arrk, arrq, arrdj);
        this.a = linuxJoystickDevice;
    }

    protected final void a(int n2) {
        this.a.a(n2);
    }

    public final void a() {
        this.a.b();
    }

    protected final boolean a(ar ar2) {
        return this.a.a(ar2);
    }

    public s h() {
        return s.h;
    }
}

