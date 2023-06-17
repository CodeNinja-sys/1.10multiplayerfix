/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ce;
import com.a.a.n.a.dl;
import com.a.a.n.a.dn;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class ee
extends ce
implements dn {
    private final ScheduledFuture a;

    public ee(dl dl2, ScheduledFuture scheduledFuture) {
        super(dl2);
        this.a = scheduledFuture;
    }

    @Override
    public boolean cancel(boolean bl2) {
        boolean bl3 = super.cancel(bl2);
        if (bl3) {
            this.a.cancel(bl2);
        }
        return bl3;
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    public int a(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((Delayed)object);
    }
}

