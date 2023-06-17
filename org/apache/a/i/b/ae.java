/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.i.b.af;

public final class ae {
    private final AtomicLong a = new AtomicLong();
    private final AtomicLong b = new AtomicLong();
    private final af c = new af();
    private final af d = new af();
    private final af e = new af();
    private final af f = new af();

    ae() {
    }

    AtomicLong a() {
        return this.a;
    }

    AtomicLong b() {
        return this.b;
    }

    af c() {
        return this.c;
    }

    af d() {
        return this.d;
    }

    af e() {
        return this.e;
    }

    af f() {
        return this.f;
    }

    public long g() {
        return this.a.get();
    }

    public long h() {
        return this.b.get();
    }

    public long i() {
        return this.c.a();
    }

    public long j() {
        return this.c.b();
    }

    public long k() {
        return this.d.a();
    }

    public long l() {
        return this.d.b();
    }

    public long m() {
        return this.e.a();
    }

    public long n() {
        return this.e.b();
    }

    public long o() {
        return this.f.a();
    }

    public long p() {
        return this.f.b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[activeConnections=").append(this.a).append(", scheduledConnections=").append(this.b).append(", successfulConnections=").append(this.c).append(", failedConnections=").append(this.d).append(", requests=").append(this.e).append(", tasks=").append(this.f).append("]");
        return stringBuilder.toString();
    }
}

