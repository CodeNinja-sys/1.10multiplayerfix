/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.sz;
import com.a.a.d.uw;
import java.util.Iterator;
import java.util.Map;

class ux
extends agi {
    final /* synthetic */ Iterator a;
    final /* synthetic */ uw b;

    ux(uw uw2, Iterator iterator) {
        this.b = uw2;
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry a() {
        return sz.a((Map.Entry)this.a.next());
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

