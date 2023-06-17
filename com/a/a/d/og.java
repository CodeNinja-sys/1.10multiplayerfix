/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.oe;
import com.a.a.d.of;
import com.a.a.d.oh;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class og
implements Iterator {
    oh a;
    oe b;
    int c;
    final /* synthetic */ of d;

    og(of of2) {
        this.d = of2;
        this.a = of.a(this.d);
        this.c = of.b(this.d);
    }

    private void a() {
        if (of.b(this.d) != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.a != this.d;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        oe oe2 = (oe)this.a;
        Object object = oe2.getValue();
        this.b = oe2;
        this.a = oe2.b();
        return object;
    }

    @Override
    public void remove() {
        this.a();
        cl.a(this.b != null);
        this.d.remove(this.b.getValue());
        this.c = of.b(this.d);
        this.b = null;
    }
}

