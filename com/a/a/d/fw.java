/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.hi;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

class fw
extends hi {
    final Object a;

    fw(Object object) {
        this.a = object;
    }

    @Override
    public boolean add(Object object) {
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    public boolean addAll(Collection collection) {
        cl.a(collection);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    protected Set bI_() {
        return Collections.emptySet();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }
}

