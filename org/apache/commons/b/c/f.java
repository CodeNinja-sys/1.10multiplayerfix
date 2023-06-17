/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class f
extends InputStream {
    private final CharsetEncoder a;
    private final CharBuffer b;
    private final ByteBuffer c;
    private int d;

    public f(CharSequence charSequence, Charset charset, int n2) {
        this.a = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        this.c = ByteBuffer.allocate(n2);
        this.c.flip();
        this.b = CharBuffer.wrap(charSequence);
        this.d = -1;
    }

    public f(CharSequence charSequence, String string, int n2) {
        this(charSequence, Charset.forName(string), n2);
    }

    public f(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public f(CharSequence charSequence, String string) {
        this(charSequence, string, 2048);
    }

    private void a() {
        this.c.compact();
        CoderResult coderResult = this.a.encode(this.b, this.c, true);
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.c.flip();
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (n3 < 0 || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("Array Size=" + arrby.length + ", offset=" + n2 + ", length=" + n3);
        }
        if (n3 == 0) {
            return 0;
        }
        if (!this.c.hasRemaining() && !this.b.hasRemaining()) {
            return -1;
        }
        int n4 = 0;
        while (n3 > 0) {
            if (this.c.hasRemaining()) {
                int n5 = Math.min(this.c.remaining(), n3);
                this.c.get(arrby, n2, n5);
                n2 += n5;
                n3 -= n5;
                n4 += n5;
                continue;
            }
            this.a();
            if (this.c.hasRemaining() || this.b.hasRemaining()) continue;
        }
        return n4 == 0 && !this.b.hasRemaining() ? -1 : n4;
    }

    @Override
    public int read() {
        do {
            if (this.c.hasRemaining()) {
                return this.c.get() & 0xFF;
            }
            this.a();
        } while (this.c.hasRemaining() || this.b.hasRemaining());
        return -1;
    }

    @Override
    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    @Override
    public long skip(long l2) {
        int n2 = 0;
        while (l2 > 0L && this.b.hasRemaining()) {
            this.b.get();
            --l2;
            ++n2;
        }
        return n2;
    }

    @Override
    public int available() {
        return this.b.remaining();
    }

    @Override
    public void close() {
    }

    @Override
    public synchronized void mark(int n2) {
        this.d = this.b.position();
    }

    @Override
    public synchronized void reset() {
        if (this.d != -1) {
            this.b.position(this.d);
            this.d = -1;
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }
}

