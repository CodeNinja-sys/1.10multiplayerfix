/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aby;
import com.a.a.d.acm;
import com.a.a.d.aco;
import com.a.a.d.nj;
import com.a.a.d.tu;
import java.util.Iterator;
import java.util.Map;

final class acn
extends tu {
    final /* synthetic */ acm a;

    private acn(acm acm2) {
        this.a = acm2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public int size() {
        Map map = this.a.c();
        return map == null ? 0 : map.size();
    }

    @Override
    public Iterator iterator() {
        Map map = this.a.c();
        if (map == null) {
            return nj.c();
        }
        Iterator iterator = map.entrySet().iterator();
        return new aco(this, iterator);
    }

    /* synthetic */ acn(acm acm2, aby aby2) {
        this(acm2);
    }
}

