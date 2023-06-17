/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.oc;
import com.a.a.d.oe;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

class od
implements Iterator {
    oe a;
    oe b;
    final /* synthetic */ oc c;

    od(oc oc2) {
        this.c = oc2;
        this.a = oc.a((oc)this.c).h;
    }

    @Override
    public boolean hasNext() {
        return this.a != oc.a(this.c);
    }

    public Map.Entry a() {
        oe oe2;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = oe2 = this.a;
        this.a = this.a.h;
        return oe2;
    }

    @Override
    public void remove() {
        cl.a(this.b != null);
        this.c.c(this.b.getKey(), this.b.getValue());
        this.b = null;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

