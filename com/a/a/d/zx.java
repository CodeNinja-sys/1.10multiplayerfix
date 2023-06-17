/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.yd;
import java.io.Serializable;
import java.util.Iterator;

final class zx
extends yd
implements Serializable {
    final yd a;
    private static final long b = 0L;

    zx(yd yd2) {
        this.a = (yd)cl.a(yd2);
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.a.compare(object2, object);
    }

    @Override
    public yd a() {
        return this.a;
    }

    @Override
    public Object a(Object object, Object object2) {
        return this.a.b(object, object2);
    }

    @Override
    public Object a(Object object, Object object2, Object object3, Object ... arrobject) {
        return this.a.b(object, object2, object3, arrobject);
    }

    @Override
    public Object a(Iterator iterator) {
        return this.a.b(iterator);
    }

    @Override
    public Object d(Iterable iterable) {
        return this.a.e(iterable);
    }

    @Override
    public Object b(Object object, Object object2) {
        return this.a.a(object, object2);
    }

    @Override
    public Object b(Object object, Object object2, Object object3, Object ... arrobject) {
        return this.a.a(object, object2, object3, arrobject);
    }

    @Override
    public Object b(Iterator iterator) {
        return this.a.a(iterator);
    }

    @Override
    public Object e(Iterable iterable) {
        return this.a.d(iterable);
    }

    public int hashCode() {
        return -this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof zx) {
            zx zx2 = (zx)object;
            return this.a.equals(zx2.a);
        }
        return false;
    }

    public String toString() {
        return this.a + ".reverse()";
    }
}

