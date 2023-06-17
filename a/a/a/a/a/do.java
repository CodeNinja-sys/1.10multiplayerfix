/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.u;
import java.util.ListIterator;

class do
extends u {
    final ListIterator a;

    public do(ListIterator listIterator) {
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
    public void d(int n2) {
        this.a.set(n2);
    }

    @Override
    public void c(int n2) {
        this.a.add(n2);
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    @Override
    public int a() {
        return (Integer)this.a.next();
    }

    @Override
    public int b() {
        return (Integer)this.a.previous();
    }
}

