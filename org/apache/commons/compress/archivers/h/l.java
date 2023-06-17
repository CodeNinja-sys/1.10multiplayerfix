/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;

class l
implements am {
    private final Charset a;

    public l(Charset charset) {
        this.a = charset;
    }

    public boolean a(String string) {
        CharsetEncoder charsetEncoder = this.a.newEncoder();
        charsetEncoder.onMalformedInput(CodingErrorAction.REPORT);
        charsetEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return charsetEncoder.canEncode(string);
    }

    public ByteBuffer b(String string) {
        CharsetEncoder charsetEncoder = this.a.newEncoder();
        charsetEncoder.onMalformedInput(CodingErrorAction.REPORT);
        charsetEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        CharBuffer charBuffer = CharBuffer.wrap(string);
        ByteBuffer byteBuffer = ByteBuffer.allocate(string.length() + (string.length() + 1) / 2);
        while (charBuffer.remaining() > 0) {
            CoderResult coderResult = charsetEncoder.encode(charBuffer, byteBuffer, true);
            if (coderResult.isUnmappable() || coderResult.isMalformed()) {
                if (coderResult.length() * 6 > byteBuffer.remaining()) {
                    byteBuffer = an.a(byteBuffer, byteBuffer.position() + coderResult.length() * 6);
                }
                for (int i2 = 0; i2 < coderResult.length(); ++i2) {
                    an.a(byteBuffer, charBuffer.get());
                }
                continue;
            }
            if (coderResult.isOverflow()) {
                byteBuffer = an.a(byteBuffer, 0);
                continue;
            }
            if (!coderResult.isUnderflow()) continue;
            charsetEncoder.flush(byteBuffer);
            break;
        }
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        return byteBuffer;
    }

    public String a(byte[] arrby) {
        return this.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(arrby)).toString();
    }
}

