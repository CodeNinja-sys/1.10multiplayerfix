/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.d;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.a.d.b;
import org.apache.a.d.c;

public class a
implements Future,
b {
    private final c a;
    private volatile boolean b;
    private volatile boolean c;
    private volatile Object d;
    private volatile Exception e;

    public a(c c2) {
        this.a = c2;
    }

    public boolean isCancelled() {
        return this.c;
    }

    public boolean isDone() {
        return this.b;
    }

    private Object b() {
        if (this.e != null) {
            throw new ExecutionException(this.e);
        }
        return this.d;
    }

    public synchronized Object get() {
        while (!this.b) {
            this.wait();
        }
        return this.b();
    }

    public synchronized Object get(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        long l3 = timeUnit.toMillis(l2);
        long l4 = l3 <= 0L ? 0L : System.currentTimeMillis();
        long l5 = l3;
        if (this.b) {
            return this.b();
        }
        if (l5 <= 0L) {
            throw new TimeoutException();
        }
        do {
            this.wait(l5);
            if (!this.b) continue;
            return this.b();
        } while ((l5 = l3 - (System.currentTimeMillis() - l4)) > 0L);
        throw new TimeoutException();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(Object object) {
        a a2 = this;
        synchronized (a2) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.d = object;
            this.notifyAll();
        }
        if (this.a != null) {
            this.a.a(object);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(Exception exception) {
        a a2 = this;
        synchronized (a2) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.e = exception;
            this.notifyAll();
        }
        if (this.a != null) {
            this.a.a(exception);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean cancel(boolean bl2) {
        a a2 = this;
        synchronized (a2) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.notifyAll();
        }
        if (this.a != null) {
            this.a.a();
        }
        return true;
    }

    public boolean a() {
        return this.cancel(true);
    }
}

