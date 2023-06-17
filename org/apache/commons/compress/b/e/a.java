/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.e;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import org.apache.commons.compress.b.e.b;
import org.apache.commons.compress.b.e.c;
import org.apache.commons.compress.c.i;

public class a
extends org.apache.commons.compress.b.b {
    static final long a = 2726488792L;
    private static final int b = 255;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 254;
    private static final int f = 2;
    private static final int g = 127;
    private static final int h = 253;
    private static final byte[] i = new byte[]{-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};
    private final PushbackInputStream j;
    private c k;
    private final byte[] l = new byte[1];
    private boolean m;
    private boolean n;
    private int o;
    private long p = -1L;
    private final b q = new b();

    public a(InputStream inputStream) {
        this.j = new PushbackInputStream(inputStream, 1);
        this.g();
    }

    public int read() {
        return this.read(this.l, 0, 1) == -1 ? -1 : this.l[0] & 0xFF;
    }

    public void close() {
        if (this.k != null) {
            this.k.close();
            this.k = null;
        }
        this.j.close();
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.a(arrby, n2, n3);
        if (n4 == -1) {
            this.a();
            if (this.m) {
                return -1;
            }
            n4 = this.a(arrby, n2, n3);
        }
        return n4;
    }

    public int available() {
        if (this.n) {
            return Math.min(this.o, this.j.available());
        }
        if (this.k != null) {
            return this.k.available();
        }
        return 0;
    }

    private int a(byte[] arrby, int n2, int n3) {
        int n4 = -1;
        if (this.n) {
            int n5 = Math.min(this.o, n3);
            if (n5 == 0) {
                return -1;
            }
            n4 = this.j.read(arrby, n2, n5);
            if (n4 != -1) {
                this.o -= n4;
                this.a(n4);
            }
        } else if (this.k != null) {
            long l2 = this.k.c();
            n4 = this.k.read(arrby, n2, n3);
            if (n4 == -1) {
                this.k.close();
                this.k = null;
            } else {
                this.a(this.k.c() - l2);
            }
        }
        if (n4 > 0) {
            this.q.update(arrby, n2, n4);
        }
        return n4;
    }

    private void a() {
        this.i();
        this.n = false;
        int n2 = this.h();
        if (n2 == -1) {
            this.m = true;
        } else if (n2 == 255) {
            this.j.unread(n2);
            this.b(1L);
            this.g();
            this.a();
        } else if (n2 == 254 || n2 > 127 && n2 <= 253) {
            this.f();
            this.a();
        } else {
            if (n2 >= 2 && n2 <= 127) {
                throw new IOException("unskippable chunk with type " + n2 + " (hex " + Integer.toHexString(n2) + ")" + " detected.");
            }
            if (n2 == 1) {
                this.n = true;
                this.o = this.e() - 4;
                this.p = org.apache.commons.compress.b.e.a.c(this.d());
            } else if (n2 == 0) {
                long l2 = this.e() - 4;
                this.p = org.apache.commons.compress.b.e.a.c(this.d());
                this.k = new c(new org.apache.commons.compress.c.b(this.j, l2));
                this.a(this.k.c());
            } else {
                throw new IOException("unknown chunk type " + n2 + " detected.");
            }
        }
    }

    private long d() {
        byte[] arrby = new byte[4];
        int n2 = org.apache.commons.compress.c.i.a((InputStream)this.j, arrby);
        this.a(n2);
        if (n2 != 4) {
            throw new IOException("premature end of stream");
        }
        long l2 = 0L;
        for (int i2 = 0; i2 < 4; ++i2) {
            l2 |= ((long)arrby[i2] & 0xFFL) << 8 * i2;
        }
        return l2;
    }

    static long c(long l2) {
        l2 -= 2726488792L;
        return ((l2 &= 0xFFFFFFFFL) >> 17 | l2 << 15) & 0xFFFFFFFFL;
    }

    private int e() {
        int n2 = 0;
        int n3 = 0;
        for (int i2 = 0; i2 < 3; ++i2) {
            n2 = this.h();
            if (n2 == -1) {
                throw new IOException("premature end of stream");
            }
            n3 |= n2 << i2 * 8;
        }
        return n3;
    }

    private void f() {
        int n2 = this.e();
        long l2 = org.apache.commons.compress.c.i.a((InputStream)this.j, n2);
        this.a(l2);
        if (l2 != (long)n2) {
            throw new IOException("premature end of stream");
        }
    }

    private void g() {
        byte[] arrby = new byte[10];
        int n2 = org.apache.commons.compress.c.i.a((InputStream)this.j, arrby);
        this.a(n2);
        if (10 != n2 || !org.apache.commons.compress.b.e.a.a(arrby, 10)) {
            throw new IOException("Not a framed Snappy stream");
        }
    }

    private int h() {
        int n2 = this.j.read();
        if (n2 != -1) {
            this.a(1);
            return n2 & 0xFF;
        }
        return -1;
    }

    private void i() {
        if (this.p >= 0L && this.p != this.q.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        this.p = -1L;
        this.q.reset();
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < i.length) {
            return false;
        }
        byte[] arrby2 = arrby;
        if (arrby.length > i.length) {
            arrby2 = new byte[i.length];
            System.arraycopy(arrby, 0, arrby2, 0, i.length);
        }
        return Arrays.equals(arrby2, i);
    }
}

