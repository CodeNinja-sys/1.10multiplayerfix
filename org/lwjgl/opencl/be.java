/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.util.Iterator;
import org.lwjgl.opencl.bf;
import org.lwjgl.opencl.bg;

final class be
implements Iterable {
    private bf[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    be() {
        this(16, 0.75f);
    }

    be(int n2) {
        this(n2, 0.75f);
    }

    be(int n2, float f2) {
        if (n2 > 0x40000000) {
            throw new IllegalArgumentException("initialCapacity is too large.");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("initialCapacity must be greater than zero.");
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("initialCapacity must be greater than zero.");
        }
        this.d = 1;
        while (this.d < n2) {
            this.d <<= 1;
        }
        this.e = (int)((float)this.d * f2);
        this.a = new bf[this.d];
        this.c = this.d - 1;
    }

    private int d(long l2) {
        return be.a(l2, this.c);
    }

    private static int a(long l2, int n2) {
        int n3 = (int)(l2 ^ l2 >>> 32);
        return n3 & n2;
    }

    public Object a(long l2, Object object) {
        bf[] arrbf = this.a;
        int n2 = this.d(l2);
        bf bf2 = arrbf[n2];
        while (bf2 != null) {
            if (bf2.a == l2) {
                Object object2 = bf2.b;
                bf2.b = object;
                return object2;
            }
            bf2 = bf2.c;
        }
        arrbf[n2] = new bf(l2, object, arrbf[n2]);
        if (this.b++ >= this.e) {
            this.a(arrbf);
        }
        return null;
    }

    private void a(bf[] arrbf) {
        int n2 = 2 * this.d;
        int n3 = n2 - 1;
        bf[] arrbf2 = new bf[n2];
        for (int i2 = 0; i2 < arrbf.length; ++i2) {
            bf bf2;
            bf bf3 = arrbf[i2];
            if (bf3 == null) continue;
            do {
                bf2 = bf3.c;
                int n4 = be.a(bf3.a, n3);
                bf3.c = arrbf2[n4];
                arrbf2[n4] = bf3;
            } while ((bf3 = bf2) != null);
        }
        this.a = arrbf2;
        this.d = n2;
        this.c = n3;
        this.e *= 2;
    }

    public Object a(long l2) {
        int n2 = this.d(l2);
        bf bf2 = this.a[n2];
        while (bf2 != null) {
            if (bf2.a == l2) {
                return bf2.b;
            }
            bf2 = bf2.c;
        }
        return null;
    }

    public boolean a(Object object) {
        bf[] arrbf = this.a;
        for (int i2 = arrbf.length - 1; i2 >= 0; --i2) {
            bf bf2 = arrbf[i2];
            while (bf2 != null) {
                if (bf2.b.equals(object)) {
                    return true;
                }
                bf2 = bf2.c;
            }
        }
        return false;
    }

    public boolean b(long l2) {
        int n2 = this.d(l2);
        bf bf2 = this.a[n2];
        while (bf2 != null) {
            if (bf2.a == l2) {
                return true;
            }
            bf2 = bf2.c;
        }
        return false;
    }

    public Object c(long l2) {
        bf bf2;
        int n2 = this.d(l2);
        bf bf3 = bf2 = this.a[n2];
        while (bf3 != null) {
            bf bf4 = bf3.c;
            if (bf3.a == l2) {
                --this.b;
                if (bf2 == bf3) {
                    this.a[n2] = bf4;
                } else {
                    bf2.c = bf4;
                }
                return bf3.b;
            }
            bf2 = bf3;
            bf3 = bf4;
        }
        return null;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.b == 0;
    }

    public void c() {
        bf[] arrbf = this.a;
        for (int i2 = arrbf.length - 1; i2 >= 0; --i2) {
            arrbf[i2] = null;
        }
        this.b = 0;
    }

    public bg d() {
        return new bg(this);
    }

    public /* synthetic */ Iterator iterator() {
        return this.d();
    }

    static /* synthetic */ bf[] a(be be2) {
        return be2.a;
    }
}

