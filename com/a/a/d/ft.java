/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.fu;
import com.a.a.d.ou;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.List;

final class ft
extends fu
implements ou {
    ft(ou ou2, cm cm2) {
        super(ou2, cm2);
    }

    public ou d() {
        return (ou)super.a();
    }

    @Override
    public List a(Object object) {
        return (List)super.c(object);
    }

    @Override
    public List b(Object object) {
        return (List)super.d(object);
    }

    @Override
    public List a(Object object, Iterable iterable) {
        return (List)super.b(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ vi a() {
        return this.d();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }
}

