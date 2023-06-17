/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.b.g;
import io.netty.channel.bj;
import io.netty.channel.bo;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.u;
import io.netty.util.b.z;

final class t
implements bo {
    private static final int b = io.netty.util.c.u.l();
    private static final int c = 2 * b;
    private static final int d = Native.e * c;
    private static final z e = new u();
    private final long f = io.netty.util.c.u.a((long)d);
    private int g;
    private long h;

    private t() {
    }

    private boolean a(g g2) {
        if (this.g == Native.e) {
            return false;
        }
        int n2 = g2.r();
        if (n2 == 0) {
            return true;
        }
        long l2 = g2.aa();
        int n3 = g2.p();
        long l3 = this.a(this.g++);
        long l4 = l3 + (long)b;
        if (b == 8) {
            io.netty.util.c.u.a(l3, l2 + (long)n3);
            io.netty.util.c.u.a(l4, (long)n2);
        } else {
            assert (b == 4);
            io.netty.util.c.u.a(l3, (int)l2 + n3);
            io.netty.util.c.u.a(l4, n2);
        }
        this.h += (long)n2;
        return true;
    }

    long a(int n2, long l2) {
        long l3 = this.a(n2);
        long l4 = l3 + (long)b;
        if (b == 8) {
            long l5 = io.netty.util.c.u.f(l4);
            if (l5 > l2) {
                long l6 = io.netty.util.c.u.f(l3);
                io.netty.util.c.u.a(l3, l6 + l2);
                io.netty.util.c.u.a(l4, l5 - l2);
                return -1L;
            }
            return l5;
        }
        assert (b == 4);
        long l7 = io.netty.util.c.u.e(l4);
        if (l7 > l2) {
            int n3 = io.netty.util.c.u.e(l3);
            io.netty.util.c.u.a(l3, (int)((long)n3 + l2));
            io.netty.util.c.u.a(l4, (int)(l7 - l2));
            return -1L;
        }
        return l7;
    }

    int a() {
        return this.g;
    }

    long b() {
        return this.h;
    }

    long a(int n2) {
        return this.f + (long)(c * n2);
    }

    @Override
    public boolean a(Object object) {
        return object instanceof g && this.a((g)object);
    }

    static t a(bj bj2) {
        t t2 = (t)e.f();
        t2.h = 0L;
        t2.g = 0;
        bj2.a(t2);
        return t2;
    }

    /* synthetic */ t(u u2) {
        this();
    }

    static /* synthetic */ long a(t t2) {
        return t2.f;
    }
}

