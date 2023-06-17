/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.at;
import com.a.a.d.au;
import com.a.a.d.nj;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xe;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class as
extends AbstractCollection
implements xc {
    private transient Set a;
    private transient Set b;

    as() {
    }

    @Override
    public int size() {
        return xe.c(this);
    }

    @Override
    public boolean isEmpty() {
        return this.aS_().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.a(object) > 0;
    }

    @Override
    public Iterator iterator() {
        return xe.b(this);
    }

    @Override
    public int a(Object object) {
        for (xd xd2 : this.aS_()) {
            if (!cc.a(xd2.a(), object)) continue;
            return xd2.b();
        }
        return 0;
    }

    @Override
    public boolean add(Object object) {
        this.a(object, 1);
        return true;
    }

    @Override
    public int a(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object) {
        return this.b(object, 1) > 0;
    }

    @Override
    public int b(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int c(Object object, int n2) {
        return xe.a(this, object, n2);
    }

    @Override
    public boolean a(Object object, int n2, int n3) {
        return xe.a(this, object, n2, n3);
    }

    public boolean addAll(Collection collection) {
        return xe.a((xc)this, collection);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return xe.b((xc)this, collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return xe.c((xc)this, collection);
    }

    @Override
    public void clear() {
        nj.i(this.b());
    }

    @Override
    public Set d() {
        Set set = this.a;
        if (set == null) {
            this.a = set = this.e();
        }
        return set;
    }

    Set e() {
        return new at(this);
    }

    abstract Iterator b();

    abstract int c();

    @Override
    public Set aS_() {
        Set set = this.b;
        return set == null ? (this.b = this.f()) : set;
    }

    Set f() {
        return new au(this);
    }

    @Override
    public boolean equals(Object object) {
        return xe.a((xc)this, object);
    }

    @Override
    public int hashCode() {
        return this.aS_().hashCode();
    }

    @Override
    public String toString() {
        return this.aS_().toString();
    }
}

