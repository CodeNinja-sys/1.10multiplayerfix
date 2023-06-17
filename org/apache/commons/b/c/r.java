/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.b.b;
import org.apache.commons.b.c.t;

public class r
implements Closeable {
    private final int a;
    private final Charset b;
    private final RandomAccessFile c;
    private final long d;
    private final long e;
    private final byte[][] f;
    private final int g;
    private final int h;
    private t i;
    private boolean j = false;

    public r(File file) {
        this(file, 4096, Charset.defaultCharset().toString());
    }

    public r(File file, int n2, Charset charset) {
        this.a = n2;
        this.b = charset;
        this.c = new RandomAccessFile(file, "r");
        this.d = this.c.length();
        int n3 = (int)(this.d % (long)n2);
        if (n3 > 0) {
            this.e = this.d / (long)n2 + 1L;
        } else {
            this.e = this.d / (long)n2;
            if (this.d > 0L) {
                n3 = n2;
            }
        }
        this.i = new t(this, this.e, n3, null, null);
        Charset charset2 = org.apache.commons.b.b.a(charset);
        CharsetEncoder charsetEncoder = charset2.newEncoder();
        float f2 = charsetEncoder.maxBytesPerChar();
        if (f2 == 1.0f) {
            this.h = 1;
        } else if (charset2 == Charset.forName("UTF-8")) {
            this.h = 1;
        } else if (charset2 == Charset.forName("Shift_JIS")) {
            this.h = 1;
        } else if (charset2 == Charset.forName("UTF-16BE") || charset2 == Charset.forName("UTF-16LE")) {
            this.h = 2;
        } else {
            if (charset2 == Charset.forName("UTF-16")) {
                throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
            }
            throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
        }
        this.f = new byte[][]{"\r\n".getBytes(charset), "\n".getBytes(charset), "\r".getBytes(charset)};
        this.g = this.f[0].length;
    }

    public r(File file, int n2, String string) {
        this(file, n2, org.apache.commons.b.b.a(string));
    }

    public String a() {
        String string = t.a(this.i);
        while (string == null) {
            this.i = t.b(this.i);
            if (this.i == null) break;
            string = t.a(this.i);
        }
        if ("".equals(string) && !this.j) {
            this.j = true;
            string = this.a();
        }
        return string;
    }

    @Override
    public void close() {
        this.c.close();
    }

    static /* synthetic */ int a(r r2) {
        return r2.a;
    }

    static /* synthetic */ RandomAccessFile b(r r2) {
        return r2.c;
    }

    static /* synthetic */ Charset c(r r2) {
        return r2.b;
    }

    static /* synthetic */ int d(r r2) {
        return r2.g;
    }

    static /* synthetic */ int e(r r2) {
        return r2.h;
    }

    static /* synthetic */ byte[][] f(r r2) {
        return r2.f;
    }
}

