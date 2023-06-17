/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aco;
import com.a.a.d.gw;
import java.util.Map;

class acp
extends gw {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ aco b;

    acp(aco aco2, Map.Entry entry) {
        this.b = aco2;
        this.a = entry;
    }

    @Override
    protected Map.Entry a() {
        return this.a;
    }

    @Override
    public Object setValue(Object object) {
        return super.setValue(cl.a(object));
    }

    @Override
    public boolean equals(Object object) {
        return this.a(object);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

