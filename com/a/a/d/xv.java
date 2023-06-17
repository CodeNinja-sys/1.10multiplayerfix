/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.xc;
import com.a.a.d.xd;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class xv
implements Iterator {
    private final xc a;
    private final Iterator b;
    private xd c;
    private int d;
    private int e;
    private boolean f;

    xv(xc xc2, Iterator iterator) {
        this.a = xc2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.d == 0) {
            this.c = (xd)this.b.next();
            this.e = this.d = this.c.b();
        }
        --this.d;
        this.f = true;
        return this.c.a();
    }

    @Override
    public void remove() {
        cl.a(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            this.a.remove(this.c.a());
        }
        --this.e;
        this.f = false;
    }
}

