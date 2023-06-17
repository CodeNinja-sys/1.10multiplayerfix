/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.ad;
import com.sun.jna.a.af;
import com.sun.jna.a.ak;
import com.sun.jna.a.d.di;
import com.sun.jna.a.d.fg;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;

class ah
implements Runnable {
    final /* synthetic */ Window a;
    final /* synthetic */ boolean b;
    final /* synthetic */ af c;

    ah(af af2, Window window, boolean bl2) {
        this.c = af2;
        this.a = window;
        this.b = bl2;
    }

    public void run() {
        di di2 = di.g;
        fg fg2 = af.a(this.c, (Component)this.a);
        int n2 = di2.a(fg2, -20);
        JRootPane jRootPane = ((RootPaneContainer)((Object)this.a)).getRootPane();
        JLayeredPane jLayeredPane = jRootPane.getLayeredPane();
        Container container = jRootPane.getContentPane();
        if (container instanceof ak) {
            ((ak)container).a(this.b);
        } else if (this.b) {
            ak ak2 = new ak(this.c, container);
            jRootPane.setContentPane(ak2);
            jLayeredPane.add((Component)new ad(ak2), JLayeredPane.DRAG_LAYER);
        }
        if (this.b && !af.a(this.c, this.a)) {
            di2.a(fg2, -20, n2 |= 0x80000);
        } else if (!this.b && af.a(this.c, this.a)) {
            di2.a(fg2, -20, n2 &= 0xFFF7FFFF);
        }
        this.c.b(this.a, this.b);
        this.c.c(this.a, this.b);
        this.c.a((Component)this.a, !this.b);
    }
}

