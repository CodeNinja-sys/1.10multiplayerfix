/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.hi;
import com.a.a.m.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class q
extends hi {
    final /* synthetic */ Set a;

    q(Set set) {
        this.a = set;
    }

    @Override
    protected Set bI_() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return p.a(super.iterator());
    }

    @Override
    public Object[] toArray() {
        return this.r();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return this.a(arrobject);
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

