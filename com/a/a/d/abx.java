/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.d.abz;
import com.a.a.d.aca;
import com.a.a.d.acg;
import com.a.a.d.ach;
import com.a.a.d.aci;
import com.a.a.d.acm;
import com.a.a.d.acq;
import com.a.a.d.bf;
import com.a.a.d.sz;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class abx
extends bf
implements Serializable {
    final Map a;
    final dx b;
    private transient Set c;
    private transient Map d;
    private transient aci e;
    private static final long f = 0L;

    abx(Map map, dx dx2) {
        this.a = map;
        this.b = dx2;
    }

    @Override
    public boolean a(Object object, Object object2) {
        return object != null && object2 != null && super.a(object, object2);
    }

    @Override
    public boolean b(Object object) {
        if (object == null) {
            return false;
        }
        for (Map map : this.a.values()) {
            if (!sz.b(map, object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(Object object) {
        return object != null && sz.b(this.a, object);
    }

    @Override
    public boolean c(Object object) {
        return object != null && super.c(object);
    }

    @Override
    public Object b(Object object, Object object2) {
        return object == null || object2 == null ? null : super.b(object, object2);
    }

    @Override
    public boolean c() {
        return this.a.isEmpty();
    }

    @Override
    public int n() {
        int n2 = 0;
        for (Map map : this.a.values()) {
            n2 += map.size();
        }
        return n2;
    }

    @Override
    public void d() {
        this.a.clear();
    }

    private Map f(Object object) {
        Map map = (Map)this.a.get(object);
        if (map == null) {
            map = (Map)this.b.a();
            this.a.put(object, map);
        }
        return map;
    }

    @Override
    public Object a(Object object, Object object2, Object object3) {
        cl.a(object);
        cl.a(object2);
        cl.a(object3);
        return this.f(object).put(object2, object3);
    }

    @Override
    public Object c(Object object, Object object2) {
        if (object == null || object2 == null) {
            return null;
        }
        Map map = (Map)sz.a(this.a, object);
        if (map == null) {
            return null;
        }
        Object v2 = map.remove(object2);
        if (map.isEmpty()) {
            this.a.remove(object);
        }
        return v2;
    }

    private Map g(Object object) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object v2 = ((Map)entry.getValue()).remove(object);
            if (v2 == null) continue;
            linkedHashMap.put(entry.getKey(), v2);
            if (!((Map)entry.getValue()).isEmpty()) continue;
            iterator.remove();
        }
        return linkedHashMap;
    }

    private boolean b(Object object, Object object2, Object object3) {
        return object3 != null && object3.equals(this.b(object, object2));
    }

    private boolean c(Object object, Object object2, Object object3) {
        if (this.b(object, object2, object3)) {
            this.c(object, object2);
            return true;
        }
        return false;
    }

    @Override
    public Set e() {
        return super.e();
    }

    @Override
    Iterator g() {
        return new abz(this, null);
    }

    @Override
    public Map e(Object object) {
        return new acm(this, object);
    }

    @Override
    public Map d(Object object) {
        return new aca(this, object);
    }

    @Override
    public Set a() {
        return this.r().keySet();
    }

    @Override
    public Set b() {
        Set set = this.c;
        return set == null ? (this.c = new ach(this, null)) : set;
    }

    Iterator m() {
        return new acg(this, null);
    }

    @Override
    public Collection h() {
        return super.h();
    }

    @Override
    public Map r() {
        Map map = this.d;
        return map == null ? (this.d = this.l()) : map;
    }

    Map l() {
        return new acq(this);
    }

    @Override
    public Map p() {
        aci aci2 = this.e;
        return aci2 == null ? (this.e = new aci(this, null)) : aci2;
    }

    static /* synthetic */ boolean a(abx abx2, Object object, Object object2, Object object3) {
        return abx2.b(object, object2, object3);
    }

    static /* synthetic */ boolean b(abx abx2, Object object, Object object2, Object object3) {
        return abx2.c(object, object2, object3);
    }

    static /* synthetic */ Map a(abx abx2, Object object) {
        return abx2.g(object);
    }
}

