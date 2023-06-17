/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.c.f.a;
import io.netty.c.f.g;
import io.netty.c.f.h;
import io.netty.c.f.i;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.w;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class f
extends a {
    private Map h = new HashMap();

    void a(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService == null) {
            throw new NullPointerException("executor");
        }
        i i2 = new i(this, scheduledExecutorService, "GlobalTC", this.f);
        this.a(i2);
        i2.a();
    }

    public f(ScheduledExecutorService scheduledExecutorService, long l2, long l3, long l4, long l5) {
        super(l2, l3, l4, l5);
        this.a(scheduledExecutorService);
    }

    public f(ScheduledExecutorService scheduledExecutorService, long l2, long l3, long l4) {
        super(l2, l3, l4);
        this.a(scheduledExecutorService);
    }

    public f(ScheduledExecutorService scheduledExecutorService, long l2, long l3) {
        super(l2, l3);
        this.a(scheduledExecutorService);
    }

    public f(ScheduledExecutorService scheduledExecutorService, long l2) {
        super(l2);
        this.a(scheduledExecutorService);
    }

    public f(w w2) {
        this.a(w2);
    }

    public final void h() {
        if (this.d != null) {
            this.d.b();
        }
    }

    @Override
    public void e(bd bd2) {
        Integer n2 = bd2.b().hashCode();
        LinkedList linkedList = new LinkedList();
        this.h.put(n2, linkedList);
    }

    @Override
    public synchronized void f(bd bd2) {
        Integer n2 = bd2.b().hashCode();
        List list = (List)this.h.remove(n2);
        if (list != null) {
            for (h h2 : list) {
                if (!(h2.b instanceof io.netty.b.g)) continue;
                ((io.netty.b.g)h2.b).ad();
            }
            list.clear();
        }
    }

    @Override
    protected synchronized void a(bd bd2, Object object, long l2, bw bw2) {
        Integer n2 = bd2.b().hashCode();
        LinkedList<h> linkedList = (LinkedList<h>)this.h.get(n2);
        if (l2 == 0L && (linkedList == null || linkedList.isEmpty())) {
            bd2.a(object, bw2);
            return;
        }
        h h2 = new h(l2, object, bw2, null);
        if (linkedList == null) {
            linkedList = new LinkedList<h>();
            this.h.put(n2, linkedList);
        }
        linkedList.add(h2);
        LinkedList<h> linkedList2 = linkedList;
        bd2.e().a(new g(this, bd2, linkedList2), l2, TimeUnit.MILLISECONDS);
    }

    private synchronized void a(bd bd2, List list) {
        while (!list.isEmpty()) {
            h h2 = (h)list.remove(0);
            if (h2.a <= System.currentTimeMillis()) {
                bd2.a(h2.b, h2.c);
                continue;
            }
            list.add(0, h2);
            break;
        }
        bd2.q();
    }

    static /* synthetic */ void a(f f2, bd bd2, List list) {
        f2.a(bd2, list);
    }
}

