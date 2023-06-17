/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.f;
import a.a.a.a.c.h;
import java.util.NoSuchElementException;

class g
extends h {
    int a;
    int b;
    final /* synthetic */ int c;
    final /* synthetic */ f d;

    g(f f2, int n2) {
        this.d = f2;
        this.c = n2;
        this.a = this.c;
        this.b = -1;
    }

    @Override
    public boolean hasNext() {
        return this.a < this.d.size();
    }

    @Override
    public boolean hasPrevious() {
        return this.a > 0;
    }

    @Override
    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = this.a++;
        return this.d.a.get(this.d.b + this.b);
    }

    @Override
    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b = --this.a;
        return this.d.a.get(this.d.b + this.a);
    }

    @Override
    public int nextIndex() {
        return this.a;
    }

    @Override
    public int previousIndex() {
        return this.a - 1;
    }

    @Override
    public void add(Object object) {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
        this.d.add(this.a++, object);
        this.b = -1;
    }

    @Override
    public void set(Object object) {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
        this.d.set(this.b, object);
    }

    @Override
    public void remove() {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
        this.d.remove(this.b);
        if (this.b < this.a) {
            --this.a;
        }
        this.b = -1;
    }
}

