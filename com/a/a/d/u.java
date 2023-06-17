/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.n;
import com.a.a.d.nj;
import com.a.a.d.uk;
import com.a.a.d.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class u
extends uk {
    final /* synthetic */ n a;

    u(n n2, Map map) {
        this.a = n2;
        super(map);
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = this.c().entrySet().iterator();
        return new v(this, iterator);
    }

    @Override
    public boolean remove(Object object) {
        int n2 = 0;
        Collection collection = (Collection)this.c().remove(object);
        if (collection != null) {
            n2 = collection.size();
            collection.clear();
            n.b(this.a, n2);
        }
        return n2 > 0;
    }

    @Override
    public void clear() {
        nj.i(this.iterator());
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.c().keySet().containsAll(collection);
    }

    @Override
    public boolean equals(Object object) {
        return this == object || this.c().keySet().equals(object);
    }

    @Override
    public int hashCode() {
        return this.c().keySet().hashCode();
    }
}

