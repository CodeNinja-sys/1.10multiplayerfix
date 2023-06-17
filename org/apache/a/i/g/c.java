/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.a.i.g.u;
import org.apache.a.j.a;
import org.apache.a.j.g;
import org.apache.a.j.h;
import org.apache.a.l.j;
import org.apache.a.o.d;

public abstract class c
implements a,
h {
    private InputStream a;
    private byte[] b;
    private org.apache.a.o.c c;
    private Charset d;
    private boolean e;
    private int f;
    private int g;
    private u h;
    private CodingErrorAction i;
    private CodingErrorAction j;
    private int k;
    private int l;
    private CharsetDecoder m;
    private CharBuffer n;

    protected void a(InputStream inputStream, int n2, j j2) {
        org.apache.a.o.a.a(inputStream, "Input stream");
        org.apache.a.o.a.b(n2, "Buffer size");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        this.a = inputStream;
        this.b = new byte[n2];
        this.k = 0;
        this.l = 0;
        this.c = new org.apache.a.o.c(n2);
        String string = (String)j2.a("http.protocol.element-charset");
        this.d = string != null ? Charset.forName(string) : org.apache.a.c.f;
        this.e = this.d.equals(org.apache.a.c.f);
        this.m = null;
        this.f = j2.a("http.connection.max-line-length", -1);
        this.g = j2.a("http.connection.min-chunk-limit", 512);
        this.h = this.e();
        CodingErrorAction codingErrorAction = (CodingErrorAction)j2.a("http.malformed.input.action");
        this.i = codingErrorAction != null ? codingErrorAction : CodingErrorAction.REPORT;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction)j2.a("http.unmappable.input.action");
        this.j = codingErrorAction2 != null ? codingErrorAction2 : CodingErrorAction.REPORT;
    }

    protected u e() {
        return new u();
    }

    public int f() {
        return this.b.length;
    }

    public int g() {
        return this.l - this.k;
    }

    public int h() {
        return this.f() - this.g();
    }

    protected int i() {
        int n2;
        int n3;
        int n4;
        if (this.k > 0) {
            n4 = this.l - this.k;
            if (n4 > 0) {
                System.arraycopy(this.b, this.k, this.b, 0, n4);
            }
            this.k = 0;
            this.l = n4;
        }
        if ((n4 = this.a.read(this.b, n3 = this.l, n2 = this.b.length - n3)) == -1) {
            return -1;
        }
        this.l = n3 + n4;
        this.h.b(n4);
        return n4;
    }

    protected boolean j() {
        return this.k < this.l;
    }

    public int a() {
        while (!this.j()) {
            int n2 = this.i();
            if (n2 != -1) continue;
            return -1;
        }
        return this.b[this.k++] & 0xFF;
    }

    public int a(byte[] arrby, int n2, int n3) {
        int n4;
        if (arrby == null) {
            return 0;
        }
        if (this.j()) {
            int n5 = Math.min(n3, this.l - this.k);
            System.arraycopy(this.b, this.k, arrby, n2, n5);
            this.k += n5;
            return n5;
        }
        if (n3 > this.g) {
            int n6 = this.a.read(arrby, n2, n3);
            if (n6 > 0) {
                this.h.b(n6);
            }
            return n6;
        }
        while (!this.j()) {
            n4 = this.i();
            if (n4 != -1) continue;
            return -1;
        }
        n4 = Math.min(n3, this.l - this.k);
        System.arraycopy(this.b, this.k, arrby, n2, n4);
        this.k += n4;
        return n4;
    }

    public int a(byte[] arrby) {
        if (arrby == null) {
            return 0;
        }
        return this.a(arrby, 0, arrby.length);
    }

    private int d() {
        for (int i2 = this.k; i2 < this.l; ++i2) {
            if (this.b[i2] != 10) continue;
            return i2;
        }
        return -1;
    }

    public int a(d d2) {
        org.apache.a.o.a.a(d2, "Char array buffer");
        int n2 = 0;
        boolean bl2 = true;
        while (bl2) {
            int n3;
            int n4 = this.d();
            if (n4 != -1) {
                if (this.c.f()) {
                    return this.a(d2, n4);
                }
                bl2 = false;
                n3 = n4 + 1 - this.k;
                this.c.a(this.b, this.k, n3);
                this.k = n4 + 1;
            } else {
                if (this.j()) {
                    n3 = this.l - this.k;
                    this.c.a(this.b, this.k, n3);
                    this.k = this.l;
                }
                if ((n2 = this.i()) == -1) {
                    bl2 = false;
                }
            }
            if (this.f <= 0 || this.c.d() < this.f) continue;
            throw new IOException("Maximum line length limit exceeded");
        }
        if (n2 == -1 && this.c.f()) {
            return -1;
        }
        return this.b(d2);
    }

    private int b(d d2) {
        int n2 = this.c.d();
        if (n2 > 0) {
            if (this.c.b(n2 - 1) == 10) {
                --n2;
            }
            if (n2 > 0 && this.c.b(n2 - 1) == 13) {
                --n2;
            }
        }
        if (this.e) {
            d2.a(this.c, 0, n2);
        } else {
            ByteBuffer byteBuffer = ByteBuffer.wrap(this.c.e(), 0, n2);
            n2 = this.a(d2, byteBuffer);
        }
        this.c.a();
        return n2;
    }

    private int a(d d2, int n2) {
        int n3 = this.k;
        int n4 = n2;
        this.k = n4 + 1;
        if (n4 > n3 && this.b[n4 - 1] == 13) {
            --n4;
        }
        int n5 = n4 - n3;
        if (this.e) {
            d2.a(this.b, n3, n5);
        } else {
            ByteBuffer byteBuffer = ByteBuffer.wrap(this.b, n3, n5);
            n5 = this.a(d2, byteBuffer);
        }
        return n5;
    }

    private int a(d d2, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.m == null) {
            this.m = this.d.newDecoder();
            this.m.onMalformedInput(this.i);
            this.m.onUnmappableCharacter(this.j);
        }
        if (this.n == null) {
            this.n = CharBuffer.allocate(1024);
        }
        this.m.reset();
        int n2 = 0;
        while (byteBuffer.hasRemaining()) {
            coderResult = this.m.decode(byteBuffer, this.n, true);
            n2 += this.a(coderResult, d2, byteBuffer);
        }
        coderResult = this.m.flush(this.n);
        this.n.clear();
        return n2 += this.a(coderResult, d2, byteBuffer);
    }

    private int a(CoderResult coderResult, d d2, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.n.flip();
        int n2 = this.n.remaining();
        while (this.n.hasRemaining()) {
            d2.a(this.n.get());
        }
        this.n.compact();
        return n2;
    }

    public String b() {
        d d2 = new d(64);
        int n2 = this.a(d2);
        if (n2 != -1) {
            return d2.toString();
        }
        return null;
    }

    public g c() {
        return this.h;
    }
}

