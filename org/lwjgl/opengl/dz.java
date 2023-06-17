/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.fz;

final class dz
extends ComponentAdapter {
    dz() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void componentResized(ComponentEvent componentEvent) {
        Object object = fz.a;
        synchronized (object) {
            dx.e(true);
        }
    }
}

