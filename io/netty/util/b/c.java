/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.a;
import io.netty.util.b.b;
import io.netty.util.b.w;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class c
implements Iterator {
    private boolean b;
    final /* synthetic */ a a;

    private c(a a2) {
        this.a = a2;
    }

    @Override
    public boolean hasNext() {
        return !this.b;
    }

    public w a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return this.a;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("read-only");
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ c(a a2, b b2) {
        this(a2);
    }
}

