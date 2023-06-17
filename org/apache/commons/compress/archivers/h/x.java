/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.Serializable;
import java.math.BigInteger;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.bb;

public class x
implements Serializable,
Cloneable,
ap {
    private static final ba a = new ba(30837);
    private static final BigInteger b = BigInteger.valueOf(1000L);
    private static final long c = 1L;
    private int d = 1;
    private BigInteger e;
    private BigInteger f;

    public x() {
        this.h();
    }

    public ba cI_() {
        return a;
    }

    public long b() {
        return bb.a(this.e);
    }

    public long g() {
        return bb.a(this.f);
    }

    public void a(long l2) {
        this.e = bb.b(l2);
    }

    public void b(long l2) {
        this.f = bb.b(l2);
    }

    public ba f() {
        int n2 = x.a(this.e.toByteArray()).length;
        int n3 = x.a(this.f.toByteArray()).length;
        return new ba(3 + n2 + n3);
    }

    public ba d() {
        return this.f();
    }

    public byte[] e() {
        byte[] arrby = this.e.toByteArray();
        byte[] arrby2 = this.f.toByteArray();
        arrby = x.a(arrby);
        arrby2 = x.a(arrby2);
        byte[] arrby3 = new byte[3 + arrby.length + arrby2.length];
        bb.a(arrby);
        bb.a(arrby2);
        int n2 = 0;
        arrby3[n2++] = bb.b(this.d);
        arrby3[n2++] = bb.b(arrby.length);
        System.arraycopy(arrby, 0, arrby3, n2, arrby.length);
        n2 += arrby.length;
        arrby3[n2++] = bb.b(arrby2.length);
        System.arraycopy(arrby2, 0, arrby3, n2, arrby2.length);
        return arrby3;
    }

    public byte[] c() {
        return this.e();
    }

    public void a(byte[] arrby, int n2, int n3) {
        this.h();
        this.d = bb.a(arrby[n2++]);
        int n4 = bb.a(arrby[n2++]);
        byte[] arrby2 = new byte[n4];
        System.arraycopy(arrby, n2, arrby2, 0, n4);
        n2 += n4;
        this.e = new BigInteger(1, bb.a(arrby2));
        int n5 = bb.a(arrby[n2++]);
        byte[] arrby3 = new byte[n5];
        System.arraycopy(arrby, n2, arrby3, 0, n5);
        this.f = new BigInteger(1, bb.a(arrby3));
    }

    public void b(byte[] arrby, int n2, int n3) {
        this.h();
        this.a(arrby, n2, n3);
    }

    private void h() {
        this.e = b;
        this.f = b;
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.e + " GID=" + this.f;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object instanceof x) {
            x x2 = (x)object;
            return this.d == x2.d && this.e.equals(x2.e) && this.f.equals(x2.f);
        }
        return false;
    }

    public int hashCode() {
        int n2 = -1234567 * this.d;
        n2 ^= Integer.rotateLeft(this.e.hashCode(), 16);
        return n2 ^= this.f.hashCode();
    }

    static byte[] a(byte[] arrby) {
        if (arrby == null) {
            return arrby;
        }
        int n2 = 0;
        for (byte by2 : arrby) {
            if (by2 != 0) break;
            ++n2;
        }
        boolean bl2 = true;
        byte[] arrby2 = new byte[Math.max(1, arrby.length - n2)];
        int n3 = arrby2.length - (arrby.length - n2);
        System.arraycopy(arrby, n2, arrby2, n3, arrby2.length - n3);
        return arrby2;
    }
}

