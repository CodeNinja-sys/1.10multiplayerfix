/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.au;
import com.a.a.d.dg;
import com.a.a.d.dh;
import com.a.a.d.nj;
import com.a.a.d.ov;
import com.a.a.d.xc;
import java.util.ArrayList;
import java.util.List;

class dk
extends au {
    final /* synthetic */ dg b;

    private dk(dg dg2) {
        this.b = dg2;
        super(dg2);
    }

    dg b() {
        return this.b;
    }

    @Override
    public Object[] toArray() {
        return this.c().toArray();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return this.c().toArray(arrobject);
    }

    private List c() {
        ArrayList arrayList = ov.c(this.size());
        nj.a(arrayList, this.iterator());
        return arrayList;
    }

    @Override
    /* synthetic */ xc a() {
        return this.b();
    }

    /* synthetic */ dk(dg dg2, dh dh2) {
        this(dg2);
    }
}

