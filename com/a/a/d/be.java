/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abs;
import com.a.a.d.ba;
import com.a.a.d.me;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

abstract class be
extends ba
implements abs {
    private static final long a = 430848587173315748L;

    protected be(Map map) {
        super(map);
    }

    abstract SortedSet y();

    SortedSet z() {
        Comparator comparator = this.aM_();
        if (comparator == null) {
            return Collections.unmodifiableSortedSet(this.y());
        }
        return me.a(this.aM_());
    }

    @Override
    public SortedSet h(Object object) {
        return (SortedSet)super.a(object);
    }

    @Override
    public SortedSet i(Object object) {
        return (SortedSet)super.b(object);
    }

    @Override
    public SortedSet d(Object object, Iterable iterable) {
        return (SortedSet)super.a(object, iterable);
    }

    @Override
    public Map c() {
        return super.c();
    }

    @Override
    public Collection j() {
        return super.j();
    }

    @Override
    public /* synthetic */ Set a(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Set b(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Set a(Object object) {
        return this.h(object);
    }

    @Override
    /* synthetic */ Set b() {
        return this.z();
    }

    @Override
    /* synthetic */ Set a() {
        return this.y();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.y();
    }

    @Override
    /* synthetic */ Collection e() {
        return this.z();
    }
}

