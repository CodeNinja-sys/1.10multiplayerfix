/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.al;
import com.sun.jna.a.c.a;
import com.sun.jna.a.c.f;
import com.sun.jna.a.c.o;
import com.sun.jna.b.e;
import java.awt.Window;

class an
implements Runnable {
    final /* synthetic */ Window a;
    final /* synthetic */ float b;
    final /* synthetic */ al c;

    an(al al2, Window window, float f2) {
        this.c = al2;
        this.a = window;
        this.b = f2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        a a2 = com.sun.jna.a.c.a.g;
        f f2 = a2.a((String)null);
        if (f2 == null) {
            return;
        }
        try {
            o o2 = al.b(this.a);
            if (this.b == 1.0f) {
                a2.a(f2, o2, a2.a(f2, "_NET_WM_WINDOW_OPACITY", false));
            } else {
                int n2 = (int)((long)(this.b * 4.2949673E9f) & 0xFFFFFFFFFFFFFFFFL);
                e e2 = new e(n2);
                a2.a(f2, o2, a2.a(f2, "_NET_WM_WINDOW_OPACITY", false), com.sun.jna.a.c.a.N, 32, 0, e2.c(), 1);
            }
        }
        finally {
            a2.f(f2);
        }
    }
}

