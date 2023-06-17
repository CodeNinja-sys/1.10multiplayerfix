/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.abs;
import com.a.a.d.vi;
import com.a.a.d.xa;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class xb
extends xa
implements abs {
    private static final long g = 0L;

    xb(abs abs2) {
        super(abs2);
    }

    public abs d() {
        return (abs)super.a();
    }

    @Override
    public SortedSet h(Object object) {
        return Collections.unmodifiableSortedSet(this.d().h(object));
    }

    @Override
    public SortedSet i(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SortedSet d(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
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
    public /* synthetic */ aac a() {
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
    public /* synthetic */ vi b() {
        return this.d();
    }

    @Override
    public /* synthetic */ Object aN_() {
        return this.d();
    }
}

