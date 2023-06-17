/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.lwjgl.BufferUtils;
import org.lwjgl.d;
import org.lwjgl.q;
import org.lwjgl.r;
import org.lwjgl.s;
import org.lwjgl.t;
import org.lwjgl.x;

public final class o {
    private static final Charset a;
    private static final Charset b;
    private static final Charset c;
    private static final q d;

    private o() {
    }

    public static long a(Buffer buffer) {
        return d.a(buffer);
    }

    public static long b(Buffer buffer) {
        return buffer == null ? 0L : d.a(buffer);
    }

    public static long a(x x2) {
        return d.a(x2.a());
    }

    public static long b(x x2) {
        return x2 == null ? 0L : d.a(x2.a());
    }

    public static long a(ByteBuffer byteBuffer) {
        return o.a(byteBuffer, byteBuffer.position());
    }

    public static long a(ByteBuffer byteBuffer, int n2) {
        return o.a((Buffer)byteBuffer) + (long)n2;
    }

    public static long a(ShortBuffer shortBuffer) {
        return o.a(shortBuffer, shortBuffer.position());
    }

    public static long a(ShortBuffer shortBuffer, int n2) {
        return o.a((Buffer)shortBuffer) + (long)(n2 << 1);
    }

    public static long a(CharBuffer charBuffer) {
        return o.a(charBuffer, charBuffer.position());
    }

    public static long a(CharBuffer charBuffer, int n2) {
        return o.a((Buffer)charBuffer) + (long)(n2 << 1);
    }

    public static long a(IntBuffer intBuffer) {
        return o.a(intBuffer, intBuffer.position());
    }

    public static long a(IntBuffer intBuffer, int n2) {
        return o.a((Buffer)intBuffer) + (long)(n2 << 2);
    }

    public static long a(FloatBuffer floatBuffer) {
        return o.a(floatBuffer, floatBuffer.position());
    }

    public static long a(FloatBuffer floatBuffer, int n2) {
        return o.a((Buffer)floatBuffer) + (long)(n2 << 2);
    }

    public static long a(LongBuffer longBuffer) {
        return o.a(longBuffer, longBuffer.position());
    }

    public static long a(LongBuffer longBuffer, int n2) {
        return o.a((Buffer)longBuffer) + (long)(n2 << 3);
    }

    public static long a(DoubleBuffer doubleBuffer) {
        return o.a(doubleBuffer, doubleBuffer.position());
    }

    public static long a(DoubleBuffer doubleBuffer, int n2) {
        return o.a((Buffer)doubleBuffer) + (long)(n2 << 3);
    }

    public static long c(x x2) {
        return o.a(x2, x2.e());
    }

    public static long a(x x2, int n2) {
        return o.a(x2) + (long)(n2 * x.c());
    }

    public static long b(ByteBuffer byteBuffer) {
        return byteBuffer == null ? 0L : o.a(byteBuffer);
    }

    public static long b(ByteBuffer byteBuffer, int n2) {
        return byteBuffer == null ? 0L : o.a(byteBuffer, n2);
    }

    public static long b(ShortBuffer shortBuffer) {
        return shortBuffer == null ? 0L : o.a(shortBuffer);
    }

    public static long b(ShortBuffer shortBuffer, int n2) {
        return shortBuffer == null ? 0L : o.a(shortBuffer, n2);
    }

    public static long b(CharBuffer charBuffer) {
        return charBuffer == null ? 0L : o.a(charBuffer);
    }

    public static long b(CharBuffer charBuffer, int n2) {
        return charBuffer == null ? 0L : o.a(charBuffer, n2);
    }

    public static long b(IntBuffer intBuffer) {
        return intBuffer == null ? 0L : o.a(intBuffer);
    }

    public static long b(IntBuffer intBuffer, int n2) {
        return intBuffer == null ? 0L : o.a(intBuffer, n2);
    }

    public static long b(FloatBuffer floatBuffer) {
        return floatBuffer == null ? 0L : o.a(floatBuffer);
    }

    public static long b(FloatBuffer floatBuffer, int n2) {
        return floatBuffer == null ? 0L : o.a(floatBuffer, n2);
    }

    public static long b(LongBuffer longBuffer) {
        return longBuffer == null ? 0L : o.a(longBuffer);
    }

    public static long b(LongBuffer longBuffer, int n2) {
        return longBuffer == null ? 0L : o.a(longBuffer, n2);
    }

    public static long b(DoubleBuffer doubleBuffer) {
        return doubleBuffer == null ? 0L : o.a(doubleBuffer);
    }

    public static long b(DoubleBuffer doubleBuffer, int n2) {
        return doubleBuffer == null ? 0L : o.a(doubleBuffer, n2);
    }

    public static long d(x x2) {
        return x2 == null ? 0L : o.c(x2);
    }

    public static long b(x x2, int n2) {
        return x2 == null ? 0L : o.a(x2, n2);
    }

    public static ByteBuffer a(CharSequence charSequence) {
        return o.a(charSequence, a);
    }

    public static ByteBuffer b(CharSequence charSequence) {
        return o.a(charSequence, b);
    }

    public static ByteBuffer c(CharSequence charSequence) {
        return o.a(charSequence, c);
    }

    private static ByteBuffer a(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        return o.a(CharBuffer.wrap(new t(charSequence)), charset);
    }

    private static ByteBuffer a(CharBuffer charBuffer, Charset charset) {
        CharsetEncoder charsetEncoder = charset.newEncoder();
        int n2 = (int)((float)charBuffer.remaining() * charsetEncoder.averageBytesPerChar());
        ByteBuffer byteBuffer = BufferUtils.a(n2);
        if (n2 == 0 && charBuffer.remaining() == 0) {
            return byteBuffer;
        }
        charsetEncoder.reset();
        while (true) {
            CoderResult coderResult;
            CoderResult coderResult2 = coderResult = charBuffer.hasRemaining() ? charsetEncoder.encode(charBuffer, byteBuffer, true) : CoderResult.UNDERFLOW;
            if (coderResult.isUnderflow()) {
                coderResult = charsetEncoder.flush(byteBuffer);
            }
            if (coderResult.isUnderflow()) break;
            if (coderResult.isOverflow()) {
                n2 = 2 * n2 + 1;
                ByteBuffer byteBuffer2 = BufferUtils.a(n2);
                byteBuffer.flip();
                byteBuffer2.put(byteBuffer);
                byteBuffer = byteBuffer2;
                continue;
            }
            try {
                coderResult.throwException();
            }
            catch (CharacterCodingException characterCodingException) {
                throw new RuntimeException(characterCodingException);
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static String c(ByteBuffer byteBuffer) {
        return o.a(byteBuffer, a);
    }

    public static String d(ByteBuffer byteBuffer) {
        return o.a(byteBuffer, b);
    }

    public static String e(ByteBuffer byteBuffer) {
        return o.a(byteBuffer, c);
    }

    private static String a(ByteBuffer byteBuffer, Charset charset) {
        if (byteBuffer == null) {
            return null;
        }
        return o.b(byteBuffer, charset);
    }

    private static String b(ByteBuffer byteBuffer, Charset charset) {
        CharsetDecoder charsetDecoder = charset.newDecoder();
        int n2 = (int)((float)byteBuffer.remaining() * charsetDecoder.averageCharsPerByte());
        CharBuffer charBuffer = BufferUtils.c(n2);
        if (n2 == 0 && byteBuffer.remaining() == 0) {
            return "";
        }
        charsetDecoder.reset();
        while (true) {
            CoderResult coderResult;
            CoderResult coderResult2 = coderResult = byteBuffer.hasRemaining() ? charsetDecoder.decode(byteBuffer, charBuffer, true) : CoderResult.UNDERFLOW;
            if (coderResult.isUnderflow()) {
                coderResult = charsetDecoder.flush(charBuffer);
            }
            if (coderResult.isUnderflow()) break;
            if (coderResult.isOverflow()) {
                n2 = 2 * n2 + 1;
                CharBuffer charBuffer2 = BufferUtils.c(n2);
                charBuffer.flip();
                charBuffer2.put(charBuffer);
                charBuffer = charBuffer2;
                continue;
            }
            try {
                coderResult.throwException();
            }
            catch (CharacterCodingException characterCodingException) {
                throw new RuntimeException(characterCodingException);
            }
        }
        charBuffer.flip();
        return charBuffer.toString();
    }

    private static q a(String string) {
        return (q)Class.forName(string).newInstance();
    }

    static Field a() {
        return o.a(ByteBuffer.class, "address");
    }

    private static Field a(Class class_, String string) {
        Class class_2 = class_;
        while (true) {
            try {
                return class_2.getDeclaredField(string);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                if ((class_2 = class_2.getSuperclass()) != null) continue;
                throw new NoSuchFieldException(string + " does not exist in " + class_.getSimpleName() + " or any of its superclasses.");
            }
            break;
        }
    }

    static {
        q q2;
        a = Charset.forName("ISO-8859-1");
        b = Charset.forName("UTF-8");
        c = Charset.forName("UTF-16LE");
        try {
            q2 = o.a("org.lwjgl.MemoryUtilSun$AccessorUnsafe");
        }
        catch (Exception exception) {
            try {
                q2 = o.a("org.lwjgl.MemoryUtilSun$AccessorReflectFast");
            }
            catch (Exception exception2) {
                try {
                    q2 = new s();
                }
                catch (Exception exception3) {
                    org.lwjgl.d.a((CharSequence)"Unsupported JVM detected, this will likely result in low performance. Please inform LWJGL developers.");
                    q2 = new r(null);
                }
            }
        }
        org.lwjgl.d.a((CharSequence)("MemoryUtil Accessor: " + q2.getClass().getSimpleName()));
        d = q2;
    }
}

