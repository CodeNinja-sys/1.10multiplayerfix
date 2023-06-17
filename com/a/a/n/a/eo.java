/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.ep;
import com.a.a.n.a.eq;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

final class eo
implements Executor {
    private static final Logger a = Logger.getLogger(eo.class.getName());
    private final Executor b;
    private final Queue c = new ArrayDeque();
    private boolean d = false;
    private final eq e = new eq(this, null);
    private final Object f = new ep(this);

    public eo(Executor executor) {
        cl.a(executor, (Object)"'executor' must not be null.");
        this.b = executor;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void execute(Runnable runnable) {
        cl.a(runnable, (Object)"'r' must not be null.");
        boolean bl2 = false;
        Object object = this.f;
        synchronized (object) {
            this.c.add(runnable);
            if (!this.d) {
                this.d = true;
                bl2 = true;
            }
        }
        if (bl2) {
            boolean bl3 = true;
            try {
                this.b.execute(this.e);
                bl3 = false;
            }
            finally {
                if (bl3) {
                    Object object2 = this.f;
                    synchronized (object2) {
                        this.d = false;
                    }
                }
            }
        }
    }

    static /* synthetic */ boolean a(eo eo2) {
        return eo2.d;
    }

    static /* synthetic */ Object b(eo eo2) {
        return eo2.f;
    }

    static /* synthetic */ Queue c(eo eo2) {
        return eo2.c;
    }

    static /* synthetic */ boolean a(eo eo2, boolean bl2) {
        eo2.d = bl2;
        return eo2.d;
    }

    static /* synthetic */ Logger a() {
        return a;
    }
}

