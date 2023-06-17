/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class EXTTimerQuery {
    public static final int a = 35007;

    private EXTTimerQuery() {
    }

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        EXTTimerQuery.nglGetQueryObjecti64vEXT(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetQueryObjecti64vEXT(int var0, int var1, long var2, long var4);

    public static long a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uv;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = i.b(dt2);
        EXTTimerQuery.nglGetQueryObjecti64vEXT(n2, n3, o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        EXTTimerQuery.nglGetQueryObjectui64vEXT(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetQueryObjectui64vEXT(int var0, int var1, long var2, long var4);

    public static long b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uw;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = i.b(dt2);
        EXTTimerQuery.nglGetQueryObjectui64vEXT(n2, n3, o.a(longBuffer), l2);
        return longBuffer.get(0);
    }
}

