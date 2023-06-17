/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.UUID;

final class am
extends an {
    am() {
    }

    public UUID b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        return UUID.fromString(a2.h());
    }

    public void a(e e2, UUID uUID) {
        e2.b(uUID == null ? null : uUID.toString());
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

