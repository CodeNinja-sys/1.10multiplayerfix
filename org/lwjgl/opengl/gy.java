/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import org.lwjgl.opengl.MacOSXCanvasPeerInfo;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.ds;

final class gy
extends MacOSXCanvasPeerInfo {
    private final Canvas b;

    gy(Canvas canvas, PixelFormat pixelFormat, ds ds2, boolean bl2) {
        super(pixelFormat, ds2, bl2);
        this.b = canvas;
    }

    protected void a() {
        this.a(this.b);
    }
}

