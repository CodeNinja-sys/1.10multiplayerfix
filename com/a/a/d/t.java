/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.n;
import com.a.a.d.nj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

abstract class t
implements Iterator {
    final Iterator b;
    Object c;
    Collection d;
    Iterator e;
    final /* synthetic */ n f;

    t(n n2) {
        this.f = n2;
        this.b = n.a(n2).entrySet().iterator();
        this.c = null;
        this.d = null;
        this.e = nj.c();
    }

    abstract Object a(Object var1, Object var2);

    @Override
    public boolean hasNext() {
        return this.b.hasNext() || this.e.hasNext();
    }

    public Object next() {
        if (!this.e.hasNext()) {
            Map.Entry entry = (Map.Entry)this.b.next();
            this.c = entry.getKey();
            this.d = (Collection)entry.getValue();
            this.e = this.d.iterator();
        }
        return this.a(this.c, this.e.next());
    }

    @Override
    public void remove() {
        this.e.remove();
        if (this.d.isEmpty()) {
            this.b.remove();
        }
        n.b(this.f);
    }
}

