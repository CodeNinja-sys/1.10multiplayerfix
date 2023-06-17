/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.jl;
import com.a.a.d.sz;
import com.a.a.d.yd;
import com.a.a.m.af;
import com.a.a.m.ao;
import com.a.a.m.ap;
import com.a.a.m.aq;
import com.a.a.m.ar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

abstract class an {
    static final an a = new ao();
    static final an b = new ap();

    private an() {
    }

    final an a() {
        return new aq(this, this);
    }

    final jl a(Object object) {
        return this.a(jl.a(object));
    }

    jl a(Iterable iterable) {
        HashMap hashMap = sz.c();
        for (Object t2 : iterable) {
            this.a(t2, hashMap);
        }
        return an.a(hashMap, yd.d().a());
    }

    private int a(Object object, Map map) {
        Integer n2 = (Integer)map.get(this);
        if (n2 != null) {
            return n2;
        }
        int n3 = this.b(object).isInterface() ? 1 : 0;
        for (Object t2 : this.c(object)) {
            n3 = Math.max(n3, this.a(t2, map));
        }
        Object object2 = this.d(object);
        if (object2 != null) {
            n3 = Math.max(n3, this.a(object2, map));
        }
        map.put(object, n3 + 1);
        return n3 + 1;
    }

    private static jl a(Map map, Comparator comparator) {
        ar ar2 = new ar(comparator, map);
        return ar2.b(map.keySet());
    }

    abstract Class b(Object var1);

    abstract Iterable c(Object var1);

    abstract Object d(Object var1);

    /* synthetic */ an(af af2) {
        this();
    }
}

