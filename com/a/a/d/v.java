/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.n;
import com.a.a.d.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class v
implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ u c;

    v(u u2, Iterator iterator) {
        this.c = u2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public Object next() {
        this.a = (Map.Entry)this.b.next();
        return this.a.getKey();
    }

    @Override
    public void remove() {
        cl.a(this.a != null);
        Collection collection = (Collection)this.a.getValue();
        this.b.remove();
        n.b(this.c.a, collection.size());
        collection.clear();
    }
}

