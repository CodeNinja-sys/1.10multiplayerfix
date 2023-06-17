/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class l
implements Map {
    private final Map a;

    protected l(Map map) {
        this.a = map;
    }

    abstract Reference a(Object var1);

    private Object a(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
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
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        throw new UnsupportedOperationException();
    }

    public Object get(Object object) {
        return this.a((Reference)this.a.get(object));
    }

    public Object put(Object object, Object object2) {
        return this.a(this.a.put(object, this.a(object2)));
    }

    public Object remove(Object object) {
        return this.a((Reference)this.a.remove(object));
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a.put(entry.getKey(), this.a(entry.getValue()));
        }
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    public Set keySet() {
        return this.a.keySet();
    }

    public Collection values() {
        throw new UnsupportedOperationException();
    }

    public Set entrySet() {
        throw new UnsupportedOperationException();
    }
}

