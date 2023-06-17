/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class r
extends OutputStream {
    private static final int a = 1024;
    private final Writer b;
    private final CharsetDecoder c;
    private final boolean d;
    private final ByteBuffer e = ByteBuffer.allocate(128);
    private final CharBuffer f;

    public r(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    public r(Writer writer, CharsetDecoder charsetDecoder, int n2, boolean bl2) {
        this.b = writer;
        this.c = charsetDecoder;
        this.d = bl2;
        this.f = CharBuffer.allocate(n2);
    }

    public r(Writer writer, Charset charset, int n2, boolean bl2) {
        this(writer, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?"), n2, bl2);
    }

    public r(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public r(Writer writer, String string, int n2, boolean bl2) {
        this(writer, Charset.forName(string), n2, bl2);
    }

    public r(Writer writer, String string) {
        this(writer, string, 1024, false);
    }

    public r(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        while (n3 > 0) {
            int n4 = Math.min(n3, this.e.remaining());
            this.e.put(arrby, n2, n4);
            this.a(false);
            n3 -= n4;
            n2 += n4;
        }
        if (this.d) {
            this.a();
        }
    }

    @Override
    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public void write(int n2) {
        this.write(new byte[]{(byte)n2}, 0, 1);
    }

    @Override
    public void flush() {
        this.a();
        this.b.flush();
    }

    @Override
    public void close() {
        this.a(true);
        this.a();
        this.b.close();
    }

    private void a(boolean bl2) {
        CoderResult coderResult;
        this.e.flip();
        while ((coderResult = this.c.decode(this.e, this.f, bl2)).isOverflow()) {
            this.a();
        }
        if (!coderResult.isUnderflow()) {
            throw new IOException("Unexpected coder result");
        }
        this.e.compact();
    }

    private void a() {
        if (this.f.position() > 0) {
            this.b.write(this.f.array(), 0, this.f.position());
            this.f.rewind();
        }
    }
}

