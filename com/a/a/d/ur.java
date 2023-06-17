/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.tv;
import com.a.a.d.uj;
import com.a.a.d.us;
import java.util.Map;
import java.util.Set;

class ur
extends uj {
    final Map a;
    final tv b;

    ur(Map map, tv tv2) {
        this.a = (Map)cl.a(map);
        this.b = (tv)cl.a(tv2);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public Object get(Object object) {
        Object v2 = this.a.get(object);
        return v2 != null || this.a.containsKey(object) ? this.b.a(object, v2) : null;
    }

    @Override
    public Object remove(Object object) {
        return this.a.containsKey(object) ? this.b.a(object, this.a.remove(object)) : null;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Set keySet() {
        return this.a.keySet();
    }

    @Override
    protected Set a() {
        return new us(this);
    }
}

