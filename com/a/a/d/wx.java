/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ou;
import com.a.a.d.vi;
import com.a.a.d.wy;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class wx
extends wy
implements ou {
    private static final long g = 0L;

    wx(ou ou2) {
        super(ou2);
    }

    public ou a() {
        return (ou)super.b();
    }

    @Override
    public List a(Object object) {
        return Collections.unmodifiableList(this.a().a(object));
    }

    @Override
    public List b(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List a(Object object, Iterable iterable) {
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
    public /* synthetic */ vi b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object aN_() {
        return this.a();
    }
}

