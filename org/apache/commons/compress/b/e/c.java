/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.e;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.b.b;
import org.apache.commons.compress.c.i;

public class c
extends b {
    private static final int b = 3;
    public static final int a = 32768;
    private final byte[] c;
    private int d;
    private int e;
    private final int f;
    private final InputStream g;
    private final int h;
    private int i;
    private final byte[] j = new byte[1];
    private boolean k = false;

    public c(InputStream inputStream) {
        this(inputStream, 32768);
    }

    public c(InputStream inputStream, int n2) {
        this.g = inputStream;
        this.f = n2;
        this.c = new byte[n2 * 3];
        this.e = 0;
        this.d = 0;
        this.i = this.h = (int)this.f();
    }

    public int read() {
        return this.read(this.j, 0, 1) == -1 ? -1 : this.j[0] & 0xFF;
    }

    public void close() {
        this.g.close();
    }

    public int available() {
        return this.d - this.e;
    }

    public int read(byte[] arrby, int n2, int n3) {
        if (this.k) {
            return -1;
        }
        int n4 = this.available();
        if (n3 > n4) {
            this.b(n3 - n4);
        }
        int n5 = Math.min(n3, this.available());
        System.arraycopy(this.c, this.e, arrby, n2, n5);
        this.e += n5;
        if (this.e > this.f) {
            this.d();
        }
        return n5;
    }

    private void b(int n2) {
        if (this.i == 0) {
            this.k = true;
        }
        int n3 = Math.min(n2, this.i);
        while (n3 > 0) {
            int n4 = this.e();
            int n5 = 0;
            long l2 = 0L;
            switch (n4 & 3) {
                case 0: {
                    n5 = this.c(n4);
                    if (!this.d(n5)) break;
                    return;
                }
                case 1: {
                    n5 = 4 + (n4 >> 2 & 7);
                    l2 = (n4 & 0xE0) << 3;
                    if (!this.a(l2 |= (long)this.e(), n5)) break;
                    return;
                }
                case 2: {
                    n5 = (n4 >> 2) + 1;
                    l2 = this.e();
                    if (!this.a(l2 |= (long)(this.e() << 8), n5)) break;
                    return;
                }
                case 3: {
                    n5 = (n4 >> 2) + 1;
                    l2 = this.e();
                    l2 |= (long)(this.e() << 8);
                    l2 |= (long)(this.e() << 16);
                    if (!this.a(l2 |= (long)this.e() << 24, n5)) break;
                    return;
                }
            }
            n3 -= n5;
            this.i -= n5;
        }
    }

    private void d() {
        System.arraycopy(this.c, this.f, this.c, 0, this.f * 2);
        this.d -= this.f;
        this.e -= this.f;
    }

    private int c(int n2) {
        int n3;
        switch (n2 >> 2) {
            case 60: {
                n3 = this.e();
                break;
            }
            case 61: {
                n3 = this.e();
                n3 |= this.e() << 8;
                break;
            }
            case 62: {
                n3 = this.e();
                n3 |= this.e() << 8;
                n3 |= this.e() << 16;
                break;
            }
            case 63: {
                n3 = this.e();
                n3 |= this.e() << 8;
                n3 |= this.e() << 16;
                n3 = (int)((long)n3 | (long)this.e() << 24);
                break;
            }
            default: {
                n3 = n2 >> 2;
            }
        }
        return n3 + 1;
    }

    private boolean d(int n2) {
        int n3 = org.apache.commons.compress.c.i.a(this.g, this.c, this.d, n2);
        this.a(n3);
        if (n2 != n3) {
            throw new IOException("Premature end of stream");
        }
        this.d += n2;
        return this.d >= 2 * this.f;
    }

    private boolean a(long l2, int n2) {
        if (l2 > (long)this.f) {
            throw new IOException("Offset is larger than block size");
        }
        int n3 = (int)l2;
        if (n3 == 1) {
            byte by2 = this.c[this.d - 1];
            for (int i2 = 0; i2 < n2; ++i2) {
                this.c[this.d++] = by2;
            }
        } else if (n2 < n3) {
            System.arraycopy(this.c, this.d - n3, this.c, this.d, n2);
            this.d += n2;
        } else {
            int n4 = n2 / n3;
            int n5 = n2 - n3 * n4;
            while (n4-- != 0) {
                System.arraycopy(this.c, this.d - n3, this.c, this.d, n3);
                this.d += n3;
            }
            if (n5 > 0) {
                System.arraycopy(this.c, this.d - n3, this.c, this.d, n5);
                this.d += n5;
            }
        }
        return this.d >= 2 * this.f;
    }

    private int e() {
        int n2 = this.g.read();
        if (n2 == -1) {
            throw new IOException("Premature end of stream");
        }
        this.a(1);
        return n2 & 0xFF;
    }

    private long f() {
        int n2 = 0;
        long l2 = 0L;
        int n3 = 0;
        do {
            n3 = this.e();
            l2 |= (long)((n3 & 0x7F) << n2++ * 7);
        } while (0 != (n3 & 0x80));
        return l2;
    }

    public int a() {
        return this.h;
    }
}

