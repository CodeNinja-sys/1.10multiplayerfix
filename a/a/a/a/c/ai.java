/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.c;
import java.util.Iterator;

class ai
extends c {
    final Iterator a;

    public ai(Iterator iterator) {
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

    public Object next() {
        return this.a.next();
    }
}

