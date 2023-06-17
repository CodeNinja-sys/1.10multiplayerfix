/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.u;
import java.util.NoSuchElementException;

class dp
extends u {
    private final int a;
    private int b;

    public dp(int n2) {
        this.a = n2;
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
    public int a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 1;
        return this.a;
    }

    @Override
    public int b() {
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

