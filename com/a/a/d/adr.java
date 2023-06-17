/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.acu;
import com.a.a.d.adj;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.Set;

class adr
extends adj
implements aac {
    transient Set f;
    private static final long i = 0L;

    adr(aac aac2, Object object) {
        super(aac2, object);
    }

    aac a() {
        return (aac)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set a(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().a(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set b(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().b(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set a(Object object, Iterable iterable) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().a(object, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set u() {
        Object object = this.h;
        synchronized (object) {
            if (this.f == null) {
                this.f = acu.a(this.a().u(), this.h);
            }
            return this.f;
        }
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    /* synthetic */ vi b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

