/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.c;
import io.netty.c.a.k.d;
import io.netty.c.a.k.e;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class f
implements Iterator {
    private e b;
    final /* synthetic */ c a;

    private f(c c2) {
        this.a = c2;
        this.b = c.a(this.a);
    }

    @Override
    public boolean hasNext() {
        return this.b.f != c.a(this.a);
    }

    public Map.Entry a() {
        this.b = this.b.f;
        if (this.b == c.a(this.a)) {
            throw new NoSuchElementException();
        }
        return this.b;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ f(c c2, d d2) {
        this(c2);
    }
}

