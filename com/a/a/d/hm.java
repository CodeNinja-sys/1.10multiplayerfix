/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abn;
import com.a.a.d.ce;
import com.a.a.d.gy;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xe;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public abstract class hm
extends gy
implements abn {
    protected hm() {
    }

    protected abstract abn c();

    @Override
    public NavigableSet g() {
        return (NavigableSet)super.d();
    }

    @Override
    public Comparator comparator() {
        return this.c().comparator();
    }

    @Override
    public abn o() {
        return this.c().o();
    }

    @Override
    public xd i() {
        return this.c().i();
    }

    protected xd e() {
        Iterator iterator = this.aS_().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        xd xd2 = (xd)iterator.next();
        return xe.a(xd2.a(), xd2.b());
    }

    @Override
    public xd j() {
        return this.c().j();
    }

    protected xd h() {
        Iterator iterator = this.o().aS_().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        xd xd2 = (xd)iterator.next();
        return xe.a(xd2.a(), xd2.b());
    }

    @Override
    public xd k() {
        return this.c().k();
    }

    protected xd v() {
        Iterator iterator = this.aS_().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        xd xd2 = (xd)iterator.next();
        xd2 = xe.a(xd2.a(), xd2.b());
        iterator.remove();
        return xd2;
    }

    @Override
    public xd l() {
        return this.c().l();
    }

    protected xd w() {
        Iterator iterator = this.o().aS_().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        xd xd2 = (xd)iterator.next();
        xd2 = xe.a(xd2.a(), xd2.b());
        iterator.remove();
        return xd2;
    }

    @Override
    public abn d(Object object, ce ce2) {
        return this.c().d(object, ce2);
    }

    @Override
    public abn a(Object object, ce ce2, Object object2, ce ce3) {
        return this.c().a(object, ce2, object2, ce3);
    }

    protected abn b(Object object, ce ce2, Object object2, ce ce3) {
        return this.c(object, ce2).d(object2, ce3);
    }

    @Override
    public abn c(Object object, ce ce2) {
        return this.c().c(object, ce2);
    }

    @Override
    public /* synthetic */ Set d() {
        return this.g();
    }

    @Override
    protected /* synthetic */ xc f() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.g();
    }
}

