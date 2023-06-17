/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abn;
import com.a.a.d.abp;
import com.a.a.d.ce;
import com.a.a.d.xc;
import com.a.a.d.xp;
import java.util.Comparator;
import java.util.SortedSet;

class abq
extends xp
implements SortedSet {
    private final abn a;

    abq(abn abn2) {
        this.a = abn2;
    }

    final abn b() {
        return this.a;
    }

    public Comparator comparator() {
        return this.b().comparator();
    }

    public SortedSet subSet(Object object, Object object2) {
        return this.b().a(object, ce.b, object2, ce.a).g();
    }

    public SortedSet headSet(Object object) {
        return this.b().d(object, ce.a).g();
    }

    public SortedSet tailSet(Object object) {
        return this.b().c(object, ce.b).g();
    }

    public Object first() {
        return abp.a(this.b().i());
    }

    public Object last() {
        return abp.a(this.b().j());
    }

    @Override
    /* synthetic */ xc a() {
        return this.b();
    }
}

