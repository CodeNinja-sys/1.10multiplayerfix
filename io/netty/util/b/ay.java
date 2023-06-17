/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.av;
import io.netty.util.b.ax;
import io.netty.util.b.w;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

final class ay
extends av
implements ax {
    private static final AtomicLong c = new AtomicLong();
    private static final long d = System.nanoTime();
    private final long e = c.getAndIncrement();
    private final Queue f;
    private long g;
    private final long h;

    static long e() {
        return System.nanoTime() - d;
    }

    static long c(long l2) {
        return ay.e() + l2;
    }

    ay(w w2, Queue queue, Runnable runnable, Object object, long l2) {
        this(w2, queue, ay.a(runnable, object), l2);
    }

    ay(w w2, Queue queue, Callable callable, long l2, long l3) {
        super(w2, callable);
        if (l3 == 0L) {
            throw new IllegalArgumentException("period: 0 (expected: != 0)");
        }
        this.f = queue;
        this.g = l2;
        this.h = l3;
    }

    ay(w w2, Queue queue, Callable callable, long l2) {
        super(w2, callable);
        this.f = queue;
        this.g = l2;
        this.h = 0L;
    }

    @Override
    protected w bu_() {
        return super.bu_();
    }

    public long f() {
        return this.g;
    }

    public long g() {
        return Math.max(0L, this.f() - ay.e());
    }

    public long d(long l2) {
        return Math.max(0L, this.f() - (l2 - d));
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.g(), TimeUnit.NANOSECONDS);
    }

    public int a(Delayed delayed) {
        if (this == delayed) {
            return 0;
        }
        ay ay2 = (ay)delayed;
        long l2 = this.f() - ay2.f();
        if (l2 < 0L) {
            return -1;
        }
        if (l2 > 0L) {
            return 1;
        }
        if (this.e < ay2.e) {
            return -1;
        }
        if (this.e == ay2.e) {
            throw new Error();
        }
        return 1;
    }

    @Override
    public void run() {
        assert (this.bu_().bt_());
        try {
            if (this.h == 0L) {
                if (this.b()) {
                    Object v2 = this.a.call();
                    this.c(v2);
                }
            } else if (!this.isCancelled()) {
                this.a.call();
                if (!this.bu_().isShutdown()) {
                    long l2 = this.h;
                    this.g = l2 > 0L ? (this.g += l2) : ay.e() - l2;
                    if (!this.isCancelled()) {
                        this.f.add(this);
                    }
                }
            }
        }
        catch (Throwable throwable) {
            this.a(throwable);
        }
    }

    @Override
    protected StringBuilder J() {
        StringBuilder stringBuilder = super.J();
        stringBuilder.setCharAt(stringBuilder.length() - 1, ',');
        stringBuilder.append(" id: ");
        stringBuilder.append(this.e);
        stringBuilder.append(", deadline: ");
        stringBuilder.append(this.g);
        stringBuilder.append(", period: ");
        stringBuilder.append(this.h);
        stringBuilder.append(')');
        return stringBuilder;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((Delayed)object);
    }
}

