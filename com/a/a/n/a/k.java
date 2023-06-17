/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ad;
import com.a.a.n.a.du;
import com.a.a.n.a.i;
import com.a.a.n.a.l;
import com.a.a.n.a.m;

class k
extends ad {
    final /* synthetic */ i a;

    k(i i2) {
        this.a = i2;
    }

    @Override
    protected final void a() {
        du.a(this.a.c(), i.a(this.a)).execute(new l(this));
    }

    @Override
    protected final void b() {
        du.a(this.a.c(), i.a(this.a)).execute(new m(this));
    }
}

