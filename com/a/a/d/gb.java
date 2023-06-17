/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.ga;
import com.a.a.d.mq;
import com.a.a.d.sz;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class gb
extends AbstractCollection {
    private final ga a;

    gb(ga ga2) {
        this.a = (ga)cl.a(ga2);
    }

    @Override
    public Iterator iterator() {
        return sz.b(this.a.l().iterator());
    }

    @Override
    public boolean contains(Object object) {
        return this.a.g(object);
    }

    @Override
    public int size() {
        return this.a.g();
    }

    @Override
    public boolean remove(Object object) {
        cm cm2 = this.a.b();
        Iterator iterator = this.a.a().l().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (!cm2.a(entry) || !cc.a(entry.getValue(), object)) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return mq.a((Iterable)this.a.a().l(), cn.a(this.a.b(), sz.b(cn.a(collection))));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return mq.a((Iterable)this.a.a().l(), cn.a(this.a.b(), sz.b(cn.a(cn.a(collection)))));
    }

    @Override
    public void clear() {
        this.a.h();
    }
}

