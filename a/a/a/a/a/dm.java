/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.dh;
import a.a.a.a.a.p;
import java.util.NoSuchElementException;

class dm
extends p {
    final dh[] a;
    int b;
    int c;
    int d = -1;

    public dm(dh[] arrdh, int n2, int n3) {
        this.a = arrdh;
        this.b = n2;
        this.c = n3;
        this.b();
    }

    private void b() {
        while (this.c != 0 && !this.a[this.b].hasNext()) {
            --this.c;
            ++this.b;
        }
    }

    @Override
    public boolean hasNext() {
        return this.c > 0;
    }

    @Override
    public int a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.d = this.b;
        int n2 = this.a[this.d].a();
        this.b();
        return n2;
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

