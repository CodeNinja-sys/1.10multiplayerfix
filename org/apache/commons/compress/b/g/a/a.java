/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.g.a;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.b.b;

public abstract class a
extends b {
    private final byte[] j = new byte[1];
    protected final InputStream a;
    protected int b = -1;
    protected int c = 9;
    protected int d = 0;
    protected int e = 0;
    protected int f = -1;
    protected int g = 0;
    protected int[] h;
    protected byte[] i;
    private byte[] k;
    private int l;

    protected a(InputStream inputStream) {
        this.a = inputStream;
    }

    public void close() {
        this.a.close();
    }

    public int read() {
        int n2 = this.read(this.j);
        if (n2 < 0) {
            return n2;
        }
        return 0xFF & this.j[0];
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.a(arrby, n2, n3);
        while (n3 - n4 > 0) {
            int n5 = this.a();
            if (n5 < 0) {
                if (n4 > 0) {
                    this.a(n4);
                    return n4;
                }
                return n5;
            }
            n4 += this.a(arrby, n2 + n4, n3 - n4);
        }
        this.a(n4);
        return n4;
    }

    protected abstract int a();

    protected abstract int a(int var1, byte var2);

    protected void b(int n2) {
        this.b = 1 << n2 - 1;
    }

    protected void c(int n2) {
        int n3 = 1 << n2;
        this.h = new int[n3];
        this.i = new byte[n3];
        this.k = new byte[n3];
        this.l = n3;
        int n4 = 256;
        for (int i2 = 0; i2 < 256; ++i2) {
            this.h[i2] = -1;
            this.i[i2] = (byte)i2;
        }
    }

    protected int d() {
        int n2;
        while (this.e < this.c) {
            n2 = this.a.read();
            if (n2 < 0) {
                return n2;
            }
            this.d |= n2 << this.e;
            this.e += 8;
        }
        n2 = (1 << this.c) - 1;
        int n3 = this.d & n2;
        this.d >>>= this.c;
        this.e -= this.c;
        return n3;
    }

    protected int a(int n2, byte by2, int n3) {
        if (this.g < n3) {
            int n4 = this.g++;
            this.h[this.g] = n2;
            this.i[this.g] = by2;
            return n4;
        }
        return -1;
    }

    protected int e() {
        if (this.f == -1) {
            throw new IOException("The first code can't be a reference to its preceding code");
        }
        byte by2 = 0;
        int n2 = this.f;
        while (n2 >= 0) {
            by2 = this.i[n2];
            n2 = this.h[n2];
        }
        return this.a(this.f, by2);
    }

    protected int a(int n2, boolean bl2) {
        int n3 = n2;
        while (n3 >= 0) {
            this.k[--this.l] = this.i[n3];
            n3 = this.h[n3];
        }
        if (this.f != -1 && !bl2) {
            this.a(this.f, this.k[this.l]);
        }
        this.f = n2;
        return this.l;
    }

    private int a(byte[] arrby, int n2, int n3) {
        int n4 = this.k.length - this.l;
        if (n4 > 0) {
            int n5 = Math.min(n4, n3);
            System.arraycopy(this.k, this.l, arrby, n2, n5);
            this.l += n5;
            return n5;
        }
        return 0;
    }
}

