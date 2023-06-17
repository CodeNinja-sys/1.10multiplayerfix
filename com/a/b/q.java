/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.e;

class q
extends an {
    private an a;

    q() {
    }

    public void a(an an2) {
        if (this.a != null) {
            throw new AssertionError();
        }
        this.a = an2;
    }

    public Object a(a a2) {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        return this.a.a(a2);
    }

    public void a(e e2, Object object) {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        this.a.a(e2, object);
    }
}

