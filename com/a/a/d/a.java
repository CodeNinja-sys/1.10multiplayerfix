/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.b;
import com.a.a.d.bw;
import com.a.a.d.c;
import com.a.a.d.f;
import com.a.a.d.g;
import com.a.a.d.gs;
import com.a.a.d.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class a
extends gs
implements bw,
Serializable {
    private transient Map b;
    transient a a;
    private transient Set c;
    private transient Set d;
    private transient Set e;
    private static final long f = 0L;

    a(Map map, Map map2) {
        this.a(map, map2);
    }

    private a(Map map, a a2) {
        this.b = map;
        this.a = a2;
    }

    @Override
    protected Map a() {
        return this.b;
    }

    Object a(Object object) {
        return object;
    }

    Object b(Object object) {
        return object;
    }

    void a(Map map, Map map2) {
        cl.b(this.b == null);
        cl.b(this.a == null);
        cl.a(map.isEmpty());
        cl.a(map2.isEmpty());
        cl.a(map != map2);
        this.b = map;
        this.a = new f(map2, this, null);
    }

    void a(a a2) {
        this.a = a2;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public Object put(Object object, Object object2) {
        return this.a(object, object2, false);
    }

    @Override
    public Object a(Object object, Object object2) {
        return this.a(object, object2, true);
    }

    private Object a(Object object, Object object2, boolean bl2) {
        this.a(object);
        this.b(object2);
        boolean bl3 = this.containsKey(object);
        if (bl3 && cc.a(object2, this.get(object))) {
            return object2;
        }
        if (bl2) {
            this.aT_().remove(object2);
        } else {
            cl.a(!this.containsValue(object2), "value already present: %s", object2);
        }
        Object object3 = this.b.put(object, object2);
        this.a(object, bl3, object3, object2);
        return object3;
    }

    private void a(Object object, boolean bl2, Object object2, Object object3) {
        if (bl2) {
            this.h(object2);
        }
        this.a.b.put(object3, object);
    }

    @Override
    public Object remove(Object object) {
        return this.containsKey(object) ? this.g(object) : null;
    }

    private Object g(Object object) {
        Object v2 = this.b.remove(object);
        this.h(v2);
        return v2;
    }

    private void h(Object object) {
        this.a.b.remove(object);
    }

    @Override
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        this.b.clear();
        this.a.b.clear();
    }

    @Override
    public bw aT_() {
        return this.a;
    }

    @Override
    public Set keySet() {
        Set set = this.c;
        return set == null ? (this.c = new g(this, null)) : set;
    }

    @Override
    public Set c() {
        Set set = this.d;
        return set == null ? (this.d = new h(this, null)) : set;
    }

    @Override
    public Set entrySet() {
        Set set = this.e;
        return set == null ? (this.e = new c(this, null)) : set;
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }

    static /* synthetic */ Map b(a a2) {
        return a2.b;
    }

    static /* synthetic */ Object a(a a2, Object object) {
        return a2.g(object);
    }

    static /* synthetic */ void a(a a2, Object object, boolean bl2, Object object2, Object object3) {
        a2.a(object, bl2, object2, object3);
    }

    static /* synthetic */ void b(a a2, Object object) {
        a2.h(object);
    }

    /* synthetic */ a(Map map, a a2, b b2) {
        this(map, a2);
    }
}

