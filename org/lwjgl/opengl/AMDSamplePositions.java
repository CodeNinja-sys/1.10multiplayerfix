/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class AMDSamplePositions {
    public static final int a = 34879;

    private AMDSamplePositions() {
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 2);
        AMDSamplePositions.nglSetMultisamplefvAMD(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglSetMultisamplefvAMD(int var0, int var1, long var2, long var4);
}

