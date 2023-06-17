/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aa;
import com.a.a.d.ab;
import com.a.a.d.ad;
import com.a.a.d.ag;
import com.a.a.d.ah;
import com.a.a.d.an;
import com.a.a.d.o;
import com.a.a.d.p;
import com.a.a.d.q;
import com.a.a.d.sz;
import com.a.a.d.u;
import com.a.a.d.y;
import com.a.a.d.z;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class n
extends an
implements Serializable {
    private transient Map a;
    private transient int b;
    private static final long c = 2447537837011683357L;

    protected n(Map map) {
        cl.a(map.isEmpty());
        this.a = map;
    }

    final void a(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            cl.a(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    Collection e() {
        return this.a(this.d());
    }

    abstract Collection d();

    Collection e(Object object) {
        return this.d();
    }

    Map f() {
        return this.a;
    }

    @Override
    public int g() {
        return this.b;
    }

    @Override
    public boolean f(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean a(Object object, Object object2) {
        Collection collection = (Collection)this.a.get(object);
        if (collection == null) {
            collection = this.e(object);
            if (collection.add(object2)) {
                ++this.b;
                this.a.put(object, collection);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        if (collection.add(object2)) {
            ++this.b;
            return true;
        }
        return false;
    }

    private Collection j(Object object) {
        Collection collection = (Collection)this.a.get(object);
        if (collection == null) {
            collection = this.e(object);
            this.a.put(object, collection);
        }
        return collection;
    }

    @Override
    public Collection b(Object object, Iterable iterable) {
        Iterator iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return this.d(object);
        }
        Collection collection = this.j(object);
        Collection collection2 = this.d();
        collection2.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        while (iterator.hasNext()) {
            if (!collection.add(iterator.next())) continue;
            ++this.b;
        }
        return this.a(collection2);
    }

    @Override
    public Collection d(Object object) {
        Collection collection = (Collection)this.a.remove(object);
        if (collection == null) {
            return this.e();
        }
        Collection collection2 = this.d();
        collection2.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return this.a(collection2);
    }

    Collection a(Collection collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List)collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    @Override
    public void h() {
        for (Collection collection : this.a.values()) {
            collection.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    @Override
    public Collection c(Object object) {
        Collection collection = (Collection)this.a.get(object);
        if (collection == null) {
            collection = this.e(object);
        }
        return this.a(object, collection);
    }

    Collection a(Object object, Collection collection) {
        if (collection instanceof SortedSet) {
            return new ah(this, object, (SortedSet)collection, null);
        }
        if (collection instanceof Set) {
            return new ag(this, object, (Set)collection);
        }
        if (collection instanceof List) {
            return this.a(object, (List)collection, null);
        }
        return new ab(this, object, collection, null);
    }

    private List a(Object object, List list, ab ab2) {
        return list instanceof RandomAccess ? new y(this, object, list, ab2) : new ad(this, object, list, ab2);
    }

    private Iterator b(Collection collection) {
        return collection instanceof List ? ((List)collection).listIterator() : collection.iterator();
    }

    @Override
    Set i() {
        return this.a instanceof SortedMap ? new aa(this, (SortedMap)this.a) : new u(this, this.a);
    }

    private int k(Object object) {
        Collection collection = (Collection)sz.c(this.a, object);
        int n2 = 0;
        if (collection != null) {
            n2 = collection.size();
            collection.clear();
            this.b -= n2;
        }
        return n2;
    }

    @Override
    public Collection j() {
        return super.j();
    }

    @Override
    Iterator k() {
        return new o(this);
    }

    @Override
    public Collection l() {
        return super.l();
    }

    @Override
    Iterator m() {
        return new p(this);
    }

    @Override
    Map n() {
        return this.a instanceof SortedMap ? new z(this, (SortedMap)this.a) : new q(this, this.a);
    }

    static /* synthetic */ Map a(n n2) {
        return n2.a;
    }

    static /* synthetic */ Iterator a(n n2, Collection collection) {
        return n2.b(collection);
    }

    static /* synthetic */ int b(n n2) {
        return n2.b--;
    }

    static /* synthetic */ int c(n n2) {
        return n2.b++;
    }

    static /* synthetic */ int a(n n2, int n3) {
        return n2.b += n3;
    }

    static /* synthetic */ int b(n n2, int n3) {
        return n2.b -= n3;
    }

    static /* synthetic */ List a(n n2, Object object, List list, ab ab2) {
        return n2.a(object, list, ab2);
    }

    static /* synthetic */ int a(n n2, Object object) {
        return n2.k(object);
    }
}

