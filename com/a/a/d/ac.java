/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ab;
import com.a.a.d.n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class ac
implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ ab c;

    ac(ab ab2) {
        this.c = ab2;
        this.b = this.c.c;
        this.a = n.a(ab2.f, ab2.c);
    }

    ac(ab ab2, Iterator iterator) {
        this.c = ab2;
        this.b = this.c.c;
        this.a = iterator;
    }

    void a() {
        this.c.a();
        if (this.c.c != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.a.hasNext();
    }

    public Object next() {
        this.a();
        return this.a.next();
    }

    @Override
    public void remove() {
        this.a.remove();
        n.b(this.c.f);
        this.c.b();
    }

    Iterator b() {
        this.a();
        return this.a;
    }
}

