/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.n;
import com.a.a.d.nj;
import com.a.a.d.r;
import com.a.a.d.s;
import com.a.a.d.sz;
import com.a.a.d.uj;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class q
extends uj {
    final transient Map a;
    final /* synthetic */ n b;

    q(n n2, Map map) {
        this.b = n2;
        this.a = map;
    }

    @Override
    protected Set a() {
        return new r(this);
    }

    @Override
    public boolean containsKey(Object object) {
        return sz.b(this.a, object);
    }

    public Collection a(Object object) {
        Collection collection = (Collection)sz.a(this.a, object);
        if (collection == null) {
            return null;
        }
        Object object2 = object;
        return this.b.a(object2, collection);
    }

    @Override
    public Set keySet() {
        return this.b.q();
    }

    @Override
    public int size() {
        return this.a.size();
    }

    public Collection b(Object object) {
        Collection collection = (Collection)this.a.remove(object);
        if (collection == null) {
            return null;
        }
        Collection collection2 = this.b.d();
        collection2.addAll(collection);
        n.b(this.b, collection.size());
        collection.clear();
        return collection2;
    }

    @Override
    public boolean equals(Object object) {
        return this == object || this.a.equals(object);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @Override
    public void clear() {
        if (this.a == n.a(this.b)) {
            this.b.h();
        } else {
            nj.i(new s(this));
        }
    }

    Map.Entry a(Map.Entry entry) {
        Object k2 = entry.getKey();
        return sz.a(k2, (Object)this.b.a(k2, (Collection)entry.getValue()));
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

