/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.ac;
import com.a.a.d.n;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class ab
extends AbstractCollection {
    final Object b;
    Collection c;
    final ab d;
    final Collection e;
    final /* synthetic */ n f;

    ab(n n2, Object object, Collection collection, ab ab2) {
        this.f = n2;
        this.b = object;
        this.c = collection;
        this.d = ab2;
        this.e = ab2 == null ? null : ab2.e();
    }

    void a() {
        Collection collection;
        if (this.d != null) {
            this.d.a();
            if (this.d.e() != this.e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.c.isEmpty() && (collection = (Collection)n.a(this.f).get(this.b)) != null) {
            this.c = collection;
        }
    }

    void b() {
        if (this.d != null) {
            this.d.b();
        } else if (this.c.isEmpty()) {
            n.a(this.f).remove(this.b);
        }
    }

    Object c() {
        return this.b;
    }

    void d() {
        if (this.d != null) {
            this.d.d();
        } else {
            n.a(this.f).put(this.b, this.c);
        }
    }

    @Override
    public int size() {
        this.a();
        return this.c.size();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        this.a();
        return this.c.equals(object);
    }

    @Override
    public int hashCode() {
        this.a();
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        this.a();
        return this.c.toString();
    }

    Collection e() {
        return this.c;
    }

    @Override
    public Iterator iterator() {
        this.a();
        return new ac(this);
    }

    @Override
    public boolean add(Object object) {
        this.a();
        boolean bl2 = this.c.isEmpty();
        boolean bl3 = this.c.add(object);
        if (bl3) {
            n.c(this.f);
            if (bl2) {
                this.d();
            }
        }
        return bl3;
    }

    ab f() {
        return this.d;
    }

    @Override
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = this.c.addAll(collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.f, n3 - n2);
            if (n2 == 0) {
                this.d();
            }
        }
        return bl2;
    }

    @Override
    public boolean contains(Object object) {
        this.a();
        return this.c.contains(object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        this.a();
        return this.c.containsAll(collection);
    }

    @Override
    public void clear() {
        int n2 = this.size();
        if (n2 == 0) {
            return;
        }
        this.c.clear();
        n.b(this.f, n2);
        this.b();
    }

    @Override
    public boolean remove(Object object) {
        this.a();
        boolean bl2 = this.c.remove(object);
        if (bl2) {
            n.b(this.f);
            this.b();
        }
        return bl2;
    }

    @Override
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = this.c.removeAll(collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.f, n3 - n2);
            this.b();
        }
        return bl2;
    }

    @Override
    public boolean retainAll(Collection collection) {
        cl.a(collection);
        int n2 = this.size();
        boolean bl2 = this.c.retainAll(collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.f, n3 - n2);
            this.b();
        }
        return bl2;
    }
}

