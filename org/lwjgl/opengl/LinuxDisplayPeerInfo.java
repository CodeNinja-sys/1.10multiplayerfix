/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengles.GLContext
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.c;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.LinuxPeerInfo;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengles.GLContext;

final class LinuxDisplayPeerInfo
extends LinuxPeerInfo {
    final boolean a;

    LinuxDisplayPeerInfo() {
        this.a = true;
        GLContext.loadOpenGLLibrary();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    LinuxDisplayPeerInfo(PixelFormat pixelFormat) {
        this.a = false;
        LinuxDisplay.C();
        try {
            org.lwjgl.opengl.GLContext.b();
            try {
                LinuxDisplay.E();
                try {
                    LinuxDisplayPeerInfo.initDefaultPeerInfo(LinuxDisplay.G(), LinuxDisplay.H(), this.h(), pixelFormat);
                }
                catch (c c2) {
                    LinuxDisplay.F();
                    throw c2;
                }
            }
            catch (c c3) {
                org.lwjgl.opengl.GLContext.c();
                throw c3;
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void initDefaultPeerInfo(long var0, int var2, ByteBuffer var3, PixelFormat var4);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a() {
        LinuxDisplay.C();
        try {
            LinuxDisplayPeerInfo.initDrawable(LinuxDisplay.I(), this.h());
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void initDrawable(long var0, ByteBuffer var2);

    protected void b() {
    }

    public void c() {
        super.c();
        if (this.a) {
            GLContext.unloadOpenGLLibrary();
        } else {
            LinuxDisplay.C();
            LinuxDisplay.F();
            org.lwjgl.opengl.GLContext.c();
            LinuxDisplay.D();
        }
    }
}

