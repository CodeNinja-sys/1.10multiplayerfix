/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.d.lr;
import com.a.a.d.lw;
import com.a.a.d.me;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;

final class fa
extends lw {
    private final transient me a;

    fa(Comparator comparator) {
        this.a = me.a(comparator);
    }

    fa(Comparator comparator, lw lw2) {
        super(lw2);
        this.a = me.a(comparator);
    }

    @Override
    public Object get(Object object) {
        return null;
    }

    @Override
    public me a() {
        return this.a;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public iz aU_() {
        return jl.d();
    }

    @Override
    public String toString() {
        return "{}";
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    public lo e() {
        return lo.j();
    }

    @Override
    lo d() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    public lr f() {
        return lr.a();
    }

    @Override
    public lw a(Object object, boolean bl2) {
        cl.a(object);
        return this;
    }

    @Override
    public lw b(Object object, boolean bl2) {
        cl.a(object);
        return this;
    }

    @Override
    lw i() {
        return new fa(yd.a(this.comparator()).a(), this);
    }

    @Override
    public /* synthetic */ NavigableMap tailMap(Object object, boolean bl2) {
        return this.b(object, bl2);
    }

    @Override
    public /* synthetic */ NavigableMap headMap(Object object, boolean bl2) {
        return this.a(object, bl2);
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return this.e();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.aU_();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.a();
    }

    @Override
    public /* synthetic */ lo g() {
        return this.a();
    }
}

