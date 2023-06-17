/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.fj;
import com.a.a.d.sz;
import com.a.a.d.uk;
import java.util.Collection;
import java.util.Map;

class fk
extends uk {
    final /* synthetic */ fj a;

    fk(fj fj2, Map map) {
        this.a = fj2;
        super(map);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.a.a.a(sz.a(cn.a(collection)));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a.a.a(sz.a(cn.a(cn.a(collection))));
    }

    @Override
    public boolean remove(Object object) {
        return this.a.b(object) != null;
    }
}

