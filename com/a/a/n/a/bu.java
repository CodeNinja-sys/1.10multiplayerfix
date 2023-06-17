/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.bv;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class bu {
    static final Logger a = Logger.getLogger(bu.class.getName());
    private bv b;
    private boolean c;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Runnable runnable, Executor executor) {
        cl.a(runnable, (Object)"Runnable was null.");
        cl.a(executor, (Object)"Executor was null.");
        bu bu2 = this;
        synchronized (bu2) {
            if (!this.c) {
                this.b = new bv(runnable, executor, this.b);
                return;
            }
        }
        bu.b(runnable, executor);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        bv bv2;
        Object object = this;
        synchronized (object) {
            if (this.c) {
                return;
            }
            this.c = true;
            bv2 = this.b;
            this.b = null;
        }
        object = null;
        while (bv2 != null) {
            bv bv3 = bv2;
            bv2 = bv2.c;
            bv3.c = object;
            object = bv3;
        }
        while (object != null) {
            bu.b(((bv)object).a, ((bv)object).b);
            object = ((bv)object).c;
        }
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (RuntimeException runtimeException) {
            a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, runtimeException);
        }
    }
}

