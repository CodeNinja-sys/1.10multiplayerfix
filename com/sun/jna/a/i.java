/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.k;
import com.sun.jna.a.l;
import com.sun.jna.a.m;
import com.sun.jna.a.n;
import com.sun.jna.ax;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;

public class i {
    static final l a;

    public static boolean a(int n2, int n3) {
        return a.a(n2, n3);
    }

    public static boolean a(int n2) {
        return a.a(n2);
    }

    static {
        if (GraphicsEnvironment.isHeadless()) {
            throw new HeadlessException("KeyboardUtils requires a keyboard");
        }
        if (ax.e()) {
            a = new m(null);
        } else {
            if (ax.b()) {
                a = new k(null);
                throw new UnsupportedOperationException("No support (yet) for " + System.getProperty("os.name"));
            }
            a = new n(null);
        }
    }
}

