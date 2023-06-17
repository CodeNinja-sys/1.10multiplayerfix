/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.am;
import com.a.a.d.hy;
import com.a.a.d.ia;
import com.a.a.d.ic;

class id
extends am {
    ia a;
    final /* synthetic */ ic b;

    id(ic ic2, ia ia2) {
        this.b = ic2;
        this.a = ia2;
    }

    @Override
    public Object getKey() {
        return this.a.e;
    }

    @Override
    public Object getValue() {
        return this.a.f;
    }

    @Override
    public Object setValue(Object object) {
        Object object2 = this.a.f;
        int n2 = hy.a(object);
        if (n2 == this.a.b && cc.a(object, object2)) {
            return object;
        }
        cl.a(hy.b(this.b.a.a, object, n2) == null, "value already present: %s", object);
        hy.a(this.b.a.a, this.a);
        ia ia2 = new ia(this.a.e, this.a.a, object, n2);
        hy.b(this.b.a.a, ia2);
        this.b.e = hy.a(this.b.a.a);
        if (this.b.d == this.a) {
            this.b.d = ia2;
        }
        this.a = ia2;
        return object2;
    }
}

