/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.d.sz;
import com.a.a.d.ui;
import com.a.a.d.uj;
import java.util.Collection;
import java.util.Map;

abstract class tl
extends uj {
    final Map a;
    final cm b;

    tl(Map map, cm cm2) {
        this.a = map;
        this.b = cm2;
    }

    boolean b(Object object, Object object2) {
        Object object3 = object;
        return this.b.a(sz.a(object3, object2));
    }

    @Override
    public Object put(Object object, Object object2) {
        cl.a(this.b(object, object2));
        return this.a.put(object, object2);
    }

    @Override
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            cl.a(this.b(entry.getKey(), entry.getValue()));
        }
        this.a.putAll(map);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object) && this.b(object, this.a.get(object));
    }

    @Override
    public Object get(Object object) {
        Object v2 = this.a.get(object);
        return v2 != null && this.b(object, v2) ? v2 : null;
    }

    @Override
    public boolean isEmpty() {
        return this.entrySet().isEmpty();
    }

    @Override
    public Object remove(Object object) {
        return this.containsKey(object) ? this.a.remove(object) : null;
    }

    @Override
    Collection aL_() {
        return new ui(this, this.a, this.b);
    }
}

