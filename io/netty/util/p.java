/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.b.z;
import io.netty.util.c.ae;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.q;
import io.netty.util.r;
import io.netty.util.s;
import io.netty.util.t;
import io.netty.util.u;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class p {
    private static final g a = io.netty.util.c.b.h.a(p.class);
    private static final AtomicInteger b = new AtomicInteger(Integer.MIN_VALUE);
    private static final int c = b.getAndIncrement();
    private static final int d;
    private static final int e;
    private final int f;
    private final z g = new q(this);
    private static final z h;

    protected p() {
        this(d);
    }

    protected p(int n2) {
        this.f = Math.max(0, n2);
    }

    public final Object a() {
        u u2 = (u)this.g.f();
        s s2 = u2.a();
        if (s2 == null) {
            s2 = u2.d();
            s.a(s2, this.b(s2));
        }
        return s.a(s2);
    }

    public final boolean a(Object object, t t2) {
        s s2 = (s)t2;
        if (s.b((s)s2).a != this) {
            return false;
        }
        if (object != s.a(s2)) {
            throw new IllegalArgumentException("o does not belong to handle");
        }
        s2.a();
        return true;
    }

    protected abstract Object b(t var1);

    static /* synthetic */ int a(p p2) {
        return p2.f;
    }

    static /* synthetic */ z b() {
        return h;
    }

    static /* synthetic */ AtomicInteger c() {
        return b;
    }

    static /* synthetic */ int d() {
        return e;
    }

    static /* synthetic */ int e() {
        return c;
    }

    static {
        int n2 = ae.a("io.netty.recycler.maxCapacity.default", 0);
        if (n2 <= 0) {
            n2 = 262144;
        }
        d = n2;
        if (a.d()) {
            a.b("-Dio.netty.recycler.maxCapacity.default: {}", (Object)d);
        }
        e = Math.min(d, 256);
        h = new r();
    }
}

