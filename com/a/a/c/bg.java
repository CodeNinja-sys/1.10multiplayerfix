/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.ar;
import com.a.a.c.bf;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

final class bg
extends ar {
    final /* synthetic */ ao c;

    bg(ao ao2, ConcurrentMap concurrentMap) {
        this.c = ao2;
        super(ao2, concurrentMap);
    }

    @Override
    public Iterator iterator() {
        return new bf(this.c);
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        if (k2 == null) {
            return false;
        }
        Object object2 = this.c.get(k2);
        return object2 != null && this.c.m.a(entry.getValue(), object2);
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k2 = entry.getKey();
        return k2 != null && this.c.remove(k2, entry.getValue());
    }
}

