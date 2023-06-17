/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.al;
import java.util.Iterator;

class am
implements Iterator {
    private final Iterator b;
    final /* synthetic */ al a;

    am(al al2) {
        this.a = al2;
        this.b = this.a.a.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public Object next() {
        return this.a.b.d(this.b.next());
    }

    @Override
    public void remove() {
        this.b.remove();
    }
}

