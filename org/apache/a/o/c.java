/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.io.Serializable;
import org.apache.a.o.a;
import org.apache.a.o.d;

public final class c
implements Serializable {
    private static final long a = 4359112959524048036L;
    private byte[] b;
    private int c;

    public c(int n2) {
        org.apache.a.o.a.b(n2, "Buffer capacity");
        this.b = new byte[n2];
    }

    private void e(int n2) {
        byte[] arrby = new byte[Math.max(this.b.length << 1, n2)];
        System.arraycopy(this.b, 0, arrby, 0, this.c);
        this.b = arrby;
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            return;
        }
        if (n2 < 0 || n2 > arrby.length || n3 < 0 || n2 + n3 < 0 || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("off: " + n2 + " len: " + n3 + " b.length: " + arrby.length);
        }
        if (n3 == 0) {
            return;
        }
        int n4 = this.c + n3;
        if (n4 > this.b.length) {
            this.e(n4);
        }
        System.arraycopy(arrby, n2, this.b, this.c, n3);
        this.c = n4;
    }

    public void a(int n2) {
        int n3 = this.c + 1;
        if (n3 > this.b.length) {
            this.e(n3);
        }
        this.b[this.c] = (byte)n2;
        this.c = n3;
    }

    public void a(char[] arrc, int n2, int n3) {
        if (arrc == null) {
            return;
        }
        if (n2 < 0 || n2 > arrc.length || n3 < 0 || n2 + n3 < 0 || n2 + n3 > arrc.length) {
            throw new IndexOutOfBoundsException("off: " + n2 + " len: " + n3 + " b.length: " + arrc.length);
        }
        if (n3 == 0) {
            return;
        }
        int n4 = this.c;
        int n5 = n4 + n3;
        if (n5 > this.b.length) {
            this.e(n5);
        }
        int n6 = n2;
        for (int i2 = n4; i2 < n5; ++i2) {
            this.b[i2] = (byte)arrc[n6];
            ++n6;
        }
        this.c = n5;
    }

    public void a(d d2, int n2, int n3) {
        if (d2 == null) {
            return;
        }
        this.a(d2.c(), n2, n3);
    }

    public void a() {
        this.c = 0;
    }

    public byte[] b() {
        byte[] arrby = new byte[this.c];
        if (this.c > 0) {
            System.arraycopy(this.b, 0, arrby, 0, this.c);
        }
        return arrby;
    }

    public int b(int n2) {
        return this.b[n2];
    }

    public int c() {
        return this.b.length;
    }

    public int d() {
        return this.c;
    }

    public void c(int n2) {
        if (n2 <= 0) {
            return;
        }
        int n3 = this.b.length - this.c;
        if (n2 > n3) {
            this.e(this.c + n2);
        }
    }

    public byte[] e() {
        return this.b;
    }

    public void d(int n2) {
        if (n2 < 0 || n2 > this.b.length) {
            throw new IndexOutOfBoundsException("len: " + n2 + " < 0 or > buffer len: " + this.b.length);
        }
        this.c = n2;
    }

    public boolean f() {
        return this.c == 0;
    }

    public boolean g() {
        return this.c == this.b.length;
    }

    public int a(byte by2, int n2, int n3) {
        int n4;
        int n5 = n2;
        if (n5 < 0) {
            n5 = 0;
        }
        if ((n4 = n3) > this.c) {
            n4 = this.c;
        }
        if (n5 > n4) {
            return -1;
        }
        for (int i2 = n5; i2 < n4; ++i2) {
            if (this.b[i2] != by2) continue;
            return i2;
        }
        return -1;
    }

    public int a(byte by2) {
        return this.a(by2, 0, this.c);
    }
}

