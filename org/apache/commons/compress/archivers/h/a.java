/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.ba;

public abstract class a
implements ap {
    private long a;
    private byte[] b;
    private byte[] c;

    protected a() {
    }

    protected a(String string, byte[] arrby, int n2, int n3) {
        CRC32 cRC32 = new CRC32();
        cRC32.update(arrby, n2, n3);
        this.a = cRC32.getValue();
        try {
            this.b = string.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("FATAL: UTF-8 encoding not supported.", unsupportedEncodingException);
        }
    }

    protected a(String string, byte[] arrby) {
        this(string, arrby, 0, arrby.length);
    }

    private void g() {
        if (this.b == null) {
            return;
        }
        this.c = new byte[5 + this.b.length];
        this.c[0] = 1;
        System.arraycopy(ay.a(this.a), 0, this.c, 1, 4);
        System.arraycopy(this.b, 0, this.c, 5, this.b.length);
    }

    public long a() {
        return this.a;
    }

    public void a(long l2) {
        this.a = l2;
        this.c = null;
    }

    public byte[] b() {
        byte[] arrby = null;
        if (this.b != null) {
            arrby = new byte[this.b.length];
            System.arraycopy(this.b, 0, arrby, 0, arrby.length);
        }
        return arrby;
    }

    public void a(byte[] arrby) {
        if (arrby != null) {
            this.b = new byte[arrby.length];
            System.arraycopy(arrby, 0, this.b, 0, arrby.length);
        } else {
            this.b = null;
        }
        this.c = null;
    }

    public byte[] c() {
        if (this.c == null) {
            this.g();
        }
        byte[] arrby = null;
        if (this.c != null) {
            arrby = new byte[this.c.length];
            System.arraycopy(this.c, 0, arrby, 0, arrby.length);
        }
        return arrby;
    }

    public ba d() {
        if (this.c == null) {
            this.g();
        }
        return new ba(this.c != null ? this.c.length : 0);
    }

    public byte[] e() {
        return this.c();
    }

    public ba f() {
        return this.d();
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (n3 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte by2 = arrby[n2];
        if (by2 != 1) {
            throw new ZipException("Unsupported version [" + by2 + "] for UniCode path extra data.");
        }
        this.a = ay.a(arrby, n2 + 1);
        this.b = new byte[n3 - 5];
        System.arraycopy(arrby, n2 + 5, this.b, 0, n3 - 5);
        this.c = null;
    }

    public void b(byte[] arrby, int n2, int n3) {
        this.a(arrby, n2, n3);
    }
}

