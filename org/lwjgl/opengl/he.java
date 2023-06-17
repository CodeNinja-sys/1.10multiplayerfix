/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.Graphics;

final class he
extends Canvas {
    private static final long a = 6916664741667434870L;
    private boolean b;
    private boolean c;

    he() {
    }

    public void update(Graphics graphics) {
        this.paint(graphics);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void paint(Graphics graphics) {
        he he2 = this;
        synchronized (he2) {
            this.c = true;
            this.b = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a() {
        boolean bl2;
        he he2 = this;
        synchronized (he2) {
            bl2 = this.b;
            this.b = false;
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b() {
        boolean bl2;
        he he2 = this;
        synchronized (he2) {
            bl2 = this.c;
            this.c = false;
        }
        return bl2;
    }
}

