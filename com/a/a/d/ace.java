/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.aca;
import com.a.a.d.sz;
import com.a.a.d.uk;
import java.util.Collection;

class ace
extends uk {
    final /* synthetic */ aca a;

    ace(aca aca2) {
        this.a = aca2;
        super(aca2);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.b.a(object, this.a.a);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.b.c(object, this.a.a) != null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a.a(sz.a(cn.a(cn.a(collection))));
    }
}

