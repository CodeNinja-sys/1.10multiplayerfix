/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;

final class aw
extends an {
    aw() {
    }

    public Boolean b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        if (a2.f() == d.f) {
            return Boolean.parseBoolean(a2.h());
        }
        return a2.i();
    }

    public void a(e e2, Boolean bl2) {
        if (bl2 == null) {
            e2.f();
            return;
        }
        e2.a(bl2);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

