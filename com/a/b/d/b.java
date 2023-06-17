/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.d;

import com.a.b.b.a.g;
import com.a.b.b.u;
import com.a.b.d.a;

final class b
extends u {
    b() {
    }

    public void a(a a2) {
        if (a2 instanceof g) {
            ((g)a2).o();
            return;
        }
        int n2 = com.a.b.d.a.a(a2);
        if (n2 == 0) {
            n2 = com.a.b.d.a.b(a2);
        }
        if (n2 == 13) {
            com.a.b.d.a.a(a2, 9);
        } else if (n2 == 12) {
            com.a.b.d.a.a(a2, 8);
        } else if (n2 == 14) {
            com.a.b.d.a.a(a2, 10);
        } else {
            throw new IllegalStateException("Expected a name but was " + (Object)((Object)a2.f()) + " " + " at line " + com.a.b.d.a.c(a2) + " column " + com.a.b.d.a.d(a2));
        }
    }
}

