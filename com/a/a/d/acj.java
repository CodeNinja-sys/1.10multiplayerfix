/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.abx;
import com.a.a.d.aci;
import com.a.a.d.ack;
import com.a.a.d.act;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class acj
extends act {
    final /* synthetic */ aci a;

    acj(aci aci2) {
        this.a = aci2;
        super(aci2.a, null);
    }

    @Override
    public Iterator iterator() {
        return sz.b(this.a.a.b(), (bl)new ack(this));
    }

    @Override
    public int size() {
        return this.a.a.b().size();
    }

    @Override
    public boolean contains(Object object) {
        Map.Entry entry;
        if (object instanceof Map.Entry && this.a.a.b((entry = (Map.Entry)object).getKey())) {
            Object k2 = entry.getKey();
            return this.a.a(k2).equals(entry.getValue());
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object)) {
            Map.Entry entry = (Map.Entry)object;
            abx.a(this.a.a, entry.getKey());
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        cl.a(collection);
        return aad.a((Set)this, collection.iterator());
    }

    @Override
    public boolean retainAll(Collection collection) {
        cl.a(collection);
        boolean bl2 = false;
        for (Object e2 : ov.a(this.a.a.b().iterator())) {
            if (collection.contains(sz.a(e2, (Object)this.a.a.d(e2)))) continue;
            abx.a(this.a.a, e2);
            bl2 = true;
        }
        return bl2;
    }
}

