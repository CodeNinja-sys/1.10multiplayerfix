/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.afh;
import com.a.a.d.sz;
import com.a.a.d.uk;
import java.util.Collection;
import java.util.Map;

class afi
extends uk {
    final /* synthetic */ afh a;

    afi(afh afh2, Map map) {
        this.a = afh2;
        super(map);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.remove(object) != null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return afh.a(this.a, cn.a(cn.a(cn.a(collection)), sz.a()));
    }
}

