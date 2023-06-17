/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.a.ae;
import org.apache.a.i.g.u;
import org.apache.a.j.a;
import org.apache.a.j.g;
import org.apache.a.j.h;
import org.apache.a.o.b;
import org.apache.a.o.c;
import org.apache.a.o.d;

public class x
implements a,
h {
    private final u a;
    private final byte[] b;
    private final c c;
    private final int d;
    private final org.apache.a.e.d e;
    private final CharsetDecoder f;
    private InputStream g;
    private int h;
    private int i;
    private CharBuffer j;

    public x(u u2, int n2, int n3, org.apache.a.e.d d2, CharsetDecoder charsetDecoder) {
        org.apache.a.o.a.a(u2, "HTTP transport metrcis");
        org.apache.a.o.a.a(n2, "Buffer size");
        this.a = u2;
        this.b = new byte[n2];
        this.h = 0;
        this.i = 0;
        this.d = n3 >= 0 ? n3 : 512;
        this.e = d2 != null ? d2 : org.apache.a.e.d.a;
        this.c = new c(n2);
        this.f = charsetDecoder;
    }

    public x(u u2, int n2) {
        this(u2, n2, n2, null, null);
    }

    public void a(InputStream inputStream) {
        this.g = inputStream;
    }

    public boolean d() {
        return this.g != null;
    }

    public int f() {
        return this.b.length;
    }

    public int g() {
        return this.i - this.h;
    }

    public int h() {
        return this.f() - this.g();
    }

    private int b(byte[] arrby, int n2, int n3) {
        org.apache.a.o.b.a(this.g, "Input stream");
        return this.g.read(arrby, n2, n3);
    }

    public int e() {
        int n2;
        int n3;
        int n4;
        if (this.h > 0) {
            n4 = this.i - this.h;
            if (n4 > 0) {
                System.arraycopy(this.b, this.h, this.b, 0, n4);
            }
            this.h = 0;
            this.i = n4;
        }
        if ((n4 = this.b(this.b, n3 = this.i, n2 = this.b.length - n3)) == -1) {
            return -1;
        }
        this.i = n3 + n4;
        this.a.b(n4);
        return n4;
    }

    public boolean i() {
        return this.h < this.i;
    }

    public void j() {
        this.h = 0;
        this.i = 0;
    }

    public int a() {
        while (!this.i()) {
            int n2 = this.e();
            if (n2 != -1) continue;
            return -1;
        }
        return this.b[this.h++] & 0xFF;
    }

    public int a(byte[] arrby, int n2, int n3) {
        int n4;
        if (arrby == null) {
            return 0;
        }
        if (this.i()) {
            int n5 = Math.min(n3, this.i - this.h);
            System.arraycopy(this.b, this.h, arrby, n2, n5);
            this.h += n5;
            return n5;
        }
        if (n3 > this.d) {
            int n6 = this.b(arrby, n2, n3);
            if (n6 > 0) {
                this.a.b(n6);
            }
            return n6;
        }
        while (!this.i()) {
            n4 = this.e();
            if (n4 != -1) continue;
            return -1;
        }
        n4 = Math.min(n3, this.i - this.h);
        System.arraycopy(this.b, this.h, arrby, n2, n4);
        this.h += n4;
        return n4;
    }

    public int a(byte[] arrby) {
        if (arrby == null) {
            return 0;
        }
        return this.a(arrby, 0, arrby.length);
    }

    private int k() {
        for (int i2 = this.h; i2 < this.i; ++i2) {
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
            int n4 = this.k();
            if (n4 != -1) {
                if (this.c.f()) {
                    return this.a(d2, n4);
                }
                bl2 = false;
                n3 = n4 + 1 - this.h;
                this.c.a(this.b, this.h, n3);
                this.h = n4 + 1;
            } else {
                if (this.i()) {
                    n3 = this.i - this.h;
                    this.c.a(this.b, this.h, n3);
                    this.h = this.i;
                }
                if ((n2 = this.e()) == -1) {
                    bl2 = false;
                }
            }
            if ((n3 = this.e.a()) <= 0 || this.c.d() < n3) continue;
            throw new ae("Maximum line length limit exceeded");
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
        if (this.f == null) {
            d2.a(this.c, 0, n2);
        } else {
            ByteBuffer byteBuffer = ByteBuffer.wrap(this.c.e(), 0, n2);
            n2 = this.a(d2, byteBuffer);
        }
        this.c.a();
        return n2;
    }

    private int a(d d2, int n2) {
        int n3 = n2;
        int n4 = this.h;
        this.h = n3 + 1;
        if (n3 > n4 && this.b[n3 - 1] == 13) {
            --n3;
        }
        int n5 = n3 - n4;
        if (this.f == null) {
            d2.a(this.b, n4, n5);
        } else {
            ByteBuffer byteBuffer = ByteBuffer.wrap(this.b, n4, n5);
            n5 = this.a(d2, byteBuffer);
        }
        return n5;
    }

    private int a(d d2, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.j == null) {
            this.j = CharBuffer.allocate(1024);
        }
        this.f.reset();
        int n2 = 0;
        while (byteBuffer.hasRemaining()) {
            coderResult = this.f.decode(byteBuffer, this.j, true);
            n2 += this.a(coderResult, d2, byteBuffer);
        }
        coderResult = this.f.flush(this.j);
        this.j.clear();
        return n2 += this.a(coderResult, d2, byteBuffer);
    }

    private int a(CoderResult coderResult, d d2, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.j.flip();
        int n2 = this.j.remaining();
        while (this.j.hasRemaining()) {
            d2.a(this.j.get());
        }
        this.j.compact();
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

    public boolean a(int n2) {
        return this.i();
    }

    public g c() {
        return this.a;
    }
}

