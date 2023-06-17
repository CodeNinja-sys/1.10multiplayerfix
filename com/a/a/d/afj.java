/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cn;
import com.a.a.d.afb;
import com.a.a.d.afg;
import com.a.a.d.afh;
import com.a.a.d.afk;
import com.a.a.d.dw;
import com.a.a.d.nj;
import com.a.a.d.tu;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class afj
extends tu {
    final /* synthetic */ afh a;

    afj(afh afh2) {
        this.a = afh2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        if (afg.a(this.a.a).j()) {
            return nj.a();
        }
        dw dw2 = (dw)cc.b(afb.a(this.a.a.a).floorKey(afg.a((afg)this.a.a).b), afg.a((afg)this.a.a).b);
        Iterator iterator = afb.a(this.a.a.a).tailMap(dw2, true).values().iterator();
        return new afk(this, iterator);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return afh.a(this.a, cn.a(cn.a(collection)));
    }

    @Override
    public int size() {
        return nj.b(this.iterator());
    }

    @Override
    public boolean isEmpty() {
        return !this.iterator().hasNext();
    }
}

