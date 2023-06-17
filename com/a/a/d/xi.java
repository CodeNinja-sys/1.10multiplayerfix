/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.j;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.xh;
import java.util.Iterator;

class xi
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ xh b;

    xi(xh xh2, Iterator iterator) {
        this.b = xh2;
        this.a = iterator;
    }

    protected xd d() {
        while (this.a.hasNext()) {
            xd xd2 = (xd)this.a.next();
            Object object = xd2.a();
            int n2 = Math.min(xd2.b(), this.b.b.a(object));
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

