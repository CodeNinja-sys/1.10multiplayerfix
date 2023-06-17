/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aer;
import com.a.a.d.aez;
import com.a.a.d.cl;
import com.a.a.d.xd;
import java.util.Iterator;
import java.util.NoSuchElementException;

class aeu
implements Iterator {
    aez a;
    xd b;
    final /* synthetic */ aer c;

    aeu(aer aer2) {
        this.c = aer2;
        this.a = aer.d(this.c);
        this.b = null;
    }

    @Override
    public boolean hasNext() {
        if (this.a == null) {
            return false;
        }
        if (aer.b(this.c).a(this.a.a())) {
            this.a = null;
            return false;
        }
        return true;
    }

    public xd a() {
        xd xd2;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = xd2 = aer.a(this.c, this.a);
        this.a = aez.h(this.a) == aer.c(this.c) ? null : aez.h(this.a);
        return xd2;
    }

    @Override
    public void remove() {
        cl.a(this.b != null);
        this.c.c(this.b.a(), 0);
        this.b = null;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

