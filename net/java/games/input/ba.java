/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxEventDevice;
import net.java.games.input.bs;

final class ba
extends bs {
    public ba(LinuxEventDevice linuxEventDevice) {
        super(linuxEventDevice);
    }

    protected final int a(int n2, float f2) {
        int n3 = Math.round(f2 * 32767.0f);
        return this.c().a(n2, 0, 0, 0, 0, 0, n3, 0, 0, 0, 0);
    }
}

