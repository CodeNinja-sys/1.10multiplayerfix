/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ou;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.tv;
import com.a.a.d.wv;
import java.util.Collection;
import java.util.List;

final class wu
extends wv
implements ou {
    wu(ou ou2, tv tv2) {
        super(ou2, tv2);
    }

    List a(Object object, Collection collection) {
        return ov.a((List)collection, sz.a(this.b, object));
    }

    @Override
    public List a(Object object) {
        return this.a(object, this.a.c(object));
    }

    @Override
    public List b(Object object) {
        return this.a(object, this.a.d(object));
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
    /* synthetic */ Collection b(Object object, Collection collection) {
        return this.a(object, collection);
    }
}

