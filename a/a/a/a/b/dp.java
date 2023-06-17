/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.u;
import java.util.ListIterator;

class dp
extends u {
    final ListIterator a;

    public dp(ListIterator listIterator) {
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
    public void b(long l2) {
        this.a.set(l2);
    }

    @Override
    public void a(long l2) {
        this.a.add(l2);
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    @Override
    public long a() {
        return (Long)this.a.next();
    }

    @Override
    public long b() {
        return (Long)this.a.previous();
    }
}

