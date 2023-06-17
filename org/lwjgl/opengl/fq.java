/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.util.Iterator;
import org.lwjgl.opengl.fr;
import org.lwjgl.opengl.fs;

final class fq
implements Iterable {
    private fr[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    fq() {
        this(16, 0.75f);
    }

    fq(int n2) {
        this(n2, 0.75f);
    }

    fq(int n2, float f2) {
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
        this.a = new fr[this.d];
        this.c = this.d - 1;
    }

    private int d(int n2) {
        return fq.a(n2, this.c);
    }

    private static int a(int n2, int n3) {
        return n2 & n3;
    }

    public Object a(int n2, Object object) {
        fr[] arrfr = this.a;
        int n3 = this.d(n2);
        fr fr2 = arrfr[n3];
        while (fr2 != null) {
            if (fr2.a == n2) {
                Object object2 = fr2.b;
                fr2.b = object;
                return object2;
            }
            fr2 = fr2.c;
        }
        arrfr[n3] = new fr(n2, object, arrfr[n3]);
        if (this.b++ >= this.e) {
            this.a(arrfr);
        }
        return null;
    }

    private void a(fr[] arrfr) {
        int n2 = 2 * this.d;
        int n3 = n2 - 1;
        fr[] arrfr2 = new fr[n2];
        for (int i2 = 0; i2 < arrfr.length; ++i2) {
            fr fr2;
            fr fr3 = arrfr[i2];
            if (fr3 == null) continue;
            do {
                fr2 = fr3.c;
                int n4 = fq.a(fr3.a, n3);
                fr3.c = arrfr2[n4];
                arrfr2[n4] = fr3;
            } while ((fr3 = fr2) != null);
        }
        this.a = arrfr2;
        this.d = n2;
        this.c = n3;
        this.e *= 2;
    }

    public Object a(int n2) {
        int n3 = this.d(n2);
        fr fr2 = this.a[n3];
        while (fr2 != null) {
            if (fr2.a == n2) {
                return fr2.b;
            }
            fr2 = fr2.c;
        }
        return null;
    }

    public boolean a(Object object) {
        fr[] arrfr = this.a;
        for (int i2 = arrfr.length - 1; i2 >= 0; --i2) {
            fr fr2 = arrfr[i2];
            while (fr2 != null) {
                if (fr2.b.equals(object)) {
                    return true;
                }
                fr2 = fr2.c;
            }
        }
        return false;
    }

    public boolean b(int n2) {
        int n3 = this.d(n2);
        fr fr2 = this.a[n3];
        while (fr2 != null) {
            if (fr2.a == n2) {
                return true;
            }
            fr2 = fr2.c;
        }
        return false;
    }

    public Object c(int n2) {
        fr fr2;
        int n3 = this.d(n2);
        fr fr3 = fr2 = this.a[n3];
        while (fr3 != null) {
            fr fr4 = fr3.c;
            if (fr3.a == n2) {
                --this.b;
                if (fr2 == fr3) {
                    this.a[n3] = fr4;
                } else {
                    fr2.c = fr4;
                }
                return fr3.b;
            }
            fr2 = fr3;
            fr3 = fr4;
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
        fr[] arrfr = this.a;
        for (int i2 = arrfr.length - 1; i2 >= 0; --i2) {
            arrfr[i2] = null;
        }
        this.b = 0;
    }

    public fs d() {
        return new fs(this);
    }

    public /* synthetic */ Iterator iterator() {
        return this.d();
    }

    static /* synthetic */ fr[] a(fq fq2) {
        return fq2.a;
    }
}

