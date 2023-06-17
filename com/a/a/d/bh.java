/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adw;
import com.a.a.d.bf;
import com.a.a.d.cm;
import com.a.a.d.sz;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class bh
extends AbstractSet {
    final /* synthetic */ bf a;

    bh(bf bf2) {
        this.a = bf2;
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof adw) {
            adw adw2 = (adw)object;
            Map map = (Map)sz.a(this.a.r(), adw2.a());
            return map != null && cm.a(map.entrySet(), sz.a(adw2.b(), adw2.c()));
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof adw) {
            adw adw2 = (adw)object;
            Map map = (Map)sz.a(this.a.r(), adw2.a());
            return map != null && cm.b(map.entrySet(), sz.a(adw2.b(), adw2.c()));
        }
        return false;
    }

    @Override
    public void clear() {
        this.a.d();
    }

    @Override
    public Iterator iterator() {
        return this.a.g();
    }

    @Override
    public int size() {
        return this.a.n();
    }
}

