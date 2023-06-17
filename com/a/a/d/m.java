/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jl;
import com.a.a.d.n;
import com.a.a.d.ou;
import java.util.Collection;
import java.util.List;
import java.util.Map;

abstract class m
extends n
implements ou {
    private static final long a = 6588350623831699109L;

    protected m(Map map) {
        super(map);
    }

    abstract List a();

    List b() {
        return jl.d();
    }

    @Override
    public List a(Object object) {
        return (List)super.c(object);
    }

    @Override
    public List b(Object object) {
        return (List)super.d(object);
    }

    @Override
    public List a(Object object, Iterable iterable) {
        return (List)super.b(object, iterable);
    }

    @Override
    public boolean a(Object object, Object object2) {
        return super.a(object, object2);
    }

    @Override
    public Map c() {
        return super.c();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
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

