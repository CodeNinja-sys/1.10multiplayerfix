/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.fo;
import com.a.a.d.fq;
import com.a.a.d.xc;
import com.a.a.d.xr;
import java.util.Collection;
import java.util.Iterator;

class fp
extends xr {
    final /* synthetic */ fo a;

    fp(fo fo2) {
        this.a = fo2;
    }

    @Override
    xc a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return this.a.b();
    }

    @Override
    public int size() {
        return this.a.a.q().size();
    }

    private boolean a(cm cm2) {
        return this.a.a.a(new fq(this, cm2));
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.a(cn.a(collection));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a(cn.a(cn.a(collection)));
    }
}

