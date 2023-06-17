/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.aan;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class tu
extends aan {
    tu() {
    }

    abstract Map a();

    @Override
    public int size() {
        return this.a().size();
    }

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            Object k2 = entry.getKey();
            Object object2 = sz.a(this.a(), k2);
            return cc.a(object2, entry.getValue()) && (object2 != null || this.a().containsKey(k2));
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object)) {
            Map.Entry entry = (Map.Entry)object;
            return this.a().keySet().remove(entry.getKey());
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection)cl.a(collection));
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            return aad.a((Set)this, collection.iterator());
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        try {
            return super.retainAll((Collection)cl.a(collection));
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            HashSet hashSet = aad.a(collection.size());
            for (Object e2 : collection) {
                if (!this.contains(e2)) continue;
                Map.Entry entry = (Map.Entry)e2;
                hashSet.add(entry.getKey());
            }
            return this.a().keySet().retainAll(hashSet);
        }
    }
}

