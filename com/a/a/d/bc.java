/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abn;
import com.a.a.d.abr;
import com.a.a.d.as;
import com.a.a.d.bd;
import com.a.a.d.ce;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.yd;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

abstract class bc
extends as
implements abn {
    final Comparator a;
    private transient abn b;

    bc() {
        this(yd.d());
    }

    bc(Comparator comparator) {
        this.a = (Comparator)cl.a(comparator);
    }

    @Override
    public NavigableSet g() {
        return (NavigableSet)super.d();
    }

    NavigableSet h() {
        return new abr(this);
    }

    @Override
    public Comparator comparator() {
        return this.a;
    }

    @Override
    public xd i() {
        Iterator iterator = this.b();
        return iterator.hasNext() ? (xd)iterator.next() : null;
    }

    @Override
    public xd j() {
        Iterator iterator = this.m();
        return iterator.hasNext() ? (xd)iterator.next() : null;
    }

    @Override
    public xd k() {
        Iterator iterator = this.b();
        if (iterator.hasNext()) {
            xd xd2 = (xd)iterator.next();
            xd2 = xe.a(xd2.a(), xd2.b());
            iterator.remove();
            return xd2;
        }
        return null;
    }

    @Override
    public xd l() {
        Iterator iterator = this.m();
        if (iterator.hasNext()) {
            xd xd2 = (xd)iterator.next();
            xd2 = xe.a(xd2.a(), xd2.b());
            iterator.remove();
            return xd2;
        }
        return null;
    }

    @Override
    public abn a(Object object, ce ce2, Object object2, ce ce3) {
        cl.a((Object)ce2);
        cl.a((Object)ce3);
        return this.c(object, ce2).d(object2, ce3);
    }

    abstract Iterator m();

    Iterator n() {
        return xe.b(this.o());
    }

    @Override
    public abn o() {
        abn abn2 = this.b;
        return abn2 == null ? (this.b = this.p()) : abn2;
    }

    abn p() {
        return new bd(this);
    }

    @Override
    /* synthetic */ Set e() {
        return this.h();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.g();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.g();
    }
}

