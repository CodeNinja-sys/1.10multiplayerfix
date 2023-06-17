/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.c;
import b.d;
import b.r;
import b.v;
import java.util.Collection;

class z
extends c {
    z(String string) {
        super(string, false);
    }

    z(Collection collection, String string) {
        super(collection, false, string);
    }

    protected void a(r r2, d d2, v v2) {
        if (d2.a()) {
            String string = d2.c();
            if (!r2.c(string)) {
                this.a(r2, v2, d2);
            } else if (this.h() && this.d(string)) {
                this.a(v2, d2.b());
            } else {
                v2.a(this);
            }
        } else {
            v2.a(this);
        }
    }

    private void a(r r2, v v2, d d2) {
        if (r2.c()) {
            v2.a(this);
            r2.f();
        } else {
            this.a(v2, d2.b());
        }
    }
}

