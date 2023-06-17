/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ab;
import com.a.a.n.a.ac;
import com.a.a.n.a.ad;
import com.a.a.n.a.q;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class aa {
    public static aa a(long l2, long l3, TimeUnit timeUnit) {
        return new ab(l2, l3, timeUnit);
    }

    public static aa b(long l2, long l3, TimeUnit timeUnit) {
        return new ac(l2, l3, timeUnit);
    }

    abstract Future a(ad var1, ScheduledExecutorService var2, Runnable var3);

    private aa() {
    }

    /* synthetic */ aa(q q2) {
        this();
    }
}

