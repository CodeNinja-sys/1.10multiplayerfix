/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.ap;
import com.a.a.l.u;
import java.io.Serializable;
import java.math.BigInteger;

public final class ao
extends Number
implements Serializable,
Comparable {
    private static final long d = Long.MAX_VALUE;
    public static final ao a = new ao(0L);
    public static final ao b = new ao(1L);
    public static final ao c = new ao(-1L);
    private final long e;

    private ao(long l2) {
        this.e = l2;
    }

    public static ao a(long l2) {
        return new ao(l2);
    }

    public static ao b(long l2) {
        cl.a(l2 >= 0L, "value (%s) is outside the range for an unsigned long value", new Object[]{l2});
        return ao.a(l2);
    }

    public static ao a(BigInteger bigInteger) {
        cl.a(bigInteger);
        cl.a(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", new Object[]{bigInteger});
        return ao.a(bigInteger.longValue());
    }

    public static ao a(String string) {
        return ao.a(string, 10);
    }

    public static ao a(String string, int n2) {
        return ao.a(ap.a(string, n2));
    }

    public ao a(ao ao2) {
        return ao.a(this.e + ((ao)cl.a((Object)ao2)).e);
    }

    public ao b(ao ao2) {
        return ao.a(this.e - ((ao)cl.a((Object)ao2)).e);
    }

    public ao c(ao ao2) {
        return ao.a(this.e * ((ao)cl.a((Object)ao2)).e);
    }

    public ao d(ao ao2) {
        return ao.a(ap.b(this.e, ((ao)cl.a((Object)ao2)).e));
    }

    public ao e(ao ao2) {
        return ao.a(ap.c(this.e, ((ao)cl.a((Object)ao2)).e));
    }

    @Override
    public int intValue() {
        return (int)this.e;
    }

    @Override
    public long longValue() {
        return this.e;
    }

    @Override
    public float floatValue() {
        float f2 = this.e & Long.MAX_VALUE;
        if (this.e < 0L) {
            f2 += 9.223372E18f;
        }
        return f2;
    }

    @Override
    public double doubleValue() {
        double d2 = this.e & Long.MAX_VALUE;
        if (this.e < 0L) {
            d2 += 9.223372036854776E18;
        }
        return d2;
    }

    public BigInteger a() {
        BigInteger bigInteger = BigInteger.valueOf(this.e & Long.MAX_VALUE);
        if (this.e < 0L) {
            bigInteger = bigInteger.setBit(63);
        }
        return bigInteger;
    }

    public int f(ao ao2) {
        cl.a(ao2);
        return ap.a(this.e, ao2.e);
    }

    public int hashCode() {
        return u.a(this.e);
    }

    public boolean equals(Object object) {
        if (object instanceof ao) {
            ao ao2 = (ao)object;
            return this.e == ao2.e;
        }
        return false;
    }

    public String toString() {
        return ap.a(this.e);
    }

    public String a(int n2) {
        return ap.a(this.e, n2);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.f((ao)object);
    }
}

