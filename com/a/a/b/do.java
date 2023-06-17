/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.dg;
import com.a.a.b.dn;
import com.a.a.b.dr;

class do
extends dr {
    final /* synthetic */ dn a;

    do(dn dn2, dg dg2, CharSequence charSequence) {
        this.a = dn2;
        super(dg2, charSequence);
    }

    @Override
    public int a(int n2) {
        int n3 = n2 + this.a.a;
        return n3 < this.c.length() ? n3 : -1;
    }

    @Override
    public int b(int n2) {
        return n2;
    }
}

