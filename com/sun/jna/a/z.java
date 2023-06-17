/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.y;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class z
extends WindowAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ y b;

    z(y y2, Runnable runnable) {
        this.b = y2;
        this.a = runnable;
    }

    public void windowOpened(WindowEvent windowEvent) {
        windowEvent.getWindow().removeWindowListener(this);
        this.a.run();
    }

    public void windowClosed(WindowEvent windowEvent) {
        windowEvent.getWindow().removeWindowListener(this);
    }
}

