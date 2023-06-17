/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.gx;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.we;
import com.a.a.d.wz;
import com.a.a.d.xc;
import com.a.a.d.xe;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class wy
extends gx
implements Serializable {
    final vi a;
    transient Collection b;
    transient xc c;
    transient Set d;
    transient Collection e;
    transient Map f;
    private static final long g = 0L;

    wy(vi vi2) {
        this.a = (vi)cl.a(vi2);
    }

    @Override
    protected vi b() {
        return this.a;
    }

    @Override
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map c() {
        Map map = this.f;
        if (map == null) {
            map = this.f = Collections.unmodifiableMap(sz.a(this.a.c(), (bl)new wz(this)));
        }
        return map;
    }

    @Override
    public Collection l() {
        Collection collection = this.b;
        if (collection == null) {
            this.b = collection = we.b(this.a.l());
        }
        return collection;
    }

    @Override
    public Collection c(Object object) {
        return we.a(this.a.c(object));
    }

    @Override
    public xc r() {
        xc xc2 = this.c;
        if (xc2 == null) {
            this.c = xc2 = xe.a(this.a.r());
        }
        return xc2;
    }

    @Override
    public Set q() {
        Set set = this.d;
        if (set == null) {
            this.d = set = Collections.unmodifiableSet(this.a.q());
        }
        return set;
    }

    @Override
    public boolean a(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(vi vi2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection d(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection b(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection j() {
        Collection collection = this.e;
        if (collection == null) {
            this.e = collection = Collections.unmodifiableCollection(this.a.j());
        }
        return collection;
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

