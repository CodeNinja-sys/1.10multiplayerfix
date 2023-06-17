/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.cm;
import com.a.a.d.hg;
import com.a.a.d.nj;
import com.a.a.d.yc;
import java.util.Collection;
import java.util.Iterator;

public abstract class gh
extends hg
implements Collection {
    protected gh() {
    }

    protected abstract Collection b();

    @Override
    public Iterator iterator() {
        return this.b().iterator();
    }

    @Override
    public int size() {
        return this.b().size();
    }

    public boolean removeAll(Collection collection) {
        return this.b().removeAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return this.b().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.b().contains(object);
    }

    public boolean add(Object object) {
        return this.b().add(object);
    }

    @Override
    public boolean remove(Object object) {
        return this.b().remove(object);
    }

    public boolean containsAll(Collection collection) {
        return this.b().containsAll(collection);
    }

    public boolean addAll(Collection collection) {
        return this.b().addAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.b().retainAll(collection);
    }

    @Override
    public void clear() {
        this.b().clear();
    }

    @Override
    public Object[] toArray() {
        return this.b().toArray();
    }

    public Object[] toArray(Object[] arrobject) {
        return this.b().toArray(arrobject);
    }

    protected boolean b(Object object) {
        return nj.a(this.iterator(), object);
    }

    protected boolean a(Collection collection) {
        return cm.a((Collection)this, collection);
    }

    protected boolean b(Collection collection) {
        return nj.a(this, collection.iterator());
    }

    protected boolean c(Object object) {
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (!cc.a(iterator.next(), object)) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    protected boolean c(Collection collection) {
        return nj.a(this.iterator(), collection);
    }

    protected boolean d(Collection collection) {
        return nj.b(this.iterator(), collection);
    }

    protected void m() {
        nj.i(this.iterator());
    }

    protected boolean n() {
        return !this.iterator().hasNext();
    }

    protected String p() {
        return cm.a(this);
    }

    protected Object[] r() {
        Object[] arrobject = new Object[this.size()];
        return this.toArray(arrobject);
    }

    protected Object[] a(Object[] arrobject) {
        return yc.a(this, arrobject);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

