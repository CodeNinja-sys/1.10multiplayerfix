/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.h;
import java.util.ListIterator;

class aj
extends h {
    final ListIterator a;

    public aj(ListIterator listIterator) {
        this.a = listIterator;
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
    public int nextIndex() {
        return this.a.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.a.previousIndex();
    }

    @Override
    public void set(Object object) {
        this.a.set(object);
    }

    @Override
    public void add(Object object) {
        this.a.add(object);
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    @Override
    public Object next() {
        return this.a.next();
    }

    @Override
    public Object previous() {
        return this.a.previous();
    }
}

