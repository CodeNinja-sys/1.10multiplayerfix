/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.f;
import org.apache.a.i;
import org.apache.a.j.e;
import org.apache.a.k.k;
import org.apache.a.k.v;
import org.apache.a.l.j;
import org.apache.a.o.a;
import org.apache.a.o.d;
import org.apache.a.t;

public abstract class b
implements e {
    protected final org.apache.a.j.i a;
    protected final d b;
    protected final v c;

    public b(org.apache.a.j.i i2, v v2, j j2) {
        org.apache.a.o.a.a(i2, "Session input buffer");
        this.a = i2;
        this.b = new d(128);
        this.c = v2 != null ? v2 : k.b;
    }

    public b(org.apache.a.j.i i2, v v2) {
        this.a = (org.apache.a.j.i)org.apache.a.o.a.a(i2, "Session input buffer");
        this.c = v2 != null ? v2 : k.b;
        this.b = new d(128);
    }

    protected abstract void a(t var1);

    public void b(t t2) {
        org.apache.a.o.a.a(t2, "HTTP message");
        this.a(t2);
        i i2 = t2.e();
        while (i2.hasNext()) {
            f f2 = i2.a();
            this.a.a(this.c.a(this.b, f2));
        }
        this.b.a();
        this.a.a(this.b);
    }
}

