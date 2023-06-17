/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class GREMEDYFrameTerminator {
    private GREMEDYFrameTerminator() {
    }

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.LT;
        a.a(l2);
        GREMEDYFrameTerminator.nglFrameTerminatorGREMEDY(l2);
    }

    static native void nglFrameTerminatorGREMEDY(long var0);
}

