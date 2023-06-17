/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.bb;
import a.a.a.a.b.bc;
import a.a.a.a.b.bh;
import a.a.a.a.b.bj;
import a.a.a.a.c.ad;

class be
extends bj
implements ad {
    private final bh h;
    final /* synthetic */ bb a;

    private be(bb bb2) {
        this.a = bb2;
        super(bb2, null);
        this.h = new bh(this.a);
    }

    public bh a() {
        this.h.a = this.c();
        return this.h;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ be(bb bb2, bc bc2) {
        this(bb2);
    }
}

