/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.c;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c.e;
import org.apache.commons.compress.archivers.d;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;

public class c
extends d
implements org.apache.commons.compress.archivers.c.d {
    private org.apache.commons.compress.archivers.c.a H;
    private boolean I = false;
    private boolean J;
    private final short K;
    private final HashMap L = new HashMap();
    private long M = 0L;
    private long N;
    private final OutputStream O;
    private final int P;
    private long Q = 1L;
    private final am R;

    public c(OutputStream outputStream, short s2) {
        this(outputStream, s2, 512, "US-ASCII");
    }

    public c(OutputStream outputStream, short s2, int n2) {
        this(outputStream, s2, n2, "US-ASCII");
    }

    public c(OutputStream outputStream, short s2, int n2, String string) {
        this.O = outputStream;
        switch (s2) {
            case 1: 
            case 2: 
            case 4: 
            case 8: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown format: " + s2);
            }
        }
        this.K = s2;
        this.P = n2;
        this.R = an.a(string);
    }

    public c(OutputStream outputStream) {
        this(outputStream, 1);
    }

    public c(OutputStream outputStream, String string) {
        this(outputStream, 1, 512, string);
    }

    private void e() {
        if (this.I) {
            throw new IOException("Stream closed");
        }
    }

    public void a(a a2) {
        short s2;
        if (this.J) {
            throw new IOException("Stream has already been finished");
        }
        org.apache.commons.compress.archivers.c.a a3 = (org.apache.commons.compress.archivers.c.a)a2;
        this.e();
        if (this.H != null) {
            this.a();
        }
        if (a3.r() == -1L) {
            a3.m(System.currentTimeMillis() / 1000L);
        }
        if ((s2 = a3.f()) != this.K) {
            throw new IOException("Header format: " + s2 + " does not match existing format: " + this.K);
        }
        if (this.L.put(a3.getName(), a3) != null) {
            throw new IOException("duplicate entry: " + a3.getName());
        }
        this.a(a3);
        this.H = a3;
        this.N = 0L;
    }

    private void a(org.apache.commons.compress.archivers.c.a a2) {
        switch (a2.f()) {
            case 1: {
                this.O.write(org.apache.commons.compress.c.a.a("070701"));
                this.a(6);
                this.b(a2);
                break;
            }
            case 2: {
                this.O.write(org.apache.commons.compress.c.a.a("070702"));
                this.a(6);
                this.b(a2);
                break;
            }
            case 4: {
                this.O.write(org.apache.commons.compress.c.a.a("070707"));
                this.a(6);
                this.c(a2);
                break;
            }
            case 8: {
                boolean bl2 = true;
                this.a(29127L, 2, bl2);
                this.a(a2, bl2);
                break;
            }
            default: {
                throw new IOException("unknown format " + a2.f());
            }
        }
    }

    private void b(org.apache.commons.compress.archivers.c.a a2) {
        long l2 = a2.l();
        long l3 = a2.e();
        if ("TRAILER!!!".equals(a2.getName())) {
            l3 = 0L;
            l2 = 0L;
        } else if (l2 == 0L && l3 == 0L) {
            l2 = this.Q & 0xFFFFFFFFFFFFFFFFL;
            l3 = this.Q++ >> 32 & 0xFFFFFFFFFFFFFFFFL;
        } else {
            this.Q = Math.max(this.Q, l2 + 0x100000000L * l3) + 1L;
        }
        this.a(l2, 8, 16);
        this.a(a2.m(), 8, 16);
        this.a(a2.s(), 8, 16);
        this.a(a2.g(), 8, 16);
        this.a(a2.n(), 8, 16);
        this.a(a2.r(), 8, 16);
        this.a(a2.getSize(), 8, 16);
        this.a(a2.d(), 8, 16);
        this.a(l3, 8, 16);
        this.a(a2.p(), 8, 16);
        this.a(a2.q(), 8, 16);
        this.a((long)(a2.getName().length() + 1), 8, 16);
        this.a(a2.b(), 8, 16);
        this.a(a2.getName());
        this.b(a2.j());
    }

    private void c(org.apache.commons.compress.archivers.c.a a2) {
        long l2 = a2.l();
        long l3 = a2.c();
        if ("TRAILER!!!".equals(a2.getName())) {
            l3 = 0L;
            l2 = 0L;
        } else if (l2 == 0L && l3 == 0L) {
            l2 = this.Q & 0x3FFFFL;
            l3 = this.Q++ >> 18 & 0x3FFFFL;
        } else {
            this.Q = Math.max(this.Q, l2 + 262144L * l3) + 1L;
        }
        this.a(l3, 6, 8);
        this.a(l2, 6, 8);
        this.a(a2.m(), 6, 8);
        this.a(a2.s(), 6, 8);
        this.a(a2.g(), 6, 8);
        this.a(a2.n(), 6, 8);
        this.a(a2.o(), 6, 8);
        this.a(a2.r(), 11, 8);
        this.a((long)(a2.getName().length() + 1), 6, 8);
        this.a(a2.getSize(), 11, 8);
        this.a(a2.getName());
    }

    private void a(org.apache.commons.compress.archivers.c.a a2, boolean bl2) {
        long l2 = a2.l();
        long l3 = a2.c();
        if ("TRAILER!!!".equals(a2.getName())) {
            l3 = 0L;
            l2 = 0L;
        } else if (l2 == 0L && l3 == 0L) {
            l2 = this.Q & 0xFFFFL;
            l3 = this.Q++ >> 16 & 0xFFFFL;
        } else {
            this.Q = Math.max(this.Q, l2 + 65536L * l3) + 1L;
        }
        this.a(l3, 2, bl2);
        this.a(l2, 2, bl2);
        this.a(a2.m(), 2, bl2);
        this.a(a2.s(), 2, bl2);
        this.a(a2.g(), 2, bl2);
        this.a(a2.n(), 2, bl2);
        this.a(a2.o(), 2, bl2);
        this.a(a2.r(), 4, bl2);
        this.a((long)(a2.getName().length() + 1), 2, bl2);
        this.a(a2.getSize(), 4, bl2);
        this.a(a2.getName());
        this.b(a2.j());
    }

    public void a() {
        if (this.J) {
            throw new IOException("Stream has already been finished");
        }
        this.e();
        if (this.H == null) {
            throw new IOException("Trying to close non-existent entry");
        }
        if (this.H.getSize() != this.N) {
            throw new IOException("invalid entry size (expected " + this.H.getSize() + " but got " + this.N + " bytes)");
        }
        this.b(this.H.k());
        if (this.H.f() == 2 && this.M != this.H.b()) {
            throw new IOException("CRC Error");
        }
        this.H = null;
        this.M = 0L;
        this.N = 0L;
    }

    public void write(byte[] arrby, int n2, int n3) {
        this.e();
        if (n2 < 0 || n3 < 0 || n2 > arrby.length - n3) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return;
        }
        if (this.H == null) {
            throw new IOException("no current CPIO entry");
        }
        if (this.N + (long)n3 > this.H.getSize()) {
            throw new IOException("attempt to write past end of STORED entry");
        }
        this.O.write(arrby, n2, n3);
        this.N += (long)n3;
        if (this.H.f() == 2) {
            for (int i2 = 0; i2 < n3; ++i2) {
                this.M += (long)(arrby[i2] & 0xFF);
            }
        }
        this.a(n3);
    }

    public void b() {
        this.e();
        if (this.J) {
            throw new IOException("This archive has already been finished");
        }
        if (this.H != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        this.H = new org.apache.commons.compress.archivers.c.a(this.K);
        this.H.a("TRAILER!!!");
        this.H.i(1L);
        this.a(this.H);
        this.a();
        int n2 = (int)(this.d() % (long)this.P);
        if (n2 != 0) {
            this.b(this.P - n2);
        }
        this.J = true;
    }

    public void close() {
        if (!this.J) {
            this.b();
        }
        if (!this.I) {
            this.O.close();
            this.I = true;
        }
    }

    private void b(int n2) {
        if (n2 > 0) {
            byte[] arrby = new byte[n2];
            this.O.write(arrby);
            this.a(n2);
        }
    }

    private void a(long l2, int n2, boolean bl2) {
        byte[] arrby = e.a(l2, n2, bl2);
        this.O.write(arrby);
        this.a(arrby.length);
    }

    private void a(long l2, int n2, int n3) {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        if (n3 == 16) {
            stringBuilder.append(Long.toHexString(l2));
        } else if (n3 == 8) {
            stringBuilder.append(Long.toOctalString(l2));
        } else {
            stringBuilder.append(Long.toString(l2));
        }
        if (stringBuilder.length() <= n2) {
            long l3 = n2 - stringBuilder.length();
            int n4 = 0;
            while ((long)n4 < l3) {
                stringBuilder.insert(0, "0");
                ++n4;
            }
            string = stringBuilder.toString();
        } else {
            string = stringBuilder.substring(stringBuilder.length() - n2);
        }
        byte[] arrby = org.apache.commons.compress.c.a.a(string);
        this.O.write(arrby);
        this.a(arrby.length);
    }

    private void a(String string) {
        ByteBuffer byteBuffer = this.R.b(string);
        int n2 = byteBuffer.limit() - byteBuffer.position();
        this.O.write(byteBuffer.array(), byteBuffer.arrayOffset(), n2);
        this.O.write(0);
        this.a(n2 + 1);
    }

    public a a(File file, String string) {
        if (this.J) {
            throw new IOException("Stream has already been finished");
        }
        return new org.apache.commons.compress.archivers.c.a(file, string);
    }
}

