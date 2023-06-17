/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.al;
import com.sun.jna.a.ar;
import com.sun.jna.a.c.a;
import com.sun.jna.a.c.by;
import com.sun.jna.a.c.f;
import com.sun.jna.a.c.k;
import com.sun.jna.a.c.o;
import java.awt.Window;

class ap
implements Runnable {
    final /* synthetic */ Window a;
    final /* synthetic */ ar b;
    final /* synthetic */ al c;

    ap(al al2, Window window, ar ar2) {
        this.c = al2;
        this.a = window;
        this.b = ar2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        k k2;
        f f2;
        a a2;
        block4: {
            a2 = com.sun.jna.a.c.a.g;
            f2 = a2.a((String)null);
            if (f2 == null) {
                return;
            }
            k2 = null;
            try {
                o o2 = al.b(this.a);
                k2 = this.b.a(f2, o2);
                by by2 = by.g;
                by2.a(f2, o2, 0, 0, 0, k2 == null ? k.c : k2, 0);
                if (k2 == null) break block4;
                a2.a(f2, k2);
            }
            catch (Throwable throwable) {
                if (k2 != null) {
                    a2.a(f2, k2);
                }
                a2.f(f2);
                throw throwable;
            }
        }
        a2.f(f2);
        this.c.c(this.c.a(this.a), k2 != null);
    }
}

