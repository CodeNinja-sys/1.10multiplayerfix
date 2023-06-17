/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.dl;
import java.util.Arrays;
import java.util.Date;

public class dg
extends dl {
    private static final long a = -1117109130077415245L;
    private final long[] b;
    private final int c;

    public dg(String string, int n2, int n3, long[] arrl, int n4) {
        super(string, n2, n3);
        if (arrl == null || arrl.length == 0) {
            throw new IllegalArgumentException("No start times are specified.");
        }
        this.b = (long[])arrl.clone();
        Arrays.sort(this.b);
        this.c = n4;
    }

    public long[] a() {
        return (long[])this.b.clone();
    }

    public int b() {
        return this.c;
    }

    public Date a(int n2, int n3) {
        return new Date(this.a(this.b[0], n2, n3));
    }

    public Date b(int n2, int n3) {
        return new Date(this.a(this.b[this.b.length - 1], n2, n3));
    }

    public Date a(long l2, int n2, int n3, boolean bl2) {
        long l3;
        int n4;
        for (n4 = this.b.length - 1; n4 >= 0 && (l3 = this.a(this.b[n4], n2, n3)) >= l2 && (bl2 || l3 != l2); --n4) {
        }
        if (n4 == this.b.length - 1) {
            return null;
        }
        return new Date(this.a(this.b[n4 + 1], n2, n3));
    }

    public Date b(long l2, int n2, int n3, boolean bl2) {
        for (int i2 = this.b.length - 1; i2 >= 0; --i2) {
            long l3 = this.a(this.b[i2], n2, n3);
            if (l3 >= l2 && (!bl2 || l3 != l2)) continue;
            return new Date(l3);
        }
        return null;
    }

    public boolean a(dl dl2) {
        if (!(dl2 instanceof dg)) {
            return false;
        }
        if (this.c == ((dg)dl2).c && Arrays.equals(this.b, ((dg)dl2).b)) {
            return super.a(dl2);
        }
        return false;
    }

    public boolean d() {
        return true;
    }

    private long a(long l2, int n2, int n3) {
        if (this.c != 2) {
            l2 -= (long)n2;
        }
        if (this.c == 0) {
            l2 -= (long)n3;
        }
        return l2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(", timeType=");
        stringBuilder.append(this.c);
        stringBuilder.append(", startTimes=[");
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(Long.toString(this.b[i2]));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

