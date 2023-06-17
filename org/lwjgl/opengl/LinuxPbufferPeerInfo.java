/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.c;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.LinuxPeerInfo;
import org.lwjgl.opengl.PixelFormat;

final class LinuxPbufferPeerInfo
extends LinuxPeerInfo {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    LinuxPbufferPeerInfo(int n2, int n3, PixelFormat pixelFormat) {
        LinuxDisplay.C();
        try {
            GLContext.b();
            try {
                LinuxDisplay.E();
                try {
                    LinuxPbufferPeerInfo.nInitHandle(LinuxDisplay.G(), LinuxDisplay.H(), this.h(), n2, n3, pixelFormat);
                }
                catch (c c2) {
                    LinuxDisplay.F();
                    throw c2;
                }
            }
            catch (c c3) {
                GLContext.c();
                throw c3;
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void nInitHandle(long var0, int var2, ByteBuffer var3, int var4, int var5, PixelFormat var6);

    public void c() {
        LinuxDisplay.C();
        LinuxPbufferPeerInfo.nDestroy(this.h());
        LinuxDisplay.F();
        GLContext.c();
        LinuxDisplay.D();
    }

    private static native void nDestroy(ByteBuffer var0);

    protected void a() {
    }

    protected void b() {
    }
}

