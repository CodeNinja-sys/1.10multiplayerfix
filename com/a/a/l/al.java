/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.am;
import java.math.BigInteger;

public final class al
extends Number
implements Comparable {
    public static final al a = al.a(0);
    public static final al b = al.a(1);
    public static final al c = al.a(-1);
    private final int d;

    private al(int n2) {
        this.d = n2 & 0xFFFFFFFF;
    }

    public static al a(int n2) {
        return new al(n2);
    }

    public static al a(long l2) {
        cl.a((l2 & 0xFFFFFFFFL) == l2, "value (%s) is outside the range for an unsigned integer value", new Object[]{l2});
        return al.a((int)l2);
    }

    public static al a(BigInteger bigInteger) {
        cl.a(bigInteger);
        cl.a(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", new Object[]{bigInteger});
        return al.a(bigInteger.intValue());
    }

    public static al a(String string) {
        return al.a(string, 10);
    }

    public static al a(String string, int n2) {
        return al.a(am.a(string, n2));
    }

    public al a(al al2) {
        return al.a(this.d + ((al)cl.a((Object)al2)).d);
    }

    public al b(al al2) {
        return al.a(this.d - ((al)cl.a((Object)al2)).d);
    }

    public al c(al al2) {
        return al.a(this.d * ((al)cl.a((Object)al2)).d);
    }

    public al d(al al2) {
        return al.a(am.b(this.d, ((al)cl.a((Object)al2)).d));
    }

    public al e(al al2) {
        return al.a(am.c(this.d, ((al)cl.a((Object)al2)).d));
    }

    @Override
    public int intValue() {
        return this.d;
    }

    @Override
    public long longValue() {
        return am.b(this.d);
    }

    @Override
    public float floatValue() {
        return this.longValue();
    }

    @Override
    public double doubleValue() {
        return this.longValue();
    }

    public BigInteger a() {
        return BigInteger.valueOf(this.longValue());
    }

    public int f(al al2) {
        cl.a(al2);
        return am.a(this.d, al2.d);
    }

    public int hashCode() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof al) {
            al al2 = (al)object;
            return this.d == al2.d;
        }
        return false;
    }

    public String toString() {
        return this.b(10);
    }

    public String b(int n2) {
        return am.d(this.d, n2);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.f((al)object);
    }
}

