/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.sz;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class vb
extends AbstractCollection {
    final Map c;

    vb(Map map) {
        this.c = (Map)cl.a(map);
    }

    final Map a() {
        return this.c;
    }

    @Override
    public Iterator iterator() {
        return sz.b(this.a().entrySet().iterator());
    }

    @Override
    public boolean remove(Object object) {
        try {
            return super.remove(object);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            for (Map.Entry entry : this.a().entrySet()) {
                if (!cc.a(object, entry.getValue())) continue;
                this.a().remove(entry.getKey());
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection)cl.a(collection));
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            HashSet hashSet = aad.a();
            for (Map.Entry entry : this.a().entrySet()) {
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().removeAll(hashSet);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        try {
            return super.retainAll((Collection)cl.a(collection));
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            HashSet hashSet = aad.a();
            for (Map.Entry entry : this.a().entrySet()) {
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().retainAll(hashSet);
        }
    }

    @Override
    public int size() {
        return this.a().size();
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.a().containsValue(object);
    }

    @Override
    public void clear() {
        this.a().clear();
    }
}

