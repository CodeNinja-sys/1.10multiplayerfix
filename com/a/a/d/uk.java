/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aan;
import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;

class uk
extends aan {
    final Map d;

    uk(Map map) {
        this.d = (Map)cl.a(map);
    }

    Map c() {
        return this.d;
    }

    @Override
    public Iterator iterator() {
        return sz.a(this.c().entrySet().iterator());
    }

    @Override
    public int size() {
        return this.c().size();
    }

    @Override
    public boolean isEmpty() {
        return this.c().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.c().containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object)) {
            this.c().remove(object);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.c().clear();
    }
}

