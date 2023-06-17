/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abn;
import com.a.a.d.agi;
import com.a.a.d.ce;
import com.a.a.d.jl;
import com.a.a.d.ma;
import com.a.a.d.me;
import com.a.a.d.nj;
import com.a.a.d.xc;
import com.a.a.d.xd;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class fb
extends ma {
    private final me b;

    fb(Comparator comparator) {
        this.b = me.a(comparator);
    }

    @Override
    public xd i() {
        return null;
    }

    @Override
    public xd j() {
        return null;
    }

    @Override
    public int a(Object object) {
        return 0;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public me b() {
        return this.b;
    }

    @Override
    xd a(int n2) {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    public ma a(Object object, ce ce2) {
        cl.a(object);
        cl.a((Object)ce2);
        return this;
    }

    @Override
    public ma b(Object object, ce ce2) {
        cl.a(object);
        cl.a((Object)ce2);
        return this;
    }

    @Override
    public agi aO_() {
        return nj.a();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof xc) {
            xc xc2 = (xc)object;
            return xc2.isEmpty();
        }
        return false;
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
    public /* synthetic */ abn c(Object object, ce ce2) {
        return this.b(object, ce2);
    }

    @Override
    public /* synthetic */ abn d(Object object, ce ce2) {
        return this.a(object, ce2);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    @Override
    public /* synthetic */ NavigableSet g() {
        return this.b();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.b();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.b();
    }
}

