/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.dt;

final class i {
    private static final int a = 256;
    private static final int b = 4;
    private static final int c = 32;
    private char[] d = new char[256];
    private ByteBuffer e = BufferUtils.a(256);
    private IntBuffer f = BufferUtils.d(4);
    private final IntBuffer g = BufferUtils.d(32);
    private final LongBuffer h = BufferUtils.e(32);
    private final FloatBuffer i = BufferUtils.f(32);
    private final DoubleBuffer j = BufferUtils.g(32);

    i() {
    }

    private static char[] d(dt dt2, int n2) {
        char[] arrc = dt2.b.d;
        if (arrc.length < n2) {
            for (int i2 = arrc.length << 1; i2 < n2; i2 <<= 1) {
            }
            dt2.b.d = arrc = new char[n2];
        }
        return arrc;
    }

    static ByteBuffer a(dt dt2, int n2) {
        ByteBuffer byteBuffer = dt2.b.e;
        if (byteBuffer.capacity() < n2) {
            for (int i2 = byteBuffer.capacity() << 1; i2 < n2; i2 <<= 1) {
            }
            dt2.b.e = byteBuffer = BufferUtils.a(n2);
        } else {
            byteBuffer.clear();
        }
        return byteBuffer;
    }

    private static ByteBuffer e(dt dt2, int n2) {
        ByteBuffer byteBuffer = dt2.b.e;
        if (byteBuffer.capacity() < n2) {
            for (int i2 = byteBuffer.capacity() << 1; i2 < n2; i2 <<= 1) {
            }
            ByteBuffer byteBuffer2 = BufferUtils.a(n2);
            byteBuffer2.put(byteBuffer);
            dt2.b.e = byteBuffer = byteBuffer2;
        } else {
            byteBuffer.position(byteBuffer.limit());
            byteBuffer.limit(byteBuffer.capacity());
        }
        return byteBuffer;
    }

    static IntBuffer a(dt dt2) {
        return dt2.b.g;
    }

    static LongBuffer b(dt dt2) {
        return dt2.b.h;
    }

    static FloatBuffer c(dt dt2) {
        return dt2.b.i;
    }

    static DoubleBuffer d(dt dt2) {
        return dt2.b.j;
    }

    static IntBuffer e(dt dt2) {
        return org.lwjgl.opengl.i.b(dt2, 1);
    }

    static IntBuffer b(dt dt2, int n2) {
        IntBuffer intBuffer = dt2.b.f;
        if (intBuffer.capacity() < n2) {
            for (int i2 = intBuffer.capacity(); i2 < n2; i2 <<= 1) {
            }
            dt2.b.f = intBuffer = BufferUtils.d(n2);
        } else {
            intBuffer.clear();
        }
        return intBuffer;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, CharSequence charSequence) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (org.lwjgl.d.i && '\u0080' <= c2) {
                byteBuffer.put((byte)26);
                continue;
            }
            byteBuffer.put((byte)c2);
        }
        return byteBuffer;
    }

    static String a(dt dt2, ByteBuffer byteBuffer) {
        int n2 = byteBuffer.remaining();
        char[] arrc = org.lwjgl.opengl.i.d(dt2, n2);
        for (int i2 = byteBuffer.position(); i2 < byteBuffer.limit(); ++i2) {
            arrc[i2 - byteBuffer.position()] = (char)byteBuffer.get(i2);
        }
        return new String(arrc, 0, n2);
    }

    static long a(dt dt2, CharSequence charSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(org.lwjgl.opengl.i.a(dt2, charSequence.length()), charSequence);
        byteBuffer.flip();
        return o.a((Buffer)byteBuffer);
    }

    static long a(dt dt2, CharSequence charSequence, int n2) {
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(org.lwjgl.opengl.i.e(dt2, n2 + charSequence.length()), charSequence);
        byteBuffer.flip();
        return o.a(byteBuffer);
    }

    static long b(dt dt2, CharSequence charSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(org.lwjgl.opengl.i.a(dt2, charSequence.length() + 1), charSequence);
        byteBuffer.put((byte)0);
        byteBuffer.flip();
        return o.a((Buffer)byteBuffer);
    }

    static int a(CharSequence[] arrcharSequence) {
        int n2 = 0;
        for (CharSequence charSequence : arrcharSequence) {
            n2 += charSequence.length();
        }
        return n2;
    }

    static long a(dt dt2, CharSequence[] arrcharSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, org.lwjgl.opengl.i.a(arrcharSequence));
        for (CharSequence charSequence : arrcharSequence) {
            org.lwjgl.opengl.i.a(byteBuffer, charSequence);
        }
        byteBuffer.flip();
        return o.a((Buffer)byteBuffer);
    }

    static long b(dt dt2, CharSequence[] arrcharSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, org.lwjgl.opengl.i.a(arrcharSequence) + arrcharSequence.length);
        for (CharSequence charSequence : arrcharSequence) {
            org.lwjgl.opengl.i.a(byteBuffer, charSequence);
            byteBuffer.put((byte)0);
        }
        byteBuffer.flip();
        return o.a((Buffer)byteBuffer);
    }

    static long c(dt dt2, CharSequence[] arrcharSequence) {
        IntBuffer intBuffer = org.lwjgl.opengl.i.b(dt2, arrcharSequence.length);
        for (CharSequence charSequence : arrcharSequence) {
            intBuffer.put(charSequence.length());
        }
        intBuffer.flip();
        return o.a((Buffer)intBuffer);
    }

    static long c(dt dt2, int n2) {
        return o.a((Buffer)org.lwjgl.opengl.i.a(dt2).put(0, n2));
    }

    static long f(dt dt2) {
        return o.a((Buffer)org.lwjgl.opengl.i.a(dt2, 0));
    }
}

