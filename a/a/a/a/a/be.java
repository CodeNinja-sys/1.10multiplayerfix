/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.bb;
import a.a.a.a.a.bc;
import a.a.a.a.a.bh;
import a.a.a.a.a.bj;
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

