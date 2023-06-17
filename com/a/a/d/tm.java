/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.cm;
import com.a.a.d.sz;
import com.a.a.d.tn;
import com.a.a.d.uj;
import java.util.Collection;
import java.util.Set;

class tm
extends uj {
    private final Set b;
    final bl a;

    Set c() {
        return this.b;
    }

    tm(Set set, bl bl2) {
        this.b = (Set)cl.a(set);
        this.a = (bl)cl.a(bl2);
    }

    @Override
    public Set h() {
        return sz.b(this.c());
    }

    @Override
    Collection aL_() {
        return cm.a((Collection)this.b, this.a);
    }

    @Override
    public int size() {
        return this.c().size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.c().contains(object);
    }

    @Override
    public Object get(Object object) {
        if (cm.a((Collection)this.c(), object)) {
            Object object2 = object;
            return this.a.a(object2);
        }
        return null;
    }

    @Override
    public Object remove(Object object) {
        if (this.c().remove(object)) {
            Object object2 = object;
            return this.a.a(object2);
        }
        return null;
    }

    @Override
    public void clear() {
        this.c().clear();
    }

    @Override
    protected Set a() {
        return new tn(this);
    }
}

