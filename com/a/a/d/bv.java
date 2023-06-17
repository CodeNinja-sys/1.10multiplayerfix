/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bl;
import com.a.a.d.bm;
import com.a.a.d.bo;
import com.a.a.d.bu;
import java.util.Map;

class bv
extends bo {
    final /* synthetic */ bl a;

    private bv(bl bl2) {
        this.a = bl2;
        super(bl.c(bl2), null);
    }

    @Override
    String b() {
        return "Row";
    }

    Map c(int n2) {
        return new bu(this.a, n2);
    }

    Map a(int n2, Map map) {
        throw new UnsupportedOperationException();
    }

    public Map a(Object object, Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a(object, (Map)object2);
    }

    @Override
    /* synthetic */ Object b(int n2) {
        return this.c(n2);
    }

    /* synthetic */ bv(bl bl2, bm bm2) {
        this(bl2);
    }
}

