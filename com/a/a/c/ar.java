/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import java.util.AbstractSet;
import java.util.concurrent.ConcurrentMap;

abstract class ar
extends AbstractSet {
    final ConcurrentMap a;
    final /* synthetic */ ao b;

    ar(ao ao2, ConcurrentMap concurrentMap) {
        this.b = ao2;
        this.a = concurrentMap;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public void clear() {
        this.a.clear();
    }
}

