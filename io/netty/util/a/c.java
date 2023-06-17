/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.a;

import io.netty.util.a.a;
import io.netty.util.a.b;
import io.netty.util.a.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class c
implements e,
Iterator {
    private int b = -1;
    private int c = -1;
    private int d = -1;
    final /* synthetic */ a a;

    private c(a a2) {
        this.a = a2;
    }

    private void d() {
        while (++this.c != io.netty.util.a.a.a(this.a).length && io.netty.util.a.a.a(this.a)[this.c] == null) {
        }
    }

    @Override
    public boolean hasNext() {
        if (this.c == -1) {
            this.d();
        }
        return this.c < io.netty.util.a.a.b(this.a).length;
    }

    public e a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = this.c;
        this.d();
        this.d = this.b;
        return this;
    }

    @Override
    public void remove() {
        if (this.b < 0) {
            throw new IllegalStateException("next must be called before each remove.");
        }
        io.netty.util.a.a.a(this.a, this.b);
        this.b = -1;
    }

    @Override
    public int b() {
        return io.netty.util.a.a.b(this.a)[this.d];
    }

    @Override
    public Object c() {
        return io.netty.util.a.a.b(io.netty.util.a.a.a(this.a)[this.d]);
    }

    @Override
    public void a(Object object) {
        io.netty.util.a.a.a((a)this.a)[this.d] = io.netty.util.a.a.c(object);
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ c(a a2, b b2) {
        this(a2);
    }
}

