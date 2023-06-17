/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adv;
import com.a.a.d.adw;
import com.a.a.d.adx;
import com.a.a.d.bg;
import com.a.a.d.bh;
import com.a.a.d.bi;
import com.a.a.d.nj;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class bf
implements adv {
    private transient Set a;
    private transient Collection b;

    bf() {
    }

    @Override
    public boolean a(Object object) {
        return sz.b(this.r(), object);
    }

    @Override
    public boolean b(Object object) {
        return sz.b(this.p(), object);
    }

    @Override
    public Set a() {
        return this.r().keySet();
    }

    @Override
    public Set b() {
        return this.p().keySet();
    }

    @Override
    public boolean c(Object object) {
        for (Map map : this.r().values()) {
            if (!map.containsValue(object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(Object object, Object object2) {
        Map map = (Map)sz.a(this.r(), object);
        return map != null && sz.b(map, object2);
    }

    @Override
    public Object b(Object object, Object object2) {
        Map map = (Map)sz.a(this.r(), object);
        return map == null ? null : sz.a(map, object2);
    }

    @Override
    public boolean c() {
        return this.n() == 0;
    }

    @Override
    public void d() {
        nj.i(this.e().iterator());
    }

    @Override
    public Object c(Object object, Object object2) {
        Map map = (Map)sz.a(this.r(), object);
        return map == null ? null : sz.c(map, object2);
    }

    @Override
    public Object a(Object object, Object object2, Object object3) {
        return this.e(object).put(object2, object3);
    }

    @Override
    public void a(adv adv2) {
        for (adw adw2 : adv2.e()) {
            this.a(adw2.a(), adw2.b(), adw2.c());
        }
    }

    @Override
    public Set e() {
        Set set = this.a;
        return set == null ? (this.a = this.f()) : set;
    }

    Set f() {
        return new bh(this);
    }

    abstract Iterator g();

    @Override
    public Collection h() {
        Collection collection = this.b;
        return collection == null ? (this.b = this.aW_()) : collection;
    }

    Collection aW_() {
        return new bi(this);
    }

    Iterator aX_() {
        return new bg(this, this.e().iterator());
    }

    @Override
    public boolean equals(Object object) {
        return adx.a((adv)this, object);
    }

    @Override
    public int hashCode() {
        return this.e().hashCode();
    }

    public String toString() {
        return this.r().toString();
    }
}

