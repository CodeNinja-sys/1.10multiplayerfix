/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.security.AccessController;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.WindowsAWTGLCanvasPeerInfo;
import org.lwjgl.opengl.dk;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.ii;
import org.lwjgl.opengl.ja;

final class iz
implements dk {
    iz() {
    }

    public ii a(Canvas canvas, PixelFormat pixelFormat, ds ds2) {
        return new WindowsAWTGLCanvasPeerInfo(canvas, pixelFormat);
    }

    public GraphicsConfiguration a(GraphicsDevice graphicsDevice, PixelFormat pixelFormat) {
        return null;
    }

    static {
        Toolkit.getDefaultToolkit();
        AccessController.doPrivileged(new ja());
    }
}

