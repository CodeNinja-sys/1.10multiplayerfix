/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.bb;

public class w
implements Serializable,
Cloneable,
ap {
    private static final ba d = new ba(21589);
    private static final long e = 1L;
    public static final byte a = 1;
    public static final byte b = 2;
    public static final byte c = 4;
    private byte f;
    private boolean g;
    private boolean h;
    private boolean i;
    private ay j;
    private ay k;
    private ay l;

    public ba cI_() {
        return d;
    }

    public ba f() {
        return new ba(1 + (this.g ? 4 : 0) + (this.h && this.k != null ? 4 : 0) + (this.i && this.l != null ? 4 : 0));
    }

    public ba d() {
        return new ba(1 + (this.g ? 4 : 0));
    }

    public byte[] e() {
        byte[] arrby = new byte[this.f().b()];
        int n2 = 0;
        arrby[n2++] = 0;
        if (this.g) {
            arrby[0] = (byte)(arrby[0] | 1);
            System.arraycopy(this.j.a(), 0, arrby, n2, 4);
            n2 += 4;
        }
        if (this.h && this.k != null) {
            arrby[0] = (byte)(arrby[0] | 2);
            System.arraycopy(this.k.a(), 0, arrby, n2, 4);
            n2 += 4;
        }
        if (this.i && this.l != null) {
            arrby[0] = (byte)(arrby[0] | 4);
            System.arraycopy(this.l.a(), 0, arrby, n2, 4);
            n2 += 4;
        }
        return arrby;
    }

    public byte[] c() {
        byte[] arrby = new byte[this.d().b()];
        byte[] arrby2 = this.e();
        System.arraycopy(arrby2, 0, arrby, 0, arrby.length);
        return arrby;
    }

    public void a(byte[] arrby, int n2, int n3) {
        this.p();
        int n4 = n2 + n3;
        this.a(arrby[n2++]);
        if (this.g) {
            this.j = new ay(arrby, n2);
            n2 += 4;
        }
        if (this.h && n2 + 4 <= n4) {
            this.k = new ay(arrby, n2);
            n2 += 4;
        }
        if (this.i && n2 + 4 <= n4) {
            this.l = new ay(arrby, n2);
            n2 += 4;
        }
    }

    public void b(byte[] arrby, int n2, int n3) {
        this.p();
        this.a(arrby, n2, n3);
    }

    private void p() {
        this.a((byte)0);
        this.j = null;
        this.k = null;
        this.l = null;
    }

    public void a(byte by2) {
        this.f = by2;
        this.g = (by2 & 1) == 1;
        this.h = (by2 & 2) == 2;
        this.i = (by2 & 4) == 4;
    }

    public byte b() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }

    public ay j() {
        return this.j;
    }

    public ay k() {
        return this.k;
    }

    public ay l() {
        return this.l;
    }

    public Date m() {
        return this.j != null ? new Date(this.j.b() * 1000L) : null;
    }

    public Date n() {
        return this.k != null ? new Date(this.k.b() * 1000L) : null;
    }

    public Date o() {
        return this.l != null ? new Date(this.l.b() * 1000L) : null;
    }

    public void a(ay ay2) {
        this.g = ay2 != null;
        this.f = (byte)(ay2 != null ? this.f | 1 : this.f & 0xFFFFFFFE);
        this.j = ay2;
    }

    public void b(ay ay2) {
        this.h = ay2 != null;
        this.f = (byte)(ay2 != null ? this.f | 2 : this.f & 0xFFFFFFFD);
        this.k = ay2;
    }

    public void c(ay ay2) {
        this.i = ay2 != null;
        this.f = (byte)(ay2 != null ? this.f | 4 : this.f & 0xFFFFFFFB);
        this.l = ay2;
    }

    public void a(Date date) {
        this.a(w.d(date));
    }

    public void b(Date date) {
        this.b(w.d(date));
    }

    public void c(Date date) {
        this.c(w.d(date));
    }

    private static ay d(Date date) {
        if (date == null) {
            return null;
        }
        long l2 = 0x100000000L;
        long l3 = date.getTime() / 1000L;
        if (l3 >= 0x100000000L) {
            throw new IllegalArgumentException("Cannot set an X5455 timestamp larger than 2^32: " + l3);
        }
        return new ay(l3);
    }

    public String toString() {
        Date date;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x5455 Zip Extra Field: Flags=");
        stringBuilder.append(Integer.toBinaryString(bb.b(this.f))).append(" ");
        if (this.g && this.j != null) {
            date = this.m();
            stringBuilder.append(" Modify:[").append(date).append("] ");
        }
        if (this.h && this.k != null) {
            date = this.n();
            stringBuilder.append(" Access:[").append(date).append("] ");
        }
        if (this.i && this.l != null) {
            date = this.o();
            stringBuilder.append(" Create:[").append(date).append("] ");
        }
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object instanceof w) {
            w w2 = (w)object;
            return (this.f & 7) == (w2.f & 7) && (this.j == w2.j || this.j != null && this.j.equals(w2.j)) && (this.k == w2.k || this.k != null && this.k.equals(w2.k)) && (this.l == w2.l || this.l != null && this.l.equals(w2.l));
        }
        return false;
    }

    public int hashCode() {
        int n2 = -123 * (this.f & 7);
        if (this.j != null) {
            n2 ^= this.j.hashCode();
        }
        if (this.k != null) {
            n2 ^= Integer.rotateLeft(this.k.hashCode(), 11);
        }
        if (this.l != null) {
            n2 ^= Integer.rotateLeft(this.l.hashCode(), 22);
        }
        return n2;
    }
}

