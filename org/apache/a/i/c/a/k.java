/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.util.concurrent.TimeUnit;
import org.apache.a.f.f;
import org.apache.a.f.t;
import org.apache.a.i.c.a.d;
import org.apache.a.i.c.a.g;
import org.apache.a.i.c.a.j;
import org.apache.a.i.c.b;
import org.apache.a.o.a;

class k
implements f {
    final /* synthetic */ g a;
    final /* synthetic */ org.apache.a.f.b.b b;
    final /* synthetic */ j c;

    k(j j2, g g2, org.apache.a.f.b.b b2) {
        this.c = j2;
        this.a = g2;
        this.b = b2;
    }

    public void a() {
        this.a.a();
    }

    public t a(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a(this.b, "Route");
        if (j.a(this.c).a()) {
            j.a(this.c).b("Get connection: " + this.b + ", timeout = " + l2);
        }
        org.apache.a.i.c.a.b b2 = this.a.a(l2, timeUnit);
        return new d(this.c, (b)b2);
    }
}

