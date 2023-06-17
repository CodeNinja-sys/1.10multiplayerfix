/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.d.abx;
import com.a.a.d.acb;
import com.a.a.d.ace;
import com.a.a.d.acf;
import com.a.a.d.sz;
import com.a.a.d.uj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class aca
extends uj {
    final Object a;
    final /* synthetic */ abx b;

    aca(abx abx2, Object object) {
        this.b = abx2;
        this.a = cl.a(object);
    }

    @Override
    public Object put(Object object, Object object2) {
        return this.b.a(object, this.a, object2);
    }

    @Override
    public Object get(Object object) {
        return this.b.b(object, this.a);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.b.a(object, this.a);
    }

    @Override
    public Object remove(Object object) {
        return this.b.c(object, this.a);
    }

    boolean a(cm cm2) {
        boolean bl2 = false;
        Iterator iterator = this.b.a.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Map map = (Map)entry.getValue();
            Object v2 = map.get(this.a);
            if (v2 == null || !cm2.a(sz.a(entry.getKey(), v2))) continue;
            map.remove(this.a);
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    @Override
    Set a() {
        return new acb(this, null);
    }

    @Override
    Set h() {
        return new ace(this);
    }

    @Override
    Collection aL_() {
        return new acf(this);
    }
}

