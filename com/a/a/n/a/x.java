/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.aa;
import com.a.a.n.a.ad;
import com.a.a.n.a.y;
import com.a.a.n.a.z;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public abstract class x
extends aa {
    public x() {
        super(null);
    }

    @Override
    final Future a(ad ad2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        y y2 = new y(this, ad2, scheduledExecutorService, runnable);
        y2.b();
        return y2;
    }

    protected abstract z a();
}

