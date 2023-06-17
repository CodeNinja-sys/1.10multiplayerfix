/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abn;
import com.a.a.d.abp;
import com.a.a.d.abq;
import com.a.a.d.ce;
import java.util.Iterator;
import java.util.NavigableSet;

class abr
extends abq
implements NavigableSet {
    abr(abn abn2) {
        super(abn2);
    }

    public Object lower(Object object) {
        return abp.b(this.b().d(object, ce.a).j());
    }

    public Object floor(Object object) {
        return abp.b(this.b().d(object, ce.b).j());
    }

    public Object ceiling(Object object) {
        return abp.b(this.b().c(object, ce.b).i());
    }

    public Object higher(Object object) {
        return abp.b(this.b().c(object, ce.a).i());
    }

    public NavigableSet descendingSet() {
        return new abr(this.b().o());
    }

    public Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    public Object pollFirst() {
        return abp.b(this.b().k());
    }

    public Object pollLast() {
        return abp.b(this.b().l());
    }

    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return new abr(this.b().a(object, ce.a(bl2), object2, ce.a(bl3)));
    }

    public NavigableSet headSet(Object object, boolean bl2) {
        return new abr(this.b().d(object, ce.a(bl2)));
    }

    public NavigableSet tailSet(Object object, boolean bl2) {
        return new abr(this.b().c(object, ce.a(bl2)));
    }
}

