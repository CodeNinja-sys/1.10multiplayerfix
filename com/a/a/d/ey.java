/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.d.nj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class ey
extends lo {
    static final ey a = new ey();
    private static final long c = 0L;

    private ey() {
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
    boolean a() {
        return false;
    }

    @Override
    int a(Object[] arrobject, int n2) {
        return n2;
    }

    @Override
    public jl h() {
        return jl.d();
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
    public final int hashCode() {
        return 0;
    }

    @Override
    boolean aQ_() {
        return true;
    }

    @Override
    public String toString() {
        return "[]";
    }

    Object d() {
        return a;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

