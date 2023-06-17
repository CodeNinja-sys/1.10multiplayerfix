/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.cl;
import com.a.a.d.oj;
import com.a.a.d.ok;
import com.a.a.d.or;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

class op
implements Iterator {
    final Set a;
    or b;
    or c;
    int d;
    final /* synthetic */ oj e;

    private op(oj oj2) {
        this.e = oj2;
        this.a = aad.a(this.e.q().size());
        this.b = oj.c(this.e);
        this.d = oj.a(this.e);
    }

    private void a() {
        if (oj.a(this.e) != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.b != null;
    }

    public Object next() {
        this.a();
        oj.e(this.b);
        this.c = this.b;
        this.a.add(this.c.a);
        do {
            this.b = this.b.c;
        } while (this.b != null && !this.a.add(this.b.a));
        return this.c.a;
    }

    @Override
    public void remove() {
        this.a();
        cl.a(this.c != null);
        oj.a(this.e, this.c.a);
        this.c = null;
        this.d = oj.a(this.e);
    }

    /* synthetic */ op(oj oj2, ok ok2) {
        this(oj2);
    }
}

