/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ab;
import com.a.a.d.ac;
import com.a.a.d.ah;
import com.a.a.d.n;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

class af
extends ah
implements NavigableSet {
    final /* synthetic */ n a;

    af(n n2, Object object, NavigableSet navigableSet, ab ab2) {
        this.a = n2;
        super(n2, object, navigableSet, ab2);
    }

    NavigableSet g() {
        return (NavigableSet)super.h();
    }

    public Object lower(Object object) {
        return this.g().lower(object);
    }

    public Object floor(Object object) {
        return this.g().floor(object);
    }

    public Object ceiling(Object object) {
        return this.g().ceiling(object);
    }

    public Object higher(Object object) {
        return this.g().higher(object);
    }

    public Object pollFirst() {
        return nj.h(this.iterator());
    }

    public Object pollLast() {
        return nj.h(this.descendingIterator());
    }

    private NavigableSet a(NavigableSet navigableSet) {
        return new af(this.a, this.b, navigableSet, this.f() == null ? this : this.f());
    }

    public NavigableSet descendingSet() {
        return this.a(this.g().descendingSet());
    }

    public Iterator descendingIterator() {
        return new ac(this, this.g().descendingIterator());
    }

    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a(this.g().subSet(object, bl2, object2, bl3));
    }

    public NavigableSet headSet(Object object, boolean bl2) {
        return this.a(this.g().headSet(object, bl2));
    }

    public NavigableSet tailSet(Object object, boolean bl2) {
        return this.a(this.g().tailSet(object, bl2));
    }

    @Override
    /* synthetic */ SortedSet h() {
        return this.g();
    }
}

