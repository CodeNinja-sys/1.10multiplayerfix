/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import com.a.b.k;

class o
extends an {
    final /* synthetic */ k a;

    o(k k2) {
        this.a = k2;
    }

    public Float b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        return Float.valueOf((float)a2.k());
    }

    public void a(e e2, Number number) {
        if (number == null) {
            e2.f();
            return;
        }
        float f2 = number.floatValue();
        k.a(this.a, f2);
        e2.a(number);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

