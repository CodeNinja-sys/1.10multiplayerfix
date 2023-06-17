/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.abs;
import com.a.a.d.hj;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

public abstract class hq
extends hj
implements abs {
    protected hq() {
    }

    protected abstract abs d();

    @Override
    public SortedSet h(Object object) {
        return this.d().h(object);
    }

    @Override
    public SortedSet i(Object object) {
        return this.d().i(object);
    }

    @Override
    public SortedSet d(Object object, Iterable iterable) {
        return this.d().d(object, iterable);
    }

    @Override
    public Comparator aM_() {
        return this.d().aM_();
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
    protected /* synthetic */ aac a() {
        return this.d();
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
    protected /* synthetic */ vi b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.d();
    }
}

