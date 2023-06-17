/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.dm;
import com.a.a.d.dn;
import com.a.a.d.gp;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class dp
extends gp {
    final List a;
    final dm b;

    dp(List list, dm dm2) {
        this.a = (List)cl.a(list);
        this.b = (dm)cl.a(dm2);
    }

    @Override
    protected List a() {
        return this.a;
    }

    @Override
    public boolean add(Object object) {
        this.b.a(object);
        return this.a.add(object);
    }

    @Override
    public void add(int n2, Object object) {
        this.b.a(object);
        this.a.add(n2, object);
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.a.addAll(dn.c(collection, this.b));
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        return this.a.addAll(n2, dn.c(collection, this.b));
    }

    @Override
    public ListIterator listIterator() {
        return dn.a(this.a.listIterator(), this.b);
    }

    @Override
    public ListIterator listIterator(int n2) {
        return dn.a(this.a.listIterator(n2), this.b);
    }

    @Override
    public Object set(int n2, Object object) {
        this.b.a(object);
        return this.a.set(n2, object);
    }

    @Override
    public List subList(int n2, int n3) {
        return dn.a(this.a.subList(n2, n3), this.b);
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

