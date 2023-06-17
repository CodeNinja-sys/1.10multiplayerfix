/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.gh;
import java.util.Collection;
import java.util.Set;

public abstract class hi
extends gh
implements Set {
    protected hi() {
    }

    protected abstract Set bI_();

    @Override
    public boolean equals(Object object) {
        return object == this || this.bI_().equals(object);
    }

    @Override
    public int hashCode() {
        return this.bI_().hashCode();
    }

    @Override
    protected boolean c(Collection collection) {
        return aad.a((Set)this, (Collection)cl.a(collection));
    }

    protected boolean i(Object object) {
        return aad.a((Set)this, object);
    }

    protected int j() {
        return aad.b(this);
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

