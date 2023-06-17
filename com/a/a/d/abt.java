/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adw;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.lo;
import com.a.a.d.sz;
import com.a.a.d.zr;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

final class abt
extends zr {
    private final jt a;
    private final jt b;
    private final int[] c;
    private final int[] d;

    abt(jl jl2, lo lo2, lo lo3) {
        Object object;
        Object object222;
        Object object322;
        HashMap hashMap = sz.c();
        LinkedHashMap linkedHashMap = sz.d();
        for (Object object322 : lo2) {
            hashMap.put(object322, linkedHashMap.size());
            linkedHashMap.put(object322, new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = sz.d();
        for (Object object222 : lo3) {
            linkedHashMap2.put(object222, new LinkedHashMap());
        }
        object322 = new int[jl2.size()];
        object222 = new int[jl2.size()];
        for (int i2 = 0; i2 < jl2.size(); ++i2) {
            object = (adw)jl2.get(i2);
            Object iterator = object.a();
            Map.Entry entry = object.b();
            Object object2 = object.c();
            object322[i2] = (Integer)hashMap.get(iterator);
            Map map = (Map)linkedHashMap.get(iterator);
            object222[i2] = map.size();
            Object object3 = map.put(entry, object2);
            if (object3 != null) {
                throw new IllegalArgumentException("Duplicate value for row=" + iterator + ", column=" + entry + ": " + object2 + ", " + object3);
            }
            ((Map)linkedHashMap2.get(entry)).put(iterator, object2);
        }
        this.c = (int[])object322;
        this.d = (int[])object222;
        ju ju2 = jt.n();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ju2.b(entry.getKey(), jt.b((Map)entry.getValue()));
        }
        this.a = ju2.b();
        object = jt.n();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            ((ju)object).b(entry.getKey(), jt.b((Map)entry.getValue()));
        }
        this.b = ((ju)object).b();
    }

    @Override
    public jt k() {
        return this.b;
    }

    @Override
    public jt l() {
        return this.a;
    }

    @Override
    public int n() {
        return this.c.length;
    }

    @Override
    adw a(int n2) {
        int n3 = this.c[n2];
        Map.Entry entry = (Map.Entry)this.a.e().h().get(n3);
        jt jt2 = (jt)entry.getValue();
        int n4 = this.d[n2];
        Map.Entry entry2 = (Map.Entry)jt2.e().h().get(n4);
        return abt.c(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override
    Object b(int n2) {
        int n3 = this.c[n2];
        jt jt2 = (jt)this.a.aU_().h().get(n3);
        int n4 = this.d[n2];
        return jt2.aU_().h().get(n4);
    }

    @Override
    public /* synthetic */ Map p() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.l();
    }
}

