/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxEventDevice;
import net.java.games.input.bs;

final class ce
extends bs {
    public ce(LinuxEventDevice linuxEventDevice) {
        super(linuxEventDevice);
    }

    protected final int a(int n2, float f2) {
        int n3;
        int n4;
        if (f2 > 0.666666f) {
            n4 = (int)(32768.0f * f2);
            n3 = (int)(49152.0f * f2);
        } else if (f2 > 0.3333333f) {
            n4 = (int)(32768.0f * f2);
            n3 = 0;
        } else {
            n4 = 0;
            n3 = (int)(49152.0f * f2);
        }
        return this.c().a(n2, 0, 0, 0, -1, 0, n4, n3);
    }
}

