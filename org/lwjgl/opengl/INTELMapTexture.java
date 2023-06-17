/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class INTELMapTexture {
    public static final int a = 33791;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;

    private INTELMapTexture() {
    }

    public static ByteBuffer a(int n2, int n3, long l2, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.LV;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(intBuffer, 1);
        org.lwjgl.a.a(intBuffer2, 1);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = INTELMapTexture.nglMapTexture2DINTEL(n2, n3, l2, n4, o.a(intBuffer), o.a(intBuffer2), byteBuffer, l3);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapTexture2DINTEL(int var0, int var1, long var2, int var4, long var5, long var7, ByteBuffer var9, long var10);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LW;
        org.lwjgl.a.a(l2);
        INTELMapTexture.nglUnmapTexture2DINTEL(n2, n3, l2);
    }

    static native void nglUnmapTexture2DINTEL(int var0, int var1, long var2);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LX;
        org.lwjgl.a.a(l2);
        INTELMapTexture.nglSyncTextureINTEL(n2, l2);
    }

    static native void nglSyncTextureINTEL(int var0, long var1);
}

