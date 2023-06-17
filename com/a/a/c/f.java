/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.aw;
import com.a.a.b.cc;
import com.a.a.b.ce;
import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.b.dy;
import com.a.a.b.eh;
import com.a.a.c.ab;
import com.a.a.c.ai;
import com.a.a.c.an;
import com.a.a.c.bn;
import com.a.a.c.bo;
import com.a.a.c.bw;
import com.a.a.c.dg;
import com.a.a.c.dq;
import com.a.a.c.e;
import com.a.a.c.g;
import com.a.a.c.h;
import com.a.a.c.i;
import com.a.a.c.j;
import com.a.a.c.k;
import com.a.a.c.l;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class f {
    private static final int v = 16;
    private static final int w = 4;
    private static final int x = 0;
    private static final int y = 0;
    static final dx a = dy.a(new g());
    static final ai b = new ai(0L, 0L, 0L, 0L, 0L, 0L);
    static final dx c = new h();
    static final eh d = new i();
    private static final Logger z = Logger.getLogger(f.class.getName());
    static final int e = -1;
    boolean f = true;
    int g = -1;
    int h = -1;
    long i = -1L;
    long j = -1L;
    dq k;
    bw l;
    bw m;
    long n = -1L;
    long o = -1L;
    long p = -1L;
    aw q;
    aw r;
    dg s;
    eh t;
    dx u = a;

    f() {
    }

    public static f a() {
        return new f();
    }

    public static f a(l l2) {
        return l2.b().b();
    }

    public static f a(String string) {
        return com.a.a.c.f.a(com.a.a.c.l.a(string));
    }

    f b() {
        this.f = false;
        return this;
    }

    f a(aw aw2) {
        cl.b(this.q == null, "key equivalence was already set to %s", this.q);
        this.q = (aw)cl.a(aw2);
        return this;
    }

    aw c() {
        return (aw)cc.b(this.q, this.j().a());
    }

    f b(aw aw2) {
        cl.b(this.r == null, "value equivalence was already set to %s", this.r);
        this.r = (aw)cl.a(aw2);
        return this;
    }

    aw d() {
        return (aw)cc.b(this.r, this.m().a());
    }

    public f a(int n2) {
        cl.b(this.g == -1, "initial capacity was already set to %s", this.g);
        cl.a(n2 >= 0);
        this.g = n2;
        return this;
    }

    int e() {
        return this.g == -1 ? 16 : this.g;
    }

    public f b(int n2) {
        cl.b(this.h == -1, "concurrency level was already set to %s", this.h);
        cl.a(n2 > 0);
        this.h = n2;
        return this;
    }

    int f() {
        return this.h == -1 ? 4 : this.h;
    }

    public f a(long l2) {
        cl.b(this.i == -1L, "maximum size was already set to %s", this.i);
        cl.b(this.j == -1L, "maximum weight was already set to %s", this.j);
        cl.b(this.k == null, "maximum size can not be combined with weigher");
        cl.a(l2 >= 0L, (Object)"maximum size must not be negative");
        this.i = l2;
        return this;
    }

    public f b(long l2) {
        cl.b(this.j == -1L, "maximum weight was already set to %s", this.j);
        cl.b(this.i == -1L, "maximum size was already set to %s", this.i);
        this.j = l2;
        cl.a(l2 >= 0L, (Object)"maximum weight must not be negative");
        return this;
    }

    public f a(dq dq2) {
        cl.b(this.k == null);
        if (this.f) {
            cl.b(this.i == -1L, "weigher can not be combined with maximum size", this.i);
        }
        f f2 = this;
        f2.k = (dq)cl.a(dq2);
        return f2;
    }

    long g() {
        if (this.n == 0L || this.o == 0L) {
            return 0L;
        }
        return this.k == null ? this.i : this.j;
    }

    dq h() {
        return (dq)cc.b(this.k, com.a.a.c.k.a);
    }

    public f i() {
        return this.a(bw.c);
    }

    f a(bw bw2) {
        cl.b(this.l == null, "Key strength was already set to %s", new Object[]{this.l});
        this.l = (bw)((Object)cl.a((Object)bw2));
        return this;
    }

    bw j() {
        return (bw)((Object)cc.b((Object)this.l, (Object)bw.a));
    }

    public f k() {
        return this.b(bw.c);
    }

    public f l() {
        return this.b(bw.b);
    }

    f b(bw bw2) {
        cl.b(this.m == null, "Value strength was already set to %s", new Object[]{this.m});
        this.m = (bw)((Object)cl.a((Object)bw2));
        return this;
    }

    bw m() {
        return (bw)((Object)cc.b((Object)this.m, (Object)bw.a));
    }

    public f a(long l2, TimeUnit timeUnit) {
        cl.b(this.n == -1L, "expireAfterWrite was already set to %s ns", this.n);
        cl.a(l2 >= 0L, "duration cannot be negative: %s %s", new Object[]{l2, timeUnit});
        this.n = timeUnit.toNanos(l2);
        return this;
    }

    long n() {
        return this.n == -1L ? 0L : this.n;
    }

    public f b(long l2, TimeUnit timeUnit) {
        cl.b(this.o == -1L, "expireAfterAccess was already set to %s ns", this.o);
        cl.a(l2 >= 0L, "duration cannot be negative: %s %s", new Object[]{l2, timeUnit});
        this.o = timeUnit.toNanos(l2);
        return this;
    }

    long o() {
        return this.o == -1L ? 0L : this.o;
    }

    public f c(long l2, TimeUnit timeUnit) {
        cl.a((Object)timeUnit);
        cl.b(this.p == -1L, "refresh was already set to %s ns", this.p);
        cl.a(l2 > 0L, "duration must be positive: %s %s", new Object[]{l2, timeUnit});
        this.p = timeUnit.toNanos(l2);
        return this;
    }

    long p() {
        return this.p == -1L ? 0L : this.p;
    }

    public f a(eh eh2) {
        cl.b(this.t == null);
        this.t = (eh)cl.a(eh2);
        return this;
    }

    eh a(boolean bl2) {
        if (this.t != null) {
            return this.t;
        }
        return bl2 ? eh.b() : d;
    }

    public f a(dg dg2) {
        cl.b(this.s == null);
        f f2 = this;
        f2.s = (dg)cl.a(dg2);
        return f2;
    }

    dg q() {
        return (dg)cc.b(this.s, com.a.a.c.j.a);
    }

    public f r() {
        this.u = c;
        return this;
    }

    boolean s() {
        return this.u == c;
    }

    dx t() {
        return this.u;
    }

    public an a(ab ab2) {
        this.w();
        return new bn(this, ab2);
    }

    public e u() {
        this.w();
        this.v();
        return new bo(this);
    }

    private void v() {
        cl.b(this.p == -1L, "refreshAfterWrite requires a LoadingCache");
    }

    private void w() {
        if (this.k == null) {
            cl.b(this.j == -1L, "maximumWeight requires weigher");
        } else if (this.f) {
            cl.b(this.j != -1L, "weigher requires maximumWeight");
        } else if (this.j == -1L) {
            z.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public String toString() {
        ce ce2 = cc.a((Object)this);
        if (this.g != -1) {
            ce2.a("initialCapacity", this.g);
        }
        if (this.h != -1) {
            ce2.a("concurrencyLevel", this.h);
        }
        if (this.i != -1L) {
            ce2.a("maximumSize", this.i);
        }
        if (this.j != -1L) {
            ce2.a("maximumWeight", this.j);
        }
        if (this.n != -1L) {
            ce2.a("expireAfterWrite", this.n + "ns");
        }
        if (this.o != -1L) {
            ce2.a("expireAfterAccess", this.o + "ns");
        }
        if (this.l != null) {
            ce2.a("keyStrength", com.a.a.b.e.a(this.l.toString()));
        }
        if (this.m != null) {
            ce2.a("valueStrength", com.a.a.b.e.a(this.m.toString()));
        }
        if (this.q != null) {
            ce2.a("keyEquivalence");
        }
        if (this.r != null) {
            ce2.a("valueEquivalence");
        }
        if (this.s != null) {
            ce2.a("removalListener");
        }
        return ce2.toString();
    }
}

