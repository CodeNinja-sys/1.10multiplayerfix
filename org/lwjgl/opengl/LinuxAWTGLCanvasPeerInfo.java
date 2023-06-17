/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.AWTSurfaceLock;
import org.lwjgl.opengl.LinuxPeerInfo;

final class LinuxAWTGLCanvasPeerInfo
extends LinuxPeerInfo {
    private final Canvas a;
    private final AWTSurfaceLock b = new AWTSurfaceLock();
    private int c = -1;

    LinuxAWTGLCanvasPeerInfo(Canvas canvas) {
        this.a = canvas;
    }

    protected void a() {
        ByteBuffer byteBuffer = this.b.a(this.a);
        if (this.c == -1) {
            try {
                this.c = LinuxAWTGLCanvasPeerInfo.getScreenFromSurfaceInfo(byteBuffer);
            }
            catch (c c2) {
                d.a((CharSequence)("Got exception while trying to determine screen: " + c2));
                this.c = 0;
            }
        }
        LinuxAWTGLCanvasPeerInfo.nInitHandle(this.c, byteBuffer, this.h());
    }

    private static native int getScreenFromSurfaceInfo(ByteBuffer var0);

    private static native void nInitHandle(int var0, ByteBuffer var1, ByteBuffer var2);

    protected void b() {
        this.b.a();
    }
}

