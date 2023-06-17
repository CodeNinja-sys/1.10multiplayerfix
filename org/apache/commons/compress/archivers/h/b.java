/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.q;

public class b
implements Cloneable,
ap,
q {
    private static final ba h = new ba(30062);
    private static final int i = 4;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private String m = "";
    private boolean n = false;
    private CRC32 o = new CRC32();

    public ba cI_() {
        return h;
    }

    public ba f() {
        return new ba(14 + this.h().getBytes().length);
    }

    public ba d() {
        return this.f();
    }

    public byte[] e() {
        byte[] arrby = new byte[this.f().b() - 4];
        System.arraycopy(ba.a(this.j()), 0, arrby, 0, 2);
        byte[] arrby2 = this.h().getBytes();
        System.arraycopy(ay.a(arrby2.length), 0, arrby, 2, 4);
        System.arraycopy(ba.a(this.b()), 0, arrby, 6, 2);
        System.arraycopy(ba.a(this.g()), 0, arrby, 8, 2);
        System.arraycopy(arrby2, 0, arrby, 10, arrby2.length);
        this.o.reset();
        this.o.update(arrby);
        long l2 = this.o.getValue();
        byte[] arrby3 = new byte[arrby.length + 4];
        System.arraycopy(ay.a(l2), 0, arrby3, 0, 4);
        System.arraycopy(arrby, 0, arrby3, 4, arrby.length);
        return arrby3;
    }

    public byte[] c() {
        return this.e();
    }

    public void a(int n2) {
        this.k = n2;
    }

    public int b() {
        return this.k;
    }

    public void b(int n2) {
        this.l = n2;
    }

    public int g() {
        return this.l;
    }

    public void a(String string) {
        this.m = string;
        this.j = this.d(this.j);
    }

    public String h() {
        return this.m;
    }

    public boolean i() {
        return this.h().length() != 0;
    }

    public void c(int n2) {
        this.j = this.d(n2);
    }

    public int j() {
        return this.j;
    }

    public void a(boolean bl2) {
        this.n = bl2;
        this.j = this.d(this.j);
    }

    public boolean k() {
        return this.n && !this.i();
    }

    public void a(byte[] arrby, int n2, int n3) {
        long l2 = ay.a(arrby, n2);
        byte[] arrby2 = new byte[n3 - 4];
        System.arraycopy(arrby, n2 + 4, arrby2, 0, n3 - 4);
        this.o.reset();
        this.o.update(arrby2);
        long l3 = this.o.getValue();
        if (l2 != l3) {
            throw new ZipException("bad CRC checksum " + Long.toHexString(l2) + " instead of " + Long.toHexString(l3));
        }
        int n4 = ba.a(arrby2, 0);
        byte[] arrby3 = new byte[(int)ay.a(arrby2, 2)];
        this.k = ba.a(arrby2, 6);
        this.l = ba.a(arrby2, 8);
        if (arrby3.length == 0) {
            this.m = "";
        } else {
            System.arraycopy(arrby2, 10, arrby3, 0, arrby3.length);
            this.m = new String(arrby3);
        }
        this.a((n4 & 0x4000) != 0);
        this.c(n4);
    }

    public void b(byte[] arrby, int n2, int n3) {
        this.a(arrby, n2, n3);
    }

    protected int d(int n2) {
        int n3 = 32768;
        if (this.i()) {
            n3 = 40960;
        } else if (this.k()) {
            n3 = 16384;
        }
        return n3 | n2 & 0xFFF;
    }

    public Object clone() {
        try {
            b b2 = (b)super.clone();
            b2.o = new CRC32();
            return b2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }
}

