/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.abn;
import com.a.a.d.ce;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.xw;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class agk
extends xw
implements abn {
    private transient agk d;
    private static final long e = 0L;

    agk(abn abn2) {
        super(abn2);
    }

    protected abn e() {
        return (abn)super.f();
    }

    @Override
    public Comparator comparator() {
        return this.e().comparator();
    }

    NavigableSet h() {
        return aad.a(this.e().g());
    }

    @Override
    public NavigableSet g() {
        return (NavigableSet)super.d();
    }

    @Override
    public abn o() {
        agk agk2 = this.d;
        if (agk2 == null) {
            agk2 = new agk(this.e().o());
            agk2.d = this;
            this.d = agk2;
            return this.d;
        }
        return agk2;
    }

    @Override
    public xd i() {
        return this.e().i();
    }

    @Override
    public xd j() {
        return this.e().j();
    }

    @Override
    public xd k() {
        throw new UnsupportedOperationException();
    }

    @Override
    public xd l() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abn d(Object object, ce ce2) {
        return xe.a(this.e().d(object, ce2));
    }

    @Override
    public abn a(Object object, ce ce2, Object object2, ce ce3) {
        return xe.a(this.e().a(object, ce2, object2, ce3));
    }

    @Override
    public abn c(Object object, ce ce2) {
        return xe.a(this.e().c(object, ce2));
    }

    @Override
    public /* synthetic */ Set d() {
        return this.g();
    }

    @Override
    /* synthetic */ Set c() {
        return this.h();
    }

    @Override
    protected /* synthetic */ xc f() {
        return this.e();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.e();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.e();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.g();
    }
}

