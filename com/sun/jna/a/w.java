/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.v;
import java.awt.Window;
import java.awt.peer.ComponentPeer;

class w
implements Runnable {
    final /* synthetic */ Window a;
    final /* synthetic */ float b;
    final /* synthetic */ v c;

    w(v v2, Window window, float f2) {
        this.c = v2;
        this.a = window;
        this.b = f2;
    }

    public void run() {
        ComponentPeer componentPeer = this.a.getPeer();
        try {
            componentPeer.getClass().getMethod("setAlpha", Float.TYPE).invoke(componentPeer, new Float(this.b));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

