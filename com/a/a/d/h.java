/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.a;
import com.a.a.d.b;
import com.a.a.d.hi;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class h
extends hi {
    final Set a;
    final /* synthetic */ a b;

    private h(a a2) {
        this.b = a2;
        this.a = this.b.a.keySet();
    }

    @Override
    protected Set bI_() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return sz.b(this.b.entrySet().iterator());
    }

    @Override
    public Object[] toArray() {
        return this.r();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return this.a(arrobject);
    }

    @Override
    public String toString() {
        return this.p();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }

    /* synthetic */ h(a a2, b b2) {
        this(a2);
    }
}

