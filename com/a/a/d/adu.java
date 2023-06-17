/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.abs;
import com.a.a.d.acu;
import com.a.a.d.adr;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class adu
extends adr
implements abs {
    private static final long i = 0L;

    adu(abs abs2, Object object) {
        super(abs2, object);
    }

    abs d() {
        return (abs)super.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet h(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.d().h(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet i(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().i(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet d(Object object, Iterable iterable) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().d(object, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Comparator aM_() {
        Object object = this.h;
        synchronized (object) {
            return this.d().aM_();
        }
    }

    @Override
    public /* synthetic */ Set a(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Set b(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Set a(Object object) {
        return this.h(object);
    }

    @Override
    /* synthetic */ aac a() {
        return this.d();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    /* synthetic */ vi b() {
        return this.d();
    }

    @Override
    /* synthetic */ Object e() {
        return this.d();
    }
}

