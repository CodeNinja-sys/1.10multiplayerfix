/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.be;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class bb
extends be {
    bb(SortedMap sortedMap) {
        super(sortedMap);
    }

    public SortedMap v() {
        return (SortedMap)super.c();
    }

    SortedMap w() {
        return (SortedMap)super.f();
    }

    public SortedSet x() {
        return (SortedSet)super.q();
    }

    @Override
    public /* synthetic */ Map c() {
        return this.v();
    }

    @Override
    public /* synthetic */ Set q() {
        return this.x();
    }

    @Override
    /* synthetic */ Map f() {
        return this.w();
    }
}

