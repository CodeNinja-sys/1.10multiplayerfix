/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.x;

public final class BufferUtils {
    public static ByteBuffer a(int n2) {
        return ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
    }

    public static ShortBuffer b(int n2) {
        return BufferUtils.a(n2 << 1).asShortBuffer();
    }

    public static CharBuffer c(int n2) {
        return BufferUtils.a(n2 << 1).asCharBuffer();
    }

    public static IntBuffer d(int n2) {
        return BufferUtils.a(n2 << 2).asIntBuffer();
    }

    public static LongBuffer e(int n2) {
        return BufferUtils.a(n2 << 3).asLongBuffer();
    }

    public static FloatBuffer f(int n2) {
        return BufferUtils.a(n2 << 2).asFloatBuffer();
    }

    public static DoubleBuffer g(int n2) {
        return BufferUtils.a(n2 << 3).asDoubleBuffer();
    }

    public static x h(int n2) {
        return x.c(n2);
    }

    public static int a(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return 0;
        }
        if (buffer instanceof ShortBuffer || buffer instanceof CharBuffer) {
            return 1;
        }
        if (buffer instanceof FloatBuffer || buffer instanceof IntBuffer) {
            return 2;
        }
        if (buffer instanceof LongBuffer || buffer instanceof DoubleBuffer) {
            return 3;
        }
        throw new IllegalStateException("Unsupported buffer type: " + buffer);
    }

    public static int b(Buffer buffer) {
        return buffer.position() << BufferUtils.a(buffer);
    }

    public static void a(ByteBuffer byteBuffer) {
        BufferUtils.zeroBuffer0(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static void a(ShortBuffer shortBuffer) {
        BufferUtils.zeroBuffer0(shortBuffer, (long)shortBuffer.position() * 2L, (long)shortBuffer.remaining() * 2L);
    }

    public static void a(CharBuffer charBuffer) {
        BufferUtils.zeroBuffer0(charBuffer, (long)charBuffer.position() * 2L, (long)charBuffer.remaining() * 2L);
    }

    public static void a(IntBuffer intBuffer) {
        BufferUtils.zeroBuffer0(intBuffer, (long)intBuffer.position() * 4L, (long)intBuffer.remaining() * 4L);
    }

    public static void a(FloatBuffer floatBuffer) {
        BufferUtils.zeroBuffer0(floatBuffer, (long)floatBuffer.position() * 4L, (long)floatBuffer.remaining() * 4L);
    }

    public static void a(LongBuffer longBuffer) {
        BufferUtils.zeroBuffer0(longBuffer, (long)longBuffer.position() * 8L, (long)longBuffer.remaining() * 8L);
    }

    public static void a(DoubleBuffer doubleBuffer) {
        BufferUtils.zeroBuffer0(doubleBuffer, (long)doubleBuffer.position() * 8L, (long)doubleBuffer.remaining() * 8L);
    }

    private static native void zeroBuffer0(Buffer var0, long var1, long var3);

    static native long getBufferAddress(Buffer var0);
}

