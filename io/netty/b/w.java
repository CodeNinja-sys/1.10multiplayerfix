/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.aa;
import io.netty.b.au;
import io.netty.b.b;
import io.netty.b.bj;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.y;
import io.netty.util.c.ae;
import io.netty.util.c.u;
import io.netty.util.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Locale;

public final class w {
    private static final io.netty.util.c.b.g b;
    private static final char[] c;
    static final h a;
    private static final int d;

    public static String a(g g2) {
        return w.a(g2, g2.p(), g2.r());
    }

    public static String a(g g2, int n2, int n3) {
        if (n3 < 0) {
            throw new IllegalArgumentException("length: " + n3);
        }
        if (n3 == 0) {
            return "";
        }
        int n4 = n2 + n3;
        char[] arrc = new char[n3 << 1];
        int n5 = n2;
        int n6 = 0;
        while (n5 < n4) {
            System.arraycopy(c, g2.n(n5) << 1, arrc, n6, 2);
            ++n5;
            n6 += 2;
        }
        return new String(arrc);
    }

    public static int b(g g2) {
        int n2;
        int n3 = g2.r();
        int n4 = n3 >>> 2;
        int n5 = n3 & 3;
        int n6 = 1;
        int n7 = g2.p();
        if (g2.m() == ByteOrder.BIG_ENDIAN) {
            for (n2 = n4; n2 > 0; --n2) {
                n6 = 31 * n6 + g2.s(n7);
                n7 += 4;
            }
        } else {
            for (n2 = n4; n2 > 0; --n2) {
                n6 = 31 * n6 + w.b(g2.s(n7));
                n7 += 4;
            }
        }
        for (n2 = n5; n2 > 0; --n2) {
            n6 = 31 * n6 + g2.m(n7++);
        }
        if (n6 == 0) {
            n6 = 1;
        }
        return n6;
    }

    public static boolean a(g g2, g g3) {
        int n2;
        int n3 = g2.r();
        if (n3 != g3.r()) {
            return false;
        }
        int n4 = n3 >>> 3;
        int n5 = n3 & 7;
        int n6 = g2.p();
        int n7 = g3.p();
        if (g2.m() == g3.m()) {
            for (n2 = n4; n2 > 0; --n2) {
                if (g2.u(n6) != g3.u(n7)) {
                    return false;
                }
                n6 += 8;
                n7 += 8;
            }
        } else {
            for (n2 = n4; n2 > 0; --n2) {
                if (g2.u(n6) != w.a(g3.u(n7))) {
                    return false;
                }
                n6 += 8;
                n7 += 8;
            }
        }
        for (n2 = n5; n2 > 0; --n2) {
            if (g2.m(n6) != g3.m(n7)) {
                return false;
            }
            ++n6;
            ++n7;
        }
        return true;
    }

    public static int b(g g2, g g3) {
        long l2;
        long l3;
        int n2;
        int n3 = g2.r();
        int n4 = g3.r();
        int n5 = Math.min(n3, n4);
        int n6 = n5 >>> 2;
        int n7 = n5 & 3;
        int n8 = g2.p();
        int n9 = g3.p();
        if (g2.m() == g3.m()) {
            for (n2 = n6; n2 > 0; --n2) {
                l3 = g2.t(n8);
                if (l3 > (l2 = g3.t(n9))) {
                    return 1;
                }
                if (l3 < l2) {
                    return -1;
                }
                n8 += 4;
                n9 += 4;
            }
        } else {
            for (n2 = n6; n2 > 0; --n2) {
                l3 = g2.t(n8);
                if (l3 > (l2 = (long)w.b(g3.s(n9)) & 0xFFFFFFFFL)) {
                    return 1;
                }
                if (l3 < l2) {
                    return -1;
                }
                n8 += 4;
                n9 += 4;
            }
        }
        for (n2 = n7; n2 > 0; --n2) {
            short s2;
            short s3 = g2.n(n8);
            if (s3 > (s2 = g3.n(n9))) {
                return 1;
            }
            if (s3 < s2) {
                return -1;
            }
            ++n8;
            ++n9;
        }
        return n3 - n4;
    }

    public static int a(g g2, int n2, int n3, byte by2) {
        if (n2 <= n3) {
            return w.b(g2, n2, n3, by2);
        }
        return w.c(g2, n2, n3, by2);
    }

    public static short a(short s2) {
        return Short.reverseBytes(s2);
    }

    public static int a(int n2) {
        int n3 = n2 << 16 & 0xFF0000 | n2 & 0xFF00 | n2 >>> 16 & 0xFF;
        if ((n3 & 0x800000) != 0) {
            n3 |= 0xFF000000;
        }
        return n3;
    }

    public static int b(int n2) {
        return Integer.reverseBytes(n2);
    }

    public static long a(long l2) {
        return Long.reverseBytes(l2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static g a(h h2, g g2, int n2) {
        boolean bl2 = true;
        g g3 = h2.a(n2);
        try {
            g2.a(g3);
            bl2 = false;
            g g4 = g3;
            return g4;
        }
        finally {
            if (bl2) {
                g3.ad();
            }
        }
    }

    private static int b(g g2, int n2, int n3, byte by2) {
        if ((n2 = Math.max(n2, 0)) >= n3 || g2.j() == 0) {
            return -1;
        }
        for (int i2 = n2; i2 < n3; ++i2) {
            if (g2.m(i2) != by2) continue;
            return i2;
        }
        return -1;
    }

    private static int c(g g2, int n2, int n3, byte by2) {
        if ((n2 = Math.min(n2, g2.j())) < 0 || g2.j() == 0) {
            return -1;
        }
        for (int i2 = n2 - 1; i2 >= n3; --i2) {
            if (g2.m(i2) != by2) continue;
            return i2;
        }
        return -1;
    }

    public static g a(h h2, CharBuffer charBuffer, Charset charset) {
        return w.a(h2, false, charBuffer, charset);
    }

    static g a(h h2, boolean bl2, CharBuffer charBuffer, Charset charset) {
        CharsetEncoder charsetEncoder = e.a(charset);
        int n2 = (int)((double)charBuffer.remaining() * (double)charsetEncoder.maxBytesPerChar());
        boolean bl3 = true;
        g g2 = bl2 ? h2.c(n2) : h2.a(n2);
        try {
            ByteBuffer byteBuffer = g2.k(0, n2);
            int n3 = byteBuffer.position();
            CoderResult coderResult = charsetEncoder.encode(charBuffer, byteBuffer, true);
            if (!coderResult.isUnderflow()) {
                coderResult.throwException();
            }
            if (!(coderResult = charsetEncoder.flush(byteBuffer)).isUnderflow()) {
                coderResult.throwException();
            }
            g2.h(g2.q() + byteBuffer.position() - n3);
            bl3 = false;
            g g3 = g2;
            return g3;
        }
        catch (CharacterCodingException characterCodingException) {
            throw new IllegalStateException(characterCodingException);
        }
        finally {
            if (bl3) {
                g2.ad();
            }
        }
    }

    static String a(ByteBuffer byteBuffer, Charset charset) {
        CharsetDecoder charsetDecoder = e.b(charset);
        CharBuffer charBuffer = CharBuffer.allocate((int)((double)byteBuffer.remaining() * (double)charsetDecoder.maxCharsPerByte()));
        try {
            CoderResult coderResult = charsetDecoder.decode(byteBuffer, charBuffer, true);
            if (!coderResult.isUnderflow()) {
                coderResult.throwException();
            }
            if (!(coderResult = charsetDecoder.flush(charBuffer)).isUnderflow()) {
                coderResult.throwException();
            }
        }
        catch (CharacterCodingException characterCodingException) {
            throw new IllegalStateException(characterCodingException);
        }
        return charBuffer.flip().toString();
    }

    public static g a() {
        if (d <= 0) {
            return null;
        }
        if (u.f()) {
            return aa.d();
        }
        return y.d();
    }

    private w() {
    }

    static /* synthetic */ int b() {
        return d;
    }

    static {
        b b2;
        b = io.netty.util.c.b.h.a(w.class);
        c = new char[1024];
        char[] arrc = "0123456789abcdef".toCharArray();
        for (int i2 = 0; i2 < 256; ++i2) {
            w.c[i2 << 1] = arrc[i2 >>> 4 & 0xF];
            w.c[(i2 << 1) + 1] = arrc[i2 & 0xF];
        }
        String string = ae.a("io.netty.allocator.type", "unpooled").toLowerCase(Locale.US).trim();
        if ("unpooled".equals(string)) {
            b2 = bj.b;
            b.b("-Dio.netty.allocator.type: {}", (Object)string);
        } else if ("pooled".equals(string)) {
            b2 = au.b;
            b.b("-Dio.netty.allocator.type: {}", (Object)string);
        } else {
            b2 = bj.b;
            b.b("-Dio.netty.allocator.type: unpooled (unknown: {})", (Object)string);
        }
        a = b2;
        d = ae.a("io.netty.threadLocalDirectBufferSize", 65536);
        b.b("-Dio.netty.threadLocalDirectBufferSize: {}", (Object)d);
    }
}

