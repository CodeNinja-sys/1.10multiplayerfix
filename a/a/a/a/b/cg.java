/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cf;
import a.a.a.a.b.p;
import java.util.NoSuchElementException;

class cg
extends p {
    int a = 0;
    final /* synthetic */ cf b;

    cg(cf cf2) {
        this.b = cf2;
    }

    @Override
    public boolean hasNext() {
        return this.a < cf.a(this.b);
    }

    @Override
    public long a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return cf.b(this.b)[this.a++];
    }

    @Override
    public void remove() {
        int n2 = cf.c(this.b) - this.a--;
        System.arraycopy(cf.b(this.b), this.a + 1, cf.b(this.b), this.a, n2);
    }
}

