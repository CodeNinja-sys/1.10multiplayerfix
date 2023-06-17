/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gy;
import com.a.a.d.nj;
import com.a.a.d.xc;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

class xw
extends gy
implements Serializable {
    final xc a;
    transient Set b;
    transient Set c;
    private static final long d = 0L;

    xw(xc xc2) {
        this.a = xc2;
    }

    @Override
    protected xc f() {
        return this.a;
    }

    Set c() {
        return Collections.unmodifiableSet(this.a.d());
    }

    @Override
    public Set d() {
        Set set = this.b;
        return set == null ? (this.b = this.c()) : set;
    }

    @Override
    public Set aS_() {
        Set set = this.c;
        return set == null ? (this.c = Collections.unmodifiableSet(this.a.aS_())) : set;
    }

    @Override
    public Iterator iterator() {
        return nj.a(this.a.iterator());
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int a(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int c(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(Object object, int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.f();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.f();
    }
}

