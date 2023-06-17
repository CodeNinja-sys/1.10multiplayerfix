/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.archivers.d.c;
import org.apache.commons.compress.archivers.d.i;
import org.apache.commons.compress.archivers.d.m;
import org.apache.commons.compress.archivers.d.o;
import org.apache.commons.compress.archivers.d.s;

class p
extends FilterInputStream {
    private byte[] a = new byte[1024];
    private int b = -1;
    private int c = 1024;
    private static final int d = 1024;
    private int e = 1024;
    private boolean f = false;
    private long g = 0L;

    public p(InputStream inputStream) {
        super(inputStream);
    }

    public void a(int n2, boolean bl2) {
        this.f = bl2;
        this.c = 1024 * n2;
        byte[] arrby = this.a;
        this.a = new byte[this.c];
        System.arraycopy(arrby, 0, this.a, 0, 1024);
        this.a(this.a, 1024, this.c - 1024);
        this.b = 0;
        this.e = 1024;
    }

    public int available() {
        if (this.e < this.c) {
            return this.c - this.e;
        }
        return this.in.available();
    }

    public int read() {
        throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
    }

    public int read(byte[] arrby, int n2, int n3) {
        if (n3 % 1024 != 0) {
            throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
        }
        int n4 = 0;
        while (n4 < n3) {
            if (this.e == this.c && !this.a(true)) {
                return -1;
            }
            int n5 = 0;
            n5 = this.e + (n3 - n4) <= this.c ? n3 - n4 : this.c - this.e;
            System.arraycopy(this.a, this.e, arrby, n2, n5);
            this.e += n5;
            n4 += n5;
            n2 += n5;
        }
        return n4;
    }

    public long skip(long l2) {
        long l3;
        long l4;
        if (l2 % 1024L != 0L) {
            throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
        }
        for (l3 = 0L; l3 < l2; l3 += l4) {
            if (this.e == this.c && !this.a(l2 - l3 < (long)this.c)) {
                return -1L;
            }
            l4 = 0L;
            l4 = (long)this.e + (l2 - l3) <= (long)this.c ? l2 - l3 : (long)(this.c - this.e);
            this.e = (int)((long)this.e + l4);
        }
        return l3;
    }

    public void close() {
        if (this.in != null && this.in != System.in) {
            this.in.close();
        }
    }

    public byte[] a() {
        if (this.e == this.c && !this.a(true)) {
            return null;
        }
        byte[] arrby = new byte[1024];
        System.arraycopy(this.a, this.e, arrby, 0, arrby.length);
        return arrby;
    }

    public byte[] b() {
        byte[] arrby = new byte[1024];
        if (-1 == this.read(arrby, 0, arrby.length)) {
            throw new o();
        }
        return arrby;
    }

    private boolean a(boolean bl2) {
        boolean bl3 = true;
        if (this.in == null) {
            throw new IOException("input buffer is closed");
        }
        if (!this.f || this.b == -1) {
            bl3 = this.a(this.a, 0, this.c);
            this.g += (long)this.c;
        } else {
            boolean bl4;
            if (!this.a(this.a, 0, 4)) {
                return false;
            }
            this.g += 4L;
            int n2 = m.b(this.a, 0);
            boolean bl5 = bl4 = (n2 & 1) == 1;
            if (!bl4) {
                bl3 = this.a(this.a, 0, this.c);
                this.g += (long)this.c;
            } else {
                int n3 = n2 >> 1 & 7;
                int n4 = n2 >> 4 & 0xFFFFFFF;
                byte[] arrby = new byte[n4];
                bl3 = this.a(arrby, 0, n4);
                this.g += (long)n4;
                if (!bl2) {
                    Arrays.fill(this.a, (byte)0);
                } else {
                    switch (org.apache.commons.compress.archivers.d.c.a(n3 & 3)) {
                        case a: {
                            try {
                                Inflater inflater = new Inflater();
                                inflater.setInput(arrby, 0, arrby.length);
                                n4 = inflater.inflate(this.a);
                                if (n4 != this.c) {
                                    throw new o();
                                }
                                inflater.end();
                                break;
                            }
                            catch (DataFormatException dataFormatException) {
                                throw new i("bad data", dataFormatException);
                            }
                        }
                        case b: {
                            throw new s("BZLIB2");
                        }
                        case c: {
                            throw new s("LZO");
                        }
                        default: {
                            throw new s();
                        }
                    }
                }
            }
        }
        ++this.b;
        this.e = 0;
        return bl3;
    }

    private boolean a(byte[] arrby, int n2, int n3) {
        int n4 = org.apache.commons.compress.c.i.a(this.in, arrby, n2, n3);
        if (n4 < n3) {
            throw new o();
        }
        return true;
    }

    public long c() {
        return this.g;
    }
}

