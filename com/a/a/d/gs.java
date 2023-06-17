/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.aad;
import com.a.a.d.hg;
import com.a.a.d.nj;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class gs
extends hg
implements Map {
    protected gs() {
    }

    protected abstract Map a();

    @Override
    public int size() {
        return this.a().size();
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    public Object remove(Object object) {
        return this.a().remove(object);
    }

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a().containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a().containsValue(object);
    }

    public Object get(Object object) {
        return this.a().get(object);
    }

    public Object put(Object object, Object object2) {
        return this.a().put(object, object2);
    }

    public void putAll(Map map) {
        this.a().putAll(map);
    }

    public Set keySet() {
        return this.a().keySet();
    }

    public Collection values() {
        return this.a().values();
    }

    public Set entrySet() {
        return this.a().entrySet();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.a().equals(object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    protected void c(Map map) {
        sz.b((Map)this, map);
    }

    protected Object c(Object object) {
        Iterator iterator = this.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (!cc.a(entry.getKey(), object)) continue;
            Object v2 = entry.getValue();
            iterator.remove();
            return v2;
        }
        return null;
    }

    protected void f() {
        nj.i(this.entrySet().iterator());
    }

    protected boolean d(Object object) {
        return sz.d(this, object);
    }

    protected boolean e(Object object) {
        return sz.e(this, object);
    }

    protected boolean h() {
        return !this.entrySet().iterator().hasNext();
    }

    protected boolean f(Object object) {
        return sz.f(this, object);
    }

    protected int i() {
        return aad.b(this.entrySet());
    }

    protected String j() {
        return sz.e(this);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

