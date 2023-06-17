/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.acy;
import com.a.a.d.adq;
import com.a.a.d.cm;
import com.a.a.d.nj;
import com.a.a.d.sz;
import com.a.a.d.yc;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class acx
extends adq {
    private static final long a = 0L;

    acx(Set set, Object object) {
        super(set, object);
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = super.iterator();
        return new acy(this, iterator);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object[] toArray() {
        Object object = this.h;
        synchronized (object) {
            return yc.a(this.d());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object[] toArray(Object[] arrobject) {
        Object object = this.h;
        synchronized (object) {
            return yc.a(this.d(), arrobject);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean contains(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return sz.a((Collection)this.d(), object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsAll(Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return cm.a((Collection)this.d(), collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return aad.a(this.d(), object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean remove(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return sz.b((Collection)this.d(), object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeAll(Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return nj.a(this.d().iterator(), collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean retainAll(Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return nj.b(this.d().iterator(), collection);
        }
    }
}

