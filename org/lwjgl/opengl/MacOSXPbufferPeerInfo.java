/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.MacOSXPeerInfo;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.ds;

final class MacOSXPbufferPeerInfo
extends MacOSXPeerInfo {
    MacOSXPbufferPeerInfo(int n2, int n3, PixelFormat pixelFormat, ds ds2) {
        super(pixelFormat, ds2, false, false, true, false);
        MacOSXPbufferPeerInfo.nCreate(this.h(), n2, n3);
    }

    private static native void nCreate(ByteBuffer var0, int var1, int var2);

    public void c() {
        MacOSXPbufferPeerInfo.nDestroy(this.h());
    }

    private static native void nDestroy(ByteBuffer var0);

    protected void a() {
    }

    protected void b() {
    }
}

