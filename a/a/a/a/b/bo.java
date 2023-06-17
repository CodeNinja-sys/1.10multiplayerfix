/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.bl;
import a.a.a.a.b.bm;
import a.a.a.a.b.br;
import a.a.a.a.b.bt;
import a.a.a.a.c.ad;

class bo
extends bt
implements ad {
    private final br h;
    final /* synthetic */ bl a;

    private bo(bl bl2) {
        this.a = bl2;
        super(bl2, null);
        this.h = new br(this.a);
    }

    public br a() {
        this.h.a = this.c();
        return this.h;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ bo(bl bl2, bm bm2) {
        this(bl2);
    }
}

