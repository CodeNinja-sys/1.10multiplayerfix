/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.gp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class fv
extends gp {
    final Object a;

    fv(Object object) {
        this.a = object;
    }

    @Override
    public boolean add(Object object) {
        this.add(0, object);
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        this.addAll(0, collection);
        return true;
    }

    @Override
    public void add(int n2, Object object) {
        cl.b(n2, 0);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        cl.a(collection);
        cl.b(n2, 0);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    protected List a() {
        return Collections.emptyList();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

