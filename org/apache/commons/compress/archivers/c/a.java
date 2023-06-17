/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.c;

import java.io.File;
import java.util.Date;
import org.apache.commons.compress.archivers.c.d;
import org.apache.commons.compress.archivers.c.e;

public class a
implements org.apache.commons.compress.archivers.a,
d {
    private final short H;
    private final int I;
    private final int J;
    private long K = 0L;
    private long L = 0L;
    private long M = 0L;
    private long N = 0L;
    private long O = 0L;
    private long P = 0L;
    private long Q = 0L;
    private long R = 0L;
    private String S;
    private long T = 0L;
    private long U = 0L;
    private long V = 0L;
    private long W = 0L;

    public a(short s2) {
        switch (s2) {
            case 1: {
                this.I = 110;
                this.J = 4;
                break;
            }
            case 2: {
                this.I = 110;
                this.J = 4;
                break;
            }
            case 4: {
                this.I = 76;
                this.J = 0;
                break;
            }
            case 8: {
                this.I = 26;
                this.J = 2;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown header type");
            }
        }
        this.H = s2;
    }

    public a(String string) {
        this(1, string);
    }

    public a(short s2, String string) {
        this(s2);
        this.S = string;
    }

    public a(String string, long l2) {
        this(string);
        this.e(l2);
    }

    public a(short s2, String string, long l2) {
        this(s2, string);
        this.e(l2);
    }

    public a(File file, String string) {
        this(1, file, string);
    }

    public a(short s2, File file, String string) {
        this(s2, string, file.isFile() ? file.length() : 0L);
        if (file.isDirectory()) {
            this.h(16384L);
        } else if (file.isFile()) {
            this.h(32768L);
        } else {
            throw new IllegalArgumentException("Cannot determine type of file " + file.getName());
        }
        this.m(file.lastModified() / 1000L);
    }

    private void A() {
        if ((this.H & 3) == 0) {
            throw new UnsupportedOperationException();
        }
    }

    private void B() {
        if ((this.H & 0xC) == 0) {
            throw new UnsupportedOperationException();
        }
    }

    public long b() {
        this.A();
        return this.K;
    }

    public long c() {
        this.B();
        return this.P;
    }

    public long d() {
        this.A();
        return this.O;
    }

    public long e() {
        this.A();
        return this.P;
    }

    public long getSize() {
        return this.L;
    }

    public short f() {
        return this.H;
    }

    public long g() {
        return this.M;
    }

    public int h() {
        return this.I;
    }

    public int i() {
        return this.J;
    }

    public int j() {
        int n2;
        if (this.J == 0) {
            return 0;
        }
        int n3 = this.I + 1;
        if (this.S != null) {
            n3 += this.S.length();
        }
        if ((n2 = n3 % this.J) > 0) {
            return this.J - n2;
        }
        return 0;
    }

    public int k() {
        if (this.J == 0) {
            return 0;
        }
        long l2 = this.L;
        int n2 = (int)(l2 % (long)this.J);
        if (n2 > 0) {
            return this.J - n2;
        }
        return 0;
    }

    public long l() {
        return this.N;
    }

    public long m() {
        return this.Q == 0L && !"TRAILER!!!".equals(this.S) ? 32768L : this.Q;
    }

    public String getName() {
        return this.S;
    }

    public long n() {
        return this.T == 0L ? (this.isDirectory() ? 2L : 1L) : this.T;
    }

    public long o() {
        this.B();
        return this.V;
    }

    public long p() {
        this.A();
        return this.U;
    }

    public long q() {
        this.A();
        return this.V;
    }

    public long r() {
        return this.R;
    }

    public Date a() {
        return new Date(1000L * this.r());
    }

    public long s() {
        return this.W;
    }

    public boolean t() {
        return e.a(this.Q) == 24576L;
    }

    public boolean u() {
        return e.a(this.Q) == 8192L;
    }

    public boolean isDirectory() {
        return e.a(this.Q) == 16384L;
    }

    public boolean v() {
        return e.a(this.Q) == 36864L;
    }

    public boolean w() {
        return e.a(this.Q) == 4096L;
    }

    public boolean x() {
        return e.a(this.Q) == 32768L;
    }

    public boolean y() {
        return e.a(this.Q) == 49152L;
    }

    public boolean z() {
        return e.a(this.Q) == 40960L;
    }

    public void a(long l2) {
        this.A();
        this.K = l2;
    }

    public void b(long l2) {
        this.B();
        this.P = l2;
    }

    public void c(long l2) {
        this.A();
        this.O = l2;
    }

    public void d(long l2) {
        this.A();
        this.P = l2;
    }

    public void e(long l2) {
        if (l2 < 0L || l2 > 0xFFFFFFFFL) {
            throw new IllegalArgumentException("invalid entry size <" + l2 + ">");
        }
        this.L = l2;
    }

    public void f(long l2) {
        this.M = l2;
    }

    public void g(long l2) {
        this.N = l2;
    }

    public void h(long l2) {
        long l3 = l2 & 0xF000L;
        switch ((int)l3) {
            case 4096: 
            case 8192: 
            case 16384: 
            case 24576: 
            case 32768: 
            case 36864: 
            case 40960: 
            case 49152: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown mode. Full: " + Long.toHexString(l2) + " Masked: " + Long.toHexString(l3));
            }
        }
        this.Q = l2;
    }

    public void a(String string) {
        this.S = string;
    }

    public void i(long l2) {
        this.T = l2;
    }

    public void j(long l2) {
        this.B();
        this.V = l2;
    }

    public void k(long l2) {
        this.A();
        this.U = l2;
    }

    public void l(long l2) {
        this.A();
        this.V = l2;
    }

    public void m(long l2) {
        this.R = l2;
    }

    public void n(long l2) {
        this.W = l2;
    }

    public int hashCode() {
        int n2 = 31;
        int n3 = 1;
        n3 = 31 * n3 + (this.S == null ? 0 : this.S.hashCode());
        return n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        a a2 = (a)object;
        return !(this.S == null ? a2.S != null : !this.S.equals(a2.S));
    }
}

