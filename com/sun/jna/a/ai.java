/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.af;
import com.sun.jna.a.d.di;
import com.sun.jna.a.d.fe;
import com.sun.jna.a.d.fg;
import com.sun.jna.a.d.y;
import java.awt.Component;

class ai
implements Runnable {
    final /* synthetic */ Component a;
    final /* synthetic */ fe b;
    final /* synthetic */ af c;

    ai(af af2, Component component, fe fe2) {
        this.c = af2;
        this.a = component;
        this.b = fe2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        y y2 = y.g;
        di di2 = di.g;
        fg fg2 = af.a(this.c, this.a);
        try {
            di2.a(fg2, this.b, true);
            this.c.c(this.c.a(this.a), this.b != null);
        }
        finally {
            y2.a(this.b);
        }
    }
}

