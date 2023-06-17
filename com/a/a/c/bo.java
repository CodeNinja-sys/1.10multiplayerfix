/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.ab;
import com.a.a.c.ai;
import com.a.a.c.ao;
import com.a.a.c.ap;
import com.a.a.c.b;
import com.a.a.c.bp;
import com.a.a.c.bq;
import com.a.a.c.bt;
import com.a.a.c.e;
import com.a.a.c.f;
import com.a.a.d.jt;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

class bo
implements e,
Serializable {
    final ao a;
    private static final long b = 1L;

    bo(f f2) {
        this(new ao(f2, null));
    }

    private bo(ao ao2) {
        this.a = ao2;
    }

    @Override
    public Object e(Object object) {
        return this.a.b(object);
    }

    @Override
    public Object a(Object object, Callable callable) {
        cl.a(callable);
        return this.a.a(object, (ab)new bp(this, callable));
    }

    @Override
    public jt a(Iterable iterable) {
        return this.a.a(iterable);
    }

    @Override
    public void a(Object object, Object object2) {
        this.a.put(object, object2);
    }

    @Override
    public void a(Map map) {
        this.a.putAll(map);
    }

    @Override
    public void b(Object object) {
        cl.a(object);
        this.a.remove(object);
    }

    @Override
    public void b(Iterable iterable) {
        this.a.c(iterable);
    }

    @Override
    public void c() {
        this.a.clear();
    }

    @Override
    public long b() {
        return this.a.u();
    }

    @Override
    public ConcurrentMap e() {
        return this.a;
    }

    @Override
    public ai d() {
        b b2 = new b();
        b2.a(this.a.y);
        for (bt bt2 : this.a.j) {
            b2.a(bt2.n);
        }
        return b2.b();
    }

    @Override
    public void a() {
        this.a.t();
    }

    Object f() {
        return new bq(this.a);
    }

    /* synthetic */ bo(ao ao2, ap ap2) {
        this(ao2);
    }
}

