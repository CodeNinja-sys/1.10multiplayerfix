/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;

final class ac
extends an {
    ac() {
    }

    public Character b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        String string = a2.h();
        if (string.length() != 1) {
            throw new ag("Expecting character, got: " + string);
        }
        return Character.valueOf(string.charAt(0));
    }

    public void a(e e2, Character c2) {
        e2.b(c2 == null ? null : String.valueOf(c2));
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

