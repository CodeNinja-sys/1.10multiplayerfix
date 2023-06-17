/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aer;
import com.a.a.d.aez;
import com.a.a.d.xo;

class aes
extends xo {
    final /* synthetic */ aez a;
    final /* synthetic */ aer b;

    aes(aer aer2, aez aez2) {
        this.b = aer2;
        this.a = aez2;
    }

    @Override
    public Object a() {
        return this.a.a();
    }

    @Override
    public int b() {
        int n2 = this.a.b();
        if (n2 == 0) {
            return this.b.a(this.a());
        }
        return n2;
    }
}

