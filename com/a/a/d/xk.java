/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.j;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.xj;
import java.util.Iterator;

class xk
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ xj c;

    xk(xj xj2, Iterator iterator, Iterator iterator2) {
        this.c = xj2;
        this.a = iterator;
        this.b = iterator2;
    }

    protected xd d() {
        if (this.a.hasNext()) {
            xd xd2 = (xd)this.a.next();
            Object object = xd2.a();
            int n2 = xd2.b() + this.c.b.a(object);
            return xe.a(object, n2);
        }
        while (this.b.hasNext()) {
            xd xd3 = (xd)this.b.next();
            Object object = xd3.a();
            if (this.c.a.contains(object)) continue;
            return xe.a(object, xd3.b());
        }
        return (xd)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

