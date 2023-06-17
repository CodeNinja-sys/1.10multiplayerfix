/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hi;
import java.util.Collection;
import java.util.Set;

final class te
extends hi {
    final /* synthetic */ Set a;

    te(Set set) {
        this.a = set;
    }

    @Override
    protected Set bI_() {
        return this.a;
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
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

