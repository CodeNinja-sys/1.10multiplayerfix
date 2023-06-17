/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aac;
import com.a.a.d.ap;
import com.a.a.d.aq;
import com.a.a.d.ar;
import com.a.a.d.nj;
import com.a.a.d.sz;
import com.a.a.d.uk;
import com.a.a.d.vi;
import com.a.a.d.we;
import com.a.a.d.wn;
import com.a.a.d.xc;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class an
implements vi {
    private transient Collection a;
    private transient Set b;
    private transient xc c;
    private transient Collection d;
    private transient Map e;

    an() {
    }

    @Override
    public boolean o() {
        return this.g() == 0;
    }

    @Override
    public boolean g(Object object) {
        for (Collection collection : this.c().values()) {
            if (!collection.contains(object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(Object object, Object object2) {
        Collection collection = (Collection)this.c().get(object);
        return collection != null && collection.contains(object2);
    }

    @Override
    public boolean c(Object object, Object object2) {
        Collection collection = (Collection)this.c().get(object);
        return collection != null && collection.remove(object2);
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.c(object).add(object2);
    }

    @Override
    public boolean c(Object object, Iterable iterable) {
        cl.a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            return !collection.isEmpty() && this.c(object).addAll(collection);
        }
        Iterator iterator = iterable.iterator();
        return iterator.hasNext() && nj.a(this.c(object), iterator);
    }

    @Override
    public boolean a(vi vi2) {
        boolean bl2 = false;
        for (Map.Entry entry : vi2.l()) {
            bl2 |= this.a(entry.getKey(), entry.getValue());
        }
        return bl2;
    }

    @Override
    public Collection b(Object object, Iterable iterable) {
        cl.a(iterable);
        Collection collection = this.d(object);
        this.c(object, iterable);
        return collection;
    }

    @Override
    public Collection l() {
        Collection collection = this.a;
        return collection == null ? (this.a = this.p()) : collection;
    }

    Collection p() {
        if (this instanceof aac) {
            return new aq(this, null);
        }
        return new ap(this, null);
    }

    abstract Iterator m();

    @Override
    public Set q() {
        Set set = this.b;
        return set == null ? (this.b = this.i()) : set;
    }

    Set i() {
        return new uk(this.c());
    }

    @Override
    public xc r() {
        xc xc2 = this.c;
        return xc2 == null ? (this.c = this.s()) : xc2;
    }

    xc s() {
        return new wn(this);
    }

    @Override
    public Collection j() {
        Collection collection = this.d;
        return collection == null ? (this.d = this.t()) : collection;
    }

    Collection t() {
        return new ar(this);
    }

    Iterator k() {
        return sz.b(this.l().iterator());
    }

    @Override
    public Map c() {
        Map map = this.e;
        return map == null ? (this.e = this.n()) : map;
    }

    abstract Map n();

    @Override
    public boolean equals(Object object) {
        return we.a((vi)this, object);
    }

    @Override
    public int hashCode() {
        return this.c().hashCode();
    }

    public String toString() {
        return this.c().toString();
    }
}

