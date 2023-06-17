/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.math.BigDecimal;

final class ae
extends an {
    ae() {
    }

    public BigDecimal b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        try {
            return new BigDecimal(a2.h());
        }
        catch (NumberFormatException numberFormatException) {
            throw new ag(numberFormatException);
        }
    }

    public void a(e e2, BigDecimal bigDecimal) {
        e2.a(bigDecimal);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

