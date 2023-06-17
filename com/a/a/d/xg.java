/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.j;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.xf;
import java.util.Iterator;

class xg
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ xf c;

    xg(xf xf2, Iterator iterator, Iterator iterator2) {
        this.c = xf2;
        this.a = iterator;
        this.b = iterator2;
    }

    protected xd d() {
        if (this.a.hasNext()) {
            xd xd2 = (xd)this.a.next();
            Object object = xd2.a();
            int n2 = Math.max(xd2.b(), this.c.b.a(object));
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

