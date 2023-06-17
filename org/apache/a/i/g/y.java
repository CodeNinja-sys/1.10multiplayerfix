/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.a.i.g.u;
import org.apache.a.j.a;
import org.apache.a.j.g;
import org.apache.a.j.i;
import org.apache.a.o.b;
import org.apache.a.o.c;
import org.apache.a.o.d;

public class y
implements a,
i {
    private static final byte[] a = new byte[]{13, 10};
    private final u b;
    private final c c;
    private final int d;
    private final CharsetEncoder e;
    private OutputStream f;
    private ByteBuffer g;

    public y(u u2, int n2, int n3, CharsetEncoder charsetEncoder) {
        org.apache.a.o.a.a(n2, "Buffer size");
        org.apache.a.o.a.a(u2, "HTTP transport metrcis");
        this.b = u2;
        this.c = new c(n2);
        this.d = n3 >= 0 ? n3 : 0;
        this.e = charsetEncoder;
    }

    public y(u u2, int n2) {
        this(u2, n2, n2, null);
    }

    public void a(OutputStream outputStream) {
        this.f = outputStream;
    }

    public boolean c() {
        return this.f != null;
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

    private void b(byte[] arrby, int n2, int n3) {
        org.apache.a.o.b.a(this.f, "Output stream");
        this.f.write(arrby, n2, n3);
    }

    private void d() {
        if (this.f != null) {
            this.f.flush();
        }
    }

    private void e() {
        int n2 = this.c.d();
        if (n2 > 0) {
            this.b(this.c.e(), 0, n2);
            this.c.a();
            this.b.b(n2);
        }
    }

    public void a() {
        this.e();
        this.d();
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            return;
        }
        if (n3 > this.d || n3 > this.c.c()) {
            this.e();
            this.b(arrby, n2, n3);
            this.b.b(n3);
        } else {
            int n4 = this.c.c() - this.c.d();
            if (n3 > n4) {
                this.e();
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
        if (this.d > 0) {
            if (this.c.g()) {
                this.e();
            }
            this.c.a(n2);
        } else {
            this.e();
            this.f.write(n2);
        }
    }

    public void a(String string) {
        if (string == null) {
            return;
        }
        if (string.length() > 0) {
            if (this.e == null) {
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

    public void a(d d2) {
        if (d2 == null) {
            return;
        }
        if (this.e == null) {
            int n2;
            int n3 = 0;
            for (int i2 = d2.e(); i2 > 0; i2 -= n2) {
                n2 = this.c.c() - this.c.d();
                if ((n2 = Math.min(n2, i2)) > 0) {
                    this.c.a(d2, n3, n2);
                }
                if (this.c.g()) {
                    this.e();
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
        if (this.g == null) {
            this.g = ByteBuffer.allocate(1024);
        }
        this.e.reset();
        while (charBuffer.hasRemaining()) {
            coderResult = this.e.encode(charBuffer, this.g, true);
            this.a(coderResult);
        }
        coderResult = this.e.flush(this.g);
        this.a(coderResult);
        this.g.clear();
    }

    private void a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.g.flip();
        while (this.g.hasRemaining()) {
            this.a(this.g.get());
        }
        this.g.compact();
    }

    public g b() {
        return this.b;
    }
}

