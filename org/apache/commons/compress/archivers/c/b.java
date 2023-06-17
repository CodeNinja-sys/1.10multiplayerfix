/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.c.d;
import org.apache.commons.compress.archivers.c.e;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.c.i;

public class b
extends c
implements d {
    private boolean H = false;
    private org.apache.commons.compress.archivers.c.a I;
    private long J = 0L;
    private boolean K = false;
    private final byte[] L = new byte[4096];
    private long M = 0L;
    private final InputStream N;
    private final byte[] O = new byte[2];
    private final byte[] P = new byte[4];
    private final byte[] Q = new byte[6];
    private final int R;
    private final am S;

    public b(InputStream inputStream) {
        this(inputStream, 512, "US-ASCII");
    }

    public b(InputStream inputStream, String string) {
        this(inputStream, 512, string);
    }

    public b(InputStream inputStream, int n2) {
        this(inputStream, n2, "US-ASCII");
    }

    public b(InputStream inputStream, int n2, String string) {
        this.N = inputStream;
        this.R = n2;
        this.S = an.a(string);
    }

    public int available() {
        this.f();
        if (this.K) {
            return 0;
        }
        return 1;
    }

    public void close() {
        if (!this.H) {
            this.N.close();
            this.H = true;
        }
    }

    private void e() {
        while (this.skip(Integer.MAX_VALUE) == Integer.MAX_VALUE) {
        }
    }

    private void f() {
        if (this.H) {
            throw new IOException("Stream closed");
        }
    }

    public org.apache.commons.compress.archivers.c.a d() {
        this.f();
        if (this.I != null) {
            this.e();
        }
        this.a(this.O, 0, this.O.length);
        if (e.a(this.O, false) == 29127L) {
            this.I = this.b(false);
        } else if (e.a(this.O, true) == 29127L) {
            this.I = this.b(true);
        } else {
            System.arraycopy(this.O, 0, this.Q, 0, this.O.length);
            this.a(this.Q, this.O.length, this.P.length);
            String string = org.apache.commons.compress.c.a.a(this.Q);
            if (string.equals("070701")) {
                this.I = this.a(false);
            } else if (string.equals("070702")) {
                this.I = this.a(true);
            } else if (string.equals("070707")) {
                this.I = this.g();
            } else {
                throw new IOException("Unknown magic [" + string + "]. Occured at byte: " + this.c());
            }
        }
        this.J = 0L;
        this.K = false;
        this.M = 0L;
        if (this.I.getName().equals("TRAILER!!!")) {
            this.K = true;
            this.h();
            return null;
        }
        return this.I;
    }

    private void b(int n2) {
        if (n2 > 0) {
            this.a(this.P, 0, n2);
        }
    }

    public int read(byte[] arrby, int n2, int n3) {
        this.f();
        if (n2 < 0 || n3 < 0 || n2 > arrby.length - n3) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return 0;
        }
        if (this.I == null || this.K) {
            return -1;
        }
        if (this.J == this.I.getSize()) {
            this.b(this.I.k());
            this.K = true;
            if (this.I.f() == 2 && this.M != this.I.b()) {
                throw new IOException("CRC Error. Occured at byte: " + this.c());
            }
            return -1;
        }
        int n4 = (int)Math.min((long)n3, this.I.getSize() - this.J);
        if (n4 < 0) {
            return -1;
        }
        int n5 = this.a(arrby, n2, n4);
        if (this.I.f() == 2) {
            for (int i2 = 0; i2 < n5; ++i2) {
                this.M += (long)(arrby[i2] & 0xFF);
            }
        }
        this.J += (long)n5;
        return n5;
    }

    private final int a(byte[] arrby, int n2, int n3) {
        int n4 = i.a(this.N, arrby, n2, n3);
        this.a(n4);
        if (n4 < n3) {
            throw new EOFException();
        }
        return n4;
    }

    private long a(int n2, boolean bl2) {
        byte[] arrby = new byte[n2];
        this.a(arrby, 0, arrby.length);
        return e.a(arrby, bl2);
    }

    private long a(int n2, int n3) {
        byte[] arrby = new byte[n2];
        this.a(arrby, 0, arrby.length);
        return Long.parseLong(org.apache.commons.compress.c.a.a(arrby), n3);
    }

    private org.apache.commons.compress.archivers.c.a a(boolean bl2) {
        org.apache.commons.compress.archivers.c.a a2 = bl2 ? new org.apache.commons.compress.archivers.c.a(2) : new org.apache.commons.compress.archivers.c.a(1);
        a2.g(this.a(8, 16));
        long l2 = this.a(8, 16);
        if (e.a(l2) != 0L) {
            a2.h(l2);
        }
        a2.n(this.a(8, 16));
        a2.f(this.a(8, 16));
        a2.i(this.a(8, 16));
        a2.m(this.a(8, 16));
        a2.e(this.a(8, 16));
        a2.c(this.a(8, 16));
        a2.d(this.a(8, 16));
        a2.k(this.a(8, 16));
        a2.l(this.a(8, 16));
        long l3 = this.a(8, 16);
        a2.a(this.a(8, 16));
        String string = this.c((int)l3);
        a2.a(string);
        if (e.a(l2) == 0L && !string.equals("TRAILER!!!")) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry name: " + string + " Occured at byte: " + this.c());
        }
        this.b(a2.j());
        return a2;
    }

    private org.apache.commons.compress.archivers.c.a g() {
        org.apache.commons.compress.archivers.c.a a2 = new org.apache.commons.compress.archivers.c.a(4);
        a2.b(this.a(6, 8));
        a2.g(this.a(6, 8));
        long l2 = this.a(6, 8);
        if (e.a(l2) != 0L) {
            a2.h(l2);
        }
        a2.n(this.a(6, 8));
        a2.f(this.a(6, 8));
        a2.i(this.a(6, 8));
        a2.j(this.a(6, 8));
        a2.m(this.a(11, 8));
        long l3 = this.a(6, 8);
        a2.e(this.a(11, 8));
        String string = this.c((int)l3);
        a2.a(string);
        if (e.a(l2) == 0L && !string.equals("TRAILER!!!")) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry: " + string + " Occured at byte: " + this.c());
        }
        return a2;
    }

    private org.apache.commons.compress.archivers.c.a b(boolean bl2) {
        org.apache.commons.compress.archivers.c.a a2 = new org.apache.commons.compress.archivers.c.a(8);
        a2.b(this.a(2, bl2));
        a2.g(this.a(2, bl2));
        long l2 = this.a(2, bl2);
        if (e.a(l2) != 0L) {
            a2.h(l2);
        }
        a2.n(this.a(2, bl2));
        a2.f(this.a(2, bl2));
        a2.i(this.a(2, bl2));
        a2.j(this.a(2, bl2));
        a2.m(this.a(4, bl2));
        long l3 = this.a(2, bl2);
        a2.e(this.a(4, bl2));
        String string = this.c((int)l3);
        a2.a(string);
        if (e.a(l2) == 0L && !string.equals("TRAILER!!!")) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry: " + string + "Occured at byte: " + this.c());
        }
        this.b(a2.j());
        return a2;
    }

    private String c(int n2) {
        byte[] arrby = new byte[n2 - 1];
        this.a(arrby, 0, arrby.length);
        this.N.read();
        return this.S.a(arrby);
    }

    public long skip(long l2) {
        int n2;
        int n3;
        if (l2 < 0L) {
            throw new IllegalArgumentException("negative skip length");
        }
        this.f();
        int n4 = (int)Math.min(l2, Integer.MAX_VALUE);
        for (n2 = 0; n2 < n4; n2 += n3) {
            n3 = n4 - n2;
            if (n3 > this.L.length) {
                n3 = this.L.length;
            }
            if ((n3 = this.read(this.L, 0, n3)) != -1) continue;
            this.K = true;
            break;
        }
        return n2;
    }

    public a a() {
        return this.d();
    }

    private void h() {
        long l2;
        long l3;
        long l4 = this.c() % (long)this.R;
        long l5 = l3 = l4 == 0L ? 0L : (long)this.R - l4;
        while (l3 > 0L && (l2 = this.skip((long)this.R - l4)) > 0L) {
            l3 -= l2;
        }
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < 6) {
            return false;
        }
        if (arrby[0] == 113 && (arrby[1] & 0xFF) == 199) {
            return true;
        }
        if (arrby[1] == 113 && (arrby[0] & 0xFF) == 199) {
            return true;
        }
        if (arrby[0] != 48) {
            return false;
        }
        if (arrby[1] != 55) {
            return false;
        }
        if (arrby[2] != 48) {
            return false;
        }
        if (arrby[3] != 55) {
            return false;
        }
        if (arrby[4] != 48) {
            return false;
        }
        if (arrby[5] == 49) {
            return true;
        }
        if (arrby[5] == 50) {
            return true;
        }
        return arrby[5] == 55;
    }
}

