/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.go;
import com.a.a.d.po;
import com.a.a.d.ps;
import java.util.Iterator;
import java.util.Map;

class pt
extends go {
    final /* synthetic */ Iterator a;
    final /* synthetic */ ps b;

    pt(ps ps2, Iterator iterator) {
        this.b = ps2;
        this.a = iterator;
    }

    public Map.Entry b() {
        return po.b((Map.Entry)this.a.next(), ps.a(this.b));
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

