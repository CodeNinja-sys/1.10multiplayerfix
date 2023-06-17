/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.c;
import b.d;
import b.q;
import b.r;
import b.v;
import java.util.Collection;

class ab
extends c {
    ab(String string) {
        super(string, true);
    }

    ab(Collection collection, String string) {
        super(collection, true, string);
    }

    protected void a(r r2, d d2, v v2) {
        if (!d2.a()) {
            throw new q(this.a());
        }
        this.a(v2, d2.b());
    }
}

