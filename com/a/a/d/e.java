/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.d.gw;
import java.util.Map;

class e
extends gw {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ d b;

    e(d d2, Map.Entry entry) {
        this.b = d2;
        this.a = entry;
    }

    @Override
    protected Map.Entry a() {
        return this.a;
    }

    @Override
    public Object setValue(Object object) {
        cl.b(this.b.c.contains(this), "entry no longer in map");
        if (cc.a(object, this.getValue())) {
            return object;
        }
        cl.a(!this.b.c.b.containsValue(object), "value already present: %s", object);
        Object object2 = this.a.setValue(object);
        cl.b(cc.a(object, this.b.c.b.get(this.getKey())), "entry no longer in map");
        com.a.a.d.a.a(this.b.c.b, this.getKey(), true, object2, object);
        return object2;
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

