/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gh;
import com.a.a.d.ux;
import java.util.Collection;
import java.util.Iterator;

class uw
extends gh {
    private final Collection a;

    uw(Collection collection) {
        this.a = collection;
    }

    @Override
    protected Collection b() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = super.iterator();
        return new ux(this, iterator);
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
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

