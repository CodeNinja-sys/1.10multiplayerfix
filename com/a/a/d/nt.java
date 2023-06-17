/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class nt
implements Iterator {
    Iterator a = nj.a();
    Iterator b;
    final /* synthetic */ Iterator c;

    nt(Iterator iterator) {
        this.c = iterator;
    }

    @Override
    public boolean hasNext() {
        boolean bl2;
        while (!(bl2 = ((Iterator)com.a.a.b.cl.a(this.a)).hasNext()) && this.c.hasNext()) {
            this.a = (Iterator)this.c.next();
        }
        return bl2;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = this.a;
        return this.a.next();
    }

    @Override
    public void remove() {
        cl.a(this.b != null);
        this.b.remove();
        this.b = null;
    }
}

