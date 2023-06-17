/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengles.GLContext
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.WindowsPeerInfo;
import org.lwjgl.opengles.GLContext;

final class WindowsDisplayPeerInfo
extends WindowsPeerInfo {
    final boolean a;

    WindowsDisplayPeerInfo(boolean bl2) {
        this.a = bl2;
        if (bl2) {
            GLContext.loadOpenGLLibrary();
        } else {
            org.lwjgl.opengl.GLContext.b();
        }
    }

    void a(long l2, long l3) {
        WindowsDisplayPeerInfo.nInitDC(this.h(), l2, l3);
    }

    private static native void nInitDC(ByteBuffer var0, long var1, long var3);

    protected void a() {
    }

    protected void b() {
    }

    public void c() {
        super.c();
        if (this.a) {
            GLContext.unloadOpenGLLibrary();
        } else {
            org.lwjgl.opengl.GLContext.c();
        }
    }
}

