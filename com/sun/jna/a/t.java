/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import java.awt.Rectangle;
import java.awt.Window;

class t
extends Window {
    private static final long a = 1L;
    private final boolean b;

    public t(Window window) {
        super(window);
        this.pack();
        this.b = true;
    }

    public boolean isVisible() {
        return this.b;
    }

    public Rectangle getBounds() {
        return this.getOwner().getBounds();
    }
}

