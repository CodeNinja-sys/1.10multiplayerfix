/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.me;
import com.a.a.d.nj;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class fc
extends me {
    fc(Comparator comparator) {
        super(comparator);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override
    public agi aO_() {
        return nj.a();
    }

    @Override
    public agi d() {
        return nj.a();
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    public jl h() {
        return jl.d();
    }

    @Override
    int a(Object[] arrobject, int n2) {
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Set) {
            Set set = (Set)object;
            return set.isEmpty();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "[]";
    }

    @Override
    public Object first() {
        throw new NoSuchElementException();
    }

    @Override
    public Object last() {
        throw new NoSuchElementException();
    }

    @Override
    me b(Object object, boolean bl2) {
        return this;
    }

    @Override
    me a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this;
    }

    @Override
    me a(Object object, boolean bl2) {
        return this;
    }

    @Override
    int c(Object object) {
        return -1;
    }

    @Override
    me e() {
        return new fc(yd.a(this.c).a());
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

