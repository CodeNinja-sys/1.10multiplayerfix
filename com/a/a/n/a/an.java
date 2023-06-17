/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ad;
import com.a.a.n.a.dp;
import com.a.a.n.a.et;
import com.a.a.n.a.eu;

class an
extends dp {
    final /* synthetic */ eu a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ ad c;

    an(ad ad2, String string, eu eu2, Throwable throwable) {
        this.c = ad2;
        this.a = eu2;
        this.b = throwable;
        super(string);
    }

    void a(et et2) {
        et2.a(this.a, this.b);
    }
}

