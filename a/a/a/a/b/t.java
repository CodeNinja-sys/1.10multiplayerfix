/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.s;
import a.a.a.a.b.u;
import java.util.NoSuchElementException;

class t
extends u {
    int a;
    int b;
    final /* synthetic */ int c;
    final /* synthetic */ s d;

    t(s s2, int n2) {
        this.d = s2;
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
    public long a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = this.a++;
        return this.d.a.l(this.d.b + this.b);
    }

    @Override
    public long b() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b = --this.a;
        return this.d.a.l(this.d.b + this.a);
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
    public void a(long l2) {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
        this.d.a(this.a++, l2);
        this.b = -1;
    }

    @Override
    public void b(long l2) {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
        this.d.b(this.b, l2);
    }

    @Override
    public void remove() {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
        this.d.d(this.b);
        if (this.b < this.a) {
            --this.a;
        }
        this.b = -1;
    }
}

