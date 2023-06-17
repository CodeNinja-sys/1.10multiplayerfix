/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.u;
import java.util.NoSuchElementException;

class dq
extends u {
    private final long a;
    private int b;

    public dq(long l2) {
        this.a = l2;
    }

    @Override
    public boolean hasNext() {
        return this.b == 0;
    }

    @Override
    public boolean hasPrevious() {
        return this.b == 1;
    }

    @Override
    public long a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 1;
        return this.a;
    }

    @Override
    public long b() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b = 0;
        return this.a;
    }

    @Override
    public int nextIndex() {
        return this.b;
    }

    @Override
    public int previousIndex() {
        return this.b - 1;
    }
}

