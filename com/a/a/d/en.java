/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abn;
import com.a.a.d.abr;
import com.a.a.d.ce;
import com.a.a.d.eo;
import com.a.a.d.gy;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

abstract class en
extends gy
implements abn {
    private transient Comparator a;
    private transient NavigableSet b;
    private transient Set c;

    en() {
    }

    abstract abn c();

    @Override
    public Comparator comparator() {
        Comparator comparator = this.a;
        if (comparator == null) {
            this.a = yd.a(this.c().comparator()).a();
            return this.a;
        }
        return comparator;
    }

    @Override
    public NavigableSet g() {
        NavigableSet navigableSet = this.b;
        if (navigableSet == null) {
            this.b = new abr(this);
            return this.b;
        }
        return navigableSet;
    }

    @Override
    public xd k() {
        return this.c().l();
    }

    @Override
    public xd l() {
        return this.c().k();
    }

    @Override
    public abn d(Object object, ce ce2) {
        return this.c().c(object, ce2).o();
    }

    @Override
    public abn a(Object object, ce ce2, Object object2, ce ce3) {
        return this.c().a(object2, ce3, object, ce2).o();
    }

    @Override
    public abn c(Object object, ce ce2) {
        return this.c().d(object, ce2).o();
    }

    @Override
    protected xc f() {
        return this.c();
    }

    @Override
    public abn o() {
        return this.c();
    }

    @Override
    public xd i() {
        return this.c().j();
    }

    @Override
    public xd j() {
        return this.c().i();
    }

    abstract Iterator e();

    @Override
    public Set aS_() {
        Set set = this.c;
        return set == null ? (this.c = this.h()) : set;
    }

    Set h() {
        return new eo(this);
    }

    @Override
    public Iterator iterator() {
        return xe.b(this);
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
        return this.aS_().toString();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.g();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.f();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.f();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.g();
    }
}

