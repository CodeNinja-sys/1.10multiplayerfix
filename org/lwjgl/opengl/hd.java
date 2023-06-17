/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import org.lwjgl.opengl.MacOSXCanvasPeerInfo;
import org.lwjgl.opengl.MacOSXDisplay;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.dx;

final class hd
extends MacOSXCanvasPeerInfo {
    private boolean b;

    hd(PixelFormat pixelFormat, ds ds2, boolean bl2) {
        super(pixelFormat, ds2, bl2);
    }

    protected void a() {
        if (this.b) {
            throw new RuntimeException("Already locked");
        }
        Canvas canvas = ((MacOSXDisplay)dx.t()).D();
        if (canvas != null) {
            this.a(canvas);
            this.b = true;
        }
    }

    protected void b() {
        if (this.b) {
            super.b();
            this.b = false;
        }
    }
}

