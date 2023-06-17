/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.afh;
import com.a.a.d.sz;
import com.a.a.d.vb;
import java.util.Collection;
import java.util.Map;

class afl
extends vb {
    final /* synthetic */ afh a;

    afl(afh afh2, Map map) {
        this.a = afh2;
        super(map);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return afh.a(this.a, cn.a(cn.a(collection), sz.b()));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return afh.a(this.a, cn.a(cn.a(cn.a(collection)), sz.b()));
    }
}

