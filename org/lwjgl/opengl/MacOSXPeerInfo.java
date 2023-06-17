/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.ii;

abstract class MacOSXPeerInfo
extends ii {
    MacOSXPeerInfo(PixelFormat pixelFormat, ds ds2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        super(MacOSXPeerInfo.createHandle());
        boolean bl6;
        boolean bl7 = bl6 = ds2 != null && (3 < ds2.a() || ds2.a() == 3 && 2 <= ds2.b()) && ds2.d();
        if (bl6 && !d.a(10, 7)) {
            throw new c("OpenGL 3.2+ requested, but it requires MacOS X 10.7 or newer");
        }
        this.a(pixelFormat, bl6, bl2, bl3, bl4, bl5);
    }

    private static native ByteBuffer createHandle();

    private void a(PixelFormat pixelFormat, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        MacOSXPeerInfo.nChoosePixelFormat(this.h(), pixelFormat, bl2, bl3, bl4, bl5, bl6);
    }

    private static native void nChoosePixelFormat(ByteBuffer var0, PixelFormat var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6);

    public void c() {
        MacOSXPeerInfo.nDestroy(this.h());
    }

    private static native void nDestroy(ByteBuffer var0);
}

