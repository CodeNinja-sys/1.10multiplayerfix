/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import org.lwjgl.c;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dk;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.gy;
import org.lwjgl.opengl.ii;

final class gz
implements dk {
    gz() {
    }

    public ii a(Canvas canvas, PixelFormat pixelFormat, ds ds2) {
        try {
            return new gy(canvas, pixelFormat, ds2, true);
        }
        catch (c c2) {
            return new gy(canvas, pixelFormat, ds2, false);
        }
    }

    public GraphicsConfiguration a(GraphicsDevice graphicsDevice, PixelFormat pixelFormat) {
        return null;
    }
}

