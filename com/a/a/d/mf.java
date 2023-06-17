/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.iz;
import com.a.a.d.ja;
import com.a.a.d.jb;
import com.a.a.d.lo;
import com.a.a.d.lp;
import com.a.a.d.me;
import java.util.Comparator;
import java.util.Iterator;

public final class mf
extends lp {
    private final Comparator d;

    public mf(Comparator comparator) {
        this.d = (Comparator)cl.a(comparator);
    }

    public mf d(Object object) {
        super.c(object);
        return this;
    }

    public mf c(Object ... arrobject) {
        super.b(arrobject);
        return this;
    }

    public mf c(Iterable iterable) {
        super.b(iterable);
        return this;
    }

    public mf c(Iterator iterator) {
        super.b(iterator);
        return this;
    }

    public me c() {
        Object[] arrobject = this.a;
        me me2 = me.a(this.d, this.b, arrobject);
        this.b = me2.size();
        return me2;
    }

    @Override
    public /* synthetic */ lo b() {
        return this.c();
    }

    @Override
    public /* synthetic */ lp b(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ lp b(Iterable iterable) {
        return this.c(iterable);
    }

    @Override
    public /* synthetic */ lp b(Object[] arrobject) {
        return this.c(arrobject);
    }

    @Override
    public /* synthetic */ lp c(Object object) {
        return this.d(object);
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
    public /* synthetic */ ja a(Object object) {
        return this.d(object);
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
    public /* synthetic */ jb b(Object object) {
        return this.d(object);
    }
}

