/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import org.apache.a.i.a.o;
import org.apache.a.i.a.p;
import org.apache.a.i.a.s;

public class q {
    protected final String a;
    protected final String b;
    protected final String c;
    protected final byte[] d;
    protected final String e;
    protected final byte[] f;
    protected byte[] g;
    protected byte[] h;
    protected byte[] i;
    protected byte[] j;
    protected byte[] k = null;
    protected byte[] l = null;
    protected byte[] m = null;
    protected byte[] n = null;
    protected byte[] o = null;
    protected byte[] p = null;
    protected byte[] q = null;
    protected byte[] r = null;
    protected byte[] s = null;
    protected byte[] t = null;
    protected byte[] u = null;
    protected byte[] v = null;
    protected byte[] w = null;
    protected byte[] x = null;
    protected byte[] y = null;
    protected byte[] z = null;

    public q(String string, String string2, String string3, byte[] arrby, String string4, byte[] arrby2, byte[] arrby3, byte[] arrby4, byte[] arrby5, byte[] arrby6) {
        this.a = string;
        this.e = string4;
        this.b = string2;
        this.c = string3;
        this.d = arrby;
        this.f = arrby2;
        this.g = arrby3;
        this.h = arrby4;
        this.i = arrby5;
        this.j = arrby6;
    }

    public q(String string, String string2, String string3, byte[] arrby, String string4, byte[] arrby2) {
        this(string, string2, string3, arrby, string4, arrby2, null, null, null, null);
    }

    public byte[] a() {
        if (this.g == null) {
            this.g = org.apache.a.i.a.p.b();
        }
        return this.g;
    }

    public byte[] b() {
        if (this.h == null) {
            this.h = org.apache.a.i.a.p.b();
        }
        return this.h;
    }

    public byte[] c() {
        if (this.i == null) {
            this.i = org.apache.a.i.a.p.c();
        }
        return this.i;
    }

    public byte[] d() {
        if (this.k == null) {
            this.k = org.apache.a.i.a.p.b(this.c);
        }
        return this.k;
    }

    public byte[] e() {
        if (this.l == null) {
            this.l = org.apache.a.i.a.p.c(this.d(), this.d);
        }
        return this.l;
    }

    public byte[] f() {
        if (this.m == null) {
            this.m = org.apache.a.i.a.p.c(this.c);
        }
        return this.m;
    }

    public byte[] g() {
        if (this.n == null) {
            this.n = org.apache.a.i.a.p.c(this.f(), this.d);
        }
        return this.n;
    }

    public byte[] h() {
        if (this.p == null) {
            this.p = org.apache.a.i.a.p.a(this.a, this.b, this.f());
        }
        return this.p;
    }

    public byte[] i() {
        if (this.o == null) {
            this.o = org.apache.a.i.a.p.b(this.a, this.b, this.f());
        }
        return this.o;
    }

    public byte[] j() {
        if (this.j == null) {
            long l2 = System.currentTimeMillis();
            l2 += 11644473600000L;
            l2 *= 10000L;
            this.j = new byte[8];
            for (int i2 = 0; i2 < 8; ++i2) {
                this.j[i2] = (byte)l2;
                l2 >>>= 8;
            }
        }
        return this.j;
    }

    public byte[] k() {
        if (this.r == null) {
            this.r = org.apache.a.i.a.p.b(this.b(), this.f, this.j());
        }
        return this.r;
    }

    public byte[] l() {
        if (this.s == null) {
            this.s = org.apache.a.i.a.p.c(this.i(), this.d, this.k());
        }
        return this.s;
    }

    public byte[] m() {
        if (this.q == null) {
            this.q = org.apache.a.i.a.p.c(this.h(), this.d, this.a());
        }
        return this.q;
    }

    public byte[] n() {
        if (this.t == null) {
            this.t = org.apache.a.i.a.p.a(this.f(), this.d, this.a());
        }
        return this.t;
    }

    public byte[] o() {
        if (this.u == null) {
            byte[] arrby = this.a();
            this.u = new byte[24];
            System.arraycopy(arrby, 0, this.u, 0, arrby.length);
            Arrays.fill(this.u, arrby.length, this.u.length, (byte)0);
        }
        return this.u;
    }

    public byte[] p() {
        if (this.v == null) {
            byte[] arrby = this.d();
            this.v = new byte[16];
            System.arraycopy(arrby, 0, this.v, 0, 8);
            Arrays.fill(this.v, 8, 16, (byte)0);
        }
        return this.v;
    }

    public byte[] q() {
        if (this.w == null) {
            byte[] arrby = this.f();
            s s2 = new s();
            s2.a(arrby);
            this.w = s2.a();
        }
        return this.w;
    }

    public byte[] r() {
        if (this.x == null) {
            byte[] arrby = this.i();
            byte[] arrby2 = new byte[16];
            System.arraycopy(this.l(), 0, arrby2, 0, 16);
            this.x = org.apache.a.i.a.p.a(arrby2, arrby);
        }
        return this.x;
    }

    public byte[] s() {
        if (this.y == null) {
            byte[] arrby = this.q();
            byte[] arrby2 = this.o();
            byte[] arrby3 = new byte[this.d.length + arrby2.length];
            System.arraycopy(this.d, 0, arrby3, 0, this.d.length);
            System.arraycopy(arrby2, 0, arrby3, this.d.length, arrby2.length);
            this.y = org.apache.a.i.a.p.a(arrby3, arrby);
        }
        return this.y;
    }

    public byte[] t() {
        if (this.z == null) {
            byte[] arrby = this.d();
            byte[] arrby2 = this.e();
            try {
                byte[] arrby3 = new byte[14];
                System.arraycopy(arrby, 0, arrby3, 0, 8);
                Arrays.fill(arrby3, 8, arrby3.length, (byte)-67);
                Key key = org.apache.a.i.a.p.a(arrby3, 0);
                Key key2 = org.apache.a.i.a.p.a(arrby3, 7);
                byte[] arrby4 = new byte[8];
                System.arraycopy(arrby2, 0, arrby4, 0, arrby4.length);
                Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                cipher.init(1, key);
                byte[] arrby5 = cipher.doFinal(arrby4);
                cipher = Cipher.getInstance("DES/ECB/NoPadding");
                cipher.init(1, key2);
                byte[] arrby6 = cipher.doFinal(arrby4);
                this.z = new byte[16];
                System.arraycopy(arrby5, 0, this.z, 0, arrby5.length);
                System.arraycopy(arrby6, 0, this.z, arrby5.length, arrby6.length);
            }
            catch (Exception exception) {
                throw new o(exception.getMessage(), exception);
            }
        }
        return this.z;
    }
}

