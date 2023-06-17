/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.pn;
import com.a.a.d.qc;
import java.util.Collection;
import java.util.Set;

class qf
extends qc
implements aac {
    qf(aac aac2, pn pn2) {
        super(aac2, pn2);
    }

    @Override
    public Set a(Object object) {
        return (Set)super.c(object);
    }

    @Override
    public Set u() {
        return (Set)super.l();
    }

    @Override
    public Set b(Object object) {
        return (Set)super.d(object);
    }

    @Override
    public Set a(Object object, Iterable iterable) {
        return (Set)super.b(object, iterable);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
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
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }
}

