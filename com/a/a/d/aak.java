/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.aam;
import com.a.a.d.mq;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.NavigableSet;

class aak
extends aam
implements NavigableSet {
    aak(NavigableSet navigableSet, cm cm2) {
        super(navigableSet, cm2);
    }

    NavigableSet a() {
        return (NavigableSet)this.a;
    }

    public Object lower(Object object) {
        return nj.d(this.headSet(object, false).descendingIterator(), null);
    }

    public Object floor(Object object) {
        return nj.d(this.headSet(object, true).descendingIterator(), null);
    }

    public Object ceiling(Object object) {
        return mq.d((Iterable)this.tailSet(object, true), null);
    }

    public Object higher(Object object) {
        return mq.d((Iterable)this.tailSet(object, false), null);
    }

    public Object pollFirst() {
        return mq.b((Iterable)this.a(), this.b);
    }

    public Object pollLast() {
        return mq.b(this.a().descendingSet(), this.b);
    }

    public NavigableSet descendingSet() {
        return aad.a(this.a().descendingSet(), this.b);
    }

    public Iterator descendingIterator() {
        return nj.b(this.a().descendingIterator(), this.b);
    }

    @Override
    public Object last() {
        return this.descendingIterator().next();
    }

    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return aad.a(this.a().subSet(object, bl2, object2, bl3), this.b);
    }

    public NavigableSet headSet(Object object, boolean bl2) {
        return aad.a(this.a().headSet(object, bl2), this.b);
    }

    public NavigableSet tailSet(Object object, boolean bl2) {
        return aad.a(this.a().tailSet(object, bl2), this.b);
    }
}

