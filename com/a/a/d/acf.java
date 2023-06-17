/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.aca;
import com.a.a.d.sz;
import com.a.a.d.vb;
import java.util.Collection;

class acf
extends vb {
    final /* synthetic */ aca a;

    acf(aca aca2) {
        this.a = aca2;
        super(aca2);
    }

    @Override
    public boolean remove(Object object) {
        return object != null && this.a.a(sz.b(cn.a(object)));
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.a.a(sz.b(cn.a(collection)));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a.a(sz.b(cn.a(cn.a(collection))));
    }
}

