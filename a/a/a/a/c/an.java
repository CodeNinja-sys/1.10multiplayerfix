/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ap;
import a.a.a.a.c.h;

public class an
extends h {
    protected final ap a;

    public an(ap ap2) {
        this.a = ap2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override
    public Object next() {
        return this.a.next();
    }

    @Override
    public Object previous() {
        return this.a.previous();
    }

    @Override
    public int nextIndex() {
        return this.a.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.a.previousIndex();
    }
}

