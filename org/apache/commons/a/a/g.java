/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import org.apache.commons.a.a;
import org.apache.commons.a.a.m;
import org.apache.commons.a.b;
import org.apache.commons.a.f;
import org.apache.commons.a.h;

public abstract class g
implements a,
b {
    static final int b = -1;
    public static final int c = 76;
    public static final int d = 64;
    private static final int a = 2;
    private static final int i = 8192;
    protected static final int e = 255;
    protected static final byte f = 61;
    protected final byte g = (byte)61;
    private final int j;
    private final int k;
    protected final int h;
    private final int l;

    protected g(int n2, int n3, int n4, int n5) {
        this.j = n2;
        this.k = n3;
        boolean bl2 = n4 > 0 && n5 > 0;
        this.h = bl2 ? n4 / n3 * n3 : 0;
        this.l = n5;
    }

    boolean a(org.apache.commons.a.a.h h2) {
        return h2.c != null;
    }

    int b(org.apache.commons.a.a.h h2) {
        return h2.c != null ? h2.d - h2.e : 0;
    }

    protected int b() {
        return 8192;
    }

    private byte[] c(org.apache.commons.a.a.h h2) {
        if (h2.c == null) {
            h2.c = new byte[this.b()];
            h2.d = 0;
            h2.e = 0;
        } else {
            byte[] arrby = new byte[h2.c.length * 2];
            System.arraycopy(h2.c, 0, arrby, 0, h2.c.length);
            h2.c = arrby;
        }
        return h2.c;
    }

    protected byte[] a(int n2, org.apache.commons.a.a.h h2) {
        if (h2.c == null || h2.c.length < h2.d + n2) {
            return this.c(h2);
        }
        return h2.c;
    }

    int c(byte[] arrby, int n2, int n3, org.apache.commons.a.a.h h2) {
        if (h2.c != null) {
            int n4 = Math.min(this.b(h2), n3);
            System.arraycopy(h2.c, h2.e, arrby, n2, n4);
            h2.e += n4;
            if (h2.e >= h2.d) {
                h2.c = null;
            }
            return n4;
        }
        return h2.f ? -1 : 0;
    }

    protected static boolean c(byte by2) {
        switch (by2) {
            case 9: 
            case 10: 
            case 13: 
            case 32: {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof byte[])) {
            throw new h("Parameter supplied to Base-N encode is not a byte[]");
        }
        return this.b((byte[])object);
    }

    public String l(byte[] arrby) {
        return m.f(this.b(arrby));
    }

    public String m(byte[] arrby) {
        return m.f(this.b(arrby));
    }

    @Override
    public Object a(Object object) {
        if (object instanceof byte[]) {
            return this.a((byte[])object);
        }
        if (object instanceof String) {
            return this.c((String)object);
        }
        throw new f("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] c(String string) {
        return this.a(m.f(string));
    }

    @Override
    public byte[] a(byte[] arrby) {
        if (arrby == null || arrby.length == 0) {
            return arrby;
        }
        org.apache.commons.a.a.h h2 = new org.apache.commons.a.a.h();
        this.a(arrby, 0, arrby.length, h2);
        this.a(arrby, 0, -1, h2);
        byte[] arrby2 = new byte[h2.d];
        this.c(arrby2, 0, arrby2.length, h2);
        return arrby2;
    }

    @Override
    public byte[] b(byte[] arrby) {
        if (arrby == null || arrby.length == 0) {
            return arrby;
        }
        org.apache.commons.a.a.h h2 = new org.apache.commons.a.a.h();
        this.b(arrby, 0, arrby.length, h2);
        this.b(arrby, 0, -1, h2);
        byte[] arrby2 = new byte[h2.d - h2.e];
        this.c(arrby2, 0, arrby2.length, h2);
        return arrby2;
    }

    abstract void b(byte[] var1, int var2, int var3, org.apache.commons.a.a.h var4);

    abstract void a(byte[] var1, int var2, int var3, org.apache.commons.a.a.h var4);

    protected abstract boolean a(byte var1);

    public boolean b(byte[] arrby, boolean bl2) {
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            if (this.a(arrby[i2]) || bl2 && (arrby[i2] == 61 || org.apache.commons.a.a.g.c(arrby[i2]))) continue;
            return false;
        }
        return true;
    }

    public boolean d(String string) {
        return this.b(m.f(string), true);
    }

    protected boolean n(byte[] arrby) {
        if (arrby == null) {
            return false;
        }
        for (byte by2 : arrby) {
            if (61 != by2 && !this.a(by2)) continue;
            return true;
        }
        return false;
    }

    public long o(byte[] arrby) {
        long l2 = (long)((arrby.length + this.j - 1) / this.j) * (long)this.k;
        if (this.h > 0) {
            l2 += (l2 + (long)this.h - 1L) / (long)this.h * (long)this.l;
        }
        return l2;
    }
}

