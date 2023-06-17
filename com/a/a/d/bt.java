/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bl;
import com.a.a.d.bm;
import com.a.a.d.bo;
import com.a.a.d.bs;
import java.util.Map;

class bt
extends bo {
    final /* synthetic */ bl a;

    private bt(bl bl2) {
        this.a = bl2;
        super(bl.d(bl2), null);
    }

    @Override
    String b() {
        return "Column";
    }

    Map c(int n2) {
        return new bs(this.a, n2);
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

    /* synthetic */ bt(bl bl2, bm bm2) {
        this(bl2);
    }
}

