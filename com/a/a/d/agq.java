/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agp;
import com.a.a.d.am;

class agq
extends am {
    final /* synthetic */ Object a;
    final /* synthetic */ agp b;

    agq(agp agp2, Object object) {
        this.b = agp2;
        this.a = object;
    }

    @Override
    public Object getKey() {
        return this.a;
    }

    @Override
    public Object getValue() {
        return this.b.a.a.get(this.a);
    }

    @Override
    public Object setValue(Object object) {
        return this.b.a.a.put(this.a, object);
    }
}

