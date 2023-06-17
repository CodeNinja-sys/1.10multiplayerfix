/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.sq;
import java.util.AbstractCollection;
import java.util.Iterator;

final class ss
extends AbstractCollection {
    final /* synthetic */ qy a;

    ss(qy qy2) {
        this.a = qy2;
    }

    @Override
    public Iterator iterator() {
        return new sq(this.a);
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
    public boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public void clear() {
        this.a.clear();
    }
}

