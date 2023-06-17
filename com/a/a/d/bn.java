/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adz;
import com.a.a.d.bl;
import com.a.a.d.bm;

class bn
extends adz {
    final int a;
    final int b;
    final /* synthetic */ int c;
    final /* synthetic */ bm d;

    bn(bm bm2, int n2) {
        this.d = bm2;
        this.c = n2;
        this.a = this.c / bl.a(this.d.a).size();
        this.b = this.c % bl.a(this.d.a).size();
    }

    @Override
    public Object a() {
        return bl.b(this.d.a).get(this.a);
    }

    @Override
    public Object b() {
        return bl.a(this.d.a).get(this.b);
    }

    @Override
    public Object c() {
        return this.d.a.a(this.a, this.b);
    }
}

