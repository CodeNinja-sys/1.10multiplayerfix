/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.a;
import a.a.a.a.c.v;

public class al
extends a {
    protected final v a;

    public al(v v2) {
        this.a = v2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public Object next() {
        return this.a.next();
    }

    @Override
    public Object previous() {
        return this.a.previous();
    }
}

