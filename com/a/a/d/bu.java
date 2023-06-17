/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bl;
import com.a.a.d.bo;

class bu
extends bo {
    final int a;
    final /* synthetic */ bl b;

    bu(bl bl2, int n2) {
        this.b = bl2;
        super(bl.d(bl2), null);
        this.a = n2;
    }

    @Override
    String b() {
        return "Column";
    }

    @Override
    Object b(int n2) {
        return this.b.a(this.a, n2);
    }

    @Override
    Object a(int n2, Object object) {
        return this.b.a(this.a, n2, object);
    }
}

