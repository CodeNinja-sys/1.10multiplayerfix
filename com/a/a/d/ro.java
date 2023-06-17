/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rn;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class ro
extends AbstractSet {
    final /* synthetic */ qy a;

    ro(qy qy2) {
        this.a = qy2;
    }

    @Override
    public Iterator iterator() {
        return new rn(this.a);
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        if (k2 == null) {
            return false;
        }
        Object object2 = this.a.get(k2);
        return object2 != null && this.a.m.a(entry.getValue(), object2);
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        return k2 != null && this.a.remove(k2, entry.getValue());
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

