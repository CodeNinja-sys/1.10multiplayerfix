/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ATIEnvmapBumpmap {
    public static final int a = 34677;
    public static final int b = 34678;
    public static final int c = 34679;
    public static final int d = 34680;
    public static final int e = 34681;
    public static final int f = 34682;
    public static final int g = 34683;
    public static final int h = 34684;

    private ATIEnvmapBumpmap() {
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ne;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ATIEnvmapBumpmap.nglTexBumpParameterfvATI(n2, o.a(floatBuffer), l2);
    }

    static native void nglTexBumpParameterfvATI(int var0, long var1, long var3);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ATIEnvmapBumpmap.nglTexBumpParameterivATI(n2, o.a(intBuffer), l2);
    }

    static native void nglTexBumpParameterivATI(int var0, long var1, long var3);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ng;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ATIEnvmapBumpmap.nglGetTexBumpParameterfvATI(n2, o.a(floatBuffer), l2);
    }

    static native void nglGetTexBumpParameterfvATI(int var0, long var1, long var3);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ATIEnvmapBumpmap.nglGetTexBumpParameterivATI(n2, o.a(intBuffer), l2);
    }

    static native void nglGetTexBumpParameterivATI(int var0, long var1, long var3);
}

