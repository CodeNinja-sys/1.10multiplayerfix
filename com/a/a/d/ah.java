/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ab;
import com.a.a.d.n;
import java.util.Comparator;
import java.util.SortedSet;

class ah
extends ab
implements SortedSet {
    final /* synthetic */ n g;

    ah(n n2, Object object, SortedSet sortedSet, ab ab2) {
        this.g = n2;
        super(n2, object, sortedSet, ab2);
    }

    SortedSet h() {
        return (SortedSet)this.e();
    }

    public Comparator comparator() {
        return this.h().comparator();
    }

    public Object first() {
        this.a();
        return this.h().first();
    }

    public Object last() {
        this.a();
        return this.h().last();
    }

    public SortedSet headSet(Object object) {
        this.a();
        return new ah(this.g, this.c(), this.h().headSet(object), this.f() == null ? this : this.f());
    }

    public SortedSet subSet(Object object, Object object2) {
        this.a();
        return new ah(this.g, this.c(), this.h().subSet(object, object2), this.f() == null ? this : this.f());
    }

    public SortedSet tailSet(Object object) {
        this.a();
        return new ah(this.g, this.c(), this.h().tailSet(object), this.f() == null ? this : this.f());
    }
}

