/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import org.apache.a.c.c.q;
import org.apache.a.f;
import org.apache.a.n;
import org.apache.a.o;

class s
extends q
implements o {
    private n a;

    public s(o o2) {
        super(o2, null);
        this.a = o2.b();
    }

    public n b() {
        return this.a;
    }

    public void a(n n2) {
        this.a = n2;
    }

    public boolean a() {
        f f2 = this.c("Expect");
        return f2 != null && "100-continue".equalsIgnoreCase(f2.d());
    }
}

