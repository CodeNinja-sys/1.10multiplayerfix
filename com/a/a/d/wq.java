/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.wn;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xr;
import java.util.Collection;
import java.util.Iterator;

class wq
extends xr {
    final /* synthetic */ wn a;

    wq(wn wn2) {
        this.a = wn2;
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
        return this.a.c();
    }

    @Override
    public boolean isEmpty() {
        return this.a.b.o();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof xd) {
            xd xd2 = (xd)object;
            Collection collection = (Collection)this.a.b.c().get(xd2.a());
            return collection != null && collection.size() == xd2.b();
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof xd) {
            xd xd2 = (xd)object;
            Collection collection = (Collection)this.a.b.c().get(xd2.a());
            if (collection != null && collection.size() == xd2.b()) {
                collection.clear();
                return true;
            }
        }
        return false;
    }
}

