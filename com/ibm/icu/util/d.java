/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.jd;
import java.nio.ByteBuffer;

public class d
implements Comparable {
    public byte[] a;
    public int b;

    public d() {
    }

    public d(byte[] arrby, int n2) {
        if (arrby == null && n2 != 0 || n2 < 0 || n2 > arrby.length) {
            throw new IndexOutOfBoundsException("illegal size: " + n2);
        }
        this.a = arrby;
        this.b = n2;
    }

    public d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.limit();
        this.a = new byte[this.b];
        byteBuffer.get(this.a, 0, this.b);
    }

    public d a(int n2) {
        if (this.a == null || this.a.length < n2) {
            byte[] arrby = new byte[n2];
            d.a(this.a, 0, arrby, 0, this.b);
            this.a = arrby;
        }
        return this;
    }

    public final d a(byte[] arrby, int n2, int n3) {
        this.b = 0;
        this.b(arrby, n2, n3);
        return this;
    }

    public final d b(byte[] arrby, int n2, int n3) {
        int n4 = n3 - n2;
        this.a(this.b + n4);
        d.a(arrby, n2, this.a, this.b, n4);
        this.b += n4;
        return this;
    }

    public final byte[] a() {
        byte[] arrby = this.a;
        this.a = null;
        this.b = 0;
        return arrby;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(jd.a((long)(this.a[i2] & 0xFF), 2));
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        try {
            d d2 = (d)object;
            if (this.b != d2.b) {
                return false;
            }
            for (int i2 = 0; i2 < this.b; ++i2) {
                if (this.a[i2] == d2.a[i2]) continue;
                return false;
            }
            return true;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        int n2 = this.a.length;
        for (int i2 = 0; i2 < this.b; ++i2) {
            n2 = 37 * n2 + this.a[i2];
        }
        return n2;
    }

    public int a(d d2) {
        if (this == d2) {
            return 0;
        }
        int n2 = this.b < d2.b ? this.b : d2.b;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.a[i2] == d2.a[i2]) continue;
            return (this.a[i2] & 0xFF) - (d2.a[i2] & 0xFF);
        }
        return this.b - d2.b;
    }

    private static final void a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        if (n4 < 64) {
            int n5 = n2;
            int n6 = n3;
            while (--n4 >= 0) {
                arrby2[n6] = arrby[n5];
                ++n5;
                ++n6;
            }
        } else {
            System.arraycopy(arrby, n2, arrby2, n3, n4);
        }
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((d)object);
    }
}

