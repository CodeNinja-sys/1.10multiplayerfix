/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.gs;
import com.a.a.d.pn;
import com.a.a.d.po;
import java.util.Map;
import java.util.Set;

class qb
extends gs {
    private final Map a;
    final pn b;
    private transient Set c;

    qb(Map map, pn pn2) {
        this.a = (Map)cl.a(map);
        this.b = (pn)cl.a(pn2);
    }

    @Override
    protected Map a() {
        return this.a;
    }

    @Override
    public Set entrySet() {
        Set set = this.c;
        if (set == null) {
            this.c = set = po.a(this.a.entrySet(), this.b);
        }
        return set;
    }

    @Override
    public Object put(Object object, Object object2) {
        this.b.a(object, object2);
        return this.a.put(object, object2);
    }

    @Override
    public void putAll(Map map) {
        this.a.putAll(po.b(map, this.b));
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

