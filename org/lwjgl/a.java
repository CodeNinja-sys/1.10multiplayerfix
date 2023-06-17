/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.d;
import org.lwjgl.x;

public class a {
    private a() {
    }

    public static void a(long l2) {
        if (d.j && l2 == 0L) {
            throw new IllegalStateException("Function is not supported");
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        if (d.j && byteBuffer.get(byteBuffer.limit() - 1) != 0) {
            throw new IllegalArgumentException("Missing null termination");
        }
    }

    public static void a(ByteBuffer byteBuffer, int n2) {
        if (d.j) {
            int n3 = 0;
            for (int i2 = byteBuffer.position(); i2 < byteBuffer.limit(); ++i2) {
                if (byteBuffer.get(i2) != 0) continue;
                ++n3;
            }
            if (n3 < n2) {
                throw new IllegalArgumentException("Missing null termination");
            }
        }
    }

    public static void a(IntBuffer intBuffer) {
        if (d.j && intBuffer.get(intBuffer.limit() - 1) != 0) {
            throw new IllegalArgumentException("Missing null termination");
        }
    }

    public static void a(LongBuffer longBuffer) {
        if (d.j && longBuffer.get(longBuffer.limit() - 1) != 0L) {
            throw new IllegalArgumentException("Missing null termination");
        }
    }

    public static void a(x x2) {
        if (d.j && x2.d(x2.g() - 1) != 0L) {
            throw new IllegalArgumentException("Missing null termination");
        }
    }

    public static void a(Object object) {
        if (d.j && object == null) {
            throw new IllegalArgumentException("Null argument");
        }
    }

    public static void b(ByteBuffer byteBuffer) {
        if (d.j && !byteBuffer.isDirect()) {
            throw new IllegalArgumentException("ByteBuffer is not direct");
        }
    }

    public static void a(ShortBuffer shortBuffer) {
        if (d.j && !shortBuffer.isDirect()) {
            throw new IllegalArgumentException("ShortBuffer is not direct");
        }
    }

    public static void b(IntBuffer intBuffer) {
        if (d.j && !intBuffer.isDirect()) {
            throw new IllegalArgumentException("IntBuffer is not direct");
        }
    }

    public static void b(LongBuffer longBuffer) {
        if (d.j && !longBuffer.isDirect()) {
            throw new IllegalArgumentException("LongBuffer is not direct");
        }
    }

    public static void a(FloatBuffer floatBuffer) {
        if (d.j && !floatBuffer.isDirect()) {
            throw new IllegalArgumentException("FloatBuffer is not direct");
        }
    }

    public static void a(DoubleBuffer doubleBuffer) {
        if (d.j && !doubleBuffer.isDirect()) {
            throw new IllegalArgumentException("DoubleBuffer is not direct");
        }
    }

    public static void b(x x2) {
    }

    public static void a(Object[] arrobject) {
        if (d.j && (arrobject == null || arrobject.length == 0)) {
            throw new IllegalArgumentException("Invalid array");
        }
    }

    private static void c(Buffer buffer, int n2) {
        throw new IllegalArgumentException("Number of remaining buffer elements is " + buffer.remaining() + ", must be at least " + n2 + ". Because at most " + n2 + " elements can be returned, a buffer with at least " + n2 + " elements is required, regardless of actual returned element count");
    }

    private static void b(x x2, int n2) {
        throw new IllegalArgumentException("Number of remaining pointer buffer elements is " + x2.m() + ", must be at least " + n2);
    }

    private static void b(Object[] arrobject, int n2) {
        throw new IllegalArgumentException("Number of array elements is " + arrobject.length + ", must be at least " + n2);
    }

    private static void b(long[] arrl, int n2) {
        throw new IllegalArgumentException("Number of array elements is " + arrl.length + ", must be at least " + n2);
    }

    public static void a(Buffer buffer, int n2) {
        if (d.j && buffer.remaining() < n2) {
            a.c(buffer, n2);
        }
    }

    public static int b(Buffer buffer, int n2) {
        int n3;
        if (buffer instanceof ByteBuffer) {
            a.b((ByteBuffer)buffer, n2);
            n3 = 0;
        } else if (buffer instanceof ShortBuffer) {
            a.a((ShortBuffer)buffer, n2);
            n3 = 1;
        } else if (buffer instanceof IntBuffer) {
            a.a((IntBuffer)buffer, n2);
            n3 = 2;
        } else if (buffer instanceof LongBuffer) {
            a.a((LongBuffer)buffer, n2);
            n3 = 4;
        } else if (buffer instanceof FloatBuffer) {
            a.a((FloatBuffer)buffer, n2);
            n3 = 2;
        } else if (buffer instanceof DoubleBuffer) {
            a.a((DoubleBuffer)buffer, n2);
            n3 = 4;
        } else {
            throw new IllegalArgumentException("Unsupported Buffer type specified: " + buffer.getClass());
        }
        return buffer.position() << n3;
    }

    public static void b(ByteBuffer byteBuffer, int n2) {
        if (d.j) {
            a.a((Buffer)byteBuffer, n2);
            a.b(byteBuffer);
        }
    }

    public static void a(ShortBuffer shortBuffer, int n2) {
        if (d.j) {
            a.a((Buffer)shortBuffer, n2);
            a.a(shortBuffer);
        }
    }

    public static void a(IntBuffer intBuffer, int n2) {
        if (d.j) {
            a.a((Buffer)intBuffer, n2);
            a.b(intBuffer);
        }
    }

    public static void a(LongBuffer longBuffer, int n2) {
        if (d.j) {
            a.a((Buffer)longBuffer, n2);
            a.b(longBuffer);
        }
    }

    public static void a(FloatBuffer floatBuffer, int n2) {
        if (d.j) {
            a.a((Buffer)floatBuffer, n2);
            a.a(floatBuffer);
        }
    }

    public static void a(DoubleBuffer doubleBuffer, int n2) {
        if (d.j) {
            a.a((Buffer)doubleBuffer, n2);
            a.a(doubleBuffer);
        }
    }

    public static void a(x x2, int n2) {
        if (d.j && x2.m() < n2) {
            a.b(x2, n2);
        }
    }

    public static void a(Object[] arrobject, int n2) {
        if (d.j && arrobject.length < n2) {
            a.b(arrobject, n2);
        }
    }

    public static void a(long[] arrl, int n2) {
        if (d.j && arrl.length < n2) {
            a.b(arrl, n2);
        }
    }
}

