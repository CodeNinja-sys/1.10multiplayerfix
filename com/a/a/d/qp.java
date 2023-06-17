/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.ql;
import com.a.a.d.qq;
import com.a.a.d.qw;
import com.a.a.d.qx;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

class qp
extends AbstractMap
implements Serializable,
ConcurrentMap {
    private static final long a = 0L;
    private final qw b;
    private final qq c;

    qp(ql ql2) {
        this.b = ql2.d();
        this.c = ql2.k;
    }

    @Override
    public boolean containsKey(Object object) {
        return false;
    }

    @Override
    public boolean containsValue(Object object) {
        return false;
    }

    @Override
    public Object get(Object object) {
        return null;
    }

    void a(Object object, Object object2) {
        qx qx2 = new qx(object, object2, this.c);
        this.b.a(qx2);
    }

    @Override
    public Object put(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        this.a(object, object2);
        return null;
    }

    @Override
    public Object putIfAbsent(Object object, Object object2) {
        return this.put(object, object2);
    }

    @Override
    public Object remove(Object object) {
        return null;
    }

    @Override
    public boolean remove(Object object, Object object2) {
        return false;
    }

    @Override
    public Object replace(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        return null;
    }

    @Override
    public boolean replace(Object object, Object object2, Object object3) {
        cl.a(object);
        cl.a(object3);
        return false;
    }

    @Override
    public Set entrySet() {
        return Collections.emptySet();
    }
}

