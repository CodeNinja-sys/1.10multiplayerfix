/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.c;
import b.d;
import b.q;
import b.r;
import b.v;
import java.util.Collections;

class b
extends c {
    b() {
        super(Collections.singletonList("W"), true, "Alternative form of long options");
        this.b("opt=value");
    }

    protected void a(r r2, d d2, v v2) {
        if (!d2.a()) {
            throw new q(this.a());
        }
        d2.d();
    }
}

