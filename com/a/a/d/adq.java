/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.add;
import java.util.Collection;
import java.util.Set;

class adq
extends add
implements Set {
    private static final long a = 0L;

    adq(Set set, Object object) {
        super(set, object, null);
    }

    Set d() {
        return (Set)super.b();
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
            return this.d().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.d().hashCode();
        }
    }

    @Override
    /* synthetic */ Collection b() {
        return this.d();
    }

    @Override
    /* synthetic */ Object e() {
        return this.d();
    }
}

