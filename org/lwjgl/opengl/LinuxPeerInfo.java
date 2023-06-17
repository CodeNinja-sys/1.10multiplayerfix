/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.ii;

abstract class LinuxPeerInfo
extends ii {
    LinuxPeerInfo() {
        super(LinuxPeerInfo.createHandle());
    }

    private static native ByteBuffer createHandle();

    public final long d() {
        return LinuxPeerInfo.nGetDisplay(this.h());
    }

    private static native long nGetDisplay(ByteBuffer var0);

    public final long e() {
        return LinuxPeerInfo.nGetDrawable(this.h());
    }

    private static native long nGetDrawable(ByteBuffer var0);
}

