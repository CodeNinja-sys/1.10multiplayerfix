/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.jp;
import com.a.a.d.yc;
import com.a.a.d.yw;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class iz
extends AbstractCollection
implements Serializable {
    private transient jl a;

    iz() {
    }

    public abstract agi aO_();

    @Override
    public final Object[] toArray() {
        int n2 = this.size();
        if (n2 == 0) {
            return yc.a;
        }
        Object[] arrobject = new Object[this.size()];
        this.a(arrobject, 0);
        return arrobject;
    }

    @Override
    public final Object[] toArray(Object[] arrobject) {
        cl.a(arrobject);
        int n2 = this.size();
        if (arrobject.length < n2) {
            arrobject = yc.a(arrobject, n2);
        } else if (arrobject.length > n2) {
            arrobject[n2] = null;
        }
        this.a(arrobject, 0);
        return arrobject;
    }

    @Override
    public boolean contains(Object object) {
        return object != null && super.contains(object);
    }

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public jl h() {
        jl jl2 = this.a;
        return jl2 == null ? (this.a = this.m()) : jl2;
    }

    jl m() {
        switch (this.size()) {
            case 0: {
                return jl.d();
            }
            case 1: {
                return jl.a(this.aO_().next());
            }
        }
        return new yw(this, this.toArray());
    }

    abstract boolean a();

    int a(Object[] arrobject, int n2) {
        for (Object e2 : this) {
            arrobject[n2++] = e2;
        }
        return n2;
    }

    Object aR_() {
        return new jp(this.toArray());
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

