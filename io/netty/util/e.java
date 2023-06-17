/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.c.f;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Map;

public final class e {
    public static final Charset a = Charset.forName("UTF-16");
    public static final Charset b = Charset.forName("UTF-16BE");
    public static final Charset c = Charset.forName("UTF-16LE");
    public static final Charset d = Charset.forName("UTF-8");
    public static final Charset e = Charset.forName("ISO-8859-1");
    public static final Charset f = Charset.forName("US-ASCII");

    public static CharsetEncoder a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        Map map = io.netty.util.c.f.b().i();
        CharsetEncoder charsetEncoder = (CharsetEncoder)map.get(charset);
        if (charsetEncoder != null) {
            charsetEncoder.reset();
            charsetEncoder.onMalformedInput(CodingErrorAction.REPLACE);
            charsetEncoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetEncoder;
        }
        charsetEncoder = charset.newEncoder();
        charsetEncoder.onMalformedInput(CodingErrorAction.REPLACE);
        charsetEncoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        map.put(charset, charsetEncoder);
        return charsetEncoder;
    }

    public static CharsetDecoder b(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        Map map = io.netty.util.c.f.b().j();
        CharsetDecoder charsetDecoder = (CharsetDecoder)map.get(charset);
        if (charsetDecoder != null) {
            charsetDecoder.reset();
            charsetDecoder.onMalformedInput(CodingErrorAction.REPLACE);
            charsetDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetDecoder;
        }
        charsetDecoder = charset.newDecoder();
        charsetDecoder.onMalformedInput(CodingErrorAction.REPLACE);
        charsetDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        map.put(charset, charsetDecoder);
        return charsetDecoder;
    }

    private e() {
    }
}

