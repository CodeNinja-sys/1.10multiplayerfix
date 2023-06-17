/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.cn;
import com.a.a.d.cm;
import com.a.a.d.mq;
import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class co
extends AbstractCollection {
    final Collection a;
    final com.a.a.b.cm b;

    co(Collection collection, com.a.a.b.cm cm2) {
        this.a = collection;
        this.b = cm2;
    }

    co a(com.a.a.b.cm cm2) {
        return new co(this.a, cn.a(this.b, cm2));
    }

    @Override
    public boolean add(Object object) {
        cl.a(this.b.a(object));
        return this.a.add(object);
    }

    @Override
    public boolean addAll(Collection collection) {
        for (Object e2 : collection) {
            cl.a(this.b.a(e2));
        }
        return this.a.addAll(collection);
    }

    @Override
    public void clear() {
        mq.a((Iterable)this.a, this.b);
    }

    @Override
    public boolean contains(Object object) {
        if (cm.a(this.a, object)) {
            Object object2 = object;
            return this.b.a(object2);
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return cm.a((Collection)this, collection);
    }

    @Override
    public boolean isEmpty() {
        return !mq.d((Iterable)this.a, this.b);
    }

    @Override
    public Iterator iterator() {
        return nj.b(this.a.iterator(), this.b);
    }

    @Override
    public boolean remove(Object object) {
        return this.contains(object) && this.a.remove(object);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return mq.a((Iterable)this.a, cn.a(this.b, cn.a(collection)));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return mq.a((Iterable)this.a, cn.a(this.b, cn.a(cn.a(collection))));
    }

    @Override
    public int size() {
        return nj.b(this.iterator());
    }

    @Override
    public Object[] toArray() {
        return ov.a(this.iterator()).toArray();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return ov.a(this.iterator()).toArray(arrobject);
    }
}

