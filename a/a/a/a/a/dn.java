/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.p;
import java.util.Iterator;

class dn
extends p {
    final Iterator a;

    public dn(Iterator iterator) {
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
    public int a() {
        return (Integer)this.a.next();
    }
}

