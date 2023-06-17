/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.dx;
import com.a.a.d.abw;
import com.a.a.d.abx;
import com.a.a.d.zy;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class abu
extends abx
implements zy {
    private static final long c = 0L;

    abu(SortedMap sortedMap, dx dx2) {
        super(sortedMap, dx2);
    }

    private SortedMap o() {
        return (SortedMap)this.a;
    }

    @Override
    public SortedSet i() {
        return (SortedSet)this.j().keySet();
    }

    @Override
    public SortedMap j() {
        return (SortedMap)super.r();
    }

    SortedMap k() {
        return new abw(this, null);
    }

    @Override
    /* synthetic */ Map l() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.j();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.i();
    }

    static /* synthetic */ SortedMap a(abu abu2) {
        return abu2.o();
    }
}

