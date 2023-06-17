/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.AWTSurfaceLock;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.WindowsPeerInfo;

final class WindowsAWTGLCanvasPeerInfo
extends WindowsPeerInfo {
    private final Canvas a;
    private final AWTSurfaceLock b = new AWTSurfaceLock();
    private final PixelFormat c;
    private boolean d;

    WindowsAWTGLCanvasPeerInfo(Canvas canvas, PixelFormat pixelFormat) {
        this.a = canvas;
        this.c = pixelFormat;
    }

    protected void a() {
        WindowsAWTGLCanvasPeerInfo.nInitHandle(this.b.a(this.a), this.h());
        if (!this.d && this.c != null) {
            int n2 = WindowsAWTGLCanvasPeerInfo.a(this.e(), this.a.getX(), this.a.getY(), this.c, null, true, true, false, true);
            WindowsAWTGLCanvasPeerInfo.setPixelFormat(this.e(), n2);
            this.d = true;
        }
    }

    private static native void nInitHandle(ByteBuffer var0, ByteBuffer var1);

    protected void b() {
        this.b.a();
    }
}

