/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.m;
import java.util.NoSuchElementException;

class dm
extends m {
    private final long b;
    private final long c;
    long a;

    public dm(long l2, long l3) {
        this.b = this.a = l2;
        this.c = l3;
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
    public long a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.a++;
    }

    @Override
    public long b() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        return --this.a;
    }

    @Override
    public int b(int n2) {
        if (this.a + (long)n2 <= this.c) {
            this.a += (long)n2;
            return n2;
        }
        n2 = (int)(this.c - this.a);
        this.a = this.c;
        return n2;
    }

    @Override
    public int a(int n2) {
        if (this.a - (long)n2 >= this.b) {
            this.a -= (long)n2;
            return n2;
        }
        n2 = (int)(this.a - this.b);
        this.a = this.b;
        return n2;
    }
}

