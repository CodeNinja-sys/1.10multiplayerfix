/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import org.apache.a.c.c.p;
import org.apache.a.c.f.a;
import org.apache.a.f;
import org.apache.a.n;
import org.apache.a.o;

public abstract class h
extends p
implements o {
    private n a;

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

    public Object clone() {
        h h2 = (h)super.clone();
        if (this.a != null) {
            h2.a = (n)org.apache.a.c.f.a.a(this.a);
        }
        return h2;
    }
}

