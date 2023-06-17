/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.m;
import com.a.a.i.ca;

final class e
implements ca {
    final /* synthetic */ ca a;
    final /* synthetic */ m b;

    e(ca ca2, m m2) {
        this.a = ca2;
        this.b = m2;
    }

    @Override
    public int a() {
        int n2;
        while ((n2 = this.a.a()) != -1 && this.b.c((char)n2)) {
        }
        return n2;
    }

    @Override
    public void b() {
        this.a.b();
    }
}

