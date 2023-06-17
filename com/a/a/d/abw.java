/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abu;
import com.a.a.d.abv;
import com.a.a.d.acq;
import com.a.a.d.up;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class abw
extends acq
implements SortedMap {
    final /* synthetic */ abu a;

    private abw(abu abu2) {
        this.a = abu2;
        super(abu2);
    }

    public SortedSet c() {
        return (SortedSet)super.keySet();
    }

    SortedSet d() {
        return new up(this);
    }

    public Comparator comparator() {
        return abu.a(this.a).comparator();
    }

    public Object firstKey() {
        return abu.a(this.a).firstKey();
    }

    public Object lastKey() {
        return abu.a(this.a).lastKey();
    }

    public SortedMap headMap(Object object) {
        cl.a(object);
        return new abu(abu.a(this.a).headMap(object), this.a.b).j();
    }

    public SortedMap subMap(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        return new abu(abu.a(this.a).subMap(object, object2), this.a.b).j();
    }

    public SortedMap tailMap(Object object) {
        cl.a(object);
        return new abu(abu.a(this.a).tailMap(object), this.a.b).j();
    }

    @Override
    /* synthetic */ Set h() {
        return this.d();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.c();
    }

    /* synthetic */ abw(abu abu2, abv abv2) {
        this(abu2);
    }
}

