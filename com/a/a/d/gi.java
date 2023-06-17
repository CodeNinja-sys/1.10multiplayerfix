/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gs;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public abstract class gi
extends gs
implements ConcurrentMap {
    protected gi() {
    }

    protected abstract ConcurrentMap c();

    @Override
    public Object putIfAbsent(Object object, Object object2) {
        return this.c().putIfAbsent(object, object2);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        return this.c().remove(object, object2);
    }

    @Override
    public Object replace(Object object, Object object2) {
        return this.c().replace(object, object2);
    }

    @Override
    public boolean replace(Object object, Object object2, Object object3) {
        return this.c().replace(object, object2, object3);
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

