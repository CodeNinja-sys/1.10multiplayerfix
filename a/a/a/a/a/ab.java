/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.at;
import a.a.a.a.a.g;
import a.a.a.a.a.x;
import a.a.a.a.a.z;
import a.a.a.a.c.c;
import java.util.NoSuchElementException;

class ab
extends c {
    int a = 0;
    int b = -1;
    final g c = new g(0, (Object)null);
    final /* synthetic */ z d;

    ab(z z2) {
        this.d = z2;
    }

    @Override
    public boolean hasNext() {
        return this.a < x.a(this.d.a);
    }

    public at a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = this.a;
        this.c.a = x.b(this.d.a)[this.b];
        this.c.b = x.c(this.d.a)[this.a++];
        return this.c;
    }

    @Override
    public void remove() {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
        this.b = -1;
        int n2 = x.d(this.d.a) - this.a--;
        System.arraycopy(x.b(this.d.a), this.a + 1, x.b(this.d.a), this.a, n2);
        System.arraycopy(x.c(this.d.a), this.a + 1, x.c(this.d.a), this.a, n2);
        x.c((x)this.d.a)[x.a((x)this.d.a)] = null;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

