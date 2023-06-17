/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.a.c;
import org.apache.a.i.g.u;
import org.apache.a.j.a;
import org.apache.a.j.g;
import org.apache.a.j.i;
import org.apache.a.l.j;

public abstract class d
implements a,
i {
    private static final byte[] a = new byte[]{13, 10};
    private OutputStream b;
    private org.apache.a.o.c c;
    private Charset d;
    private boolean e;
    private int f;
    private u g;
    private CodingErrorAction h;
    private CodingErrorAction i;
    private CharsetEncoder j;
    private ByteBuffer k;

    protected d(OutputStream outputStream, int n2, Charset charset, int n3, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2) {
        org.apache.a.o.a.a(outputStream, "Input stream");
        org.apache.a.o.a.b(n2, "Buffer size");
        this.b = outputStream;
        this.c = new org.apache.a.o.c(n2);
        this.d = charset != null ? charset : org.apache.a.c.f;
        this.e = this.d.equals(org.apache.a.c.f);
        this.j = null;
        this.f = n3 >= 0 ? n3 : 512;
        this.g = this.c();
        this.h = codingErrorAction != null ? codingErrorAction : CodingErrorAction.REPORT;
        this.i = codingErrorAction2 != null ? codingErrorAction2 : CodingErrorAction.REPORT;
    }

    public d() {
    }

    protected void a(OutputStream outputStream, int n2, j j2) {
        org.apache.a.o.a.a(outputStream, "Input stream");
        org.apache.a.o.a.b(n2, "Buffer size");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        this.b = outputStream;
        this.c = new org.apache.a.o.c(n2);
        String string = (String)j2.a("http.protocol.element-charset");
        this.d = string != null ? Charset.forName(string) : org.apache.a.c.f;
        this.e = this.d.equals(org.apache.a.c.f);
        this.j = null;
        this.f = j2.a("http.connection.min-chunk-limit", 512);
        this.g = this.c();
        CodingErrorAction codingErrorAction = (CodingErrorAction)j2.a("http.malformed.input.action");
        this.h = codingErrorAction != null ? codingErrorAction : CodingErrorAction.REPORT;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction)j2.a("http.unmappable.input.action");
        this.i = codingErrorAction2 != null ? codingErrorAction2 : CodingErrorAction.REPORT;
    }

    protected u c() {
        return new u();
    }

    public int f() {
        return this.c.c();
    }

    public int g() {
        return this.c.d();
    }

    public int h() {
        return this.f() - this.g();
    }

    protected void d() {
        int n2 = this.c.d();
        if (n2 > 0) {
            this.b.write(this.c.e(), 0, n2);
            this.c.a();
            this.g.b(n2);
        }
    }

    public void a() {
        this.d();
        this.b.flush();
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            return;
        }
        if (n3 > this.f || n3 > this.c.c()) {
            this.d();
            this.b.write(arrby, n2, n3);
            this.g.b(n3);
        } else {
            int n4 = this.c.c() - this.c.d();
            if (n3 > n4) {
                this.d();
            }
            this.c.a(arrby, n2, n3);
        }
    }

    public void a(byte[] arrby) {
        if (arrby == null) {
            return;
        }
        this.a(arrby, 0, arrby.length);
    }

    public void a(int n2) {
        if (this.c.g()) {
            this.d();
        }
        this.c.a(n2);
    }

    public void a(String string) {
        if (string == null) {
            return;
        }
        if (string.length() > 0) {
            if (this.e) {
                for (int i2 = 0; i2 < string.length(); ++i2) {
                    this.a(string.charAt(i2));
                }
            } else {
                CharBuffer charBuffer = CharBuffer.wrap(string);
                this.a(charBuffer);
            }
        }
        this.a(a);
    }

    public void a(org.apache.a.o.d d2) {
        if (d2 == null) {
            return;
        }
        if (this.e) {
            int n2;
            int n3 = 0;
            for (int i2 = d2.e(); i2 > 0; i2 -= n2) {
                n2 = this.c.c() - this.c.d();
                if ((n2 = Math.min(n2, i2)) > 0) {
                    this.c.a(d2, n3, n2);
                }
                if (this.c.g()) {
                    this.d();
                }
                n3 += n2;
            }
        } else {
            CharBuffer charBuffer = CharBuffer.wrap(d2.c(), 0, d2.e());
            this.a(charBuffer);
        }
        this.a(a);
    }

    private void a(CharBuffer charBuffer) {
        CoderResult coderResult;
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.j == null) {
            this.j = this.d.newEncoder();
            this.j.onMalformedInput(this.h);
            this.j.onUnmappableCharacter(this.i);
        }
        if (this.k == null) {
            this.k = ByteBuffer.allocate(1024);
        }
        this.j.reset();
        while (charBuffer.hasRemaining()) {
            coderResult = this.j.encode(charBuffer, this.k, true);
            this.a(coderResult);
        }
        coderResult = this.j.flush(this.k);
        this.a(coderResult);
        this.k.clear();
    }

    private void a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.k.flip();
        while (this.k.hasRemaining()) {
            this.a(this.k.get());
        }
        this.k.compact();
    }

    public g b() {
        return this.g;
    }
}

