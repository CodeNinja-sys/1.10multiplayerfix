/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.ad;
import com.sun.jna.a.al;
import com.sun.jna.a.as;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;

class ao
implements Runnable {
    final /* synthetic */ Window a;
    final /* synthetic */ boolean b;
    final /* synthetic */ al c;

    ao(al al2, Window window, boolean bl2) {
        this.c = al2;
        this.a = window;
        this.b = bl2;
    }

    public void run() {
        JRootPane jRootPane = ((RootPaneContainer)((Object)this.a)).getRootPane();
        JLayeredPane jLayeredPane = jRootPane.getLayeredPane();
        Container container = jRootPane.getContentPane();
        if (container instanceof as) {
            ((as)container).a(this.b);
        } else if (this.b) {
            as as2 = new as(this.c, container);
            jRootPane.setContentPane(as2);
            jLayeredPane.add((Component)new ad(as2), JLayeredPane.DRAG_LAYER);
        }
        this.c.b(this.a, this.b);
        this.c.c(this.a, this.b);
        this.c.a((Component)this.a, !this.b);
    }
}

