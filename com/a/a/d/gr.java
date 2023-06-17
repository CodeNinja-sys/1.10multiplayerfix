/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gx;
import com.a.a.d.ou;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.List;

public abstract class gr
extends gx
implements ou {
    protected gr() {
    }

    protected abstract ou a();

    @Override
    public List a(Object object) {
        return this.a().a(object);
    }

    @Override
    public List b(Object object) {
        return this.a().b(object);
    }

    @Override
    public List a(Object object, Iterable iterable) {
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
    protected /* synthetic */ vi b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

