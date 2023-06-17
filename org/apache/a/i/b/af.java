/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.concurrent.atomic.AtomicLong;

class af {
    private final AtomicLong a = new AtomicLong(0L);
    private final AtomicLong b = new AtomicLong(0L);

    af() {
    }

    public void a(long l2) {
        this.a.incrementAndGet();
        this.b.addAndGet(System.currentTimeMillis() - l2);
    }

    public long a() {
        return this.a.get();
    }

    public long b() {
        long l2 = this.a.get();
        return l2 > 0L ? this.b.get() / l2 : 0L;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[count=").append(this.a()).append(", averageDuration=").append(this.b()).append("]");
        return stringBuilder.toString();
    }
}

