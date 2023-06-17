/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.af;
import com.sun.jna.a.al;
import com.sun.jna.a.v;
import com.sun.jna.a.y;
import com.sun.jna.ax;

class u {
    public static boolean a;
    public static final y b;

    private u() {
    }

    static {
        if (ax.e()) {
            b = new af(null);
        } else if (ax.b()) {
            b = new v(null);
        } else if (ax.i()) {
            b = new al(null);
            a = System.getProperty("java.version").matches("^1\\.4\\..*");
        } else {
            String string = System.getProperty("os.name");
            throw new UnsupportedOperationException("No support for " + string);
        }
    }
}

