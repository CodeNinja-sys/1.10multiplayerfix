/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.adq;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class adt
extends adq
implements SortedSet {
    private static final long a = 0L;

    adt(SortedSet sortedSet, Object object) {
        super(sortedSet, object);
    }

    SortedSet c() {
        return (SortedSet)super.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Comparator comparator() {
        Object object = this.h;
        synchronized (object) {
            return this.c().comparator();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SortedSet subSet(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return acu.a(this.c().subSet(object, object2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SortedSet headSet(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.c().headSet(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SortedSet tailSet(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.c().tailSet(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object first() {
        Object object = this.h;
        synchronized (object) {
            return this.c().first();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object last() {
        Object object = this.h;
        synchronized (object) {
            return this.c().last();
        }
    }

    @Override
    /* synthetic */ Set d() {
        return this.c();
    }

    @Override
    /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    /* synthetic */ Object e() {
        return this.c();
    }
}

