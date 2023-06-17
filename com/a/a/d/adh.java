/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.adj;
import com.a.a.d.ou;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.List;

class adh
extends adj
implements ou {
    private static final long f = 0L;

    adh(ou ou2, Object object) {
        super(ou2, object);
    }

    ou a() {
        return (ou)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List a(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().a(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List b(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().b(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List a(Object object, Iterable iterable) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().a(object, iterable);
        }
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

