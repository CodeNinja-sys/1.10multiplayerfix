/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.at;
import a.a.a.a.b.g;
import a.a.a.a.b.x;
import a.a.a.a.b.z;
import a.a.a.a.c.c;
import java.util.NoSuchElementException;

class aa
extends c {
    int a = -1;
    int b = 0;
    final /* synthetic */ z c;

    aa(z z2) {
        this.c = z2;
    }

    @Override
    public boolean hasNext() {
        return this.b < x.a(this.c.a);
    }

    public at a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = this.b;
        return new g(x.b(this.c.a)[this.a], x.c(this.c.a)[this.b++]);
    }

    @Override
    public void remove() {
        if (this.a == -1) {
            throw new IllegalStateException();
        }
        this.a = -1;
        int n2 = x.d(this.c.a) - this.b--;
        System.arraycopy(x.b(this.c.a), this.b + 1, x.b(this.c.a), this.b, n2);
        System.arraycopy(x.c(this.c.a), this.b + 1, x.c(this.c.a), this.b, n2);
        x.c((x)this.c.a)[x.a((x)this.c.a)] = null;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

