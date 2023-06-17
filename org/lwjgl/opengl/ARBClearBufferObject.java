/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBClearBufferObject {
    private ARBClearBufferObject() {
    }

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        GL43.a(n2, n3, n4, n5, byteBuffer);
    }

    public static void a(int n2, int n3, long l2, long l3, int n4, int n5, ByteBuffer byteBuffer) {
        GL43.a(n2, n3, l2, l3, n4, n5, byteBuffer);
    }

    public static void b(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ih;
        a.a(l2);
        a.b(byteBuffer, 1);
        ARBClearBufferObject.nglClearNamedBufferDataEXT(n2, n3, n4, n5, o.a(byteBuffer), l2);
    }

    static native void nglClearNamedBufferDataEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, int n3, long l2, long l3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l4 = dt2.ii;
        a.a(l4);
        a.b(byteBuffer, 1);
        ARBClearBufferObject.nglClearNamedBufferSubDataEXT(n2, n3, l2, l3, n4, n5, o.a(byteBuffer), l4);
    }

    static native void nglClearNamedBufferSubDataEXT(int var0, int var1, long var2, long var4, int var6, int var7, long var8, long var10);
}

