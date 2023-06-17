/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.ar;
import net.minecraft.client.g.e.q;
import net.minecraft.u.ad;

class bu {
    final q a;
    final ad b;
    byte c;
    final int d;
    final /* synthetic */ ar e;

    private bu(ar ar2, q q2, ad ad2, int n2) {
        this.e = ar2;
        this.a = q2;
        this.b = ad2;
        this.d = n2;
    }

    public void a(byte by2, ad ad2) {
        this.c = (byte)(this.c | by2 | 1 << ad2.ordinal());
    }

    public boolean a(ad ad2) {
        return (this.c & 1 << ad2.ordinal()) > 0;
    }

    /* synthetic */ bu(ar ar2, q q2, ad ad2, int n2, bu bu2) {
        this(ar2, q2, ad2, n2);
    }
}

