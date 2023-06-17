/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ep;
import java.io.Serializable;
import java.math.BigInteger;

final class eq
extends ep
implements Serializable {
    private static final eq a = new eq();
    private static final BigInteger b = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger c = BigInteger.valueOf(Long.MAX_VALUE);
    private static final long d = 0L;

    private eq() {
    }

    public BigInteger a(BigInteger bigInteger) {
        return bigInteger.add(BigInteger.ONE);
    }

    public BigInteger b(BigInteger bigInteger) {
        return bigInteger.subtract(BigInteger.ONE);
    }

    public long a(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger2.subtract(bigInteger).max(b).min(c).longValue();
    }

    private Object g() {
        return a;
    }

    public String toString() {
        return "DiscreteDomain.bigIntegers()";
    }

    static /* synthetic */ eq f() {
        return a;
    }
}

