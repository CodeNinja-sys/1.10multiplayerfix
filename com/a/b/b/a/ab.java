/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.b.v;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;

final class ab
extends an {
    ab() {
    }

    public Number b(a a2) {
        d d2 = a2.f();
        switch (d2) {
            case i: {
                a2.j();
                return null;
            }
            case g: {
                return new v(a2.h());
            }
        }
        throw new ag("Expecting number, got: " + (Object)((Object)d2));
    }

    public void a(e e2, Number number) {
        e2.a(number);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

