/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.m;

import java.util.concurrent.TimeUnit;
import org.apache.a.o.a;

public abstract class i {
    private final String a;
    private final Object b;
    private final Object c;
    private final long d;
    private final long e;
    private long f;
    private long g;
    private volatile Object h;

    public i(String string, Object object, Object object2, long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a(object, "Route");
        org.apache.a.o.a.a(object2, "Connection");
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        this.a = string;
        this.b = object;
        this.c = object2;
        this.d = System.currentTimeMillis();
        this.e = l2 > 0L ? this.d + timeUnit.toMillis(l2) : Long.MAX_VALUE;
        this.g = this.e;
    }

    public i(String string, Object object, Object object2) {
        this(string, object, object2, 0L, TimeUnit.MILLISECONDS);
    }

    public String g() {
        return this.a;
    }

    public Object h() {
        return this.b;
    }

    public Object i() {
        return this.c;
    }

    public long j() {
        return this.d;
    }

    public long k() {
        return this.e;
    }

    public Object l() {
        return this.h;
    }

    public void a(Object object) {
        this.h = object;
    }

    public synchronized long m() {
        return this.f;
    }

    public synchronized long n() {
        return this.g;
    }

    public synchronized void a(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        this.f = System.currentTimeMillis();
        long l3 = l2 > 0L ? this.f + timeUnit.toMillis(l2) : Long.MAX_VALUE;
        this.g = Math.min(l3, this.e);
    }

    public synchronized boolean a(long l2) {
        return l2 >= this.g;
    }

    public abstract void f();

    public abstract boolean e();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id:");
        stringBuilder.append(this.a);
        stringBuilder.append("][route:");
        stringBuilder.append(this.b);
        stringBuilder.append("][state:");
        stringBuilder.append(this.h);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

