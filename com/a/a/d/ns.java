/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class ns
implements Iterator {
    Iterator a = nj.a();
    Iterator b;
    final /* synthetic */ Iterable c;

    ns(Iterable iterable) {
        this.c = iterable;
    }

    @Override
    public boolean hasNext() {
        if (!this.a.hasNext()) {
            this.a = this.c.iterator();
        }
        return this.a.hasNext();
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

