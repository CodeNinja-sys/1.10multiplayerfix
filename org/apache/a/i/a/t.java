/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import org.apache.a.i.a.o;
import org.apache.a.i.a.p;
import org.apache.a.o.f;
import org.apache.commons.a.a.d;

class t {
    private byte[] a = null;
    private int b = 0;

    t() {
    }

    t(String string, int n2) {
        this.a = d.j(f.a(string, "ASCII"));
        if (this.a.length < p.d().length) {
            throw new o("NTLM message decoding error - packet too short");
        }
        for (int i2 = 0; i2 < p.d().length; ++i2) {
            if (this.a[i2] == p.d()[i2]) continue;
            throw new o("NTLM message expected - instead got unrecognized bytes");
        }
        int n3 = this.c(p.d().length);
        if (n3 != n2) {
            throw new o("NTLM type " + Integer.toString(n2) + " message expected - instead got type " + Integer.toString(n3));
        }
        this.b = this.a.length;
    }

    protected int a() {
        return p.d().length + 4;
    }

    protected int b() {
        return this.b;
    }

    protected byte a(int n2) {
        if (this.a.length < n2 + 1) {
            throw new o("NTLM: Message too short");
        }
        return this.a[n2];
    }

    protected void a(byte[] arrby, int n2) {
        if (this.a.length < n2 + arrby.length) {
            throw new o("NTLM: Message too short");
        }
        System.arraycopy(this.a, n2, arrby, 0, arrby.length);
    }

    protected int b(int n2) {
        return p.b(this.a, n2);
    }

    protected int c(int n2) {
        return p.c(this.a, n2);
    }

    protected byte[] d(int n2) {
        return p.d(this.a, n2);
    }

    protected void a(int n2, int n3) {
        this.a = new byte[n2];
        this.b = 0;
        this.a(p.d());
        this.f(n3);
    }

    protected void a(byte by2) {
        this.a[this.b] = by2;
        ++this.b;
    }

    protected void a(byte[] arrby) {
        if (arrby == null) {
            return;
        }
        byte[] arrby2 = arrby;
        int n2 = arrby2.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2;
            this.a[this.b] = by2 = arrby2[i2];
            ++this.b;
        }
    }

    protected void e(int n2) {
        this.a((byte)(n2 & 0xFF));
        this.a((byte)(n2 >> 8 & 0xFF));
    }

    protected void f(int n2) {
        this.a((byte)(n2 & 0xFF));
        this.a((byte)(n2 >> 8 & 0xFF));
        this.a((byte)(n2 >> 16 & 0xFF));
        this.a((byte)(n2 >> 24 & 0xFF));
    }

    String c() {
        byte[] arrby;
        if (this.a.length > this.b) {
            byte[] arrby2 = new byte[this.b];
            System.arraycopy(this.a, 0, arrby2, 0, this.b);
            arrby = arrby2;
        } else {
            arrby = this.a;
        }
        return f.a(d.e(arrby));
    }
}

