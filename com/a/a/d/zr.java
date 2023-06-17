/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abt;
import com.a.a.d.adw;
import com.a.a.d.ec;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.d.lp;
import com.a.a.d.mi;
import com.a.a.d.ov;
import com.a.a.d.zs;
import com.a.a.d.zt;
import com.a.a.d.zv;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

abstract class zr
extends mi {
    zr() {
    }

    abstract adw a(int var1);

    @Override
    final lo s() {
        return this.c() ? lo.j() : new zt(this, null);
    }

    abstract Object b(int var1);

    @Override
    final iz v() {
        return this.c() ? jl.d() : new zv(this, null);
    }

    static zr a(List list, Comparator comparator, Comparator comparator2) {
        cl.a(list);
        if (comparator != null || comparator2 != null) {
            zs zs2 = new zs(comparator, comparator2);
            Collections.sort(list, zs2);
        }
        return zr.a((Iterable)list, comparator, comparator2);
    }

    static zr a(Iterable iterable) {
        return zr.a(iterable, null, null);
    }

    private static final zr a(Iterable iterable, Comparator comparator, Comparator comparator2) {
        Object object2;
        lp lp2 = lo.k();
        lp lp3 = lo.k();
        jl jl2 = jl.a(iterable);
        for (Object object2 : jl2) {
            lp2.c(object2.a());
            lp3.c(object2.b());
        }
        Object object3 = lp2.b();
        if (comparator != null) {
            object2 = ov.a((Iterable)object3);
            Collections.sort(object2, comparator);
            object3 = lo.a((Collection)object2);
        }
        object2 = lp3.b();
        if (comparator2 != null) {
            ArrayList arrayList = ov.a((Iterable)object2);
            Collections.sort(arrayList, comparator2);
            object2 = lo.a(arrayList);
        }
        return (long)jl2.size() > (long)((AbstractCollection)object3).size() * (long)((AbstractCollection)object2).size() / 2L ? new ec(jl2, (lo)object3, (lo)object2) : new abt(jl2, (lo)object3, (lo)object2);
    }

    @Override
    /* synthetic */ Collection aW_() {
        return this.v();
    }

    @Override
    /* synthetic */ Set f() {
        return this.s();
    }
}

