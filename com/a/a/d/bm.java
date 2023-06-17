/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adw;
import com.a.a.d.bl;
import com.a.a.d.bn;
import com.a.a.d.i;

class bm
extends i {
    final /* synthetic */ bl a;

    bm(bl bl2, int n2) {
        this.a = bl2;
        super(n2);
    }

    protected adw b(int n2) {
        return new bn(this, n2);
    }

    @Override
    protected /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }
}

