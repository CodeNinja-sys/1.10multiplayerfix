/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;

final class bb
extends an {
    bb() {
    }

    public Number b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        try {
            int n2 = a2.m();
            return (byte)n2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new ag(numberFormatException);
        }
    }

    public void a(e e2, Number number) {
        e2.a(number);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

