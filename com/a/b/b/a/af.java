/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.math.BigInteger;

final class af
extends an {
    af() {
    }

    public BigInteger b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        try {
            return new BigInteger(a2.h());
        }
        catch (NumberFormatException numberFormatException) {
            throw new ag(numberFormatException);
        }
    }

    public void a(e e2, BigInteger bigInteger) {
        e2.a(bigInteger);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

