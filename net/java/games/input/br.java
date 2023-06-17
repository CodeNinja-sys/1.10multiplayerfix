/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxEventDevice;
import net.java.games.input.bd;

class br
extends bd {
    private final LinuxEventDevice d;

    br(LinuxEventDevice linuxEventDevice) {
        this.d = linuxEventDevice;
    }

    protected final Object e() {
        LinuxEventDevice.a(LinuxEventDevice.a(this.d));
        return null;
    }
}

