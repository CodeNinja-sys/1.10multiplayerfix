/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bl;
import com.a.a.d.bo;

class bs
extends bo {
    final int a;
    final /* synthetic */ bl b;

    bs(bl bl2, int n2) {
        this.b = bl2;
        super(bl.c(bl2), null);
        this.a = n2;
    }

    @Override
    String b() {
        return "Row";
    }

    @Override
    Object b(int n2) {
        return this.b.a(n2, this.a);
    }

    @Override
    Object a(int n2, Object object) {
        return this.b.a(n2, this.a, object);
    }
}

