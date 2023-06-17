/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.gw;
import com.a.a.d.ua;
import java.util.Map;

class ub
extends gw {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ ua b;

    ub(ua ua2, Map.Entry entry) {
        this.b = ua2;
        this.a = entry;
    }

    @Override
    protected Map.Entry a() {
        return this.a;
    }

    @Override
    public Object setValue(Object object) {
        cl.a(this.b.a.a.b(this.getKey(), object));
        return super.setValue(object);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

