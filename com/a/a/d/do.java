/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.dm;
import com.a.a.d.dn;
import com.a.a.d.gh;
import java.util.Collection;

class do
extends gh {
    private final Collection a;
    private final dm b;

    public do(Collection collection, dm dm2) {
        this.a = (Collection)cl.a(collection);
        this.b = (dm)cl.a(dm2);
    }

    @Override
    protected Collection b() {
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
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

