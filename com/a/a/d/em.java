/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.me;
import com.a.a.d.yd;
import java.util.Iterator;
import java.util.NavigableSet;

class em
extends me {
    private final me a;

    em(me me2) {
        super(yd.a(me2.comparator()).a());
        this.a = me2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public agi aO_() {
        return this.a.d();
    }

    @Override
    me b(Object object, boolean bl2) {
        return this.a.c(object, bl2).aP_();
    }

    @Override
    me a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a.b(object2, bl3, object, bl2).aP_();
    }

    @Override
    me a(Object object, boolean bl2) {
        return this.a.d(object, bl2).aP_();
    }

    @Override
    public me aP_() {
        return this.a;
    }

    @Override
    public agi d() {
        return this.a.aO_();
    }

    @Override
    me e() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    public Object lower(Object object) {
        return this.a.higher(object);
    }

    @Override
    public Object floor(Object object) {
        return this.a.ceiling(object);
    }

    @Override
    public Object ceiling(Object object) {
        return this.a.floor(object);
    }

    @Override
    public Object higher(Object object) {
        return this.a.lower(object);
    }

    @Override
    int c(Object object) {
        int n2 = this.a.c(object);
        if (n2 == -1) {
            return n2;
        }
        return this.size() - 1 - n2;
    }

    @Override
    boolean a() {
        return this.a.a();
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ NavigableSet descendingSet() {
        return this.aP_();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

