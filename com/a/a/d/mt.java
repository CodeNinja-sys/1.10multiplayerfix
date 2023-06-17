/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.ms;
import java.util.Iterator;

class mt
implements Iterator {
    boolean a = true;
    final /* synthetic */ Iterator b;
    final /* synthetic */ ms c;

    mt(ms ms2, Iterator iterator) {
        this.c = ms2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public Object next() {
        Object e2 = this.b.next();
        this.a = false;
        return e2;
    }

    @Override
    public void remove() {
        cl.a(!this.a);
        this.b.remove();
    }
}

