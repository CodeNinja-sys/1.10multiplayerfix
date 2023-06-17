/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ag;
import org.lwjgl.opencl.x;
import org.lwjgl.opengl.fx;

public final class KHRGLEvent {
    public static final int a = 8205;

    private KHRGLEvent() {
    }

    public static ag a(ab ab2, fx fx2, IntBuffer intBuffer) {
        long l2 = x.bo;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ag ag2 = new ag(KHRGLEvent.nclCreateEventFromGLsyncKHR(ab2.a(), fx2.a(), o.b(intBuffer), l2), ab2);
        return ag2;
    }

    static native long nclCreateEventFromGLsyncKHR(long var0, long var2, long var4, long var6);
}

