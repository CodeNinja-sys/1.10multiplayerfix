/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cm;
import com.a.a.d.dg;
import com.a.a.d.hi;
import java.util.Collection;
import java.util.Set;

class dh
extends hi {
    final /* synthetic */ Set a;
    final /* synthetic */ dg b;

    dh(dg dg2, Set set) {
        this.b = dg2;
        this.a = set;
    }

    @Override
    protected Set bI_() {
        return this.a;
    }

    @Override
    public boolean contains(Object object) {
        return object != null && cm.a((Collection)this.a, object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.a(collection);
    }

    @Override
    public boolean remove(Object object) {
        return object != null && cm.b(this.a, object);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.c(collection);
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

