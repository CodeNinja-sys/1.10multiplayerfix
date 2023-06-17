/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.n;
import com.a.a.d.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class s
implements Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ q c;

    s(q q2) {
        this.c = q2;
        this.a = this.c.a.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry a() {
        Map.Entry entry = (Map.Entry)this.a.next();
        this.b = (Collection)entry.getValue();
        return this.c.a(entry);
    }

    @Override
    public void remove() {
        this.a.remove();
        n.b(this.c.b, this.b.size());
        this.b.clear();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

