/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.g;

import java.io.IOException;
import java.io.InputStream;

public class a
extends org.apache.commons.compress.b.g.a.a {
    private static final int j = 31;
    private static final int k = 157;
    private static final int l = 128;
    private static final int m = 31;
    private final boolean n;
    private final int o;
    private long p = 0L;

    public a(InputStream inputStream) {
        super(inputStream);
        int n2 = this.a.read();
        int n3 = this.a.read();
        int n4 = this.a.read();
        if (n2 != 31 || n3 != 157 || n4 < 0) {
            throw new IOException("Input is not in .Z format");
        }
        this.n = (n4 & 0x80) != 0;
        this.o = n4 & 0x1F;
        if (this.n) {
            this.b(this.c);
        }
        this.c(this.o);
        this.f();
    }

    private void f() {
        this.g = 256;
        if (this.n) {
            ++this.g;
        }
    }

    protected int d() {
        int n2 = super.d();
        if (n2 >= 0) {
            ++this.p;
        }
        return n2;
    }

    private void g() {
        long l2 = 8L - this.p % 8L;
        if (l2 == 8L) {
            l2 = 0L;
        }
        for (long i2 = 0L; i2 < l2; ++i2) {
            this.d();
        }
        this.d = 0;
        this.e = 0;
    }

    protected int a(int n2, byte by2) {
        int n3 = 1 << this.c;
        int n4 = this.a(n2, by2, n3);
        if (this.g == n3 && this.c < this.o) {
            this.g();
            ++this.c;
        }
        return n4;
    }

    protected int a() {
        int n2 = this.d();
        if (n2 < 0) {
            return -1;
        }
        if (this.n && n2 == this.b) {
            this.f();
            this.g();
            this.c = 9;
            this.f = -1;
            return 0;
        }
        boolean bl2 = false;
        if (n2 == this.g) {
            this.e();
            bl2 = true;
        } else if (n2 > this.g) {
            throw new IOException(String.format("Invalid %d bit code 0x%x", this.c, n2));
        }
        return this.a(n2, bl2);
    }

    public static boolean a(byte[] arrby, int n2) {
        return n2 > 3 && arrby[0] == 31 && arrby[1] == -99;
    }
}

