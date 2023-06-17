/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.cl;
import com.a.a.d.e;
import java.util.Iterator;
import java.util.Map;

class d
implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ c c;

    d(c c2, Iterator iterator) {
        this.c = c2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public Map.Entry a() {
        Map.Entry entry = this.a = (Map.Entry)this.b.next();
        return new e(this, entry);
    }

    @Override
    public void remove() {
        cl.a(this.a != null);
        Object v2 = this.a.getValue();
        this.b.remove();
        com.a.a.d.a.b(this.c.b, v2);
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

