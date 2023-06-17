/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.u;
import java.util.NoSuchElementException;

class dj
extends u {
    private final int[] a;
    private final int b;
    private final int c;
    private int d;

    public dj(int[] arrn, int n2, int n3) {
        this.a = arrn;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public boolean hasNext() {
        return this.d < this.c;
    }

    @Override
    public boolean hasPrevious() {
        return this.d > 0;
    }

    @Override
    public int a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.a[this.b + this.d++];
    }

    @Override
    public int b() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.a[this.b + --this.d];
    }

    @Override
    public int b(int n2) {
        if (n2 <= this.c - this.d) {
            this.d += n2;
            return n2;
        }
        n2 = this.c - this.d;
        this.d = this.c;
        return n2;
    }

    @Override
    public int a(int n2) {
        if (n2 <= this.d) {
            this.d -= n2;
            return n2;
        }
        n2 = this.d;
        this.d = 0;
        return n2;
    }

    @Override
    public int nextIndex() {
        return this.d;
    }

    @Override
    public int previousIndex() {
        return this.d - 1;
    }
}

