/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.mk;
import java.util.concurrent.ConcurrentMap;

final class mm
implements mk {
    final /* synthetic */ ConcurrentMap a;

    mm(ConcurrentMap concurrentMap) {
        this.a = concurrentMap;
    }

    @Override
    public Object a(Object object) {
        Object object2 = this.a.putIfAbsent(cl.a(object), object);
        return object2 == null ? object : object2;
    }
}

