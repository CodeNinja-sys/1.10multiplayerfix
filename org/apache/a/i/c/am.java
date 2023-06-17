/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.a.f.k;
import org.apache.a.i.c.al;
import org.apache.a.j;

class am
implements k {
    final /* synthetic */ Future a;
    final /* synthetic */ al b;

    am(al al2, Future future) {
        this.b = al2;
        this.a = future;
    }

    public boolean a() {
        return this.a.cancel(true);
    }

    public j a(long l2, TimeUnit timeUnit) {
        return this.b.a(this.a, l2, timeUnit);
    }
}

