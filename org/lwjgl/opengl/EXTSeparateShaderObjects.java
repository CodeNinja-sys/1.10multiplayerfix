/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class EXTSeparateShaderObjects {
    public static final int a = 35725;

    private EXTSeparateShaderObjects() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uh;
        org.lwjgl.a.a(l2);
        EXTSeparateShaderObjects.nglUseShaderProgramEXT(n2, n3, l2);
    }

    static native void nglUseShaderProgramEXT(int var0, int var1, long var2);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ui;
        org.lwjgl.a.a(l2);
        EXTSeparateShaderObjects.nglActiveProgramEXT(n2, l2);
    }

    static native void nglActiveProgramEXT(int var0, long var1);

    public static int a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = EXTSeparateShaderObjects.nglCreateShaderProgramEXT(n2, o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglCreateShaderProgramEXT(int var0, long var1, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uj;
        org.lwjgl.a.a(l2);
        int n3 = EXTSeparateShaderObjects.nglCreateShaderProgramEXT(n2, i.b(dt2, charSequence), l2);
        return n3;
    }
}

