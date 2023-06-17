/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gs;
import com.a.a.d.po;
import com.a.a.d.pu;
import com.a.a.d.qc;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class qd
extends gs {
    Set a;
    Collection b;
    final /* synthetic */ Map c;
    final /* synthetic */ qc d;

    qd(qc qc2, Map map) {
        this.d = qc2;
        this.c = map;
    }

    @Override
    protected Map a() {
        return this.c;
    }

    @Override
    public Set entrySet() {
        Set set = this.a;
        if (set == null) {
            this.a = set = po.b(this.c.entrySet(), this.d.a);
        }
        return set;
    }

    public Collection a(Object object) {
        try {
            Collection collection = this.d.c(object);
            return collection.isEmpty() ? null : collection;
        }
        catch (ClassCastException classCastException) {
            return null;
        }
    }

    @Override
    public Collection values() {
        Collection collection = this.b;
        if (collection == null) {
            this.b = collection = new pu(this.a().values(), this.entrySet());
        }
        return collection;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.values().contains(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

