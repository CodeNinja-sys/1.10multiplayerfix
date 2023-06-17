/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.c;
import java.util.NoSuchElementException;

class ah
extends c {
    final ad[] a;
    int b;
    int c;
    int d = -1;

    public ah(ad[] arrad, int n2, int n3) {
        this.a = arrad;
        this.b = n2;
        this.c = n3;
        this.a();
    }

    private void a() {
        while (this.c != 0 && !this.a[this.b].hasNext()) {
            --this.c;
            ++this.b;
        }
    }

    @Override
    public boolean hasNext() {
        return this.c > 0;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.d = this.b;
        Object e2 = this.a[this.d].next();
        this.a();
        return e2;
    }

    @Override
    public void remove() {
        if (this.d == -1) {
            throw new IllegalStateException();
        }
        this.a[this.d].remove();
    }

    @Override
    public int b(int n2) {
        this.d = -1;
        int n3 = 0;
        while (n3 < n2 && this.c != 0) {
            n3 += this.a[this.b].b(n2 - n3);
            if (this.a[this.b].hasNext()) break;
            --this.c;
            ++this.b;
        }
        return n3;
    }
}

