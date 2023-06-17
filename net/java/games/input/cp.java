/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.OSXHIDDevice;
import net.java.games.input.OSXHIDQueue;
import net.java.games.input.ar;
import net.java.games.input.au;
import net.java.games.input.cj;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.r;

final class cp
extends au {
    private final r a;
    private final OSXHIDQueue c;

    protected cp(OSXHIDDevice oSXHIDDevice, OSXHIDQueue oSXHIDQueue, k[] arrk, q[] arrq, dj[] arrdj) {
        super(oSXHIDDevice.b(), arrk, arrq, arrdj);
        this.c = oSXHIDQueue;
        this.a = oSXHIDDevice.a();
    }

    protected final boolean a(ar ar2) {
        return cj.a(ar2, this.c);
    }

    protected final void a(int n2) {
        this.c.a(n2);
    }

    public final r e() {
        return this.a;
    }
}

