/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.pu;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class pv
implements Iterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ pu b;

    pv(pu pu2, Iterator iterator) {
        this.b = pu2;
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Collection a() {
        return (Collection)((Map.Entry)this.a.next()).getValue();
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

