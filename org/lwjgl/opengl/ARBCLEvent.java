/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ag;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.fx;

public final class ARBCLEvent {
    public static final int a = 33344;
    public static final int b = 33345;

    private ARBCLEvent() {
    }

    public static fx a(ab ab2, ag ag2, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ig;
        org.lwjgl.a.a(l2);
        fx fx2 = new fx(ARBCLEvent.nglCreateSyncFromCLeventARB(ab2.a(), ag2.a(), n2, l2));
        return fx2;
    }

    static native long nglCreateSyncFromCLeventARB(long var0, long var2, int var4, long var5);
}

