/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.dm;
import com.a.a.d.dn;
import com.a.a.d.hi;
import java.util.Collection;
import java.util.Set;

class ds
extends hi {
    private final Set a;
    private final dm b;

    public ds(Set set, dm dm2) {
        this.a = (Set)cl.a(set);
        this.b = (dm)cl.a(dm2);
    }

    @Override
    protected Set bI_() {
        return this.a;
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
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }
}

