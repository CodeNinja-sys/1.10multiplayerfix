/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.dg;
import com.a.a.d.go;
import com.a.a.d.xd;
import java.util.Iterator;

class dj
extends go {
    private xd c;
    final /* synthetic */ Iterator a;
    final /* synthetic */ dg b;

    dj(dg dg2, Iterator iterator) {
        this.b = dg2;
        this.a = iterator;
    }

    @Override
    protected Iterator a() {
        return this.a;
    }

    public xd b() {
        this.c = (xd)super.next();
        return this.c;
    }

    @Override
    public void remove() {
        cl.a(this.c != null);
        this.b.c(this.c.a(), 0);
        this.c = null;
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

