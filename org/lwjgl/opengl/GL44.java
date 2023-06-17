/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.x;

public final class GL44 {
    public static final int a = 33509;
    public static final int b = 64;
    public static final int c = 128;
    public static final int d = 256;
    public static final int e = 512;
    public static final int f = 33311;
    public static final int g = 33312;
    public static final int h = 16384;
    public static final int i = 37733;
    public static final int j = 37706;
    public static final int k = 37707;
    public static final int l = 37708;
    public static final int m = 37268;
    public static final int n = 37266;
    public static final int o = 37267;
    public static final int p = 32768;
    public static final int q = 34627;

    private GL44() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL44.nglBufferStorage(n2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL44.nglBufferStorage(n2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), n3, l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL44.nglBufferStorage(n2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL44.nglBufferStorage(n2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        GL44.nglBufferStorage(n2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), n3, l2);
    }

    public static void a(int n2, LongBuffer longBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        GL44.nglBufferStorage(n2, longBuffer.remaining() << 3, org.lwjgl.o.a(longBuffer), n3, l2);
    }

    static native void nglBufferStorage(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, long l2, int n3) {
        dt dt2 = GLContext.a();
        long l3 = dt2.JL;
        org.lwjgl.a.a(l3);
        GL44.nglBufferStorage(n2, l2, 0L, n3, l3);
    }

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JM;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, 1);
        }
        GL44.nglClearTexImage(n2, n3, n4, n5, org.lwjgl.o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JM;
        org.lwjgl.a.a(l2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, 1);
        }
        GL44.nglClearTexImage(n2, n3, n4, n5, org.lwjgl.o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JM;
        org.lwjgl.a.a(l2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, 1);
        }
        GL44.nglClearTexImage(n2, n3, n4, n5, org.lwjgl.o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JM;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        GL44.nglClearTexImage(n2, n3, n4, n5, org.lwjgl.o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JM;
        org.lwjgl.a.a(l2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, 1);
        }
        GL44.nglClearTexImage(n2, n3, n4, n5, org.lwjgl.o.b(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JM;
        org.lwjgl.a.a(l2);
        if (longBuffer != null) {
            org.lwjgl.a.a(longBuffer, 1);
        }
        GL44.nglClearTexImage(n2, n3, n4, n5, org.lwjgl.o.b(longBuffer), l2);
    }

    static native void nglClearTexImage(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JN;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, 1);
        }
        GL44.nglClearTexSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JN;
        org.lwjgl.a.a(l2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, 1);
        }
        GL44.nglClearTexSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JN;
        org.lwjgl.a.a(l2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, 1);
        }
        GL44.nglClearTexSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JN;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        GL44.nglClearTexSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JN;
        org.lwjgl.a.a(l2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, 1);
        }
        GL44.nglClearTexSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.b(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JN;
        org.lwjgl.a.a(l2);
        if (longBuffer != null) {
            org.lwjgl.a.a(longBuffer, 1);
        }
        GL44.nglClearTexSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.b(longBuffer), l2);
    }

    static native void nglClearTexSubImage(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JO;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n4);
        }
        GL44.nglBindBuffersBase(n2, n3, n4, org.lwjgl.o.b(intBuffer), l2);
    }

    static native void nglBindBuffersBase(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, x x2, x x3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JP;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n4);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, n4);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, n4);
        }
        GL44.nglBindBuffersRange(n2, n3, n4, org.lwjgl.o.b(intBuffer), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l2);
    }

    static native void nglBindBuffersRange(int var0, int var1, int var2, long var3, long var5, long var7, long var9);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JQ;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n3);
        }
        GL44.nglBindTextures(n2, n3, org.lwjgl.o.b(intBuffer), l2);
    }

    static native void nglBindTextures(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JR;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n3);
        }
        GL44.nglBindSamplers(n2, n3, org.lwjgl.o.b(intBuffer), l2);
    }

    static native void nglBindSamplers(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JS;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n3);
        }
        GL44.nglBindImageTextures(n2, n3, org.lwjgl.o.b(intBuffer), l2);
    }

    static native void nglBindImageTextures(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer, x x2, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JT;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n3);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, n3);
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, n3);
        }
        GL44.nglBindVertexBuffers(n2, n3, org.lwjgl.o.b(intBuffer), org.lwjgl.o.d(x2), org.lwjgl.o.b(intBuffer2), l2);
    }

    static native void nglBindVertexBuffers(int var0, int var1, long var2, long var4, long var6, long var8);
}

