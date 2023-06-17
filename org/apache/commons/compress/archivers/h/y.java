/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.al;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.ba;

public class y
implements ap {
    static final ba a = new ba(1);
    private static final String b = "Zip64 extended information must contain both size values in the local file header.";
    private static final byte[] c = new byte[0];
    private al d;
    private al e;
    private al f;
    private ay g;
    private byte[] h;

    public y() {
    }

    public y(al al2, al al3) {
        this(al2, al3, null, null);
    }

    public y(al al2, al al3, al al4, ay ay2) {
        this.d = al2;
        this.e = al3;
        this.f = al4;
        this.g = ay2;
    }

    public ba cI_() {
        return a;
    }

    public ba f() {
        return new ba(this.d != null ? 16 : 0);
    }

    public ba d() {
        return new ba((this.d != null ? 8 : 0) + (this.e != null ? 8 : 0) + (this.f != null ? 8 : 0) + (this.g != null ? 4 : 0));
    }

    public byte[] e() {
        if (this.d != null || this.e != null) {
            if (this.d == null || this.e == null) {
                throw new IllegalArgumentException(b);
            }
            byte[] arrby = new byte[16];
            this.a(arrby);
            return arrby;
        }
        return c;
    }

    public byte[] c() {
        byte[] arrby = new byte[this.d().b()];
        int n2 = this.a(arrby);
        if (this.f != null) {
            System.arraycopy(this.f.a(), 0, arrby, n2, 8);
            n2 += 8;
        }
        if (this.g != null) {
            System.arraycopy(this.g.a(), 0, arrby, n2, 4);
            n2 += 4;
        }
        return arrby;
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (n3 == 0) {
            return;
        }
        if (n3 < 16) {
            throw new ZipException(b);
        }
        this.d = new al(arrby, n2);
        this.e = new al(arrby, n2 += 8);
        n2 += 8;
        int n4 = n3 - 16;
        if (n4 >= 8) {
            this.f = new al(arrby, n2);
            n2 += 8;
            n4 -= 8;
        }
        if (n4 >= 4) {
            this.g = new ay(arrby, n2);
            n2 += 4;
            n4 -= 4;
        }
    }

    public void b(byte[] arrby, int n2, int n3) {
        this.h = new byte[n3];
        System.arraycopy(arrby, n2, this.h, 0, n3);
        if (n3 >= 28) {
            this.a(arrby, n2, n3);
        } else if (n3 == 24) {
            this.d = new al(arrby, n2);
            this.e = new al(arrby, n2 += 8);
            this.f = new al(arrby, n2 += 8);
        } else if (n3 % 8 == 4) {
            this.g = new ay(arrby, n2 + n3 - 4);
        }
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        if (this.h != null) {
            int n2 = (bl2 ? 8 : 0) + (bl3 ? 8 : 0) + (bl4 ? 8 : 0) + (bl5 ? 4 : 0);
            if (this.h.length < n2) {
                throw new ZipException("central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length " + n2 + " but is " + this.h.length);
            }
            int n3 = 0;
            if (bl2) {
                this.d = new al(this.h, n3);
                n3 += 8;
            }
            if (bl3) {
                this.e = new al(this.h, n3);
                n3 += 8;
            }
            if (bl4) {
                this.f = new al(this.h, n3);
                n3 += 8;
            }
            if (bl5) {
                this.g = new ay(this.h, n3);
                n3 += 4;
            }
        }
    }

    public al b() {
        return this.d;
    }

    public void a(al al2) {
        this.d = al2;
    }

    public al g() {
        return this.e;
    }

    public void b(al al2) {
        this.e = al2;
    }

    public al h() {
        return this.f;
    }

    public void c(al al2) {
        this.f = al2;
    }

    public ay i() {
        return this.g;
    }

    public void a(ay ay2) {
        this.g = ay2;
    }

    private int a(byte[] arrby) {
        int n2 = 0;
        if (this.d != null) {
            System.arraycopy(this.d.a(), 0, arrby, 0, 8);
            n2 += 8;
        }
        if (this.e != null) {
            System.arraycopy(this.e.a(), 0, arrby, n2, 8);
            n2 += 8;
        }
        return n2;
    }
}

