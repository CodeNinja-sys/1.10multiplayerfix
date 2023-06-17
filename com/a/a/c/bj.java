/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.ar;
import com.a.a.c.bi;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

final class bj
extends ar {
    final /* synthetic */ ao c;

    bj(ao ao2, ConcurrentMap concurrentMap) {
        this.c = ao2;
        super(ao2, concurrentMap);
    }

    @Override
    public Iterator iterator() {
        return new bi(this.c);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.remove(object) != null;
    }
}

