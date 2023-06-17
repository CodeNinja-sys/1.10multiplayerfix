/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.oj;
import com.a.a.d.or;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;

class os
implements ListIterator {
    int a;
    or b;
    or c;
    or d;
    int e;
    final /* synthetic */ oj f;

    os(oj oj2, int n2) {
        this.f = oj2;
        this.e = oj.a(this.f);
        int n3 = oj2.g();
        com.a.a.b.cl.b(n2, n3);
        if (n2 >= n3 / 2) {
            this.d = oj.b(oj2);
            this.a = n3;
            while (n2++ < n3) {
                this.b();
            }
        } else {
            this.b = oj.c(oj2);
            while (n2-- > 0) {
                this.a();
            }
        }
        this.c = null;
    }

    private void c() {
        if (oj.a(this.f) != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.c();
        return this.b != null;
    }

    public or a() {
        this.c();
        oj.e(this.b);
        this.d = this.c = this.b;
        this.b = this.b.c;
        ++this.a;
        return this.c;
    }

    @Override
    public void remove() {
        this.c();
        cl.a(this.c != null);
        if (this.c != this.b) {
            this.d = this.c.d;
            --this.a;
        } else {
            this.b = this.c.c;
        }
        oj.a(this.f, this.c);
        this.c = null;
        this.e = oj.a(this.f);
    }

    @Override
    public boolean hasPrevious() {
        this.c();
        return this.d != null;
    }

    public or b() {
        this.c();
        oj.e(this.d);
        this.b = this.c = this.d;
        this.d = this.d.d;
        --this.a;
        return this.c;
    }

    @Override
    public int nextIndex() {
        return this.a;
    }

    @Override
    public int previousIndex() {
        return this.a - 1;
    }

    public void a(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    public void b(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    void a(Object object) {
        com.a.a.b.cl.b(this.c != null);
        this.c.b = object;
    }

    public /* synthetic */ void add(Object object) {
        this.b((Map.Entry)object);
    }

    public /* synthetic */ void set(Object object) {
        this.a((Map.Entry)object);
    }

    public /* synthetic */ Object previous() {
        return this.b();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

