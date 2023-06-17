/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.p;
import java.util.Iterator;

class do
extends p {
    final Iterator a;

    public do(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    @Override
    public long a() {
        return (Long)this.a.next();
    }
}

