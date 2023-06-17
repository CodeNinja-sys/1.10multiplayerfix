/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.util.concurrent.TimeUnit;
import org.apache.a.i.c.a.b;
import org.apache.a.i.c.a.e;
import org.apache.a.i.c.a.g;
import org.apache.a.i.c.a.m;

class f
implements g {
    final /* synthetic */ m a;
    final /* synthetic */ org.apache.a.f.b.b b;
    final /* synthetic */ Object c;
    final /* synthetic */ e d;

    f(e e2, m m2, org.apache.a.f.b.b b2, Object object) {
        this.d = e2;
        this.a = m2;
        this.b = b2;
        this.c = object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        e.a(this.d).lock();
        try {
            this.a.a();
        }
        finally {
            e.a(this.d).unlock();
        }
    }

    public b a(long l2, TimeUnit timeUnit) {
        return this.d.a(this.b, this.c, l2, timeUnit, this.a);
    }
}

