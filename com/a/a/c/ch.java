/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.cf;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

final class ch
extends AbstractCollection {
    private final ConcurrentMap b;
    final /* synthetic */ ao a;

    ch(ao ao2, ConcurrentMap concurrentMap) {
        this.a = ao2;
        this.b = concurrentMap;
    }

    @Override
    public int size() {
        return this.b.size();
    }

    @Override
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    public void clear() {
        this.b.clear();
    }

    @Override
    public Iterator iterator() {
        return new cf(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return this.b.containsValue(object);
    }
}

