/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.aad;
import com.a.a.d.fi;
import com.a.a.d.fk;
import com.a.a.d.fl;
import com.a.a.d.fn;
import com.a.a.d.fr;
import com.a.a.d.ov;
import com.a.a.d.uj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

class fj
extends uj {
    final /* synthetic */ fi a;

    fj(fi fi2) {
        this.a = fi2;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    @Override
    public void clear() {
        this.a.h();
    }

    public Collection a(Object object) {
        Collection collection = (Collection)this.a.a.c().get(object);
        if (collection == null) {
            return null;
        }
        Object object2 = object;
        return (collection = fi.a(collection, new fr(this.a, object2))).isEmpty() ? null : collection;
    }

    public Collection b(Object object) {
        Collection collection = (Collection)this.a.a.c().get(object);
        if (collection == null) {
            return null;
        }
        Object object2 = object;
        ArrayList arrayList = ov.a();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!fi.a(this.a, object2, e2)) continue;
            iterator.remove();
            arrayList.add(e2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (this.a.a instanceof aac) {
            return Collections.unmodifiableSet(aad.d(arrayList));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override
    Set h() {
        return new fk(this, this);
    }

    @Override
    Set a() {
        return new fl(this);
    }

    @Override
    Collection aL_() {
        return new fn(this, this);
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

