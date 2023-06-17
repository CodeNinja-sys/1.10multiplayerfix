/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abn;
import com.a.a.d.aer;
import com.a.a.d.iz;
import com.a.a.d.jb;
import com.a.a.d.ku;
import com.a.a.d.kw;
import com.a.a.d.ma;
import java.util.Comparator;
import java.util.Iterator;

public class mb
extends kw {
    public mb(Comparator comparator) {
        super(aer.a((Comparator)cl.a(comparator)));
    }

    public mb c(Object object) {
        super.a(object);
        return this;
    }

    public mb c(Object object, int n2) {
        super.a(object, n2);
        return this;
    }

    public mb d(Object object, int n2) {
        super.b(object, n2);
        return this;
    }

    public mb c(Object ... arrobject) {
        super.b(arrobject);
        return this;
    }

    public mb c(Iterable iterable) {
        super.b(iterable);
        return this;
    }

    public mb c(Iterator iterator) {
        super.b(iterator);
        return this;
    }

    public ma c() {
        return ma.a((abn)this.a);
    }

    @Override
    public /* synthetic */ ku b() {
        return this.c();
    }

    @Override
    public /* synthetic */ kw b(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ kw b(Iterable iterable) {
        return this.c(iterable);
    }

    @Override
    public /* synthetic */ kw b(Object[] arrobject) {
        return this.c(arrobject);
    }

    @Override
    public /* synthetic */ kw b(Object object, int n2) {
        return this.d(object, n2);
    }

    @Override
    public /* synthetic */ kw a(Object object, int n2) {
        return this.c(object, n2);
    }

    @Override
    public /* synthetic */ kw a(Object object) {
        return this.c(object);
    }

    @Override
    public /* synthetic */ iz a() {
        return this.c();
    }

    @Override
    public /* synthetic */ jb a(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ jb a(Iterable iterable) {
        return this.c(iterable);
    }

    @Override
    public /* synthetic */ jb a(Object[] arrobject) {
        return this.c(arrobject);
    }

    @Override
    public /* synthetic */ jb b(Object object) {
        return this.c(object);
    }
}

