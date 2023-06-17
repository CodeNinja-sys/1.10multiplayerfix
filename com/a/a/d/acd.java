/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.acc;
import com.a.a.d.am;
import java.util.Map;

class acd
extends am {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ acc b;

    acd(acc acc2, Map.Entry entry) {
        this.b = acc2;
        this.a = entry;
    }

    @Override
    public Object getKey() {
        return this.a.getKey();
    }

    @Override
    public Object getValue() {
        return ((Map)this.a.getValue()).get(this.b.b.a);
    }

    @Override
    public Object setValue(Object object) {
        return ((Map)this.a.getValue()).put(this.b.b.a, cl.a(object));
    }
}

