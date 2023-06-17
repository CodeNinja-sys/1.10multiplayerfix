/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.wy;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

class xa
extends wy
implements aac {
    private static final long g = 0L;

    xa(aac aac2) {
        super(aac2);
    }

    public aac a() {
        return (aac)super.b();
    }

    @Override
    public Set a(Object object) {
        return Collections.unmodifiableSet(this.a().a(object));
    }

    @Override
    public Set u() {
        return sz.a(this.a().u());
    }

    @Override
    public Set b(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set a(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
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
    public /* synthetic */ vi b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object aN_() {
        return this.a();
    }
}

