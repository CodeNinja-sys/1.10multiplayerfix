/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.gx;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.Set;

public abstract class hj
extends gx
implements aac {
    protected abstract aac a();

    @Override
    public Set u() {
        return this.a().u();
    }

    @Override
    public Set a(Object object) {
        return this.a().a(object);
    }

    @Override
    public Set b(Object object) {
        return this.a().b(object);
    }

    @Override
    public Set a(Object object, Iterable iterable) {
        return this.a().a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    protected /* synthetic */ vi b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

