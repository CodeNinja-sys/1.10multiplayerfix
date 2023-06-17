/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.a.i.c.a.h;
import org.apache.a.o.a;

public class l {
    private final Condition a;
    private final h b;
    private Thread c;
    private boolean d;

    public l(Condition condition, h h2) {
        org.apache.a.o.a.a(condition, "Condition");
        this.a = condition;
        this.b = h2;
    }

    public final Condition a() {
        return this.a;
    }

    public final h b() {
        return this.b;
    }

    public final Thread c() {
        return this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(Date date) {
        if (this.c != null) {
            throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.c);
        }
        if (this.d) {
            throw new InterruptedException("Operation interrupted");
        }
        this.c = Thread.currentThread();
        boolean bl2 = false;
        try {
            if (date != null) {
                bl2 = this.a.awaitUntil(date);
            } else {
                this.a.await();
                bl2 = true;
            }
            if (this.d) {
                throw new InterruptedException("Operation interrupted");
            }
        }
        finally {
            this.c = null;
        }
        return bl2;
    }

    public void d() {
        if (this.c == null) {
            throw new IllegalStateException("Nobody waiting on this object.");
        }
        this.a.signalAll();
    }

    public void e() {
        this.d = true;
        this.a.signalAll();
    }
}

