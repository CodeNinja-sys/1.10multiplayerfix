/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.aw;
import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.b.ce;
import com.a.a.b.cl;
import com.a.a.b.e;
import com.a.a.b.eh;
import com.a.a.d.ht;
import com.a.a.d.qn;
import com.a.a.d.qo;
import com.a.a.d.qp;
import com.a.a.d.qq;
import com.a.a.d.qw;
import com.a.a.d.qy;
import com.a.a.d.sh;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public final class ql
extends ht {
    private static final int n = 16;
    private static final int o = 4;
    private static final int p = 0;
    static final int b = -1;
    boolean c;
    int d = -1;
    int e = -1;
    int f = -1;
    sh g;
    sh h;
    long i = -1L;
    long j = -1L;
    qq k;
    aw l;
    eh m;

    ql b(aw aw2) {
        cl.b(this.l == null, "key equivalence was already set to %s", this.l);
        this.l = (aw)cl.a(aw2);
        this.c = true;
        return this;
    }

    aw g() {
        return (aw)cc.b(this.l, this.k().a());
    }

    public ql d(int n2) {
        cl.b(this.d == -1, "initial capacity was already set to %s", this.d);
        cl.a(n2 >= 0);
        this.d = n2;
        return this;
    }

    int h() {
        return this.d == -1 ? 16 : this.d;
    }

    ql e(int n2) {
        cl.b(this.f == -1, "maximum size was already set to %s", this.f);
        cl.a(n2 >= 0, (Object)"maximum size must not be negative");
        this.f = n2;
        this.c = true;
        if (this.f == 0) {
            this.k = qq.e;
        }
        return this;
    }

    public ql f(int n2) {
        cl.b(this.e == -1, "concurrency level was already set to %s", this.e);
        cl.a(n2 > 0);
        this.e = n2;
        return this;
    }

    int i() {
        return this.e == -1 ? 4 : this.e;
    }

    public ql j() {
        return this.a(sh.c);
    }

    ql a(sh sh2) {
        cl.b(this.g == null, "Key strength was already set to %s", new Object[]{this.g});
        this.g = (sh)((Object)cl.a((Object)sh2));
        cl.a(this.g != sh.b, (Object)"Soft keys are not supported");
        if (sh2 != sh.a) {
            this.c = true;
        }
        return this;
    }

    sh k() {
        return (sh)((Object)cc.b((Object)this.g, (Object)sh.a));
    }

    public ql l() {
        return this.b(sh.c);
    }

    public ql m() {
        return this.b(sh.b);
    }

    ql b(sh sh2) {
        cl.b(this.h == null, "Value strength was already set to %s", new Object[]{this.h});
        this.h = (sh)((Object)cl.a((Object)sh2));
        if (sh2 != sh.a) {
            this.c = true;
        }
        return this;
    }

    sh n() {
        return (sh)((Object)cc.b((Object)this.h, (Object)sh.a));
    }

    ql c(long l2, TimeUnit timeUnit) {
        this.e(l2, timeUnit);
        this.i = timeUnit.toNanos(l2);
        if (l2 == 0L && this.k == null) {
            this.k = qq.d;
        }
        this.c = true;
        return this;
    }

    private void e(long l2, TimeUnit timeUnit) {
        cl.b(this.i == -1L, "expireAfterWrite was already set to %s ns", this.i);
        cl.b(this.j == -1L, "expireAfterAccess was already set to %s ns", this.j);
        cl.a(l2 >= 0L, "duration cannot be negative: %s %s", new Object[]{l2, timeUnit});
    }

    long o() {
        return this.i == -1L ? 0L : this.i;
    }

    ql d(long l2, TimeUnit timeUnit) {
        this.e(l2, timeUnit);
        this.j = timeUnit.toNanos(l2);
        if (l2 == 0L && this.k == null) {
            this.k = qq.d;
        }
        this.c = true;
        return this;
    }

    long p() {
        return this.j == -1L ? 0L : this.j;
    }

    eh q() {
        return (eh)cc.b(this.m, eh.b());
    }

    ht a(qw qw2) {
        cl.b(this.a == null);
        ql ql2 = this;
        ql2.a = (qw)cl.a(qw2);
        this.c = true;
        return ql2;
    }

    @Override
    public ConcurrentMap e() {
        if (!this.c) {
            return new ConcurrentHashMap(this.h(), 0.75f, this.i());
        }
        return (ConcurrentMap)((Object)(this.k == null ? new qy(this) : new qp(this)));
    }

    @Override
    qy f() {
        return new qy(this);
    }

    @Override
    ConcurrentMap a(bl bl2) {
        return (ConcurrentMap)((Object)(this.k == null ? new qn(this, bl2) : new qo(this, bl2)));
    }

    public String toString() {
        ce ce2 = cc.a((Object)this);
        if (this.d != -1) {
            ce2.a("initialCapacity", this.d);
        }
        if (this.e != -1) {
            ce2.a("concurrencyLevel", this.e);
        }
        if (this.f != -1) {
            ce2.a("maximumSize", this.f);
        }
        if (this.i != -1L) {
            ce2.a("expireAfterWrite", this.i + "ns");
        }
        if (this.j != -1L) {
            ce2.a("expireAfterAccess", this.j + "ns");
        }
        if (this.g != null) {
            ce2.a("keyStrength", com.a.a.b.e.a(this.g.toString()));
        }
        if (this.h != null) {
            ce2.a("valueStrength", com.a.a.b.e.a(this.h.toString()));
        }
        if (this.l != null) {
            ce2.a("keyEquivalence");
        }
        if (this.a != null) {
            ce2.a("removalListener");
        }
        return ce2.toString();
    }

    @Override
    /* synthetic */ ht b(long l2, TimeUnit timeUnit) {
        return this.d(l2, timeUnit);
    }

    @Override
    /* synthetic */ ht a(long l2, TimeUnit timeUnit) {
        return this.c(l2, timeUnit);
    }

    @Override
    public /* synthetic */ ht c() {
        return this.m();
    }

    @Override
    public /* synthetic */ ht b() {
        return this.l();
    }

    @Override
    public /* synthetic */ ht a() {
        return this.j();
    }

    @Override
    public /* synthetic */ ht c(int n2) {
        return this.f(n2);
    }

    @Override
    /* synthetic */ ht b(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ ht a(int n2) {
        return this.d(n2);
    }

    @Override
    /* synthetic */ ht a(aw aw2) {
        return this.b(aw2);
    }
}

