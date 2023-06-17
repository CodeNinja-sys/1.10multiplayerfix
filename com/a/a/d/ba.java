/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.lo;
import com.a.a.d.n;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class ba
extends n
implements aac {
    private static final long a = 7431625294878419160L;

    protected ba(Map map) {
        super(map);
    }

    abstract Set a();

    Set b() {
        return lo.j();
    }

    @Override
    public Set a(Object object) {
        return (Set)super.c(object);
    }

    @Override
    public Set u() {
        return (Set)super.l();
    }

    @Override
    public Set b(Object object) {
        return (Set)super.d(object);
    }

    @Override
    public Set a(Object object, Iterable iterable) {
        return (Set)super.b(object, iterable);
    }

    @Override
    public Map c() {
        return super.c();
    }

    @Override
    public boolean a(Object object, Object object2) {
        return super.a(object, object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.a();
    }

    @Override
    /* synthetic */ Collection e() {
        return this.b();
    }
}

