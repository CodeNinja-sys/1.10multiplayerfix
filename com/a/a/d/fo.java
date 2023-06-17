/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.fi;
import com.a.a.d.fp;
import com.a.a.d.wn;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class fo
extends wn {
    final /* synthetic */ fi a;

    fo(fi fi2) {
        this.a = fi2;
        super(fi2);
    }

    @Override
    public int b(Object object, int n2) {
        cl.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        Collection collection = (Collection)this.a.a.c().get(object);
        if (collection == null) {
            return 0;
        }
        Object object2 = object;
        int n3 = 0;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!fi.a(this.a, object2, e2) || ++n3 > n2) continue;
            iterator.remove();
        }
        return n3;
    }

    @Override
    public Set aS_() {
        return new fp(this);
    }
}

