/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.adv;
import com.a.a.d.adx;
import com.a.a.d.aei;
import com.a.a.d.sz;
import com.a.a.d.zy;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class aeh
extends aei
implements zy {
    private static final long b = 0L;

    public aeh(zy zy2) {
        super(zy2);
    }

    protected zy k() {
        return (zy)super.f();
    }

    @Override
    public SortedMap j() {
        bl bl2 = adx.a();
        return Collections.unmodifiableSortedMap(sz.a(this.k().j(), bl2));
    }

    @Override
    public SortedSet i() {
        return Collections.unmodifiableSortedSet(this.k().i());
    }

    @Override
    public /* synthetic */ Map r() {
        return this.j();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.i();
    }

    @Override
    protected /* synthetic */ adv f() {
        return this.k();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.k();
    }
}

