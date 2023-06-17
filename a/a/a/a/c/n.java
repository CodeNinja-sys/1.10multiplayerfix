/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.c;
import a.a.a.a.c.m;
import java.util.NoSuchElementException;

class n
extends c {
    int a = 0;
    final /* synthetic */ m b;

    n(m m2) {
        this.b = m2;
    }

    @Override
    public boolean hasNext() {
        return this.a < m.a(this.b);
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return m.b(this.b)[this.a++];
    }

    @Override
    public void remove() {
        int n2 = m.c(this.b) - this.a--;
        System.arraycopy(m.b(this.b), this.a + 1, m.b(this.b), this.a, n2);
        m.b((m)this.b)[m.a((m)this.b)] = null;
    }
}

