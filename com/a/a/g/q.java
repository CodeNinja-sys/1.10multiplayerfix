/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.j.i;
import java.math.RoundingMode;
import java.util.Arrays;

final class q {
    final long[] a;
    long b;

    q(long l2) {
        this(new long[com.a.a.l.q.a(i.a(l2, 64L, RoundingMode.CEILING))]);
    }

    q(long[] arrl) {
        cl.a(arrl.length > 0, (Object)"data length is zero!");
        this.a = arrl;
        long l2 = 0L;
        for (long l3 : arrl) {
            l2 += (long)Long.bitCount(l3);
        }
        this.b = l2;
    }

    boolean a(long l2) {
        if (!this.b(l2)) {
            int n2 = (int)(l2 >>> 6);
            this.a[n2] = this.a[n2] | 1L << (int)l2;
            ++this.b;
            return true;
        }
        return false;
    }

    boolean b(long l2) {
        return (this.a[(int)(l2 >>> 6)] & 1L << (int)l2) != 0L;
    }

    long a() {
        return (long)this.a.length * 64L;
    }

    long b() {
        return this.b;
    }

    q c() {
        return new q((long[])this.a.clone());
    }

    void a(q q2) {
        cl.a(this.a.length == q2.a.length, "BitArrays must be of equal length (%s != %s)", new Object[]{this.a.length, q2.a.length});
        this.b = 0L;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n2 = i2;
            this.a[n2] = this.a[n2] | q2.a[i2];
            this.b += (long)Long.bitCount(this.a[i2]);
        }
    }

    public boolean equals(Object object) {
        if (object instanceof q) {
            q q2 = (q)object;
            return Arrays.equals(this.a, q2.a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
}

