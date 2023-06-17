/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.d.ql;
import com.a.a.n.a.gc;
import java.util.concurrent.ConcurrentMap;

class fz
extends gc {
    final ConcurrentMap a;
    final dx b;
    final int c;

    fz(int n2, dx dx2) {
        super(n2);
        this.c = this.d == -1 ? Integer.MAX_VALUE : this.d + 1;
        this.b = dx2;
        this.a = new ql().l().e();
    }

    @Override
    public Object a(int n2) {
        Object object;
        if (this.c != Integer.MAX_VALUE) {
            cl.a(n2, this.a());
        }
        if ((object = this.a.get(n2)) != null) {
            return object;
        }
        Object object2 = this.b.a();
        object = this.a.putIfAbsent(n2, object2);
        return cc.b(object, object2);
    }

    @Override
    public int a() {
        return this.c;
    }
}

