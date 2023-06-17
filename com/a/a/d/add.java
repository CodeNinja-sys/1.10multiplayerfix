/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acv;
import com.a.a.d.adn;
import java.util.Collection;
import java.util.Iterator;

class add
extends adn
implements Collection {
    private static final long a = 0L;

    private add(Collection collection, Object object) {
        super(collection, object);
    }

    Collection b() {
        return (Collection)super.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean add(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().add(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean addAll(Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().addAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        Object object = this.h;
        synchronized (object) {
            this.b().clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean contains(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().contains(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean containsAll(Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().containsAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isEmpty() {
        Object object = this.h;
        synchronized (object) {
            return this.b().isEmpty();
        }
    }

    @Override
    public Iterator iterator() {
        return this.b().iterator();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean remove(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().remove(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean removeAll(Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().removeAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean retainAll(Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return this.b().retainAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int size() {
        Object object = this.h;
        synchronized (object) {
            return this.b().size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object[] toArray() {
        Object object = this.h;
        synchronized (object) {
            return this.b().toArray();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object[] toArray(Object[] arrobject) {
        Object object = this.h;
        synchronized (object) {
            return this.b().toArray(arrobject);
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.b();
    }

    /* synthetic */ add(Collection collection, Object object, acv acv2) {
        this(collection, object);
    }
}

