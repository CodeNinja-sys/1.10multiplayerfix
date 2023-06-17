/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.k;
import io.netty.c.a.d.l;
import io.netty.c.a.d.m;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class n
implements Iterator {
    private m b;
    final /* synthetic */ k a;

    private n(k k2) {
        this.a = k2;
        this.b = k.a(this.a);
    }

    @Override
    public boolean hasNext() {
        return this.b.f != k.a(this.a);
    }

    public Map.Entry a() {
        this.b = this.b.f;
        if (this.b == k.a(this.a)) {
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

    /* synthetic */ n(k k2, l l2) {
        this(k2);
    }
}

