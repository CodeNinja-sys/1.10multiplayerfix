/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.OSXEvent;
import net.java.games.input.OSXHIDQueue;
import net.java.games.input.ar;
import net.java.games.input.ci;
import net.java.games.input.co;

final class cj {
    private static final OSXEvent a = new OSXEvent();

    cj() {
    }

    public static final synchronized float a(co co2) {
        co2.a(a);
        return co2.a(a.c());
    }

    public static final synchronized boolean a(ar ar2, OSXHIDQueue oSXHIDQueue) {
        if (oSXHIDQueue.b(a)) {
            ci ci2 = oSXHIDQueue.a(a);
            ar2.a(ci2, ci2.j().a(a.c()), a.d());
            return true;
        }
        return false;
    }
}

