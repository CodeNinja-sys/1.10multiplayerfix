/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ab;
import com.a.a.d.ae;
import com.a.a.d.n;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class ad
extends ab
implements List {
    final /* synthetic */ n g;

    ad(n n2, Object object, List list, ab ab2) {
        this.g = n2;
        super(n2, object, list, ab2);
    }

    List g() {
        return (List)this.e();
    }

    public boolean addAll(int n2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n3 = this.size();
        boolean bl2 = this.g().addAll(n2, collection);
        if (bl2) {
            int n4 = this.e().size();
            n.a(this.g, n4 - n3);
            if (n3 == 0) {
                this.d();
            }
        }
        return bl2;
    }

    public Object get(int n2) {
        this.a();
        return this.g().get(n2);
    }

    public Object set(int n2, Object object) {
        this.a();
        return this.g().set(n2, object);
    }

    public void add(int n2, Object object) {
        this.a();
        boolean bl2 = this.e().isEmpty();
        this.g().add(n2, object);
        n.c(this.g);
        if (bl2) {
            this.d();
        }
    }

    public Object remove(int n2) {
        this.a();
        Object e2 = this.g().remove(n2);
        n.b(this.g);
        this.b();
        return e2;
    }

    @Override
    public int indexOf(Object object) {
        this.a();
        return this.g().indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        this.a();
        return this.g().lastIndexOf(object);
    }

    public ListIterator listIterator() {
        this.a();
        return new ae(this);
    }

    public ListIterator listIterator(int n2) {
        this.a();
        return new ae(this, n2);
    }

    public List subList(int n2, int n3) {
        this.a();
        return n.a(this.g, this.c(), this.g().subList(n2, n3), this.f() == null ? this : this.f());
    }
}

