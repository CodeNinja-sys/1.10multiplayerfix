/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.j;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.xl;
import java.util.Iterator;

class xm
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ xl b;

    xm(xl xl2, Iterator iterator) {
        this.b = xl2;
        this.a = iterator;
    }

    protected xd d() {
        while (this.a.hasNext()) {
            xd xd2 = (xd)this.a.next();
            Object object = xd2.a();
            int n2 = xd2.b() - this.b.b.a(object);
            if (n2 <= 0) continue;
            return xe.a(object, n2);
        }
        return (xd)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

