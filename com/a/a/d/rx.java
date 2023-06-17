/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rw;
import java.util.AbstractSet;
import java.util.Iterator;

final class rx
extends AbstractSet {
    final /* synthetic */ qy a;

    rx(qy qy2) {
        this.a = qy2;
    }

    @Override
    public Iterator iterator() {
        return new rw(this.a);
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
        return this.a.containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.remove(object) != null;
    }

    @Override
    public void clear() {
        this.a.clear();
    }
}

