/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTGpuProgramParameters {
    private EXTGpuProgramParameters() {
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tj;
        a.a(l2);
        a.a(floatBuffer, n4 << 2);
        EXTGpuProgramParameters.nglProgramEnvParameters4fvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglProgramEnvParameters4fvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tk;
        a.a(l2);
        a.a(floatBuffer, n4 << 2);
        EXTGpuProgramParameters.nglProgramLocalParameters4fvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglProgramLocalParameters4fvEXT(int var0, int var1, int var2, long var3, long var5);
}

