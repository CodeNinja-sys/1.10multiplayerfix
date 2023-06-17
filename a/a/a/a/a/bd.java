/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.at;
import a.a.a.a.a.bb;
import a.a.a.a.a.bc;
import a.a.a.a.a.bh;
import a.a.a.a.a.bj;
import a.a.a.a.c.ad;

class bd
extends bj
implements ad {
    private bh h;
    final /* synthetic */ bb a;

    private bd(bb bb2) {
        this.a = bb2;
        super(bb2, null);
    }

    public at a() {
        this.h = new bh(this.a, this.c());
        return this.h;
    }

    @Override
    public void remove() {
        super.remove();
        this.h.a = -1;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ bd(bb bb2, bc bc2) {
        this(bb2);
    }
}

