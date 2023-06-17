/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.u;
import java.util.NoSuchElementException;

class dl
extends u {
    private final int b;
    private final int c;
    int a;

    public dl(int n2, int n3) {
        this.b = this.a = n2;
        this.c = n3;
    }

    @Override
    public boolean hasNext() {
        return this.a < this.c;
    }

    @Override
    public boolean hasPrevious() {
        return this.a > this.b;
    }

    @Override
    public int a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.a++;
    }

    @Override
    public int b() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        return --this.a;
    }

    @Override
    public int nextIndex() {
        return this.a - this.b;
    }

    @Override
    public int previousIndex() {
        return this.a - this.b - 1;
    }

    @Override
    public int b(int n2) {
        if (this.a + n2 <= this.c) {
            this.a += n2;
            return n2;
        }
        n2 = this.c - this.a;
        this.a = this.c;
        return n2;
    }

    @Override
    public int a(int n2) {
        if (this.a - n2 >= this.b) {
            this.a -= n2;
            return n2;
        }
        n2 = this.a - this.b;
        this.a = this.b;
        return n2;
    }
}

