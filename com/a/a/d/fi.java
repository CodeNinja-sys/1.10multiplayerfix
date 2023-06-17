/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.aac;
import com.a.a.d.aad;
import com.a.a.d.an;
import com.a.a.d.cm;
import com.a.a.d.fj;
import com.a.a.d.fo;
import com.a.a.d.fr;
import com.a.a.d.ga;
import com.a.a.d.gb;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.xc;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class fi
extends an
implements ga {
    final vi a;
    final com.a.a.b.cm b;

    fi(vi vi2, com.a.a.b.cm cm2) {
        this.a = (vi)cl.a(vi2);
        this.b = (com.a.a.b.cm)cl.a(cm2);
    }

    @Override
    public vi a() {
        return this.a;
    }

    @Override
    public com.a.a.b.cm b() {
        return this.b;
    }

    @Override
    public int g() {
        return this.l().size();
    }

    private boolean d(Object object, Object object2) {
        return this.b.a(sz.a(object, object2));
    }

    static Collection a(Collection collection, com.a.a.b.cm cm2) {
        if (collection instanceof Set) {
            return aad.a((Set)collection, cm2);
        }
        return cm.a(collection, cm2);
    }

    @Override
    public boolean f(Object object) {
        return this.c().get(object) != null;
    }

    @Override
    public Collection d(Object object) {
        return (Collection)cc.b(this.c().remove(object), this.d());
    }

    Collection d() {
        return this.a instanceof aac ? Collections.emptySet() : Collections.emptyList();
    }

    @Override
    public void h() {
        this.l().clear();
    }

    @Override
    public Collection c(Object object) {
        return fi.a(this.a.c(object), new fr(this, object));
    }

    @Override
    Collection p() {
        return fi.a(this.a.l(), this.b);
    }

    @Override
    Collection t() {
        return new gb(this);
    }

    @Override
    Iterator m() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    Map n() {
        return new fj(this);
    }

    @Override
    public Set q() {
        return this.c().keySet();
    }

    boolean a(com.a.a.b.cm cm2) {
        Iterator iterator = this.a.c().entrySet().iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object k2 = entry.getKey();
            Collection collection = fi.a((Collection)entry.getValue(), new fr(this, k2));
            if (collection.isEmpty() || !cm2.a(sz.a(k2, (Object)collection))) continue;
            if (collection.size() == ((Collection)entry.getValue()).size()) {
                iterator.remove();
            } else {
                collection.clear();
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    xc s() {
        return new fo(this);
    }

    static /* synthetic */ boolean a(fi fi2, Object object, Object object2) {
        return fi2.d(object, object2);
    }
}

