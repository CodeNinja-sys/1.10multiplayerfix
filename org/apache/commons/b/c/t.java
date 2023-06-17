/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import org.apache.commons.b.c.r;
import org.apache.commons.b.c.s;

class t {
    private final long b;
    private final byte[] c;
    private byte[] d;
    private int e;
    final /* synthetic */ r a;

    private t(r r2, long l2, int n2, byte[] arrby) {
        this.a = r2;
        this.b = l2;
        int n3 = n2 + (arrby != null ? arrby.length : 0);
        this.c = new byte[n3];
        long l3 = (l2 - 1L) * (long)r.a(r2);
        if (l2 > 0L) {
            r.b(r2).seek(l3);
            int n4 = r.b(r2).read(this.c, 0, n2);
            if (n4 != n2) {
                throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
            }
        }
        if (arrby != null) {
            System.arraycopy(arrby, 0, this.c, n2, arrby.length);
        }
        this.e = this.c.length - 1;
        this.d = null;
    }

    private t a() {
        if (this.e > -1) {
            throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.e);
        }
        if (this.b > 1L) {
            return new t(this.a, this.b - 1L, r.a(this.a), this.d);
        }
        if (this.d != null) {
            throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.d, r.c(this.a)));
        }
        return null;
    }

    private String b() {
        String string = null;
        boolean bl2 = this.b == 1L;
        int n2 = this.e;
        while (n2 > -1) {
            if (!bl2 && n2 < r.d(this.a)) {
                this.c();
                break;
            }
            int n3 = this.a(this.c, n2);
            if (n3 > 0) {
                int n4 = n2 + 1;
                int n5 = this.e - n4 + 1;
                if (n5 < 0) {
                    throw new IllegalStateException("Unexpected negative line length=" + n5);
                }
                byte[] arrby = new byte[n5];
                System.arraycopy(this.c, n4, arrby, 0, n5);
                string = new String(arrby, r.c(this.a));
                this.e = n2 - n3;
                break;
            }
            if ((n2 -= r.e(this.a)) >= 0) continue;
            this.c();
            break;
        }
        if (bl2 && this.d != null) {
            string = new String(this.d, r.c(this.a));
            this.d = null;
        }
        return string;
    }

    private void c() {
        int n2 = this.e + 1;
        if (n2 > 0) {
            this.d = new byte[n2];
            System.arraycopy(this.c, 0, this.d, 0, n2);
        } else {
            this.d = null;
        }
        this.e = -1;
    }

    private int a(byte[] arrby, int n2) {
        for (byte[] arrby2 : r.f(this.a)) {
            boolean bl2 = true;
            for (int i2 = arrby2.length - 1; i2 >= 0; --i2) {
                int n3 = n2 + i2 - (arrby2.length - 1);
                bl2 &= n3 >= 0 && arrby[n3] == arrby2[i2];
            }
            if (!bl2) continue;
            return arrby2.length;
        }
        return 0;
    }

    /* synthetic */ t(r r2, long l2, int n2, byte[] arrby, s s2) {
        this(r2, l2, n2, arrby);
    }

    static /* synthetic */ String a(t t2) {
        return t2.b();
    }

    static /* synthetic */ t b(t t2) {
        return t2.a();
    }
}

