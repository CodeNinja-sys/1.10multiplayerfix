/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.at;
import a.a.a.a.a.e;
import a.a.a.a.c.ad;
import a.a.a.a.c.c;

class f
extends c {
    final ad a;
    final /* synthetic */ e b;

    f(e e2) {
        this.b = e2;
        this.a = this.b.a.d().a();
    }

    public Object next() {
        return ((at)this.a.next()).getValue();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }
}

