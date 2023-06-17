/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.et;
import com.a.a.n.a.eu;
import com.a.a.n.a.p;
import java.util.concurrent.ScheduledExecutorService;

class w
extends et {
    final /* synthetic */ ScheduledExecutorService a;
    final /* synthetic */ p b;

    w(p p2, ScheduledExecutorService scheduledExecutorService) {
        this.b = p2;
        this.a = scheduledExecutorService;
    }

    @Override
    public void a(eu eu2) {
        this.a.shutdown();
    }

    @Override
    public void a(eu eu2, Throwable throwable) {
        this.a.shutdown();
    }
}

