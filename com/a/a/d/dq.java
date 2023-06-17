/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.dm;
import com.a.a.d.gq;
import java.util.Iterator;
import java.util.ListIterator;

class dq
extends gq {
    private final ListIterator a;
    private final dm b;

    public dq(ListIterator listIterator, dm dm2) {
        this.a = listIterator;
        this.b = dm2;
    }

    @Override
    protected ListIterator b() {
        return this.a;
    }

    @Override
    public void add(Object object) {
        this.b.a(object);
        this.a.add(object);
    }

    @Override
    public void set(Object object) {
        this.b.a(object);
        this.a.set(object);
    }

    @Override
    protected /* synthetic */ Iterator a() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

