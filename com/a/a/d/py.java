/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.go;
import com.a.a.d.po;
import com.a.a.d.px;
import java.util.Iterator;
import java.util.Map;

class py
extends go {
    final /* synthetic */ Iterator a;
    final /* synthetic */ px b;

    py(px px2, Iterator iterator) {
        this.b = px2;
        this.a = iterator;
    }

    public Map.Entry b() {
        return po.a((Map.Entry)this.a.next(), this.b.a);
    }

    @Override
    protected Iterator a() {
        return this.a;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

