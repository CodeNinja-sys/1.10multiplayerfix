/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.dm;
import com.a.a.d.dn;
import com.a.a.d.gx;
import com.a.a.d.pn;
import com.a.a.d.po;
import com.a.a.d.qd;
import com.a.a.d.qe;
import com.a.a.d.vi;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

class qc
extends gx
implements Serializable {
    final pn a;
    final vi b;
    transient Collection c;
    transient Map d;

    public qc(vi vi2, pn pn2) {
        this.b = (vi)cl.a(vi2);
        this.a = (pn)cl.a(pn2);
    }

    @Override
    protected vi b() {
        return this.b;
    }

    @Override
    public Map c() {
        Map map = this.d;
        if (map == null) {
            Map map2 = this.b.c();
            this.d = map = new qd(this, map2);
        }
        return map;
    }

    @Override
    public Collection l() {
        Collection collection = this.c;
        if (collection == null) {
            this.c = collection = po.a(this.b.l(), this.a);
        }
        return collection;
    }

    @Override
    public Collection c(Object object) {
        return dn.b(this.b.c(object), (dm)new qe(this, object));
    }

    @Override
    public boolean a(Object object, Object object2) {
        this.a.a(object, object2);
        return this.b.a(object, object2);
    }

    @Override
    public boolean c(Object object, Iterable iterable) {
        return this.b.c(object, po.a(object, iterable, this.a));
    }

    @Override
    public boolean a(vi vi2) {
        boolean bl2 = false;
        for (Map.Entry entry : vi2.l()) {
            bl2 |= this.a(entry.getKey(), entry.getValue());
        }
        return bl2;
    }

    @Override
    public Collection b(Object object, Iterable iterable) {
        return this.b.b(object, po.a(object, iterable, this.a));
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

