/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.b.cl;
import com.a.a.f.f;
import com.a.a.f.h;
import com.a.a.f.l;
import com.a.a.f.n;
import com.a.a.f.q;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class e
extends h {
    private final Executor a;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();

    public e(String string, Executor executor) {
        super(string);
        this.a = (Executor)cl.a(executor);
    }

    public e(Executor executor, q q2) {
        super(q2);
        this.a = (Executor)cl.a(executor);
    }

    public e(Executor executor) {
        super("default");
        this.a = (Executor)cl.a(executor);
    }

    @Override
    void a(Object object, n n2) {
        this.b.offer(new l(object, n2));
    }

    @Override
    protected void a() {
        l l2;
        while ((l2 = (l)this.b.poll()) != null) {
            this.b(l2.a, l2.b);
        }
    }

    @Override
    void b(Object object, n n2) {
        cl.a(object);
        cl.a(n2);
        this.a.execute(new f(this, object, n2));
    }

    static /* synthetic */ void a(e e2, Object object, n n2) {
        super.b(object, n2);
    }
}

