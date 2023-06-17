/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import org.apache.commons.c.i.ao;
import org.apache.commons.c.i.ap;
import org.apache.commons.c.i.f;

public class am {
    private static final long a = 1000000L;
    private ap b = ap.a;
    private ao c = ao.b;
    private long d;
    private long e;
    private long f;

    public void a() {
        if (this.b == ap.c) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (this.b != ap.a) {
            throw new IllegalStateException("Stopwatch already started. ");
        }
        this.d = System.nanoTime();
        this.e = System.currentTimeMillis();
        this.b = ap.b;
    }

    public void b() {
        if (this.b != ap.b && this.b != ap.d) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (this.b == ap.b) {
            this.f = System.nanoTime();
        }
        this.b = ap.c;
    }

    public void c() {
        this.b = ap.a;
        this.c = ao.b;
    }

    public void d() {
        if (this.b != ap.b) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        this.f = System.nanoTime();
        this.c = ao.a;
    }

    public void e() {
        if (this.c != ao.a) {
            throw new IllegalStateException("Stopwatch has not been split. ");
        }
        this.c = ao.b;
    }

    public void f() {
        if (this.b != ap.b) {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        this.f = System.nanoTime();
        this.b = ap.d;
    }

    public void g() {
        if (this.b != ap.d) {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        this.d += System.nanoTime() - this.f;
        this.b = ap.b;
    }

    public long h() {
        return this.i() / 1000000L;
    }

    public long i() {
        if (this.b == ap.c || this.b == ap.d) {
            return this.f - this.d;
        }
        if (this.b == ap.a) {
            return 0L;
        }
        if (this.b == ap.b) {
            return System.nanoTime() - this.d;
        }
        throw new RuntimeException("Illegal running state has occurred.");
    }

    public long j() {
        return this.k() / 1000000L;
    }

    public long k() {
        if (this.c != ao.a) {
            throw new IllegalStateException("Stopwatch must be split to get the split time. ");
        }
        return this.f - this.d;
    }

    public long l() {
        if (this.b == ap.a) {
            throw new IllegalStateException("Stopwatch has not been started");
        }
        return this.e;
    }

    public String toString() {
        return org.apache.commons.c.i.f.a(this.h());
    }

    public String m() {
        return org.apache.commons.c.i.f.a(this.j());
    }

    public boolean n() {
        return this.b.a();
    }

    public boolean o() {
        return this.b.c();
    }

    public boolean p() {
        return this.b.b();
    }
}

