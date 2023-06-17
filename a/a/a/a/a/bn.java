/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.at;
import a.a.a.a.a.bl;
import a.a.a.a.a.bm;
import a.a.a.a.a.br;
import a.a.a.a.a.bt;
import a.a.a.a.c.ad;

class bn
extends bt
implements ad {
    private br h;
    final /* synthetic */ bl a;

    private bn(bl bl2) {
        this.a = bl2;
        super(bl2, null);
    }

    public at a() {
        this.h = new br(this.a, this.c());
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

    /* synthetic */ bn(bl bl2, bm bm2) {
        this(bl2);
    }
}

