/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.ej;
import org.lwjgl.opengl.fz;
import org.lwjgl.opengl.ij;

final class ed
extends ej {
    ed() {
    }

    public void a(ij ij2, ds ds2) {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j() {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                return;
            }
            dx.H();
            super.j();
            dx.I();
            dx.c(dx.d(-1));
            dx.b(null);
            dx.F();
            dx.J();
        }
    }
}

