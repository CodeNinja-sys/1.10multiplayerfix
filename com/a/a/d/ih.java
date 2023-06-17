/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.am;
import com.a.a.d.hy;
import com.a.a.d.ia;
import com.a.a.d.ig;

class ih
extends am {
    ia a;
    final /* synthetic */ ig b;

    ih(ig ig2, ia ia2) {
        this.b = ig2;
        this.a = ia2;
    }

    @Override
    public Object getKey() {
        return this.a.f;
    }

    @Override
    public Object getValue() {
        return this.a.e;
    }

    @Override
    public Object setValue(Object object) {
        Object object2 = this.a.e;
        int n2 = hy.a(object);
        if (n2 == this.a.a && cc.a(object, object2)) {
            return object;
        }
        cl.a(hy.a(this.b.a.a.a, object, n2) == null, "value already present: %s", object);
        hy.a(this.b.a.a.a, this.a);
        ia ia2 = new ia(object, n2, this.a.f, this.a.b);
        hy.b(this.b.a.a.a, ia2);
        this.b.e = hy.a(this.b.a.a.a);
        return object2;
    }
}

