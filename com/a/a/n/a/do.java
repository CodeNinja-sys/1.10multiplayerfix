/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.d.yk;
import com.a.a.n.a.dp;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

final class do
implements Runnable {
    private static final Logger a = Logger.getLogger(do.class.getName());
    private final Object b;
    private final Executor c;
    private final Queue d = yk.a();
    private boolean e;

    do(Object object, Executor executor) {
        this.b = cl.a(object);
        this.c = (Executor)cl.a(executor);
    }

    synchronized void a(dp dp2) {
        this.d.add(dp2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        boolean bl2 = false;
        do do_ = this;
        synchronized (do_) {
            if (!this.e) {
                this.e = true;
                bl2 = true;
            }
        }
        if (bl2) {
            try {
                this.c.execute(this);
            }
            catch (RuntimeException runtimeException) {
                do do_2 = this;
                synchronized (do_2) {
                    this.e = false;
                }
                a.log(Level.SEVERE, "Exception while running callbacks for " + this.b + " on " + this.c, runtimeException);
                throw runtimeException;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block18: {
            Object object;
            boolean bl2 = true;
            block14: while (true) {
                while (true) {
                    do do_ = this;
                    synchronized (do_) {
                        cl.b(this.e);
                        object = (dp)this.d.poll();
                        if (object == null) {
                            this.e = false;
                            bl2 = false;
                            break block18;
                        }
                    }
                    try {
                        ((dp)object).a(this.b);
                        continue block14;
                    }
                    catch (RuntimeException runtimeException) {
                        a.log(Level.SEVERE, "Exception while executing callback: " + this.b + "." + dp.a((dp)object), runtimeException);
                        continue;
                    }
                    break;
                }
            }
            finally {
                if (bl2) {
                    object = this;
                    synchronized (object) {
                        this.e = false;
                    }
                }
            }
        }
    }
}

