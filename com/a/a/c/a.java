/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ai;
import com.a.a.c.e;
import com.a.a.d.jt;
import com.a.a.d.sz;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

public abstract class a
implements e {
    protected a() {
    }

    @Override
    public Object a(Object object, Callable callable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public jt a(Iterable iterable) {
        LinkedHashMap linkedHashMap = sz.d();
        for (Object t2 : iterable) {
            if (linkedHashMap.containsKey(t2)) continue;
            Object t3 = t2;
            linkedHashMap.put(t3, this.e(t2));
        }
        return jt.b(linkedHashMap);
    }

    @Override
    public void a(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void a() {
    }

    @Override
    public long b() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(Iterable iterable) {
        for (Object t2 : iterable) {
            this.b(t2);
        }
    }

    @Override
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ai d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ConcurrentMap e() {
        throw new UnsupportedOperationException();
    }
}

