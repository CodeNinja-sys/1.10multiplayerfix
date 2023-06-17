/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abx;
import com.a.a.d.acn;
import com.a.a.d.sz;
import com.a.a.d.uj;
import java.util.Map;
import java.util.Set;

class acm
extends uj {
    final Object a;
    Map b;
    final /* synthetic */ abx c;

    acm(abx abx2, Object object) {
        this.c = abx2;
        this.a = cl.a(object);
    }

    Map c() {
        return this.b == null || this.b.isEmpty() && this.c.a.containsKey(this.a) ? (this.b = this.d()) : this.b;
    }

    Map d() {
        return (Map)this.c.a.get(this.a);
    }

    void e() {
        if (this.c() != null && this.b.isEmpty()) {
            this.c.a.remove(this.a);
            this.b = null;
        }
    }

    @Override
    public boolean containsKey(Object object) {
        Map map = this.c();
        return object != null && map != null && sz.b(map, object);
    }

    @Override
    public Object get(Object object) {
        Map map = this.c();
        return object != null && map != null ? sz.a(map, object) : null;
    }

    @Override
    public Object put(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        if (this.b != null && !this.b.isEmpty()) {
            return this.b.put(object, object2);
        }
        return this.c.a(this.a, object, object2);
    }

    @Override
    public Object remove(Object object) {
        Map map = this.c();
        if (map == null) {
            return null;
        }
        Object object2 = sz.c(map, object);
        this.e();
        return object2;
    }

    @Override
    public void clear() {
        Map map = this.c();
        if (map != null) {
            map.clear();
        }
        this.e();
    }

    @Override
    protected Set a() {
        return new acn(this, null);
    }
}

