/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.dm;
import com.a.a.d.dn;
import com.a.a.d.hp;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

class dt
extends hp {
    final SortedSet a;
    final dm b;

    dt(SortedSet sortedSet, dm dm2) {
        this.a = (SortedSet)cl.a(sortedSet);
        this.b = (dm)cl.a(dm2);
    }

    @Override
    protected SortedSet c() {
        return this.a;
    }

    @Override
    public SortedSet headSet(Object object) {
        return dn.a(this.a.headSet(object), this.b);
    }

    @Override
    public SortedSet subSet(Object object, Object object2) {
        return dn.a(this.a.subSet(object, object2), this.b);
    }

    @Override
    public SortedSet tailSet(Object object) {
        return dn.a(this.a.tailSet(object), this.b);
    }

    @Override
    public boolean add(Object object) {
        this.b.a(object);
        return this.a.add(object);
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.a.addAll(dn.c(collection, this.b));
    }

    @Override
    protected /* synthetic */ Set bI_() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

