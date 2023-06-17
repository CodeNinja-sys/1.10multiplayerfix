/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ad;
import com.a.b.b.w;
import com.a.b.b.x;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class ac
implements Iterator {
    ad b;
    ad c;
    int d;
    final /* synthetic */ w e;

    private ac(w w2) {
        this.e = w2;
        this.b = this.e.e.d;
        this.c = null;
        this.d = this.e.d;
    }

    public final boolean hasNext() {
        return this.b != this.e.e;
    }

    final ad b() {
        ad ad2 = this.b;
        if (ad2 == this.e.e) {
            throw new NoSuchElementException();
        }
        if (this.e.d != this.d) {
            throw new ConcurrentModificationException();
        }
        this.b = ad2.d;
        this.c = ad2;
        return this.c;
    }

    public final void remove() {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        this.e.a(this.c, true);
        this.c = null;
        this.d = this.e.d;
    }

    /* synthetic */ ac(w w2, x x2) {
        this(w2);
    }
}

