/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.at;
import a.a.a.a.a.c;
import a.a.a.a.a.p;
import a.a.a.a.c.ad;

class d
extends p {
    final ad a;
    final /* synthetic */ c b;

    d(c c2) {
        this.b = c2;
        this.a = this.b.a.d().a();
    }

    @Override
    public int a() {
        return ((at)this.a.next()).b();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }
}

