/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abx;
import com.a.a.d.aby;
import com.a.a.d.act;
import com.a.a.d.nj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class ach
extends act {
    final /* synthetic */ abx a;

    private ach(abx abx2) {
        this.a = abx2;
        super(abx2, null);
    }

    @Override
    public Iterator iterator() {
        return this.a.m();
    }

    @Override
    public int size() {
        return nj.b(this.iterator());
    }

    @Override
    public boolean remove(Object object) {
        if (object == null) {
            return false;
        }
        boolean bl2 = false;
        Iterator iterator = this.a.a.values().iterator();
        while (iterator.hasNext()) {
            Map map = (Map)iterator.next();
            if (!map.keySet().remove(object)) continue;
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    @Override
    public boolean removeAll(Collection collection) {
        cl.a(collection);
        boolean bl2 = false;
        Iterator iterator = this.a.a.values().iterator();
        while (iterator.hasNext()) {
            Map map = (Map)iterator.next();
            if (!nj.a(map.keySet().iterator(), collection)) continue;
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    @Override
    public boolean retainAll(Collection collection) {
        cl.a(collection);
        boolean bl2 = false;
        Iterator iterator = this.a.a.values().iterator();
        while (iterator.hasNext()) {
            Map map = (Map)iterator.next();
            if (!map.keySet().retainAll(collection)) continue;
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.b(object);
    }

    /* synthetic */ ach(abx abx2, aby aby2) {
        this(abx2);
    }
}

