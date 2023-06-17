/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.oj;
import com.a.a.d.oq;
import com.a.a.d.or;
import java.util.ListIterator;

class ot
implements ListIterator {
    final Object a;
    int b;
    or c;
    or d;
    or e;
    final /* synthetic */ oj f;

    ot(oj oj2, Object object) {
        this.f = oj2;
        this.a = object;
        oq oq2 = (oq)oj.d(oj2).get(object);
        this.c = oq2 == null ? null : oq2.a;
    }

    public ot(oj oj2, Object object, int n2) {
        this.f = oj2;
        oq oq2 = (oq)oj.d(oj2).get(object);
        int n3 = oq2 == null ? 0 : oq2.c;
        com.a.a.b.cl.b(n2, n3);
        if (n2 >= n3 / 2) {
            this.e = oq2 == null ? null : oq2.b;
            this.b = n3;
            while (n2++ < n3) {
                this.previous();
            }
        } else {
            or or2 = this.c = oq2 == null ? null : oq2.a;
            while (n2-- > 0) {
                this.next();
            }
        }
        this.a = object;
        this.d = null;
    }

    @Override
    public boolean hasNext() {
        return this.c != null;
    }

    @Override
    public Object next() {
        oj.e(this.c);
        this.e = this.d = this.c;
        this.c = this.c.e;
        ++this.b;
        return this.d.b;
    }

    @Override
    public boolean hasPrevious() {
        return this.e != null;
    }

    public Object previous() {
        oj.e(this.e);
        this.c = this.d = this.e;
        this.e = this.e.f;
        --this.b;
        return this.d.b;
    }

    @Override
    public int nextIndex() {
        return this.b;
    }

    @Override
    public int previousIndex() {
        return this.b - 1;
    }

    @Override
    public void remove() {
        cl.a(this.d != null);
        if (this.d != this.c) {
            this.e = this.d.f;
            --this.b;
        } else {
            this.c = this.d.e;
        }
        oj.a(this.f, this.d);
        this.d = null;
    }

    public void set(Object object) {
        com.a.a.b.cl.b(this.d != null);
        this.d.b = object;
    }

    public void add(Object object) {
        this.e = oj.a(this.f, this.a, object, this.c);
        ++this.b;
        this.d = null;
    }
}

