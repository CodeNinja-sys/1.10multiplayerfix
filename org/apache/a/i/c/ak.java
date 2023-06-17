/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.a.f.f;
import org.apache.a.f.t;
import org.apache.a.i.c.aj;

class ak
implements f {
    final /* synthetic */ Future a;
    final /* synthetic */ aj b;

    ak(aj aj2, Future future) {
        this.b = aj2;
        this.a = future;
    }

    public void a() {
        this.a.cancel(true);
    }

    public t a(long l2, TimeUnit timeUnit) {
        return this.b.a(this.a, l2, timeUnit);
    }
}

