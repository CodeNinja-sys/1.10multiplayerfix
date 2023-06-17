/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.m;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.a.d.c;
import org.apache.a.o.a;

abstract class k
implements Future {
    private final Lock a;
    private final c b;
    private final Condition c;
    private volatile boolean d;
    private volatile boolean e;
    private Object f;

    k(Lock lock, c c2) {
        this.a = lock;
        this.c = lock.newCondition();
        this.b = c2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean cancel(boolean bl2) {
        this.a.lock();
        try {
            if (this.e) {
                boolean bl3 = false;
                return bl3;
            }
            this.e = true;
            this.d = true;
            if (this.b != null) {
                this.b.a();
            }
            this.c.signalAll();
            boolean bl4 = true;
            return bl4;
        }
        finally {
            this.a.unlock();
        }
    }

    public boolean isCancelled() {
        return this.d;
    }

    public boolean isDone() {
        return this.e;
    }

    public Object get() {
        try {
            return this.get(0L, TimeUnit.MILLISECONDS);
        }
        catch (TimeoutException timeoutException) {
            throw new ExecutionException(timeoutException);
        }
    }

    public Object get(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        this.a.lock();
        try {
            if (this.e) {
                Object object = this.f;
                return object;
            }
            this.f = this.b(l2, timeUnit);
            this.e = true;
            if (this.b != null) {
                this.b.a(this.f);
            }
            Object object = this.f;
            return object;
        }
        catch (IOException iOException) {
            this.e = true;
            this.f = null;
            if (this.b != null) {
                this.b.a(iOException);
            }
            throw new ExecutionException(iOException);
        }
        finally {
            this.a.unlock();
        }
    }

    protected abstract Object b(long var1, TimeUnit var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(Date date) {
        this.a.lock();
        try {
            boolean bl2;
            if (this.d) {
                throw new InterruptedException("Operation interrupted");
            }
            if (date != null) {
                bl2 = this.c.awaitUntil(date);
            } else {
                this.c.await();
                bl2 = true;
            }
            if (this.d) {
                throw new InterruptedException("Operation interrupted");
            }
            boolean bl3 = bl2;
            return bl3;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        this.a.lock();
        try {
            this.c.signalAll();
        }
        finally {
            this.a.unlock();
        }
    }
}

