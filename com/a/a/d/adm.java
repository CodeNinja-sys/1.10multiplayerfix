/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.adt;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

class adm
extends adt
implements NavigableSet {
    transient NavigableSet a;
    private static final long b = 0L;

    adm(NavigableSet navigableSet, Object object) {
        super(navigableSet, object);
    }

    NavigableSet a() {
        return (NavigableSet)super.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object ceiling(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().ceiling(object);
        }
    }

    public Iterator descendingIterator() {
        return this.a().descendingIterator();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableSet descendingSet() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                NavigableSet navigableSet;
                this.a = navigableSet = acu.a(this.a().descendingSet(), this.h);
                return navigableSet;
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object floor(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().floor(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableSet headSet(Object object, boolean bl2) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().headSet(object, bl2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object higher(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().higher(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object lower(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().lower(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object pollFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object pollLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        Object object3 = this.h;
        synchronized (object3) {
            return acu.a(this.a().subSet(object, bl2, object2, bl3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableSet tailSet(Object object, boolean bl2) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().tailSet(object, bl2), this.h);
        }
    }

    @Override
    public SortedSet headSet(Object object) {
        return this.headSet(object, false);
    }

    @Override
    public SortedSet subSet(Object object, Object object2) {
        return this.subSet(object, true, object2, false);
    }

    @Override
    public SortedSet tailSet(Object object) {
        return this.tailSet(object, true);
    }

    @Override
    /* synthetic */ SortedSet c() {
        return this.a();
    }

    @Override
    /* synthetic */ Set d() {
        return this.a();
    }

    @Override
    /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

