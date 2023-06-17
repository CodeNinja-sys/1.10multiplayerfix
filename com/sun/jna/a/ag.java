/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.af;
import com.sun.jna.a.d.di;
import com.sun.jna.a.d.fg;
import com.sun.jna.a.d.hm;
import java.awt.Component;
import java.awt.Window;

class ag
implements Runnable {
    final /* synthetic */ Window a;
    final /* synthetic */ float b;
    final /* synthetic */ af c;

    ag(af af2, Window window, float f2) {
        this.c = af2;
        this.a = window;
        this.b = f2;
    }

    public void run() {
        fg fg2 = af.a(this.c, (Component)this.a);
        di di2 = di.g;
        int n2 = di2.a(fg2, -20);
        byte by2 = (byte)((int)(255.0f * this.b) & 0xFF);
        if (af.a(this.c, this.a)) {
            hm hm2 = new hm();
            hm2.c = by2;
            hm2.F = 1;
            di2.a(fg2, null, null, null, null, null, 0, hm2, 2);
        } else if (this.b == 1.0f) {
            di2.a(fg2, -20, n2 &= 0xFFF7FFFF);
        } else {
            di2.a(fg2, -20, n2 |= 0x80000);
            di2.a(fg2, 0, by2, 2);
        }
        this.c.c(this.a, this.b != 1.0f);
        af.a(this.c, this.a, by2);
    }
}

