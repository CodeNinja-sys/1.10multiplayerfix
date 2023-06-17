/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abs;
import com.a.a.d.pn;
import com.a.a.d.qf;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class qg
extends qf
implements abs {
    qg(abs abs2, pn pn2) {
        super(abs2, pn2);
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
    public Comparator aM_() {
        return ((abs)this.b()).aM_();
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
}

