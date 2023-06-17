/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.a;
import org.apache.logging.log4j.core.c.d;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.f;

public final class c
extends a {
    private static final long d = 1000000000L;
    private static final int e = 10;
    private static final int f = 100;
    private static final int g = 32;
    private final b h;
    private final long i;
    private final DelayQueue j = new DelayQueue();
    private final Queue k = new ConcurrentLinkedQueue();

    private c(b b2, float f2, long l2, e e2, e e3) {
        super(e2, e3);
        this.h = b2;
        this.i = (long)(1.0E9f * ((float)l2 / f2));
        int n2 = 0;
        while ((long)n2 < l2) {
            this.k.add(new d(this));
            ++n2;
        }
    }

    @Override
    public e a(i i2, b b2, f f2, String string, Object ... arrobject) {
        return this.a(b2);
    }

    @Override
    public e a(i i2, b b2, f f2, Object object, Throwable throwable) {
        return this.a(b2);
    }

    @Override
    public e a(i i2, b b2, f f2, m m2, Throwable throwable) {
        return this.a(b2);
    }

    @Override
    public e a(h h2) {
        return this.a(h2.a());
    }

    private e a(b b2) {
        if (this.h.a(b2)) {
            d d2 = (d)this.j.poll();
            while (d2 != null) {
                this.k.add(d2);
                d2 = (d)this.j.poll();
            }
            d2 = (d)this.k.poll();
            if (d2 != null) {
                d2.a(this.i);
                this.j.add(d2);
                return this.b;
            }
            return this.c;
        }
        return this.b;
    }

    public int c() {
        return this.k.size();
    }

    public void d() {
        for (d d2 : this.j) {
            this.j.remove(d2);
            this.k.add(d2);
        }
    }

    @Override
    public String toString() {
        return "level=" + this.h.toString() + ", interval=" + this.i + ", max=" + this.j.size();
    }

    public static c a(String string, String string2, String string3, String string4, String string5) {
        float f2;
        e e2 = org.apache.logging.log4j.core.e.a(string4, org.apache.logging.log4j.core.e.b);
        e e3 = org.apache.logging.log4j.core.e.a(string5, org.apache.logging.log4j.core.e.c);
        b b2 = org.apache.logging.log4j.b.a(string, org.apache.logging.log4j.b.d);
        float f3 = f2 = string2 == null ? 10.0f : Float.parseFloat(string2);
        if (f2 <= 0.0f) {
            f2 = 10.0f;
        }
        long l2 = string3 == null ? (long)(f2 * 100.0f) : Long.parseLong(string3);
        return new c(b2, f2, l2, e2, e3);
    }
}

